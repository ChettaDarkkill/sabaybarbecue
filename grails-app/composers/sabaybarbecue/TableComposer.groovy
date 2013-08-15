package sabaybarbecue

import org.zkoss.zk.grails.composer.*
import org.zkoss.zk.ui.Executions
import org.zkoss.zk.ui.select.annotation.Wire
import org.zkoss.zk.ui.select.annotation.Listen

class TableComposer extends GrailsComposer {

    def afterCompose = { window ->
	
		$('#btnlogout').on('click',{
			Executions.sendRedirect("/indextable.zul")
		})
		
		$('#btnAddreverse1')[0].label = Tabledetail.findByTablename('A1').tablename+' '+Tabledetail.findByTablename('A1').status
		
		$('#btnAddreverse1').on('click',{
			if(Tabledetail.findByTablename('A1').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('A1').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('A1').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")

			}

			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
			
		})
	
		
		$('#btnAddreverse2')[0].label = Tabledetail.findByTablename('A2').tablename+' '+Tabledetail.findByTablename('A2').status
		
		$('#btnAddreverse2').on('click',{
			if(Tabledetail.findByTablename('A2').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('A2').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('A2').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")

			}

			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')

		})


		$('#btnAddreverse3')[0].label = Tabledetail.findByTablename('A3').tablename+' '+Tabledetail.findByTablename('A3').status
		
		$('#btnAddreverse3').on('click',{
			if(Tabledetail.findByTablename('A3').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('A3').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('A3').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
		})
		
		$('#btnAddreverse4')[0].label = Tabledetail.findByTablename('A4').tablename+' '+Tabledetail.findByTablename('A4').status
		
		$('#btnAddreverse4').on('click',{
			if(Tabledetail.findByTablename('A4').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('A4').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('A4').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')

		})


		$('#btnAddreverse5')[0].label = Tabledetail.findByTablename('A5').tablename+' '+Tabledetail.findByTablename('A5').status
		
		$('#btnAddreverse5').on('click',{
			if(Tabledetail.findByTablename('A5').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('A5').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('A5').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
		})

		$('#btnAddreverse6')[0].label = Tabledetail.findByTablename('A6').tablename+' '+Tabledetail.findByTablename('A6').status
		
		$('#btnAddreverse6').on('click',{
			if(Tabledetail.findByTablename('A6').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('A6').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('A6').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
		})

		$('#btnAddreverse7')[0].label = Tabledetail.findByTablename('A7').tablename+' '+Tabledetail.findByTablename('A7').status
		
		$('#btnAddreverse7').on('click',{
			if(Tabledetail.findByTablename('A7').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('A7').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('A7').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
		})


		$('#btnAddreverse8')[0].label = Tabledetail.findByTablename('A8').tablename+' '+Tabledetail.findByTablename('A8').status
		
		$('#btnAddreverse8').on('click',{
			if(Tabledetail.findByTablename('A8').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('A8').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('A8').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
		})


		$('#btnAddreverse9')[0].label = Tabledetail.findByTablename('B1').tablename+' '+Tabledetail.findByTablename('B1').status
		
		$('#btnAddreverse9').on('click',{
			if(Tabledetail.findByTablename('B1').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('B1').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('B1').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
		})
		
		
		$('#btnAddreverse10')[0].label = Tabledetail.findByTablename('B2').tablename+' '+Tabledetail.findByTablename('B2').status
		
		$('#btnAddreverse10').on('click',{
			if(Tabledetail.findByTablename('B2').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('B2').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('B2').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
		})


		$('#btnAddreverse11')[0].label = Tabledetail.findByTablename('B3').tablename+' '+Tabledetail.findByTablename('B3').status
		
		$('#btnAddreverse11').on('click',{
			if(Tabledetail.findByTablename('B3').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('B3').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('B3').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
		})
		
		$('#btnAddreverse12')[0].label = Tabledetail.findByTablename('B4').tablename+' '+Tabledetail.findByTablename('B4').status
		
		$('#btnAddreverse12').on('click',{
			if(Tabledetail.findByTablename('B4').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('B4').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('B4').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')

		})


		$('#btnAddreverse13')[0].label = Tabledetail.findByTablename('B5').tablename+' '+Tabledetail.findByTablename('B5').status
		
		$('#btnAddreverse13').on('click',{
			if(Tabledetail.findByTablename('B5').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('B5').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('B5').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
		})

		$('#btnAddreverse14')[0].label = Tabledetail.findByTablename('B6').tablename+' '+Tabledetail.findByTablename('B6').status
		
		$('#btnAddreverse14').on('click',{
			if(Tabledetail.findByTablename('B6').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('B6').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('B6').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
		})

		$('#btnAddreverse15')[0].label = Tabledetail.findByTablename('B7').tablename+' '+Tabledetail.findByTablename('B7').status
		
		$('#btnAddreverse15').on('click',{
			if(Tabledetail.findByTablename('B7').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('B7').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('B7').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
		})


		$('#btnAddreverse16')[0].label = Tabledetail.findByTablename('B8').tablename+' '+Tabledetail.findByTablename('B8').status
		
		$('#btnAddreverse16').on('click',{
			if(Tabledetail.findByTablename('B8').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('B8').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('B8').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
		})

		$('#btnAddreverse17')[0].label = Tabledetail.findByTablename('C1').tablename+' '+Tabledetail.findByTablename('C1').status
		
		$('#btnAddreverse17').on('click',{
			if(Tabledetail.findByTablename('C1').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('C1').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('C1').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')

		})
		
		
		$('#btnAddreverse18')[0].label = Tabledetail.findByTablename('C2').tablename+' '+Tabledetail.findByTablename('C2').status
		
		$('#btnAddreverse18').on('click',{
			if(Tabledetail.findByTablename('C2').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('C2').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('C2').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
		})


		$('#btnAddreverse19')[0].label = Tabledetail.findByTablename('C3').tablename+' '+Tabledetail.findByTablename('C3').status
		
		$('#btnAddreverse19').on('click',{
			if(Tabledetail.findByTablename('C3').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('C3').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('C3').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
		})
		
		$('#btnAddreverse20')[0].label = Tabledetail.findByTablename('C4').tablename+' '+Tabledetail.findByTablename('C4').status
		
		$('#btnAddreverse20').on('click',{
			if(Tabledetail.findByTablename('C4').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('C4').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('C4').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
		})


		$('#btnAddreverse21')[0].label = Tabledetail.findByTablename('C5').tablename+' '+Tabledetail.findByTablename('C5').status
		
		$('#btnAddreverse21').on('click',{
			if(Tabledetail.findByTablename('C5').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('C5').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('C5').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')

		})

		$('#btnAddreverse22')[0].label = Tabledetail.findByTablename('C6').tablename+' '+Tabledetail.findByTablename('C6').status
		
		$('#btnAddreverse22').on('click',{
			if(Tabledetail.findByTablename('C6').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('C6').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('C6').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')

		})

		$('#btnAddreverse23')[0].label = Tabledetail.findByTablename('C7').tablename+' '+Tabledetail.findByTablename('C7').status
		
		$('#btnAddreverse23').on('click',{
			if(Tabledetail.findByTablename('C7').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('C7').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('C7').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
		})


		$('#btnAddreverse24')[0].label = Tabledetail.findByTablename('C8').tablename+' '+Tabledetail.findByTablename('C8').status
		
		$('#btnAddreverse24').on('click',{
			if(Tabledetail.findByTablename('C8').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('C8').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('C8').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')

		})

		$('#btnAddreverse25')[0].label = Tabledetail.findByTablename('D1').tablename+' '+Tabledetail.findByTablename('D1').status
		
		$('#btnAddreverse25').on('click',{
			if(Tabledetail.findByTablename('D1').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('D1').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('D1').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')

		})
		
		
		$('#btnAddreverse26')[0].label = Tabledetail.findByTablename('D2').tablename+' '+Tabledetail.findByTablename('D2').status
		
		$('#btnAddreverse26').on('click',{
			if(Tabledetail.findByTablename('D2').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('D2').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('D2').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')

		})


		$('#btnAddreverse27')[0].label = Tabledetail.findByTablename('D3').tablename+' '+Tabledetail.findByTablename('D3').status
		
		$('#btnAddreverse27').on('click',{
			if(Tabledetail.findByTablename('D3').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('D3').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('D3').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')

		})
		
		$('#btnAddreverse28')[0].label = Tabledetail.findByTablename('D4').tablename+' '+Tabledetail.findByTablename('D4').status
		
		$('#btnAddreverse28').on('click',{
			if(Tabledetail.findByTablename('D4').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('D4').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('D4').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')

		})


		$('#btnAddreverse29')[0].label = Tabledetail.findByTablename('D5').tablename+' '+Tabledetail.findByTablename('D5').status
		
		$('#btnAddreverse29').on('click',{
			if(Tabledetail.findByTablename('D5').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('D5').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('D5').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
		})

		$('#btnAddreverse30')[0].label = Tabledetail.findByTablename('D6').tablename+' '+Tabledetail.findByTablename('D6').status
		
		$('#btnAddreverse30').on('click',{
			if(Tabledetail.findByTablename('D6').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('D6').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('D6').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
		})

		$('#btnAddreverse31')[0].label = Tabledetail.findByTablename('D7').tablename+' '+Tabledetail.findByTablename('D7').status
		
		$('#btnAddreverse31').on('click',{
			if(Tabledetail.findByTablename('D7').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('D7').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('D7').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
		})


		$('#btnAddreverse32')[0].label = Tabledetail.findByTablename('D8').tablename+' '+Tabledetail.findByTablename('D8').status
		
		$('#btnAddreverse32').on('click',{
			if(Tabledetail.findByTablename('D8').status == 'ว่าง'){
			def td = new Tabledetail()
			def tm = new Member()
			def rt = new ReserveTable(
				member: tm.get(Member.findByUsername(session['username']).id),
				tabledetail: td.get(Tabledetail.findByTablename('D8').id)
			)
			rt.save()
			
			def ed = Tabledetail.get(Tabledetail.findByTablename('D8').id)
			ed.status = 'ไม่ว่าง'
			ed.save()
			alert('Reverse : OK คุณได้จองโต๊ะเรียบร้อยแล้วครับ')
			Executions.sendRedirect("/table.zul")
			}
			else 
				alert('โต๊ะถูกจองเรียบร้อยแล้วครับ  กรุณาจองโต๊ะอื่น')
		})					
    }
}