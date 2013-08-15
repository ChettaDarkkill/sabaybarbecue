package sabaybarbecue

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.Executions
import org.zkoss.zk.ui.select.annotation.Listen

class PromotionComposer extends GrailsComposer {

    def afterCompose = { window ->
        $('#btnlogout').on('click',{
			Executions.sendRedirect("/indexpromotion.zul")
		})
		
		$('#vbox1').append{
			hbox{
				label(value: 'Username')
				space()
				label(value:Member.findByUsername(session['username']).username)
			}
			hbox{
				label(value: 'POINT')
				space()
				label(value: '')
				space()
				label(value:Member.findByUsername(session['username']).point)
			}
		}
		
		$('#btnp1').on('click',{
			alert(Promotiondetail.findById(1).detail)
		})
			
		$('#btnp2').on('click',{
			alert(Promotiondetail.findById(2).detail)
		})
			
		$('#btnp3').on('click',{
			alert(Promotiondetail.findById(3).detail)
		})
			
		$('#btnp4').on('click',{
			alert(Promotiondetail.findById(4).detail)
		})
			
		$('#btnp5').on('click',{
			alert(Promotiondetail.findById(5).detail)
		})
			
		$('#btnp6').on('click',{
			alert(Promotiondetail.findById(6).detail)
		})
		
		
			
				
		$('#btncon').on('click',{
			
			if($("radio[checked=true]")){
			def h = Member.get(Member.findByUsername(session['username']).id)
			def d = Promotiondetail.findByPromotionname($('radio[checked=true]').text()).point
			def c = Member.findByUsername(session['username']).point
				if(c >= d){
					h.point = c-d
					h.save()
					def t2 = new Promotiondetail()
					def t3 = new Member()
					def t1 = new Promotion(
						member: t3.get(Member.findByUsername(session['username']).id),
						promotiondetail: t2.get(Promotiondetail.findByPromotionname($('radio[checked=true]').text()).id),
						status: 'ไม่ส่ง'
					)
					t1.save()		
					Executions.sendRedirect("/promotion.zul")
				}
				else{
					alert('แต้มคุณไม่พอ')
				}
			}
			else{
				alert('กรุณาเลือกโปรโมชั่น')
			}	
		})			
    }
}
