package sabaybarbecue

import org.zkoss.zk.grails.composer.*

import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

import org.zkoss.*
import org.zkoss.zk.ui.Executions
import org.zkoss.zul.Button
import org.zkoss.zul.Messagebox

class IndexwarehouseComposer extends GrailsComposer {
	
		
    def afterCompose = { window ->
		
		def foodDB = Foods.findAll()  //foodDB ใช้เก็บตัวแปรที่ดึงเข้ามาจาก Database
		$('listbox').append{ //แอดข้อมูลเข้าสู่ listbox ที่มีไอดีชื่อ listbox $('#listboxID') ก็ได้ แต่เดิมทำแบบนี้
			for(ls in foodDB){  //วนลูป เอา fooddB เก็บใน ls
				listitem(value: ls.food_name){
					listcell(label: ls.food_name)
					//listcell(label: "yes")
					listcell(label: ls.amount)
					listcell(label: ls.date_expire)
					listcell(label: ls.price)
				}
			}
		}	
		
		$('#btnUpdate').on('click',{
			if($('#cbBoxID').getSelectedItem()==null){
				alert('เลือกรายการ')
			}else{
				def update = Foods.get(Foods.findByFood_name($('#cbBoxID').text()).id)
				if($('#txtDecrese').text() != '' && Integer.parseInt($('#txtDecrese').text()) <= Foods.findByFood_name($('#cbBoxID').text()).amount){
					update.amount = Foods.findByFood_name($('#cbBoxID').text()).amount-Integer.parseInt($('#txtDecrese').text())
					update.save()
					
					
					def emAdd = new Employee()
					def foodDecrease = new Foods()
					new Adjustment(
						employee: emAdd.get(Employee.findByUsername(session['username']).id),
						foods: foodDecrease.get(Foods.findByFood_name($('#cbBoxID').text()).id), //บรรทัดนี้ลบได้
						type: "Decrease"
					).save()
					alert('ลดแล้ว')
					Executions.sendRedirect("/indexwarehouse.zul")
				}
				else
					alert('กรอกจำนวน')
			}
		})
		
		$('#btnAddNumber').on('click',{
			if($('#cbBoxID').getSelectedItem()==null){
				alert('เลือกรายการ')
			}else{
				def addamount = Foods.get(Foods.findByFood_name($('#cbBoxID').text()).id)
				if($('#txtDecrese').text() != ''){
					addamount.amount = Foods.findByFood_name($('#cbBoxID').text()).amount+Integer.parseInt($('#txtDecrese').text())
					addamount.save()
					
					def emAdd = new Employee()
					def foodIncrease = new Foods()
					new Adjustment(
						employee: emAdd.get(Employee.findByUsername(session['username']).id),
						foods: foodIncrease.get(Foods.findByFood_name($('#cbBoxID').text()).id), //บรรทัดนี้ลบได้
						type: "Increase"
					).save()
					
					alert('เพิ่มแล้ว')
					Executions.sendRedirect("/indexwarehouse.zul")
				}
				else
					alert('กรอกจำนวน')
			}
		})
		
		$('#cbBoxID').append{   //cb เหมือนกับ ls ใช้ดึงข้อมูลใน loop combobox
			for(cb in foodDB){
				comboitem(label: cb.food_name)
			}
			
		}
	
		$('#btnAddTask').on('click',{
			if($('#txtAddFoodName')[0].text=='' || $('#txtAddExpire')[0].text=='' || $('#txtAddNumber')[0].text=='' || $('#txtAddBy')[0].text=='' || $('#txtAddPrice')[0].text==''){
				alert('กรอกข้อมูลให้ครบถ้วน')
			}else{	
				//def adjAdd = new Adjustment(type:"add")
			
				def add_name = $('#txtAddFoodName')[0].text
				def add_expire = $('#txtAddExpire')[0].text
				def add_number = $('#txtAddNumber')[0].text
				def add_by = $('#txtAddBy')[0].text
				def add_price = $('#txtAddPrice')[0].text
				
				def food = new Foods(
					food_name: add_name,
					date_expire: add_expire,
					amount: add_number,
					buy_by: add_by,
					price: add_price
				)
				
				
				//food.adjustments = [adjAdd]
				food.save()
				
				def emAdd = new Employee()
				def foodAdd = new Foods()
				
				def adjAdd = new Adjustment(
					employee: emAdd.get(Employee.findByUsername(session['username']).id),
					foods: foodAdd.get(Foods.findByFood_name(add_name).id), //บรรทัดนี้ลบได้
					type: "add"
					
				)
				adjAdd.save()
				
				alert('บันทึกสำเร็จ')
				Executions.sendRedirect("/indexwarehouse.zul")
			}
		})
		
		$('#btnLogout').on('click',{
			Executions.sendRedirect("/login.zul")
		})
		
		$('#btnRefresh').on('click',{
			Executions.sendRedirect("/indexwarehouse.zul") //รีเฟรชหน้าไปที่ indexwarehouse.zul หน้าเดิม
		})
		
		$('#btnDelete').on('click',{
			def employee1 = new Employee()
			
		
			if($('#cbBoxID').getSelectedItem()==null){
				alert('เลือกรายการ')
			}else{
				if($('#txtDecrese').text() == ''){
					//if(Foods.findByFood_name($('#cbBoxID').getSelectedItem()).amount == 0){
						//def emDel = new Employee()
						//def foodDel = new Foods()
						//adjDel.save()    //เซฟข้อมูลใน AdjustmentDB
						
						def del = Foods.findByFood_name($('#cbBoxID').text()) //ค้นหาจากฐานข้อมูลที่มีชื่อตามรายการที่เลือก
						del.delete() //ลบรายการออกจากฐานข้อมูล
						
						alert('ลบข้อมูลเรียบร้อย')
						Executions.sendRedirect("/indexwarehouse.zul")
					//}
					//else{
					//	alert('จำนวนวัตถุดิบยังเหลืออยู่  ไม่สามารถลบข้อมูลได้')
					//}
				}
				else
					alert('ห้ามกรอกจำนวน')
			}
		})
    }
}
