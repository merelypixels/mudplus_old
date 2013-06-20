package lib.interfaces

import mudplusdriver.lib.types.combat.DamageType

/**
 * Created with IntelliJ IDEA.
 * User: Wintermute
 * Date: 6/18/13
 * Time: 3:50 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Condition {
	DamageType damageType
	Closure<String> effectOnHeartbeat
}