package st1920.automaton;


public class Wrapper {
	
	public static boolean matches(String m, REString re) {
		return RegExpMatcher.matches(m, re.getREString());
	}
	
	public static REString makeOrString(REString s1, REString s2) {
		return new REString(s1.getREString() + "|" + s2.getREString());
	}
	
	public static REString makeAndString(REString s1, REString s2) {
		return new REString(s1.getREString() + "&" + s2.getREString());
	}
	
	public static REString makeConcatenation(REString s1, REString s2) {
		return new REString(s1.getREString() + s2.getREString());
	}
	
	public static REString makeAlphaREString(REString s) {
		return new REString(s.getREString() + "a");
	}
	
	public static REString makeNumREString(REString s) {
		return new REString(s.getREString() + "1");
	}
	
	public static REString makeZeroOrOneREString(REString s) {
		return new REString(s.getREString() + "?");
	}

	public static REString makeZeroOrMoreREString(REString s) {
		return new REString(s.getREString() + "*");
	}
	
	public static REString makeOneOrMoreREString(REString s) {
		return new REString(s.getREString() + "+");
	}
	
	public static REString makeNOccurences(REString s, int n) {
		return new REString(s.getREString() + "{" + n + "}");
	}
	
	public static REString makeNOrMoreOccurences(REString s, int n) {
		return new REString(s.getREString() + "{" + n + ",}");
	}
	
	public static REString makeBetweenNandMOcc(REString s, int n, int m) {
		return new REString(s.getREString() + "{" + n + "," + m + "}");
	}
	
	public static REString makeExcluded(REString s) {
		return new REString("~" + s.getREString());
	}
	
	public static REString makeCharClass(REString s) {
		return new REString("[" + s.getREString() + "]");
	}
	
	public static REString makeNotCharClass(REString s) {
		return new REString("[^" + s.getREString() + "]");
	}
	
	public static REString makeAnyChar(REString s) {
		return new REString(s.getREString() + ".");
	}
	
	public static REString makeNothing(REString s) {
		return new REString(s.getREString() + "#");
	}
	
	public static REString makeAnyString(REString s) {
		return new REString(s.getREString() + "@");
	}
	
	public static REString makeExact(REString s) {
		return new REString("\"" + s.getREString() + "\"");
	}
	
	public static REString makeNumBetween(REString s, int n, int m) {
		return new REString(s.getREString() + "<" + n + "-" + m + ">");
	}
	
	public static REString makeGroup(REString s) {
		return new REString("(" + s.getREString() + ")");
	}
	
}
