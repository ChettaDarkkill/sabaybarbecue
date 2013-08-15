package sabaybarbecue

class Member {

	String username
	String password
	String name
	String lastname
	String idnumber
	String address
	String amphoe
	String province
	String zipcode
	String email
	String phonenumber
	double point = 0
	
	static hasMany = [sendaddress: Sendaddress, reservetable: ReserveTable, promotion: Promotion, addpoint: Addpoint]

    static constraints = {
    }
}
