package st1920.automaton;

import org.junit.Test;
import static org.junit.Assert.*;

// import st1920.automaton.RegExpMatcher;

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
	public void testBug3a() {
		assertTrue(RegExpMatcher.matches("ab", "[a&b]"));
	}
	
	@Test
	public void testBug3b() {
		assertTrue(RegExpMatcher.matches("axb", "[a&b]"));
	}
	
	@Test
	public void testBug3c() {
		assertTrue(RegExpMatcher.matches("ab", "[a|b]"));
	}
	
	@Test
	public void testBug3d() {
		assertTrue(RegExpMatcher.matches("a", "(a|b|c)"));
	}
	
	@Test
	public void testBug4a() {
		assertTrue(RegExpMatcher.matches("a", "(a)\\1"));
	}

	@Test
	public void testBug4b() {
		assertTrue(RegExpMatcher.matches("a9", "(a)\\[0-9]"));
	}
	
	@Test
	public void testBug5a() {
		assertTrue(RegExpMatcher.matches("a", "[a--b]"));
	}
	
	@Test
	public void testBug5b() {
		assertTrue(RegExpMatcher.matches("https://www.brics.dk/automaton/doc/index.html?dk/brics/automaton/RegExp.html.",
										 "([a--Z0-9])+\\\\([a-zA-Z0-9])+\\\\.([a-z]){2,3}"));
	}
	
	@Test
	public void testBug6a() {
		assertTrue(RegExpMatcher.matches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaasaaaaabcabcabcabcbabcbabc", "abc"));
	}

	@Test
	public void testBug6b() {
		assertTrue(RegExpMatcher.matches("<head>content</head>aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
										 "\\|\\&\\?\\*\\+\\,\\~\\^\\.\\#\\@\\<\\>\\(\\)\\aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
	}
	
	@Test
	public void testBug7a() {
		assertTrue(RegExpMatcher.matches("a", "a{b}"));
	}
	
	@Test
	public void testBug7b() {
		assertTrue(RegExpMatcher.matches("f", "([a-zA-Z0-9])+\\\\@([a-zA-Z0-9])+\\\\.([a-z]){2,3"));
	}

	@Test
	public void testBug8a() {
		assertTrue(RegExpMatcher.matches("a", "a**"));
	}
	
	@Test
	public void testBug8b() {
		assertTrue(RegExpMatcher.matches("aaaaaaa", "a**"));
	}
	
	@Test
	public void testBug9a() {
		assertTrue(RegExpMatcher.matches("1", "<-1>"));
	}
	
	@Test
	public void testBug9b() {
		assertTrue(RegExpMatcher.matches("100", "<-100>"));
	}
	
	@Test
	public void testBug10a() {
		assertTrue(RegExpMatcher.matches("a1342aaaa", "a+"));	
	}
	
	@Test
	public void testBug10b() {
		assertTrue(RegExpMatcher.matches("a1342aaaa", "a*"));	
	}
	
	@Test
	public void testBug10c() {
		assertTrue(RegExpMatcher.matches("abc1342aaaa", "abc"));
	}

	@Test
	public void testBug11a() {
		assertTrue(RegExpMatcher.matches("b", "a?b"));
	}
	
	@Test
	public void testBug11b() {
		assertTrue(RegExpMatcher.matches("ba", "a?"));
	}
	
	@Test
	public void testBug11c() {
		assertTrue(RegExpMatcher.matches("ba", "b?a"));
	}
	
	@Test
	public void testBug12a() {
		assertTrue(RegExpMatcher.matches("(a)", "((a))"));
	}
	
	@Test
	public void testBug12b() {
		assertTrue(RegExpMatcher.matches("aaaaa", "((a))"));
	}
	
	@Test
	public void testBug13a() {
		assertTrue(RegExpMatcher.matches("a", "()a"));
	}
	
	@Test
	public void testBug13b() {
		assertTrue(RegExpMatcher.matches("abc", "()bc"));
	}
	
	@Test
	public void testBug14a() {
		assertTrue(RegExpMatcher.matches("abcabc", "[abc][abc"));
	}
	
	@Test
	public void testBug14b() {
		assertTrue(RegExpMatcher.matches("def", "[^abc"));
	}
	
	@Test
	public void testBug15a() {
		assertTrue(RegExpMatcher.matches("xabc", "abc"));
	}
	
	@Test
	public void testBug15b() {
		assertTrue(RegExpMatcher.matches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcabcabcabcbabcbabc", "a"));
	}
	
	@Test
	public void testBug15c() {
		assertTrue(RegExpMatcher.matches("aabbcc", "a*c"));
	}
	
	@Test
	public void testBug15d() {
		assertTrue(RegExpMatcher.matches("aabbcc", "a+c"));
	}
	
	@Test
	public void testBug15e() {
		assertTrue(RegExpMatcher.matches("bcaa", "a{2}"));
	}
	
	@Test
	public void testBug15f() {
		assertTrue(RegExpMatcher.matches("bcaa", "a{1,3}"));
	}
	
	@Test
	public void testBug15g() {
		assertTrue(RegExpMatcher.matches("acbdef", "~abc"));
	}
	
	
}