package sabaybarbecue

class Adjustment {

	//adjustment เป็นฝั่งหลาย Employee และ Food เป็น One
	Date editedDate = new Date()
	String type
	
	static belongsTo = [employee: Employee, foods: Foods]
	
    static constraints = {
    }
}
