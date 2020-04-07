package st1920.automaton;

import static org.junit.Assert.*;

import org.junit.Test;

public class task4Tests {
	
	@Test
	public void test1() {
		assertTrue(
				RegExpMatcher.matches("\n", "$"));
	}
	
	@Test
	public void test2() {
		assertTrue(
				RegExpMatcher.matches("\r", "$"));
	}
	
	@Test
	public void test3() {
		assertTrue(
				RegExpMatcher.matches("\r\n", "$"));
	}

	@Test
	public void test4() {
		assertTrue(
				RegExpMatcher.matches("\r\n", "$$"));
	}
	
	@Test
	public void test5() {
		assertTrue(
				RegExpMatcher.matches("\r", "."));
	}
	
	@Test
	public void test6() {
		assertTrue(
				RegExpMatcher.matches("\n", "."));
	}
	
	@Test
	public void test7() {
		assertTrue(
				RegExpMatcher.matches("\r\n", ".."));
	}
	
	@Test
	public void test8() {
		assertTrue(
				RegExpMatcher.matches("\r\n", "."));
	}
	
	@Test
	public void test9() {
		assertFalse(
				RegExpMatcher.matches("$", "$"));
	}
	
	@Test
	public void test10() {
		assertFalse(
				RegExpMatcher.matches("\n", "[$]"));
	}
	
	@Test
	public void test11() {
		assertTrue(
				RegExpMatcher.matches("\r\n\n\n", "\r\n+"));
	}
	
	@Test
	public void test12() {
		assertTrue(
				RegExpMatcher.matches("\r\n\r\n\r\n", "\r\n+"));
	}
	
	@Test
	public void test13() {
		assertFalse(
				RegExpMatcher.matches("\n\n", "$"));
	}
	
	
}
