package mudplusdriver.lib.types.body

class RaceType {
	String name

	static constraints = {
		name nullable: false, blank: false, unique: true
	}
}
