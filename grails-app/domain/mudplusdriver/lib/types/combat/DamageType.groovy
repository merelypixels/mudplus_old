package mudplusdriver.lib.types.combat

import javax.annotation.security.RolesAllowed

class DamageType {
	String name

	@RolesAllowed(['ROLE_ADMIN', "ROLE_ARCH", "ROLE_LAW", "ROLE_DEVELOPMENT", "ROLE_CREATOR", "ROLE_DIETY", "ROLE_AVATAR", "ROLE_HIGH_MORTAL", "ROLE_MORTAL", "ROLE_NEWBIE", "ROLE_ALL"])
	transient Integer getDamageFrequency() {
		2.power((id as Integer) - 1)
	}

	static constraints = {
		name unique: true
	}
}