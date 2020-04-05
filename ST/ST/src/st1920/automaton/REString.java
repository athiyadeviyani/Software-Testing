package st1920.automaton;

public class REString {
	
	private String pattern;
	
	public REString(String re) {
		pattern = re;
	}
	
	public String getREString() {
		return pattern;
	}
	
}

//package st1920.automaton;
//
//import java.util.Random;
//
//public class REString {
//	
//	public String string;
//	
//	public REString(String re) {
//		string = re;
//	}
//	
//	public static REString makeOrString(REString s1, REString s2) {
//		return new REString(s1.string + '|' + s2.string);
//	}
//	
//	public static REString makeAndString(REString s1, REString s2) {
//		return new REString(s1.string + '&' + s2.string);
//	}
//	
//	public static REString makeConcatenation(REString s1, REString s2) {
//		return new REString(s1.string + s2.string);
//	}
//	
//	public static REString makeAlphaREString() {
//		return new REString("a");
//	}
//	
//	public static REString makeNumREString() {
//		return new REString("1");
//	}
//	
//	public static REString makeZeroOrOneREString() {
//		return new REString("?");
//	}
//	
//	public static REString makeZeroOrMoreREString() {
//		return new REString("*");
//	}
//	
//	public static REString makeOneOrMoreREString() {
//		return new REString("+");
//	}
//	
//	public static REString makeNOccurences(REString s) {
//		Random rnd = new Random();
//		int n = rnd.nextInt(100);
//		return new REString(s.string + '{' + n + '}');
//	}
//	
//	public static REString makeNOrMoreOccurences(REString s) {
//		Random rnd = new Random();
//		int n = rnd.nextInt(100);
//		return new REString(s.string + '{' + n + ',' + '}');
//	}
//	
//	public static REString makeBetweenNandMOcc(REString s) {
//		Random rnd = new Random();
//		int n = rnd.nextInt(100);
//		int m = rnd.nextInt(100);
//		return new REString(s.string + '{' + n + ',' + m + '}');
//	}
//	
//	public static REString makeExcluded(REString s) {
//		return new REString('~' + s.string);
//	}
//	
//	public static REString makeCharClass(REString s) {
//		return new REString('[' + s.string + ']');
//	}
//	
//	public static REString makeNotCharClass(REString s) {
//		return new REString('[' + '^' + s.string + ']');
//	}
//	
//	public static REString makeAnyChar(REString s) {
//		return new REString(s.string + '.');
//	}
//	
//	public static REString makeNothing(REString s) {
//		return new REString(s.string + '#');
//	}
//	
//	public static REString makeAnyString(REString s) {
//		return new REString(s.string + '@');
//	}
//	
//	public static REString makeExact(REString s) {
//		return new REString('\"' + s.string + '\"');
//	}
//	
//	public static REString makeNumBetween(REString s) {
//		Random rnd = new Random();
//		int n = rnd.nextInt(100);
//		int m = rnd.nextInt(100);
//		return new REString(s.string + '<' + n + '-' + m + '>');
//	}
//	
//	public static REString makeGroup(REString s) {
//		return new REString(s.string + '(' + s.string + ')');
//	}
//	
//}






