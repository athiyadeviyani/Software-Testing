
package st1920.automaton;

public class MatchString {
	
	private String matchstring;
	
	public MatchString(String m) {
		matchstring = m;
	}
	
	public String getMatchString() {
		return matchstring;
	}
}

//package st1920.automaton;
//
//public class MatchString {
//	
//	public String string;
//	
//	public MatchString(String m) {
//		string = m;
//	}
//	
//	public static MatchString makeAlpha() {
//		return new MatchString("a");
//	}
//	
//	public static MatchString makeNum() {
//		return new MatchString("1");
//	}
//	
//	public static MatchString makeSpecialCharacter() {
//		return new MatchString("%");
//	}
//	
//	public static MatchString makeConcatenationMatchString(MatchString l, MatchString r) {
//		return new MatchString(l.string + r.string);
//	}
//}

