package st1920.automaton;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task1 {

	@Test
	public void testBug1() {
		assertFalse(RegExpMatcher.matches("", ""));
	}
	
	@Test
	public void testBug2() {
		assertFalse(RegExpMatcher.matches("a", ""));
	}

	@Test
	public void testBug3() {
		assertFalse(RegExpMatcher.matches("ab", "[a&b]"));
	}

	@Test
	public void testBug4() {
		assertFalse(RegExpMatcher.matches("a9", "(a)\\[0-9]"));
	}
	
	@Test
	public void testBug5() {
		assertFalse(RegExpMatcher.matches("https://www.brics.dk/automaton/doc/index.html?dk/brics/automaton/RegExp.html.",
										 "([a--Z0-9])+\\\\([a-zA-Z0-9])+\\\\.([a-z]){2,3}"));
	}

	@Test
	public void testBug6() {
		assertFalse(RegExpMatcher.matches("<head>content</head>aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
										 "\\|\\&\\?\\*\\+\\,\\~\\^\\.\\#\\@\\<\\>\\(\\)\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
	}
	
	@Test
	public void testBug7() {
		assertFalse(RegExpMatcher.matches("f", "([a-zA-Z0-9])+\\\\@([a-zA-Z0-9])+\\\\.([a-z]){2,3"));
	}

	@Test
	public void testBug8() {
		assertFalse(RegExpMatcher.matches("aaaaaaa", "a**"));
	}

	@Test
	public void testBug9() {
		assertFalse(RegExpMatcher.matches("100", "<-100>"));
	}
	
	@Test
	public void testBug10() {
		assertFalse(RegExpMatcher.matches("a1342aaaa", "a+"));	
	}

	@Test
	public void testBug11() {
		assertFalse(RegExpMatcher.matches("b", "a?b"));
	}
	
	@Test
	public void testBug12() {
		assertFalse(RegExpMatcher.matches("(a)", "((a))"));
	}
	
	@Test
	public void testBug13() {
		assertFalse(RegExpMatcher.matches("a", "()a"));
	}
	
	@Test
	public void testBug14() {
		assertFalse(RegExpMatcher.matches("abcabc", "[abc][abc"));
	}
	
	@Test
	public void testBug15() {
		assertFalse(RegExpMatcher.matches("xabc", "abc"));
	}
}