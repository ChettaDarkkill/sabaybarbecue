package sabaybarbecue

class Customer {

	String name
	String email
	String tel
	String address
	String province 
	
	static hasMany = [food: Food]

    static constraints = {
    }
}
