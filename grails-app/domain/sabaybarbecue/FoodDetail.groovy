package sabaybarbecue

class FoodDetail {

	String foodname
	Integer price
	String detail

	static hasMany = [food: Food, sendaddress: Sendaddress]
	
    static constraints = {
    }
}
