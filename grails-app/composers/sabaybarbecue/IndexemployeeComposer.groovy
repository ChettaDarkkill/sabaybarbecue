package sabaybarbecue

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen
import org.zkoss.zk.ui.Executions

class IndexemployeeComposer extends GrailsComposer {

    def afterCompose = { window ->
		
		$('#logOut').on('click', {
			Executions.sendRedirect("/login.zul")
         })
		
          def name3 = Employee.findAll()
         $('#lisde').append {
			     for(ls in name3){
				      if(ls.department != 'ผู้จัดการ'){
					       comboitem(label:ls.name)
				      }
            }
         }
		
          def  kw    =  Employee.findAll()
        
          $('listbox').append{
            for(ls in kw){
			   	listitem(value: "ls.name"){
					if(ls.department != 'ผู้จัดการ'){
					listcell(label: ls.name ,)
					listcell(label: ls.sex)
					listcell(label: ls.department)
					listcell(label: ls.details)
					           }
				         }
              }
          }
       
           $('#btnSubmit').on('click',{    
                    if($('#depart').getSelectedItem()==null || 
                       $('#sex > radio[checked=true]').size()==0 || 
                       $('#name').getText()=='' ||  
                       $('#detail1').getText()=='' ||
                       $('#username').getText()==''||
                       $('#password').getText()==''){
                            alert("กรุณากรอกข้อมูลให้ครบถ้วนด้วย")
                        } 

                   else{
                          def  departs  = $('#depart').text()
                          def  t  = " "
                                for(cb in $('#sex > radio[checked=true]'))
                                      t=t+cb.getLabel()

                          def  details1 = $('#detail1').text()
                          def  names    = $('#name')[0].text

                          def usernames = $('#username')[0].text
                          def passwords = $('#password')[0].text
                  		
                      
                          def add = new Employee(
                                name: names,
                                sex:t,
                                department:departs,
                                details:details1,
                                username:usernames,
                                password:passwords
                                )  
                    	        add.save()

                         

                      alert("บันทึกข้อมูลเรียบร้อยแล้ว")
                      Executions.sendRedirect("/indexemployee.zul")
                      //$('#add1').detach()     
                            }
                    })

            $('#btnClear').on('click',{
                  $('#name')[0].text = ''
                  $('#detail1')[0].text = ''
                  $('#sex1').setSelected(false)
                  $('#sex2').setSelected(false)
                  $('#depart').setSelectedItem(null)
                  $('#username')[0].text = ''
                  $('#password')[0].text = ''
        })
		
        $('#del').on('click',{
          
                    if($('#lisde').getSelectedItem()==null){
                        alert("กรุณาเลือกพนักงานก่อน")
                    }
                    else{
                     def dele = Employee.findByName($('#lisde').text())
                     dele.delete()
                     alert("ลบข้อมูลเรียบร้อยแล้ว")
                     Executions.sendRedirect("/indexemployee.zul")}
                     
        }) 
        $('#update').on('click',{
            int count = Employee.count()-1
            $('#add2').append{
				  hbox{
					label(value:"มีพนักงานในร้านทั้งหมด "+count+" คน")
					space()
					label(value:""+new Date().toString().substring(0,19))
				}
            }
         })
		 
		def adduser = Member.findAll()
		$('#boxuser').append{
			for(user in adduser){
				comboitem(label: user.username)
			}
		}
		
		$('#btnSubmit1').on('click',{
			if($('#boxuser').getSelectedItem() != null &&
				$('#point').text() != '' &&
				Integer.parseInt($('#point').text()) > 0 &&
				$('#reason').text() != ''
			){
				def mem = new Member()
				def employ = new Employee()
				new Addpoint(
					employee: employ.get(Employee.findByUsername(session['username']).id),
					member: mem.get(Member.findByUsername($('#boxuser').text()).id),
					addpoint: Integer.parseInt($('#point').text()),
					reason: $('#reason').text()
				).save()
				def edpoint = Member.get(Member.findByUsername($('#boxuser').text()).id)
				edpoint.point = Integer.parseInt($('#point').text())+Member.findByUsername($('#boxuser').text()).point
				alert('เพิ่ม '+Integer.parseInt($('#point').text())+' point'+' ให้ '+Member.findByUsername($('#boxuser').text()).username)
				$('#boxuser').text('')
				$('#point').text('')
				$('#reason').text('')
			}
			else
				alert('กรุณากรอกข้อมูลให้ครบ แล้วจำนวน point ต้องมากกว่า 0')
		})
  }
}
