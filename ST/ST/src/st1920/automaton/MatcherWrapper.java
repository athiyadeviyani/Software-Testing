package st1920.automaton;

public class MatcherWrapper {
	
	public static boolean matches(MatchString m, REString re) {
		return RegExpMatcher.matches(m.getMatchString(), re.getREString());
	}
	
	
	// ReString METHODS
	
	public static REString makeOrString(REString s1, REString s2) {
		return new REString(s1.getREString() + '|' + s2.getREString());
	}
	
	public static REString makeAndString(REString s1, REString s2) {
		return new REString(s1.getREString() + '&' + s2.getREString());
	}
	
	public static REString makeConcatenation(REString s1, REString s2) {
		return new REString(s1.getREString() + s2.getREString());
	}
	
	public static REString makeAlpha(REString s) {
		return new REString(s.getREString() + 'a');
	}
	
	public static REString makeNum(REString s) {
		return new REString(s.getREString() + '1');
	}
	
	public static REString makeZeroOrOne(REString s) {
		return new REString(s.getREString() + '?');
	}

	public static REString makeZeroOrMore(REString s) {
		return new REString(s.getREString() + '*');
	}
	
	public static REString makeOneOrMore(REString s) {
		return new REString(s.getREString() + '+');
	}
	
	public static REString makeNOccurences(REString s, int n) {
		return new REString(s.getREString() + '{' + n + '}');
	}
	
	public static REString makeNOrMoreOccurences(REString s, int n) {
		return new REString(s.getREString() + '{' + n + ',' + '}');
	}
	
	public static REString makeBetweenNandMOcc(REString s, int n, int m) {
		return new REString(s.getREString() + '{' + n + ',' + m + '}');
	}
	
	public static REString makeExcluded(REString s) {
		return new REString('~' + s.getREString());
	}
	
	public static REString makeCharClass(REString s) {
		return new REString('[' + s.getREString() + ']');
	}
	
	public static REString makeNotCharClass(REString s) {
		return new REString('[' + '^' + s.getREString() + ']');
	}
	
	public static REString makeAnyChar(REString s) {
		return new REString(s.getREString() + '.');
	}
	
	public static REString makeNothing(REString s) {
		return new REString(s.getREString() + '#');
	}
	
	public static REString makeAnyString(REString s) {
		return new REString(s.getREString() + '@');
	}
	
	public static REString makeExact(REString s) {
		return new REString('\"' + s.getREString() + '\"');
	}
	
	public static REString makeNumBetween(REString s, int n, int m) {
		return new REString(s.getREString() + '<' + n + '-' + m + '>');
	}
	
	public static REString makeGroup(REString s) {
		return new REString(s.getREString() + '(' + s.getREString() + ')');
	}
	
	
	// MatchString METHODS
	
	public static MatchString makeAlpha() {
		return new MatchString("a");
	}
	
	public static MatchString makeNum() {
		return new MatchString("1");
	}
	
	public static MatchString makeSpecialCharacter() {
		return new MatchString("%");
	}
	
	public static MatchString makeConcatenation(MatchString l, MatchString r) {
		return new MatchString(l.getMatchString() + r.getMatchString());
	}

}
