package sabaybarbecue

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.Executions
import org.zkoss.zk.ui.select.annotation.Listen

class IndexpromotionComposer extends GrailsComposer {

	
    def afterCompose = { window ->
	
		$('#btnlogin').on('click',{
			def a = Member.findByUsername($('#txtuser').text())
		
			if($('#txtuser').text()== '' || $ ('#txtpass').text()==''){
				alert('กรุณากรอก Username และ Password')
			}
			else if(a != null){
				if($('#txtpass').text()== a.password){
					session['username'] = a.username
					Executions.sendRedirect("/promotion.zul")
				}
				else
					alert('คุณกรอก Username หรือ Password ผิด กรุณากรอกใหม่')
			}
			else
				alert('คุณกรอก Username หรือ Password ผิด กรุณากรอกใหม่')
		})
		
		
		$('#btnp1').on('click',{
			alert('กรุณาเข้าสู่ระบบ')
		})
		
		$('#btnp2').on('click',{
			alert('กรุณาเข้าสู่ระบบ')
		})
		
		$('#btnp3').on('click',{
			alert('กรุณาเข้าสู่ระบบ')
		})
		
		$('#btnp4').on('click',{
			alert('กรุณาเข้าสู่ระบบ')
		})
		
		$('#btnp5').on('click',{
			alert('กรุณาเข้าสู่ระบบ')
		})
		
		$('#btnp6').on('click',{
			alert('กรุณาเข้าสู่ระบบ')
		})
		
		$('#btncon').on('click',{
			alert('กรุณาเข้าสู่ระบบ')
		})

	}
	  
}
