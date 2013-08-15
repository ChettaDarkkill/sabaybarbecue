package sabaybarbecue

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen
import org.zkoss.zk.ui.Executions

class IndexmemberComposer extends GrailsComposer{
	
    def afterCompose = { window ->
		
		$('#login').on('click', {
			def c = Member.findByUsername($('#user').text()) 
			if($('#user').text() == '' || $('#pass').text() == '')
				alert('กรุณากรอก Username และ Password')
			else if(c != null){
				if($('#pass').text() == c.password){
					session['username'] = c.username
					Executions.sendRedirect("/loginprofile.zul")
				}
				else
					alert('คุณกรอก Username หรือ Password ผิด กรุณากรอกใหม่')
			}
			else
				alert('คุณกรอก Username หรือ Password ผิด กรุณากรอกใหม่')
		})
		
		$('#confirm').on('click', {
			def u = Member.findByUsername($('#inID').text()) 
			if(
				$('#inID').text() == '' ||
				$('#inPassword').text() == '' ||
				$('#inName').text() == '' ||
				$('#inLastname').text() == '' ||
				$('#inIdentify').text() == '' ||
				$('#inAddress').text() == '' ||
				$('#inAmphoe').text() == '' ||
				$('#inProvince').text() == '' ||
				$('#inZipCode').text() == '' ||
				$('#inEmail').text() == '' ||
				$('#inPhone').text() == ''
			)
				alert('คุณกรอกข้อมูลไม่ครบ.. กรุณากรอกข้อมูลให้ครบทุกช่อง')
			else if(u != null){
				if($('#inID').text() == u.username){
					alert('Username นี้มีผู้ใช้แล้ว กรุณาเปลี่ยนใหม่!!')
				}
			}
			else if($('#inIdentify').text().length() == 13 && $('#inPhone').text().length() == 10 && $('#inZipCode').text().length() == 5){
				if($('#inPassword').text() == $('#inPasswordc').text()){
					new Member(
						username: $('#inID').text(), 
						password: $('#inPassword').text(), 
						name: $('#inName').text(),
						lastname: $('#inLastname').text(),
						idnumber: $('#inIdentify').text(),
						address: $('#inAddress').text(),
						amphoe: $('#inAmphoe').text(),
						province: $('#inProvince').text(),
						zipcode: $('#inZipCode').text(),
						email: $('#inEmail').text(),
						phonenumber: $('#inPhone').text()
					).save()
					$('#inID').text('')
					$('#inPassword').text('')
					$('#inPasswordc').text('')
					$('#inName').text('')
					$('#inLastname').text('')
					$('#inIdentify').text('')
					$('#inAddress').text('')
					$('#inAmphoe').text('')
					$('#inProvince').text('')
					$('#inZipCode').text('')
					$('#inEmail').text('')
					$('#inPhone').text('')
					alert('คุณสมัครสมาชิกเรียบร้อยแล้ว!! สามารถเข้าสู่ระบบสมาชิกได้ทันที...')
				}
				else
					alert('คุณกรอกรหัสยืนยันผิด กรุณากรอกใหม่...')
			}
			else
				alert('คุณกรอกรหัสบัตรประชาชน, รหัสไปรษณีย์ หรือเบอร์โทรศัพท์ ผิด กรุณากรอกใหม่..')
		})
    }

}
