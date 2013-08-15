package sabaybarbecue

class Foods {
	
	String food_name
	Date editDate = new Date()
	String date_expire
	Integer amount
	String buy_by
	Integer price
	
	static hasMany = [adjustments: Adjustment]
	
    static constraints = {
    }
}
