package st1920.automaton;

import static org.junit.Assert.*;

import org.junit.Test;

public class task4Tests {
	
	@Test
	public void test01() {
		REString re = new REString("$");
		assertTrue(Wrapper.matches("\n", re));
	}

	@Test
	public void test02() {
		REString re = new REString("$");
		assertTrue(Wrapper.matches("\r", re));
	}

	@Test
	public void test03() {
		REString re = new REString("$");
		assertTrue(Wrapper.matches("\r\n", re));
	}

	@Test
	public void test04() {
		REString re = new REString("$$");
		assertTrue(Wrapper.matches("\r\n", re));
	}

	@Test
	public void test05() {
		REString re = new REString(".");
		assertTrue(Wrapper.matches("\r", re));
	}

	@Test
	public void test06() {
		REString re = new REString(".");
		assertTrue(Wrapper.matches("\n", re));
	}

	@Test
	public void test07() {
		REString re = new REString("..");
		assertTrue(Wrapper.matches("\r\n", re));
	}

	@Test
	public void test08() {
		REString re = new REString(".");
		assertFalse(Wrapper.matches("\r\n", re));
	}

	@Test
	public void test09() {
		REString re = new REString("$");
		assertFalse(Wrapper.matches("$", re));
	}

	@Test
	public void test10() {
		REString re = new REString("[$]");
		assertFalse(Wrapper.matches("\n", re));
	}

	@Test
	public void test11() {
		REString re = new REString("\r\n+");
		assertTrue(Wrapper.matches("\r\n\n\n", re));
	}

	@Test
	public void test12() {
		REString re = new REString("(\r\n)+");
		assertTrue(Wrapper.matches("\r\n\r\n\r\n", re));
	}

	@Test
	public void test13() {
		REString re = new REString("$");
		assertFalse(Wrapper.matches("\n\n", re));
	}

	@Test
	public void test14() {
		REString re = new REString("$");
		assertFalse(Wrapper.matches("\r\r", re));
	}

	@Test
	public void test15() {
		REString re = new REString("$");
		assertFalse(Wrapper.matches("\n\r", re));
	}
	
	
}
