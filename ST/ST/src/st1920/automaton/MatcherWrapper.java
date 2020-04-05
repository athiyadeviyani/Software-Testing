package st1920.automaton;

import java.util.Random;

public class MatcherWrapper {
	
	public static boolean matches(MatchString m, REString re) {
		return RegExpMatcher.matches(m.getMatchString(), re.getREString());
	}
	
	// ReString METHODS
	
//	public static REString makeEmptyREString() {
//		return new REString("");
//	}
	
	public static REString makeOrString(REString s1, REString s2) {
		return new REString(s1.getREString() + '|' + s2.getREString());
	}
	
	public static REString makeAndString(REString s1, REString s2) {
		return new REString(s1.getREString() + '&' + s2.getREString());
	}
	
	public static REString makeConcatenation(REString s1, REString s2) {
		return new REString(s1.getREString() + s2.getREString());
	}
	
	public static REString makeAlphaREString() {
		return new REString("a");
	}
	
	public static REString makeNumREString() {
		return new REString("1");
	}
	
	public static REString makeZeroOrOneREString() {
		return new REString("?");
	}

	public static REString makeZeroOrMoreREString() {
		return new REString("*");
	}
	
	public static REString makeOneOrMoreREString() {
		return new REString("+");
	}
	
	public static REString makeNOccurences(REString s) {
		Random rnd = new Random();
		int n = rnd.nextInt(100);
		return new REString(s.getREString() + '{' + n + '}');
	}
	
	public static REString makeNOrMoreOccurences(REString s) {
		Random rnd = new Random();
		int n = rnd.nextInt(100);
		return new REString(s.getREString() + '{' + n + ',' + '}');
	}
	
	public static REString makeBetweenNandMOcc(REString s) {
		Random rnd = new Random();
		int n = rnd.nextInt(100);
		int m = rnd.nextInt(100);
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
		return new REString(s.getREString() + ".");
	}
	
	public static REString makeNothing(REString s) {
		return new REString(s.getREString() + "#");
	}
	
	public static REString makeAnyString(REString s) {
		return new REString(s.getREString() + "@");
	}
	
	public static REString makeExact(REString s) {
		return new REString('\"' + s.getREString() + '\"');
	}
	
	public static REString makeNumBetween(REString s) {
		Random rnd = new Random();
		int n = rnd.nextInt(100);
		int m = rnd.nextInt(100);
		return new REString(s.getREString() + '<' + n + '-' + m + '>');
	}
	
	public static REString makeGroup(REString s) {
		return new REString(s.getREString() + '(' + s.getREString() + ')');
	}
	
	
	// MatchString METHODS
	
//	public static MatchString makeEmptyString() {
//		return new MatchString("");
//	}
	
	public static MatchString makeAlpha() {
		return new MatchString("a");
	}
	
	public static MatchString makeNum() {
		return new MatchString("1");
	}
	
	public static MatchString makeSpecialCharacter() {
		return new MatchString("%");
	}
	
	public static MatchString makeConcatenationMatchString(MatchString l, MatchString r) {
		return new MatchString(l.getMatchString() + r.getMatchString());
	}

}


//package st1920.automaton;
//
//public class MatcherWrapper {
//	
//	public static boolean matches(MatchString m, REString re) {
//		return RegExpMatcher.matches(m.string, re.string);
//	}
//	
//}

