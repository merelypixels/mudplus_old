
/*
 * DEFAULTS: used to populate domain classes upon server restart
 */
grails.mudplus.lib.defaults.useDefaults = true

//combat defaults
grails.mudplus.lib.defaults.damageTypes = [
		"physical",
		"bleed",
		"water",
		"ice",
		"fire",
		"poison",
		"disease",
		"magic",
		"mental",
		"holy",
		"unholy",
		"suffocation"
]
grails.mudplus.lib.defaults.attackTypes = [
		"blunt",
		"piercing",
		"slashing",
		"projectile",
		"gas",
		"trap",
		"falling",
		"drowning",
		"cone",
		"exploding",
		"twisting",
		"erasure",
		"internal"
]

//places defaults
grails.mudplus.lib.defaults.place.area.size = [x: 5000, y:5000, z:5000]
grails.mudplus.lib.defaults.place.terrain.names = [
		"path",
		"street",
		"forest",
		"jungle",
		"plains",
		"desert",
		"mud",
		"tundra",
		"town",
		"city",
		"castle",
		"underground",
		"sky",
		"barren planet",
		"underwater",
		"volcanic",
		"lava"
]

//measurement defaults
grails.mudplus.lib.defaults.measurement.currency.value = [
        "copper" : 5000000,
		"electrum" : 1000000,
		"silver": 200000,
		"gold": 2000,
		"platinum" : 200,
		"diamond" : 20,
		"paper" : 10,
		"credits" : 1
]
grails.mudplus.lib.defaults.measurement.weight.value = [
		"ounce" : 1,
		"quarter pound" : 4,
		"half pound" : 8,
        "pound" : 16,
		"quarter ton" : 8000,
		"half ton" : 16000,
		"ton" : 32000
]
grails.mudplus.lib.defaults.measurement.length.value = [
        "millimeter" : 1,
		"centimeter" : 10,
		"quarter meter" : 250,
		"half meter" : 500,
		"meter" : 1000,
		"quarter kilometer" : 250000,
		"half kilometer" : 500000,
		"kilometer" : 1000000
]
grails.mudplus.lib.defaults.measurement.volume.value = []


//language parsing defaults
grails.mudplus.lib.defaults.language.sentence.patterns = []

//security defaults
grails.mudplus.lib.defaults.security.user.role.names = [
        "admin",
		"mentor",
		"creator",
		"diety",
		"avatar",
		"high mortal",
		"mortal",
		"newbie",
		"all"	
]
grails.mudplus.lib.defaults.security.maximumQueuedCommandsPerUser = 50

//communication defaults
grails.mudplus.lib.defaults.communication.channel.allowCustom = true
grails.mudplus.lib.defaults.communication.channel.role.names = [
		"admin",
		"mentor",
		"creator",
		"diety",
		"avatar",
		"high mortal",
		"mortal",
		"newbie",
		"all"
]
grails.mudplus.lib.defaults.communication.channel.classes.names = [
        "fighter",
		"ranger",
		"kataan",
		"cleric",
		"monk",
		"rogue",
		"mage"
]
grails.mudplus.lib.defaults.communication.channel.guilds.names = [
        "druid",
		"witch",
		"brethren",
		"seeker"
]