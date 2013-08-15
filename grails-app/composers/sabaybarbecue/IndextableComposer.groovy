package sabaybarbecue

import org.zkoss.zk.grails.composer.*
import org.zkoss.zk.ui.Executions
import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

class IndextableComposer extends GrailsComposer {

     def afterCompose = { window ->

     	$('#btnlogin').on('click',{

		def c = Member.findByUsername($('#txtuser').text())

		if($('#txtuser').text() == '' || $ ('#txtpass').text() == ''){
			alert('กรุณากรอก Username และ Password')
		}
		else if(c != null){
			if($('#txtpass').text() == c.password){
				session['username'] = c.username
				Executions.sendRedirect("/table.zul")
			}
			else
				alert('คุณกรอก Username หรือ Password ผิด กรุณากรอกใหม่')
			}
		else
			alert('คุณกรอก Username หรือ Password ผิด กรุณากรอกใหม่')
		})
     }
}