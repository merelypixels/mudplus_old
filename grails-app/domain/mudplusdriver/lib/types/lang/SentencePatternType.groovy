package mudplusdriver.lib.types.lang

class SentencePatternType {
	public static final ADVERB_TOKEN = "adverb"
	public static final SUBJECT_TOKEN = "subject"
	public static final DIRECT_OBJECT_TOKEN = "direct_object"
	public static final ADJECTIVE_TOKEN = "adjective"
	public static final PREPOSITIONAL_PHRASE_TOKEN = "prepositional_phrase"
	public static final ONE_TOKENS = ["1", "1st", "first"]
	public static final TWO_TOKENS = ["2", "2nd", "second"]
	public static final THREE_TOKENS = ["3", "3rd", "third"]
	public static final FOUR_TOKENS = ["4", "4th", "fourth"]
	public static final FIVE_TOKENS = ["5", "5th", "fifth"]
	public static final SIX_TOKENS = ["6", "6th", "sixth"]
	public static final SEVEN_TOKENS = ["7", "7th", "seventh"]
	public static final EIGHT_TOKENS = ["8", "8th", "eighth"]
	public static final NINE_TOKENS = ["9", "9th", "ninth"]
	public static final TEN_TOKENS = ["10", "10th", "tenth"]
	public static final ELEVEN_TOKENS = ["11", "11th", "tenth"]
	public static final TWELVE_TOKENS = ["12", "12th", "twelvth"]
	public static final THIRTEEN_TOKENS = ["13", "13th", "thirteenth"]
	public static final FOURTEEN_TOKENS = ["14", "14th", "fourteenth"]
	public static final FIFTEEN_TOKENS = ["15", "15th", "fifteenth"]
	public static final SIXTEEN_TOKENS = ["16", "16th", "sixteenth"]
	public static final SEVENTEEN_TOKENS = ["17", "17th", "seventeenth"]
	public static final EIGHTEEN_TOKENS = ["18", "18th", "eighteenth"]
	public static final NINETEEN_TOKENS = ["19", "19th", "nineteenth"]

	public static final LAST_TOKEN = "last"

	public static final ADVERB_SHORT_TOKEN = "adv"
	public static final SUBJECT_SHORT_TOKEN = "sub"
	public static final DIRECT_OBJECT__SHORT_TOKEN = "do"
	public static final ADJECTIVE_SHORT_TOKEN = "adjective"
	public static final PREPOSITIONAL_PHRASE_SHORT_TOKEN = "prep"
	
	public static final DELIMITER_TOKENS = [",","and"]
	public static final END_TOKEN = [";"]

//	public static final

	//todo: possessive constants

    //todo: each of these tokens should be considered possibly plural
	public static final DEFAULT_PATTERNS_SECOND_TO_THIRD_PERSON = [
			"sub verb do",
			"sub verb adj do",
			"sub verb adv do",
			"sub verb adv adj do",
			"adj sub verb do",
			"adj sub verb adj do",
			"adj sub verb adv do",
			"adj sub verb adv adj do",
			"sub verb do prep",
			"sub verb adj do prep",
			"sub verb adv do prep",
			"sub verb adv adj do prep",
			"adj sub verb do prep",
			"adj sub verb adj do prep",
			"adj sub verb adv do prep",
			"adj sub verb adv adj do prep"
	]
	
	String pattern	

	static constraints = {
		pattern validator: {
			if(DEFAULT_PATTERNS_SECOND_TO_THIRD_PERSON.keySet().contains(it.toString())) return true
			else return false
		}
	}
}
