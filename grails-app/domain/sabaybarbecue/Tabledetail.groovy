package sabaybarbecue

class Tabledetail {

	String tablename
	String status
	
	static hasMany = [reservetable: ReserveTable]

    static constraints = {
    }
}
	