package sabaybarbecue

class Promotiondetail {
	
	String promotionname
	String detail
	double point
	
	static hasMany = [promotion: Promotion]
	
    static constraints = {
    }
}
