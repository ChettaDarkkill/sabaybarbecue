package sabaybarbecue

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen
import org.zkoss.zk.ui.Executions

class LoginprofileComposer extends GrailsComposer {

    def afterCompose = { window ->
		
		$('#wname').append {
			label(value: Member.findByUsername(session['username']).name)
		}
		
		$('#spoint').append {
			label(value: Member.findByUsername(session['username']).point)
		}
		
		$('#susername').append {
			label(value: Member.findByUsername(session['username']).username)
		}
		
		$('#sname').append {
			label(value: Member.findByUsername(session['username']).name)
		}
		
		$('#slastname').append {
			label(value: Member.findByUsername(session['username']).lastname)
		}
		
		$('#sidentify').append {
			label(value: Member.findByUsername(session['username']).idnumber)
		}
		
		$('#address').text(Member.findByUsername(session['username']).address)
		$('#amphoe').text(Member.findByUsername(session['username']).amphoe)
		$('#province').text(Member.findByUsername(session['username']).province)
		$('#zipcode').text(Member.findByUsername(session['username']).zipcode)
		$('#email').text(Member.findByUsername(session['username']).email)
		$('#phone').text(Member.findByUsername(session['username']).phonenumber)
		
		def fma = FoodDetail.findAll()
		
		for(fm in fma){
			def fd = Sendaddress.findAllByMemberAndFooddetail(
			Member.get(Member.findByUsername(session['username']).id),
			FoodDetail.get(fm.id))
			
			for(f in fd){
				if(
					new Date().date == f.orderdate.date &&
					new Date().month == f.orderdate.month &&
					new Date().year == f.orderdate.year &&
					f.status == 'ไม่ส่ง'
				){
					$('#food').append {
						hbox {
							label(value: 'ชื่อชุดอาหาร:')
							space()
							label(value: f.fooddetail.foodname)
						}
						hbox {
							label(value: 'ราคารวมค่าส่ง:')
							space()
							label(value: f.fooddetail.price)
							space()
							label(value: 'Baht')
						}
						hbox {
							label(value: 'เวลาที่สั่งซื้อ:')
							space()
							label(value: f.orderdate.toString().substring(0,19))
						}
					}
				}
			}
		}
		
		def tma = Tabledetail.findAll()
		
		for(tm in tma){
			def td = ReserveTable.findAllByMemberAndTabledetail(
			Member.get(Member.findByUsername(session['username']).id),
			Tabledetail.get(tm.id))
			
			for(t in td){
				if(
					new Date().date == t.rentdate.date &&
					new Date().month == t.rentdate.month &&
					new Date().year == t.rentdate.year
				){
					$('#table').append {
						hbox {
							label(value: 'หมายเลขโต๊ะที่ทำการจอง:')
							space()
							label(value: t.tabledetail.tablename)
						}
						hbox {
							label(value: 'เวลาที่ทำการจอง:')
							space()
							label(value: t.rentdate.toString().substring(0,19))
						}
					}
				}
			}
		}
		
    	def pma = Promotion.findAll()
		
		for(pm in pma){
			def pd = Promotion.findAllByMemberAndPromotiondetail(
			Member.get(Member.findByUsername(session['username']).id),
			Promotiondetail.get(pm.id))
			
			for(p in pd){
				if(
					new Date().date == p.orderdate.date &&
					new Date().month == p.orderdate.month &&
					new Date().year == p.orderdate.year &&
					p.status == 'ไม่ส่ง'
				){
					$('#promotion').append {
						hbox {
							label(value: 'โปรโมชั่นที่ทำการเลือกไว้:')
							space()
							label(value: p.promotiondetail.promotionname)
						}
						hbox {
							label(value: 'Point:')
							space()
							label(value: p.promotiondetail.point)
						}
						hbox {
							label(value: 'เวลาที่สั่งของ:')
							space()
							label(value: p.orderdate.toString().substring(0,19))
						}
					}
				}
			}
		}
		
		$('#logout').on('click', {
			Executions.sendRedirect("/indexmember.zul")
		})
		
		def member = Member.get(Member.findByUsername(session['username']).id)
		
		$('#save').on('click', {
			if(
				$('#address').text() != '' &&
				$('#amphoe').text() != '' &&
				$('#province').text() != '' &&
				$('#zipcode').text().length() == 5 &&
				$('#email').text() != '' &&
				$('#phone').text().length() == 10
			){
				member.address = $('#address').text()
				member.amphoe = $('#amphoe').text()
				member.province = $('#province').text()
				member.zipcode = $('#zipcode').text()
				member.email = $('#email').text()
				member.phonenumber = $('#phone').text()
				member.save()
				alert('แก้ไขข้อมูลเรียบร้อย!!')
				Executions.sendRedirect("/loginprofile.zul")
			}
			else{
				alert('กรอกข้อมูลให้ถูกต้อง')
			}
		})
		
    }
}
