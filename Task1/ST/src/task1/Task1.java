package task1;

import org.junit.Test;
import static org.junit.Assert.*;

import st1920.automaton.RegExpMatcher;

public class Task1 {

	@Test
	public void testBug1() {
		assertTrue(RegExpMatcher.matches("", ""));
	}
	
	@Test
	public void testBug2() {
		assertTrue(RegExpMatcher.matches("a", ""));
	}

	@Test
	public void testBug3() {
		assertTrue(RegExpMatcher.matches("ab", "[a&b]"));
	}

	@Test
	public void testBug4() {
		assertTrue(RegExpMatcher.matches("a9", "(a)\\[0-9]"));
	}
	
	@Test
	public void testBug5() {
		assertTrue(RegExpMatcher.matches("https://www.brics.dk/automaton/doc/index.html?dk/brics/automaton/RegExp.html.",
										 "([a--Z0-9])+\\\\([a-zA-Z0-9])+\\\\.([a-z]){2,3}"));
	}

	@Test
	public void testBug6() {
		assertTrue(RegExpMatcher.matches("<head>content</head>aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
										 "\\|\\&\\?\\*\\+\\,\\~\\^\\.\\#\\@\\<\\>\\(\\)\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
	}
	
	@Test
	public void testBug7() {
		assertTrue(RegExpMatcher.matches("f", "([a-zA-Z0-9])+\\\\@([a-zA-Z0-9])+\\\\.([a-z]){2,3"));
	}

	@Test
	public void testBug8() {
		assertTrue(RegExpMatcher.matches("aaaaaaa", "a**"));
	}

	@Test
	public void testBug9() {
		assertTrue(RegExpMatcher.matches("100", "<-100>"));
	}
	
	@Test
	public void testBug10() {
		assertTrue(RegExpMatcher.matches("a1342aaaa", "a+"));	
	}

	@Test
	public void testBug11() {
		assertTrue(RegExpMatcher.matches("b", "a?b"));
	}
	
	@Test
	public void testBug12() {
		assertTrue(RegExpMatcher.matches("(a)", "((a))"));
	}
	
	@Test
	public void testBug13() {
		assertTrue(RegExpMatcher.matches("a", "()a"));
	}
	
	@Test
	public void testBug14() {
		assertTrue(RegExpMatcher.matches("abcabc", "[abc][abc"));
	}
	
	@Test
	public void testBug15() {
		assertTrue(RegExpMatcher.matches("xabc", "abc"));
	}
}