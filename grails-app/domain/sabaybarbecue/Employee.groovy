package sabaybarbecue

class Employee {

    String name 
    String sex
    String department
    String details
    String username
    String password
	
	static hasMany = [adjustments: Adjustment]
    
    static constraints = {
    }
}
