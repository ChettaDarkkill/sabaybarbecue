package sabaybarbecue

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

import org.zkoss.zk.ui.event.EventListener
import org.zkoss.zk.ui.event.Event
import org.zkoss.zk.ui.Executions


class OrderfoodComposer extends GrailsComposer {

    def afterCompose = { window ->

       $('#login').on('click', {
            def gg = Member.findByUsername($('#user').text())
            if($('#user').text() == '' || $('#password').text() == '')
                alert('กรุณากรอก username และ password')
            else if(gg != null){
                if($('#password').text() == gg.password){
                    session['username'] = gg.username
                    Executions.sendRedirect("/orderfood2.zul")
                }else
                    alert('คุณกรอก username หรือ password ผิด')
            }else
                alert('คุณกรอก username หรือ password ผิด')
        })
       
        // button send data address==========================================================
        $('#send').on('click', {
            if(
				$('#name').text() == '' ||
				$('#email').text() == '' ||
				$('#tel').text() == '' ||
				$('#sendaddress').text() == '' ||
				$('#province').getSelectedItem() == null
			){
                alert("กรุณากรอกข้อมูลให้ครบ")
            }
			else{
				def thisname = $('#name').text()
				def thisemail = $('#email').text()
				def thistel = $('#tel').text()
				def thissendaddress = $('#sendaddress').text()
				def thisprovince = $('#province').text()

				def n = new Customer(
					name: thisname,
					email: thisemail,
					tel: thistel,
					address: thissendaddress,
					province: thisprovince
                )
				n.save()
				alert("บันทึกข้อมูลสำเร็จ")
            }
		})
        //=============================================================================

        // button add food ============================================================
		
			def p = " ชุด"
			Integer a = 1
			$('#add').on('click', {
				if(
					$('#name').text() == '' ||
					$('#email').text() == '' ||
					$('#tel').text() == '' ||
					$('#sendaddress').text() == '' ||
					$('#province').getSelectedItem() == null
				){
					alert('กรุณาบันทึกข้อมูลที่จัดส่งก่อน')
				}else{
					$('#listmenu').append {
						label(value: "ชุดอิ่มอร่อย"+a+p)
					}
					def c = new Customer()
					def f = new FoodDetail()
					def m = new Food(
						customer: c.get(Customer.findAll().size()),
						fooddetail: f.get(FoodDetail.findByFoodname("ชุดอิ่มอร่อย").id),
						status: 'ไม่ส่ง'
					)
					m.save()
					alert('คุณได้ทำการสั่งซื้อชุดอิ่มอร่อย.. ')
				}
			})

			 $('#add2').on('click', {
				if(
					$('#name').text() == '' ||
					$('#email').text() == '' ||
					$('#tel').text() == '' ||
					$('#sendaddress').text() == '' ||
					$('#province').getSelectedItem() == null
				){
					alert('กรุณาบันทึกข้อมูลที่จัดส่งก่อน')
				}else{
					$('#listmenu').append {
							label(value: "ชุดพอเพียง"+a+p)
					}
					def c = new Customer()
					def f = new FoodDetail()
					def m = new Food(
						customer: c.get(Customer.findAll().size()),
						fooddetail: f.get(FoodDetail.findByFoodname("ชุดพอเพียง").id),
						status: 'ไม่ส่ง'
					)
					m.save()
					alert('คุณได้ทำการสั่งซื้อชุดพอเพียง.. ')
				}
			})

			$('#add3').on('click', {
				if(
					$('#name').text() == '' ||
					$('#email').text() == '' ||
					$('#tel').text() == '' ||
					$('#sendaddress').text() == '' ||
					$('#province').getSelectedItem() == null
				){
					alert('กรุณาบันทึกข้อมูลที่จัดส่งก่อน')
				}else{
					$('#listmenu').append {
							label(value: "ชุดเพื่อสุขภาพ"+a+p)
							
					}
					def c = new Customer()
					def f = new FoodDetail()
					def m = new Food(
						customer: c.get(Customer.findAll().size()),
						fooddetail: f.get(FoodDetail.findByFoodname("ชุดเพื่อสุขภาพ").id),
						status: 'ไม่ส่ง'
					)
					m.save()
					alert('คุณได้ทำการสั่งซื้อชุดเพื่อสุขภาพ.. ')
				}
			})

			$('#add4').on('click', {
				if(
					$('#name').text() == '' ||
					$('#email').text() == '' ||
					$('#tel').text() == '' ||
					$('#sendaddress').text() == '' ||
					$('#province').getSelectedItem() == null
				){
					alert('กรุณาบันทึกข้อมูลที่จัดส่งก่อน')
				}else{
					$('#listmenu').append {
							label(value: "ชุดเนื้อสุดอลังการ"+a+p)

					}
					def c = new Customer()
					def f = new FoodDetail()
					def m = new Food(
						customer: c.get(Customer.findAll().size()),
						fooddetail: f.get(FoodDetail.findByFoodname("ชุดเนื้อสุดอลังการ").id),
						status: 'ไม่ส่ง'
					)
					m.save()
					alert('คุณได้ทำการสั่งซื้อชุดอลังการ..')
				}
			})
        //===============================================================================
    }
    
}
