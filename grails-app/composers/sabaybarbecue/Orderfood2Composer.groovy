package sabaybarbecue

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

import org.zkoss.zk.ui.event.EventListener
import org.zkoss.zk.ui.event.Event
import org.zkoss.zk.ui.Executions

class Orderfood2Composer extends GrailsComposer {

    def afterCompose = { window ->
		
        $('#logout').on('click', {
			Executions.sendRedirect("/orderfood.zul")    
        })

        // button add food ============================================================
        def p = " ชุด"
        Integer a =1
		
        $('#add').on('click', {
            $('#listmenu').append {
                label(value: "ชุดอิ่มอร่อย"+a+p) 
            }
            if($('#newAddress').text() == ''){
				def c = new Member()
				def f = new FoodDetail()
				def m = new Sendaddress(
					member: c.get(Member.findByUsername(session['username']).id),
					fooddetail: f.get(FoodDetail.findByFoodname("ชุดอิ่มอร่อย").id),
					status: 'ไม่ส่ง',
					address: 'บ้าน'
				)
				m.save()
				}
				else{
					def c = new Member()
					def f = new FoodDetail()
					def m = new Sendaddress(
						member: c.get(Member.findByUsername(session['username']).id),
						fooddetail: f.get(FoodDetail.findByFoodname("ชุดอิ่มอร่อย").id),
						status: 'ไม่ส่ง',
						address: $('#newAddress').text()
					)
					m.save()
				}
				alert('คุณได้ทำการสั่งซื้อชุดอิ่มอร่อย..  คุณสามารถดูรายการอาหารที่คุณสั่งจากระบบสมาชิก')
        })

        $('#add2').on('click', {
            $('#listmenu').append {
                label(value: "ชุดพอเพียง"+a+p)
            }
            if($('#newAddress').text() == ''){
				def c = new Member()
				def f = new FoodDetail()
				def m = new Sendaddress(
					member: c.get(Member.findByUsername(session['username']).id),
					fooddetail: f.get(FoodDetail.findByFoodname("ชุดพอเพียง").id),
					status: 'ไม่ส่ง',
					address: 'บ้าน'
				)
				m.save()
            }
			else{
                def c = new Member()
                def f = new FoodDetail()
                def m = new Sendaddress(
					member: c.get(Member.findByUsername(session['username']).id),
					fooddetail: f.get(FoodDetail.findByFoodname("ชุดพอเพียง").id),
					status: 'ไม่ส่ง',
					address: $('#newAddress').text()
				)
                m.save()
            }
            alert('คุณได้ทำการสั่งซื้อชุดพอเพียง..  คุณสามารถดูรายการอาหารที่คุณสั่งจากระบบสมาชิก')
        })

        $('#add3').on('click', {
            $('#listmenu').append {
                label(value: "ชุดเพื่อสุขภาพ"+a+p)      
            }
            if($('#newAddress').text() == ''){
				def c = new Member()
				def f = new FoodDetail()
				def m = new Sendaddress(
					member: c.get(Member.findByUsername(session['username']).id),
					fooddetail: f.get(FoodDetail.findByFoodname("ชุดเพื่อสุขภาพ").id),
					status: 'ไม่ส่ง',
					address: 'บ้าน'
				)
				m.save()
            }
			else{
                def c = new Member()
                def f = new FoodDetail()
                def m = new Sendaddress(
					member: c.get(Member.findByUsername(session['username']).id),
					fooddetail: f.get(FoodDetail.findByFoodname("ชุดเพื่อสุขภาพ").id),
					status: 'ไม่ส่ง',
					address: $('#newAddress').text()
				)
                m.save()
			}
			alert('คุณได้ทำการสั่งซื้อชุดเพื่อสุขภาพ..  คุณสามารถดูรายการอาหารที่คุณสั่งจากระบบสมาชิก')
        })

        $('#add4').on('click', {
            $('#listmenu').append {
                label(value: "ชุดเนื้อสุดอลังการ"+a+p)
            }
            if($('#newAddress').text() == ''){
            def c = new Member()
            def f = new FoodDetail()
            def m = new Sendaddress(
                member: c.get(Member.findByUsername(session['username']).id),
                fooddetail: f.get(FoodDetail.findByFoodname("ชุดเนื้อสุดอลังการ").id),
                status: 'ไม่ส่ง',
                address: 'บ้าน'
            )
            m.save()
            }
			else{
                def c = new Member()
                def f = new FoodDetail()
                def m = new Sendaddress(
					member: c.get(Member.findByUsername(session['username']).id),
					fooddetail: f.get(FoodDetail.findByFoodname("ชุดเนื้อสุดอลังการ").id),
					status: 'ไม่ส่ง',
					address: $('#newAddress').text()
				)
                m.save()
            }
            alert('คุณได้ทำการสั่งซื้อชุดอลังการ..  คุณสามารถดูรายการอาหารที่คุณสั่งจากระบบสมาชิก')
        })
        //===============================================================================
    }
}
