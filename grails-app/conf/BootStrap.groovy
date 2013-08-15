import sabaybarbecue.FoodDetail
import sabaybarbecue.Promotiondetail
import sabaybarbecue.Tabledetail
import sabaybarbecue.Foods
import sabaybarbecue.Employee

class BootStrap {

    def init = { servletContext ->
		
		def f = new FoodDetail(
    		detail:"ปราหมึกกรอบ เนื้อหมู เนื้อวัว เนื้อไก่ กุ้งพันปูอัด เกี๊ยวกุ้งสด หมูสามอย่าง หมูสไลค์ หอยนางรม เนื้อปลาสด หมูนุ่ม ไข่ไก่สด สาหร่ายทรงเครื่อง วุ้นเส้น ลูกชิ้น เต้าหู ตับหมูสด",
    		foodname:"ชุดอิ่มอร่อย",
    		price:"999"
    		)
    	f.save()

    	def f2 = new FoodDetail(
    		detail:"เมนูสำหรับลูกค้าที่ต้องการอิ่มอย่างประหยัด ซาลาเปา ขนมจีบ ก๋วยเตี๋ยวหลอด ลูกชิ้น ปอเปี๊ยะ เผือกทอด หอยจ๊อ ฮะเก๋า ปลาม้วน",
    		foodname:"ชุดพอเพียง",
    		price:"599"
    		) 
    	f2.save()

    	def f3 = new FoodDetail(
    		detail:"ผักและเห็ดนาๆชนิด สำหรับคนที่รักสุขภาพต้องเมนนี้เท่านั้น",
    		foodname:"ชุดเพื่อสุขภาพ",
    		price:"799"
    		)
    	f3.save()

    	def f4 = new FoodDetail(
    		detail:"ปลา ปลาหมึก กุ้ง เกี๊ยว เนื้อหมู เนื้อไก่ เนื้อวัว สาหร่าย เต้าหู้",
    		foodname:"ชุดเนื้อสุดอลังการ",
    		price:"1696"
    		)
    	f4.save()
		
		//==========================================================================================================================
		
		def promotiondetail1 = new Promotiondetail(detail:"ชุดนี้เหมาะสำหรับการมากันเป็นครอบครัว มีเนื้อหมู ผัก อย่างละ1ชุด",point:"300",promotionname:"ชุดครอบครัว")
		promotiondetail1.save()
	
		def promotiondetail2 = new Promotiondetail(detail:"ชุดนี้เหมาะสำหรับไม่ชอบรับประทานเนื้อ โดยจะเน้นไปที่เมนูผักสะส่วนใหญ่",point:"200",promotionname:"ชุดผักรวม")
		promotiondetail2.save()
	
		def promotiondetail3 = new Promotiondetail(detail:"ชุดนี้สำหรับท่านที่ชอบรับประทานเเบบไม่ยั่งต้องชุดนี้ มีทั้ง เนื้อสัตว์ ผัก เเละน้ำจิ้มอีกหลากหลายให้ท่านเลือกได้ตามใจ",point:"600",promotionname:"ชุดจุใจ")
		promotiondetail3.save()
	
		def promotiondetail4 = new Promotiondetail(detail:"ชุดนี้สำหรับคนที่ชอบรับประทานเยอะ ต้องชุดนี้เลย ประกอบไปด้วยทั้ง เนื้อสัตว์เเละยังรวมทั้งอาหารทะเล",point:"600",promotionname:"ชุดอิ่มสุด")
		promotiondetail4.save()
	
		def promotiondetail5 = new Promotiondetail(detail:"ชุดนี้เหมาะสำหรับคนที่ชอบรับประทานอาหารทะเล ชุดนี้ประกอบด้วย หมึก กุ้ง เเละปลา",point:"400",promotionname:"ชุดทะเล")
		promotiondetail5.save()
	
		def promotiondetail6 = new Promotiondetail(detail:"ชุดนี้สำหรับคนที่กินไม่เยอะ เหมาะสำหรับชุดนี้โดยจะมีทั้งเนื้อสัตว์ ผักรวมไปถึงอาหารทะเลให้ท่านสามารถเลือกรับประทานได้",point:"300",promotionname:"ชุดสุดคุ้ม")
		promotiondetail6.save()
		
		//==========================================================================================================================
		
		new Tabledetail(status: "ว่าง", tablename: "A1").save()
		new Tabledetail(status: "ว่าง", tablename: "A2").save()
		new Tabledetail(status: "ว่าง", tablename: "A3").save()
		new Tabledetail(status: "ว่าง", tablename: "A4").save()
		new Tabledetail(status: "ว่าง", tablename: "A5").save()
		new Tabledetail(status: "ว่าง", tablename: "A6").save()
		new Tabledetail(status: "ว่าง", tablename: "A7").save()
		new Tabledetail(status: "ว่าง", tablename: "A8").save()

		new Tabledetail(status: "ว่าง", tablename: "B1").save()
		new Tabledetail(status: "ว่าง", tablename: "B2").save()
		new Tabledetail(status: "ว่าง", tablename: "B3").save()
		new Tabledetail(status: "ว่าง", tablename: "B4").save()
		new Tabledetail(status: "ว่าง", tablename: "B5").save()
		new Tabledetail(status: "ว่าง", tablename: "B6").save()
		new Tabledetail(status: "ว่าง", tablename: "B7").save()
		new Tabledetail(status: "ว่าง", tablename: "B8").save()

		new Tabledetail(status: "ว่าง", tablename: "C1").save()
		new Tabledetail(status: "ว่าง", tablename: "C2").save()
		new Tabledetail(status: "ว่าง", tablename: "C3").save()
		new Tabledetail(status: "ว่าง", tablename: "C4").save()
		new Tabledetail(status: "ว่าง", tablename: "C5").save()
		new Tabledetail(status: "ว่าง", tablename: "C6").save()
		new Tabledetail(status: "ว่าง", tablename: "C7").save()
		new Tabledetail(status: "ว่าง", tablename: "C8").save()

		new Tabledetail(status: "ว่าง", tablename: "D1").save()
		new Tabledetail(status: "ว่าง", tablename: "D2").save()
		new Tabledetail(status: "ว่าง", tablename: "D3").save()
		new Tabledetail(status: "ว่าง", tablename: "D4").save()
		new Tabledetail(status: "ว่าง", tablename: "D5").save()
		new Tabledetail(status: "ว่าง", tablename: "D6").save()
		new Tabledetail(status: "ว่าง", tablename: "D7").save()
		new Tabledetail(status: "ว่าง", tablename: "D8").save()
		
		//==========================================================================================================================
		
		def emp1 = new Employee(
    		name: "นายเชษฐา ครอบกระโทก",
    		sex: "ชาย",
    		department: "ผู้จัดการ",
    		details: "จัดการทุกอย่าง",
            username:"admin",
            password:"1234"
    	)
    	emp1.save()
		
		def emp2 = new Employee(
			name:"nattapong",
			sex:"male",
			department:"พนักงานดูแลคลังสินค้า" ,
			details:"ไม่มีอะไรพิเศษ" ,
			username:"tck",
			password:"12345"
		)
		emp2.save()
		
		//==========================================================================================================================
		
		def fs1 = new Foods(
			food_name: "apple",
			//Date editDate = new Date(),
			date_expire: "27Nov",
			amount: 20,
			buy_by:  "nattapong",
			price: 20
		)
		
		fs1.save()
		
		def fs2 = new Foods(
			food_name: "orange",
			//Date editDate = new Date(),
			date_expire: "10Feb",
			amount: 15,
			buy_by:  "sutiranan",
			price: 30
		)
		
		fs2.save()
		
		def fs3 = new Foods(
			food_name: "banana",
			//Date editDate = new Date(),
			date_expire: "15Feb",
			amount: 39,
			buy_by:  "sakayaparb",
			price: 100
		)
		
		fs3.save()
		
		def fs4 = new Foods(
			food_name: "mango",
			//Date editDate = new Date(),
			date_expire: "29Dec",
			amount: 13,
			buy_by:  "chatta",
			price: 39
		)
		
		fs4.save()
		
		//==========================================================================================================================
    }
	
    def destroy = {
    }
}
