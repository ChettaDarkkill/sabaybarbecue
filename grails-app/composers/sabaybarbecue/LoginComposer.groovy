package sabaybarbecue

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen
import org.zkoss.zk.ui.Executions
import org.zkoss.zul.Messagebox

class LoginComposer extends GrailsComposer {

    def afterCompose = { window ->
	
		$('#btnlogin').on('click',{
			//===========================================
			def a = Employee.findByUsername($('#txtAddUsername').text())
			
			if($('#txtAddUsername')[0].text=='' || $('#txtAddPassword')[0].text==''){
				alert('กรอกข้อมูลใหม่')
			}else if(a != null){
				if($('#txtAddPassword').text() == a.password && $('#txtAddUsername')[0].text == Employee.findByUsername('admin').username){
					session['username']=a.username
					Executions.sendRedirect("/indexemployee.zul")
				}
				else if($('#txtAddPassword').text()==a.password){
					session['username']=a.username
					Executions.sendRedirect("/indexwarehouse.zul")
				}
				else{
					alert('รหัสผ่านผิด')
				}
			}else{
				alert('ข้อมูลไม่ถูกต้อง')
			}
			
		})
    }
}
