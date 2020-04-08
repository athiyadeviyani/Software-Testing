package st1920.automaton;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

public class Task3_all {

	/////////// TASK 3_2 STARTS HERE

	@Test
    public void test01() {
		REString re = new REString("#");
    	assertFalse(Wrapper.matches("",re));
    }

	@Test
    public void test02() {
		REString re = new REString("@");
    	assertTrue(Wrapper.matches("anystring",re));
    }
	
	
	@Test
    public void test03() {
		REString re = new REString("<1-3>");
    	assertTrue(Wrapper.matches("2", re));
    }
	
	@Test
    public void test04() {
		REString re = new REString("<3-1>");
		assertTrue(Wrapper.matches("2", re));
    }
	
	@Test
    public void test05() {
		REString re = new REString("[a-zA-Z]*[^a-zA-Z]");
    	assertTrue(Wrapper.matches("notAChar$",re));
    }
	
	@Test
	public void test06() {
		REString re = new REString("a@");
		assertTrue(Wrapper.matches("abc", re));
	}
	
	@Test
	public void test07() {
		REString re = new REString("a{4}");
		assertTrue(Wrapper.matches("aaaa", re));
	}
	
	@Test
	public void test08() {
		REString re = new REString("a{4,}");
		assertTrue(Wrapper.matches("aaaaaa", re));
	}
	
	@Test
	public void test09() {
		REString re = new REString("a{4,6}");
		assertTrue(Wrapper.matches("aaaaaa", re));
	}
	
	@Test
    public void test10() {
		REString re = new REString("1-3");
    	assertFalse(Wrapper.matches("2", re));
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void test11() {
		REString re = new REString("<1-3");
    	Wrapper.matches("2", re);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void test12() {
		REString re = new REString("(a");
    	Wrapper.matches("a", re);
    }
	
	@Test
    public void test13() {
		REString re = new REString("aa&bb");
    	assertFalse(Wrapper.matches("aacbb", re));
    }
	
	@Test
    public void test14() {
		REString re = new REString("aa|bb");
    	assertFalse(Wrapper.matches("aacbb", re));
    }
	
	@Test
	public void test15() {
		REString re = new REString("a?b+c*d{2}");
		assertTrue(Wrapper.matches("abcdd", re));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test16() {
		REString re = new REString("a?b+c*d{e}");
		Wrapper.matches("abcdd", re);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test17() {
		REString re = new REString("a?b+c*d{2");
		Wrapper.matches("abcdd", re);
	}
	
	@Test
	public void test18() {
		REString re = new REString("([a-zA-Z0-9])+\\@([a-zA-Z0-9])+\\.([a-z]){2,3}");
		assertTrue(Wrapper.matches("foo@bar.com", re));
	}
	
	@Test
	public void test19() {
		REString re = new REString("[a]");
		assertFalse(Wrapper.matches("abcd", re));
	}
	
	@Test
	public void test20() {
		REString re = new REString("[a-d]*");
		assertTrue(Wrapper.matches("abdc", re));
	}
	
	@Test
	public void test21() {
		REString re = new REString(".");
		assertTrue(Wrapper.matches("a", re));
	}
	
	@Test
	public void test22() {
		REString re = new REString("\"edinburgh\"");
		assertTrue(Wrapper.matches("edinburgh", re));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void test23() {
		REString re = new REString("\"edinburgh");
		Wrapper.matches("edinburgh", re);
	}
	
	@Test
	public void test24() {
		REString re = new REString("()");
		assertTrue(Wrapper.matches("", re));
	}
	
	@Test(expected = IllegalArgumentException.class)
    public void test25() {
		REString re = new REString("<1>");
    	Wrapper.matches("2", re);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void test26() {
		REString re = new REString("<1->");
    	Wrapper.matches("2", re);
    }
	
	@Test
	public void test27() {
		REString re = new REString("<1-12>");
		assertTrue(Wrapper.matches("2", re));
	}
	
	@Test
    public void test28() {
		REString re = new REString("a?b+c*d{1}");
		assertFalse(Wrapper.matches("abc", re));
    }
	
	@Test
    public void test29() {
		REString re = new REString("~a");
		assertTrue(Wrapper.matches("b", re));
    }
	
	@Test
    public void test30() {
		REString re = new REString("a|~c");
		assertTrue(Wrapper.matches("b", re));
    }
	
	@Test
    public void test31() {
		REString re = new REString("~b");
		assertFalse(Wrapper.matches("b", re));
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void test32() {
		REString re = new REString("[a");
    	Wrapper.matches("a", re);
    }

	@Test
    public void test33() {
		REString re = new REString("@");
		assertTrue(Wrapper.matches("@@", re));
    }
	
	@Test
	public void test34() {
		REString re = new REString("ab{0,1}bc");
		assertTrue(Wrapper.matches("abc", re));
	}
	
	@Test
	public void test35() {
		REString re = new REString("a{2,1}");
		assertFalse(Wrapper.matches("a", re));
	}
	
	@Test
	public void test36() {
		REString re = new REString("[z-a]");
		assertFalse(Wrapper.matches("a", re));
	}
	@Test
	
	public void test37() {
		REString re = new REString("[3-1]");
		assertFalse(Wrapper.matches("2", re));
	}
	
	@Test(expected = IllegalArgumentException.class)
    public void test38() {
		REString re = new REString("a&");
    	assertTrue(Wrapper.matches("",re));
    }
	
	@Test
    public void test39() {
		REString re = new REString("[a-]");
    	assertTrue(Wrapper.matches("a",re));
    }
	
	@Test
    public void test40() {
		REString re = new REString("<1-1>");
    	assertTrue(Wrapper.matches("1",re));
    }
	
	@Test
    public void test41() {
		REString re = new REString("<12-0>");
    	assertTrue(Wrapper.matches("2",re));
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void test42() {
		REString re = new REString("<12--1>");
    	Wrapper.matches("2",re);
    }
	
	@Test(expected = IllegalArgumentException.class)
    public void test43() {
		REString re = new REString("<-12-4>");
    	Wrapper.matches("2",re);
    }
	
	@Test
    public void test44() {
		REString re = new REString("<01-3>");
    	assertTrue(Wrapper.matches("02",re));
    }
	
	@Test
    public void test45() {
		REString re = new REString("<01-03>");
    	assertTrue(Wrapper.matches("02",re));
    }
	
	@Test
    public void test46() {
		REString re = new REString("<0-03>");
    	assertTrue(Wrapper.matches("02",re));
    }
	
	@Test
    public void test47() {
		REString re = new REString("[a-a]");
    	assertTrue(Wrapper.matches("a",re));
    }
	
	@Test
    public void test48() {
		REString re = new REString("<02-2>");
    	assertTrue(Wrapper.matches("02",re));
    }
	
	@Test
    public void test49() {
		REString re = new REString("<2-02>");
    	assertTrue(Wrapper.matches("02",re));
    }
	
	@Test
    public void test50() {
		REString re = new REString("");
		Wrapper.matches("", re);
    }
	
	@Test(expected = IllegalArgumentException.class)
	public void test51() {
		REString re = new REString("(?P<i d>a)a");
		assertFalse(Wrapper.matches("aa", re));
	}
	
	@Test
	public void test52() {
		REString re = new REString("(a+|a)*");
		assertTrue(Wrapper.matches("aaaaaaa", re));
	}
	
	@Test
	public void test53() {
		REString re = new REString("(?i)ab{0,}?bc");
		assertFalse(Wrapper.matches("ABBBBC", re));
	}
	
	
	@Test
	public void test54() {
		REString re = new REString("/^(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*\\/?$/");
		assertFalse(Wrapper.matches("https://mail.google.com/", re));
	}
	
	@Test
	public void test55() {
		REString re = new REString("^#?([a-z]{4})");
		assertFalse(Wrapper.matches("AAAA", re));
	}
	
	@Test
	public void test56() {
		REString re = new REString("a{0,0}");
		assertTrue(Wrapper.matches("", re));
	}

	/////////// TASK 3_1 STARTS HERE

	public static boolean debug = false;

	@Test
	public void test001() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test001");
		st1920.automaton.REString rEString0 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString1 = st1920.automaton.Wrapper.makeNumREString(rEString0);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test002() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test002");
		st1920.automaton.REString rEString0 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString1 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString0);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test003() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test003");
		st1920.automaton.REString rEString0 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString0, (int) '4',
					(int) '4');
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test004() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test004");
		st1920.automaton.REString rEString0 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString1 = st1920.automaton.Wrapper.makeExact(rEString0);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test005() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test005");
		st1920.automaton.REString rEString1 = null;
		// The following exception was thrown during execution in test generation
		try {
			boolean boolean2 = st1920.automaton.Wrapper.matches("", rEString1);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test006() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test006");
		st1920.automaton.REString rEString0 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString1 = st1920.automaton.Wrapper.makeExcluded(rEString0);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test007() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test007");
		st1920.automaton.REString rEString0 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNumBetween(rEString0, 0,
					(int) (byte) -1);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test008() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test008");
		st1920.automaton.Wrapper rEGEXWrapper0 = new st1920.automaton.Wrapper();
	}

	@Test
	public void test009() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test009");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString9, 100);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeAnyString(rEString9);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeAlphaREString(rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeAnyChar(rEString12);
		boolean boolean15 = st1920.automaton.Wrapper.matches("hi!", rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
	}

	@Test
	public void test010() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test010");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		java.lang.String str9 = rEString7.getREString();
		java.lang.String str10 = rEString7.getREString();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{97}{10}" + "'", str9.equals("{97}{10}"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{97}{10}" + "'", str10.equals("{97}{10}"));
	}

	@Test
	public void test011() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test011");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) 'a');
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, 10);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNumREString(rEString19);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString20, 100);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeExcluded(rEString20);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeOrString(rEString11, rEString23);
		java.lang.Class<?> wildcardClass25 = rEString24.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass25);
	}

	@Test
	public void test012() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test012");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString9, 100);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeExcluded(rEString9);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString14, (int) (short) 1);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeNOccurences(rEString14, (int) 'a');
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, 10);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNumREString(rEString20);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString21, 100);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeExcluded(rEString21);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeOrString(rEString12, rEString24);
		boolean boolean26 = st1920.automaton.Wrapper.matches("hi!", rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
	}

	@Test
	public void test013() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test013");
		st1920.automaton.REString rEString0 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString1 = st1920.automaton.Wrapper.makeAnyString(rEString0);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test014() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test014");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) (short) 1);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeConcatenation(rEString8, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString15);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeNumREString(rEString15);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNumBetween(rEString15, (int) (short) 100,
				1);
		boolean boolean22 = st1920.automaton.Wrapper.matches("{97}{10}", rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
	}

	@Test
	public void test015() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test015");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeGroup(rEString5);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString9,
				(int) (short) 0);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString9, 100);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
	}

	@Test
	public void test016() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test016");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeNumBetween(rEString8, (int) (short) -1, 10);
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeExact(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
	}

	@Test
	public void test017() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test017");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyChar(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeAnyString(rEString11);
		boolean boolean13 = st1920.automaton.Wrapper.matches("hi!", rEString11);
		java.lang.Class<?> wildcardClass14 = rEString11.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass14);
	}

	@Test
	public void test018() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test018");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeAnyString(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAlphaREString(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeConcatenation(rEString5, rEString10);
		java.lang.Class<?> wildcardClass13 = rEString12.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass13);
	}

	@Test
	public void test019() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test019");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		java.lang.String str4 = rEString1.getREString();
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNothing(rEString1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeAnyChar(rEString1);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
	}

	@Test
	public void test020() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test020");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeCharClass(rEString9);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNumBetween(rEString9, 0, (int) (short) 10);
		java.lang.String str14 = rEString9.getREString();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{97}{10}1" + "'", str14.equals("{97}{10}1"));
	}

	@Test
	public void test021() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test021");
		st1920.automaton.REString rEString0 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString1 = st1920.automaton.Wrapper.makeGroup(rEString0);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test022() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test022");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString7, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString17 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeOrString(rEString16, rEString17);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
	}

	@Test
	public void test023() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test023");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNotCharClass(rEString14);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumBetween(rEString16, 10, (int) (byte) 10);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
	}

	@Test
	public void test024() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test024");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeGroup(rEString5);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString8);
		st1920.automaton.REString rEString10 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeOrString(rEString8, rEString10);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
	}

	@Test
	public void test025() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test025");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString5);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeCharClass(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
	}

	@Test
	public void test026() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test026");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeCharClass(rEString10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString11, 0);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString11);
		boolean boolean15 = st1920.automaton.Wrapper.matches("", rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
	}

	@Test
	public void test027() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test027");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString9, 100);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeExcluded(rEString9);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString14, (int) (short) 1);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) 'a');
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, 10);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNumREString(rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString25, 100);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeOrString(rEString16, rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeAndString(rEString9, rEString16);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) (short) 1);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) 'a');
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNOccurences(rEString35, 10);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNumREString(rEString37);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString38, 100);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeExcluded(rEString38);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeConcatenation(rEString29, rEString41);
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeNOccurences(rEString44, (int) (short) 1);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeOrString(rEString42, rEString46);
		boolean boolean48 = st1920.automaton.Wrapper.matches("", rEString42);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeExact(rEString42);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeExact(rEString42);
		java.lang.Class<?> wildcardClass51 = rEString50.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass51);
	}

	@Test
	public void test028() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test028");
		st1920.automaton.REString rEString0 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString1 = st1920.automaton.Wrapper.makeAnyChar(rEString0);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test029() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test029");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeAnyChar(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExact(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeAnyChar(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
	}

	@Test
	public void test030() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test030");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString15);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) 'a');
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, 10);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNumREString(rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString25, 100);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeExcluded(rEString25);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, (int) (short) 1);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString34, (int) 'a');
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOccurences(rEString38, 10);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNumREString(rEString40);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString41, 100);
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeOrString(rEString32, rEString43);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeAndString(rEString25, rEString32);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString32);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeAndString(rEString15, rEString32);
		st1920.automaton.REString rEString49 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeNOccurences(rEString49, (int) (short) 1);
		st1920.automaton.REString rEString53 = st1920.automaton.Wrapper.makeNOccurences(rEString49, (int) 'a');
		st1920.automaton.REString rEString55 = st1920.automaton.Wrapper.makeNOccurences(rEString53, 10);
		st1920.automaton.REString rEString56 = st1920.automaton.Wrapper.makeNumREString(rEString55);
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeNumREString(rEString55);
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeAnyChar(rEString57);
		st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString62 = st1920.automaton.Wrapper.makeNOccurences(rEString60, (int) (short) 1);
		st1920.automaton.REString rEString64 = st1920.automaton.Wrapper.makeNOccurences(rEString60, (int) 'a');
		st1920.automaton.REString rEString66 = st1920.automaton.Wrapper.makeNOccurences(rEString64, 10);
		st1920.automaton.REString rEString67 = st1920.automaton.Wrapper.makeNumREString(rEString66);
		st1920.automaton.REString rEString68 = st1920.automaton.Wrapper.makeExact(rEString66);
		st1920.automaton.REString rEString69 = st1920.automaton.Wrapper.makeOrString(rEString58, rEString68);
		st1920.automaton.REString rEString70 = st1920.automaton.Wrapper.makeNotCharClass(rEString68);
		st1920.automaton.REString rEString71 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString68);
		st1920.automaton.REString rEString72 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
	}

	@Test
	public void test031() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test031");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		java.lang.String str4 = rEString1.getREString();
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) 'a');
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, 10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNumREString(rEString12);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString13, (int) ' ');
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeConcatenation(rEString1, rEString13);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumBetween(rEString16, (-1), 100);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeGroup(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
	}

	@Test
	public void test032() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test032");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeGroup(rEString3);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeAnyChar(rEString3);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeAnyString(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
	}

	@Test
	public void test033() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test033");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString2 = st1920.automaton.Wrapper.makeAnyString(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeAlphaREString(rEString2);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString3,
				(int) (short) 1);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
	}

	@Test
	public void test034() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test034");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString7, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) (short) 1);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) 'a');
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOccurences(rEString23, 10);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNumREString(rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString26, 100);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeExcluded(rEString26);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) (short) 1);
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNOccurences(rEString35, (int) (short) 1);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOccurences(rEString35, (int) 'a');
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNOccurences(rEString39, 10);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNumREString(rEString41);
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString42, 100);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeOrString(rEString33, rEString44);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeAndString(rEString26, rEString33);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeNOccurences(rEString48, (int) (short) 1);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeNOccurences(rEString48, (int) 'a');
		st1920.automaton.REString rEString54 = st1920.automaton.Wrapper.makeNOccurences(rEString52, 10);
		st1920.automaton.REString rEString55 = st1920.automaton.Wrapper.makeNumREString(rEString54);
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString55, 100);
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeExcluded(rEString55);
		st1920.automaton.REString rEString59 = st1920.automaton.Wrapper.makeConcatenation(rEString46, rEString58);
		st1920.automaton.REString rEString60 = st1920.automaton.Wrapper.makeAnyChar(rEString46);
		boolean boolean61 = st1920.automaton.Wrapper.matches("hi!", rEString60);
		st1920.automaton.REString rEString62 = st1920.automaton.Wrapper.makeAndString(rEString16, rEString60);
		st1920.automaton.REString rEString63 = st1920.automaton.Wrapper.makeAlphaREString(rEString62);
		st1920.automaton.REString rEString64 = st1920.automaton.Wrapper.makeExcluded(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
	}

	@Test
	public void test035() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test035");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeGroup(rEString5);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString9,
				(int) (short) 0);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
	}

	@Test
	public void test036() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test036");
		st1920.automaton.REString rEString0 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString2 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString0, (int) '#');
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test037() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test037");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeExcluded(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
	}

	@Test
	public void test038() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test038");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString7, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) (short) 1);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) 'a');
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOccurences(rEString23, 10);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNumREString(rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString26, 100);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeExcluded(rEString26);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) (short) 1);
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNOccurences(rEString35, (int) (short) 1);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOccurences(rEString35, (int) 'a');
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNOccurences(rEString39, 10);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNumREString(rEString41);
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString42, 100);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeOrString(rEString33, rEString44);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeAndString(rEString26, rEString33);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeNOccurences(rEString48, (int) (short) 1);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeNOccurences(rEString48, (int) 'a');
		st1920.automaton.REString rEString54 = st1920.automaton.Wrapper.makeNOccurences(rEString52, 10);
		st1920.automaton.REString rEString55 = st1920.automaton.Wrapper.makeNumREString(rEString54);
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString55, 100);
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeExcluded(rEString55);
		st1920.automaton.REString rEString59 = st1920.automaton.Wrapper.makeConcatenation(rEString46, rEString58);
		st1920.automaton.REString rEString60 = st1920.automaton.Wrapper.makeAnyChar(rEString46);
		boolean boolean61 = st1920.automaton.Wrapper.matches("hi!", rEString60);
		st1920.automaton.REString rEString62 = st1920.automaton.Wrapper.makeAndString(rEString16, rEString60);
		st1920.automaton.REString rEString63 = st1920.automaton.Wrapper.makeAlphaREString(rEString62);
		st1920.automaton.REString rEString64 = st1920.automaton.Wrapper.makeNumREString(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
	}

	@Test
	public void test039() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test039");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		java.lang.String str4 = rEString1.getREString();
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) 'a');
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, 10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNumREString(rEString12);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString13, (int) ' ');
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeConcatenation(rEString1, rEString13);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeGroup(rEString13);
		java.lang.Class<?> wildcardClass18 = rEString13.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass18);
	}

	@Test
	public void test040() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test040");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeGroup(rEString3);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeAnyChar(rEString3);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeAnyString(rEString3);
		java.lang.Class<?> wildcardClass20 = rEString3.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass20);
	}

	@Test
	public void test041() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test041");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyString(rEString8);
		java.lang.Class<?> wildcardClass12 = rEString11.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass12);
	}

	@Test
	public void test042() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test042");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeGroup(rEString5);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString9,
				(int) (short) 0);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString11);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNumBetween(rEString12, (int) (byte) -1,
				(int) (short) 10);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
	}

	@Test
	public void test043() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test043");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeExact(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeAnyString(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
	}

	@Test
	public void test044() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test044");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeAlphaREString(rEString1);
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNumBetween(rEString1, (int) (short) 0,
				(int) (short) 10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
	}

	@Test
	public void test045() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test045");
		st1920.automaton.REString rEString1 = null;
		// The following exception was thrown during execution in test generation
		try {
			boolean boolean2 = st1920.automaton.Wrapper.matches("{1}|{97}{10}1{100,}", rEString1);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test046() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test046");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) 'a');
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, 10);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNumREString(rEString19);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString20, 100);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeExcluded(rEString20);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeOrString(rEString11, rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeCharClass(rEString11);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeExcluded(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
	}

	@Test
	public void test047() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test047");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeAnyChar(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
	}

	@Test
	public void test048() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test048");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
	}

	@Test
	public void test049() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test049");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) (short) 1);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeConcatenation(rEString8, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString15);
		boolean boolean17 = st1920.automaton.Wrapper.matches("{97}{10}1@", rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
	}

	@Test
	public void test050() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test050");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString5);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString9,
				(int) (byte) 1);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
	}

	@Test
	public void test051() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test051");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeAnyString(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAlphaREString(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeConcatenation(rEString5, rEString10);
		java.lang.Class<?> wildcardClass13 = rEString10.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass13);
	}

	@Test
	public void test052() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test052");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString15);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) 'a');
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, 10);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNumREString(rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString25, 100);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeExcluded(rEString25);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, (int) (short) 1);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString34, (int) 'a');
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOccurences(rEString38, 10);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNumREString(rEString40);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString41, 100);
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeOrString(rEString32, rEString43);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeAndString(rEString25, rEString32);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString32);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeAndString(rEString15, rEString32);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNumREString(rEString47);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeExact(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
	}

	@Test
	public void test053() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test053");
		st1920.automaton.REString rEString0 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString1 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString0);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test054() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test054");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) (short) 1);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeConcatenation(rEString8, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString15);
		boolean boolean18 = st1920.automaton.Wrapper.matches("", rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
	}

	@Test
	public void test055() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test055");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString9, 100);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeExcluded(rEString9);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString14, (int) (short) 1);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) 'a');
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, 10);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNumREString(rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString25, 100);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeOrString(rEString16, rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeAndString(rEString9, rEString16);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) (short) 1);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) 'a');
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNOccurences(rEString35, 10);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNumREString(rEString37);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString38, 100);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeExcluded(rEString38);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeConcatenation(rEString29, rEString41);
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeNOccurences(rEString44, (int) (short) 1);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeOrString(rEString42, rEString46);
		boolean boolean48 = st1920.automaton.Wrapper.matches("", rEString42);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeExact(rEString42);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeNumREString(rEString49);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeNumREString(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
	}

	@Test
	public void test056() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test056");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString7, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) (short) 1);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) 'a');
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOccurences(rEString23, 10);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNumREString(rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString26, 100);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeExcluded(rEString26);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) (short) 1);
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNOccurences(rEString35, (int) (short) 1);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOccurences(rEString35, (int) 'a');
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNOccurences(rEString39, 10);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNumREString(rEString41);
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString42, 100);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeOrString(rEString33, rEString44);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeAndString(rEString26, rEString33);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeNOccurences(rEString48, (int) (short) 1);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeNOccurences(rEString48, (int) 'a');
		st1920.automaton.REString rEString54 = st1920.automaton.Wrapper.makeNOccurences(rEString52, 10);
		st1920.automaton.REString rEString55 = st1920.automaton.Wrapper.makeNumREString(rEString54);
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString55, 100);
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeExcluded(rEString55);
		st1920.automaton.REString rEString59 = st1920.automaton.Wrapper.makeConcatenation(rEString46, rEString58);
		st1920.automaton.REString rEString60 = st1920.automaton.Wrapper.makeAnyChar(rEString46);
		boolean boolean61 = st1920.automaton.Wrapper.matches("hi!", rEString60);
		st1920.automaton.REString rEString62 = st1920.automaton.Wrapper.makeAndString(rEString16, rEString60);
		st1920.automaton.REString rEString63 = st1920.automaton.Wrapper.makeNumREString(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
	}

	@Test
	public void test057() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test057");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeAnyChar(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) (short) 1);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) 'a');
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeNOccurences(rEString16, 10);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumREString(rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeExact(rEString18);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeOrString(rEString10, rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNotCharClass(rEString20);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString20);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString23, 0);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
	}

	@Test
	public void test058() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test058");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNotCharClass(rEString14);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumBetween(rEString16, 10, (int) (byte) 10);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNotCharClass(rEString16);
		java.lang.String str21 = rEString20.getREString();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[^[^{97}{10}1{100,}]]" + "'",
				str21.equals("[^[^{97}{10}1{100,}]]"));
	}

	@Test
	public void test059() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test059");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		java.lang.String str4 = rEString1.getREString();
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNothing(rEString1);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString5, (int) ' ',
				(int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeAnyString(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
	}

	@Test
	public void test060() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test060");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString7, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString14, 1, 1);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString18);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 0);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
	}

	@Test
	public void test061() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test061");
		st1920.automaton.REString rEString0 = null;
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, (int) (short) 1);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString14, (int) (short) 1);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeNOccurences(rEString14, (int) 'a');
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, 10);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNumREString(rEString20);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString21, 100);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeOrString(rEString12, rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeOrString(rEString8, rEString12);
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeAndString(rEString0, rEString12);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
	}

	@Test
	public void test062() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test062");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNumBetween(rEString8, (int) (short) 100,
				100);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
	}

	@Test
	public void test063() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test063");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString9, 100);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeExcluded(rEString9);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString14, (int) (short) 1);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) 'a');
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, 10);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNumREString(rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString25, 100);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeOrString(rEString16, rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeAndString(rEString9, rEString16);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) (short) 1);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) 'a');
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNOccurences(rEString35, 10);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNumREString(rEString37);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString38, 100);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeExcluded(rEString38);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeConcatenation(rEString29, rEString41);
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeNOccurences(rEString44, (int) (short) 1);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeOrString(rEString42, rEString46);
		boolean boolean48 = st1920.automaton.Wrapper.matches("", rEString42);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeExact(rEString42);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeExact(rEString42);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeNotCharClass(rEString42);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
	}

	@Test
	public void test064() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test064");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeAlphaREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeAlphaREString(rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeAnyString(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
	}

	@Test
	public void test065() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test065");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyString(rEString8);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeAlphaREString(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeAnyChar(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
	}

	@Test
	public void test066() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test066");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeExact(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
	}

	@Test
	public void test067() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test067");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeGroup(rEString3);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeExcluded(rEString3);
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString20, (int) (short) 1);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString20, (int) 'a');
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOccurences(rEString24, 10);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNumREString(rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNumREString(rEString26);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeConcatenation(rEString26, rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString33);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString33);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOccurences(rEString38, (int) (short) 1);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNOccurences(rEString38, (int) 'a');
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeNOccurences(rEString42, 10);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNumREString(rEString44);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString45, 100);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeExcluded(rEString45);
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeNOccurences(rEString50, (int) (short) 1);
		st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString56 = st1920.automaton.Wrapper.makeNOccurences(rEString54, (int) (short) 1);
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeNOccurences(rEString54, (int) 'a');
		st1920.automaton.REString rEString60 = st1920.automaton.Wrapper.makeNOccurences(rEString58, 10);
		st1920.automaton.REString rEString61 = st1920.automaton.Wrapper.makeNumREString(rEString60);
		st1920.automaton.REString rEString63 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString61, 100);
		st1920.automaton.REString rEString64 = st1920.automaton.Wrapper.makeOrString(rEString52, rEString63);
		st1920.automaton.REString rEString65 = st1920.automaton.Wrapper.makeAndString(rEString45, rEString52);
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = st1920.automaton.Wrapper.makeNOccurences(rEString67, (int) (short) 1);
		st1920.automaton.REString rEString71 = st1920.automaton.Wrapper.makeNOccurences(rEString67, (int) 'a');
		st1920.automaton.REString rEString73 = st1920.automaton.Wrapper.makeNOccurences(rEString71, 10);
		st1920.automaton.REString rEString74 = st1920.automaton.Wrapper.makeNumREString(rEString73);
		st1920.automaton.REString rEString76 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString74, 100);
		st1920.automaton.REString rEString77 = st1920.automaton.Wrapper.makeExcluded(rEString74);
		st1920.automaton.REString rEString78 = st1920.automaton.Wrapper.makeConcatenation(rEString65, rEString77);
		st1920.automaton.REString rEString79 = st1920.automaton.Wrapper.makeAnyChar(rEString65);
		boolean boolean80 = st1920.automaton.Wrapper.matches("hi!", rEString79);
		st1920.automaton.REString rEString81 = st1920.automaton.Wrapper.makeAndString(rEString35, rEString79);
		st1920.automaton.REString rEString83 = st1920.automaton.Wrapper.makeNOccurences(rEString81, 0);
		st1920.automaton.REString rEString84 = st1920.automaton.Wrapper.makeConcatenation(rEString3, rEString81);
		st1920.automaton.REString rEString85 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString84);
		st1920.automaton.REString rEString88 = st1920.automaton.Wrapper.makeNumBetween(rEString84, 10, (int) ' ');
		st1920.automaton.REString rEString89 = st1920.automaton.Wrapper.makeNotCharClass(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString81);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString89);
	}

	@Test
	public void test068() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test068");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString2 = st1920.automaton.Wrapper.makeAnyString(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeAlphaREString(rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeExcluded(rEString2);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
	}

	@Test
	public void test069() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test069");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString15);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeCharClass(rEString29);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) (short) 1);
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString36, (int) (short) 1);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOccurences(rEString36, (int) 'a');
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNOccurences(rEString40, 10);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNumREString(rEString42);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString43, 100);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOrString(rEString34, rEString45);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeAlphaREString(rEString34);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNumREString(rEString47);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeConcatenation(rEString29, rEString47);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
	}

	@Test
	public void test070() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test070");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		boolean boolean9 = st1920.automaton.Wrapper.matches("hi!", rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
	}

	@Test
	public void test071() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test071");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString7, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeAnyString(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
	}

	@Test
	public void test072() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test072");
		st1920.automaton.REString rEString0 = null;
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyString(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeAlphaREString(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeConcatenation(rEString6, rEString11);
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeOrString(rEString0, rEString13);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
	}

	@Test
	public void test073() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test073");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString5);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString9, (int) 'a');
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
	}

	@Test
	public void test074() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test074");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) (short) 1);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeConcatenation(rEString8, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString15);
		boolean boolean17 = st1920.automaton.Wrapper.matches("", rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeAnyChar(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
	}

	@Test
	public void test075() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test075");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString7, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, (int) (short) 1);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOccurences(rEString22, (int) 'a');
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOccurences(rEString26, 10);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeNumREString(rEString28);
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString29, 100);
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeOrString(rEString20, rEString31);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeAlphaREString(rEString20);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNumREString(rEString33);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeOrString(rEString14, rEString34);
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeExcluded(rEString34);
		java.lang.Class<?> wildcardClass37 = rEString36.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass37);
	}

	@Test
	public void test076() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test076");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyChar(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeAnyString(rEString11);
		boolean boolean13 = st1920.automaton.Wrapper.matches("hi!", rEString11);
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString15, (int) (short) 1);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) (short) 1);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) 'a');
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOccurences(rEString23, 10);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNumREString(rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString26, 100);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeOrString(rEString17, rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeConcatenation(rEString11, rEString28);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) (short) 1);
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) 'a');
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString36, 10);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNumREString(rEString38);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNumREString(rEString38);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeAnyChar(rEString40);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeExact(rEString41);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNumBetween(rEString42, (int) ' ',
				(int) (short) 10);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeConcatenation(rEString11, rEString42);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeGroup(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
	}

	@Test
	public void test077() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test077");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeAnyChar(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) (short) 1);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) 'a');
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeNOccurences(rEString16, 10);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumREString(rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeExact(rEString18);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeOrString(rEString10, rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNotCharClass(rEString20);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString20);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeAnyChar(rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeCharClass(rEString23);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNumBetween(rEString23, (int) (byte) 0, 100);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
	}

	@Test
	public void test078() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test078");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeAnyString(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAlphaREString(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeConcatenation(rEString5, rEString10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNotCharClass(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
	}

	@Test
	public void test079() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test079");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString9, 100);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeExcluded(rEString9);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString14, (int) (short) 1);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) 'a');
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, 10);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNumREString(rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString25, 100);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeOrString(rEString16, rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeAndString(rEString9, rEString16);
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNumBetween(rEString9, (int) (short) -1, 10);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeExcluded(rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNothing(rEString32);
		// The following exception was thrown during execution in test generation
		try {
			boolean boolean35 = st1920.automaton.Wrapper.matches("{97}{10}1", rEString34);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: interval syntax error at position 15");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
	}

	@Test
	public void test080() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test080");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString9, 100);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeExcluded(rEString9);
		boolean boolean13 = st1920.automaton.Wrapper.matches("{97}{10}", rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
	}

	@Test
	public void test081() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test081");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeNumBetween(rEString8, (int) (short) -1, 10);
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString31);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeAnyString(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
	}

	@Test
	public void test082() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test082");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) (short) 1);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeConcatenation(rEString8, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString15);
		boolean boolean18 = st1920.automaton.Wrapper.matches("hi!", rEString15);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString15, (int) 'a');
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, (int) (short) 1);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOccurences(rEString22, (int) 'a');
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOccurences(rEString26, 10);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeNumREString(rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeExact(rEString28);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) (short) 1);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeAlphaREString(rEString32);
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeAndString(rEString28, rEString32);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString28);
		java.lang.String str38 = rEString28.getREString();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{97}{10}" + "'", str38.equals("{97}{10}"));
	}

	@Test
	public void test083() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test083");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString15);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeCharClass(rEString29);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) (short) 1);
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString36, (int) (short) 1);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOccurences(rEString36, (int) 'a');
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNOccurences(rEString40, 10);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNumREString(rEString42);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString43, 100);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOrString(rEString34, rEString45);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeAlphaREString(rEString34);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNumREString(rEString47);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeConcatenation(rEString29, rEString47);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeAlphaREString(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
	}

	@Test
	public void test084() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test084");
		st1920.automaton.REString rEString1 = null;
		// The following exception was thrown during execution in test generation
		try {
			boolean boolean2 = st1920.automaton.Wrapper.matches("{97}{10}1", rEString1);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test085() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test085");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		java.lang.String str4 = rEString1.getREString();
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) 'a');
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, 10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNumREString(rEString12);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString13, 100);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeExcluded(rEString13);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, (int) (short) 1);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOccurences(rEString22, (int) 'a');
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOccurences(rEString26, 10);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeNumREString(rEString28);
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString29, 100);
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeOrString(rEString20, rEString31);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeAndString(rEString13, rEString20);
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNumBetween(rEString13, (int) (short) -1,
				10);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString36);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeOrString(rEString1, rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
	}

	@Test
	public void test086() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test086");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString2 = st1920.automaton.Wrapper.makeAnyString(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeAlphaREString(rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeGroup(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		java.lang.String str9 = rEString6.getREString();
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNothing(rEString6);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString10, (int) ' ',
				(int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString3, rEString10);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeGroup(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
	}

	@Test
	public void test087() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test087");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString2 = st1920.automaton.Wrapper.makeAnyString(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeAlphaREString(rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString2);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
	}

	@Test
	public void test088() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test088");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeExact(rEString3);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNothing(rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeConcatenation(rEString3, rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
	}

	@Test
	public void test089() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test089");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyChar(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeAnyString(rEString11);
		boolean boolean13 = st1920.automaton.Wrapper.matches("hi!", rEString11);
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString15, (int) (short) 1);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) (short) 1);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) 'a');
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOccurences(rEString23, 10);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNumREString(rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString26, 100);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeOrString(rEString17, rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeConcatenation(rEString11, rEString28);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) (short) 1);
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) 'a');
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString36, 10);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNumREString(rEString38);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNumREString(rEString38);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeAnyChar(rEString40);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeExact(rEString41);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNumBetween(rEString42, (int) ' ',
				(int) (short) 10);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeConcatenation(rEString11, rEString42);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeNumBetween(rEString11, 0, 0);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
	}

	@Test
	public void test090() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test090");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString7, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) (short) 1);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) 'a');
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOccurences(rEString23, 10);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNumREString(rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString26, 100);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeExcluded(rEString26);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) (short) 1);
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNOccurences(rEString35, (int) (short) 1);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOccurences(rEString35, (int) 'a');
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNOccurences(rEString39, 10);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNumREString(rEString41);
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString42, 100);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeOrString(rEString33, rEString44);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeAndString(rEString26, rEString33);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeNOccurences(rEString48, (int) (short) 1);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeNOccurences(rEString48, (int) 'a');
		st1920.automaton.REString rEString54 = st1920.automaton.Wrapper.makeNOccurences(rEString52, 10);
		st1920.automaton.REString rEString55 = st1920.automaton.Wrapper.makeNumREString(rEString54);
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString55, 100);
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeExcluded(rEString55);
		st1920.automaton.REString rEString59 = st1920.automaton.Wrapper.makeConcatenation(rEString46, rEString58);
		st1920.automaton.REString rEString60 = st1920.automaton.Wrapper.makeAnyChar(rEString46);
		boolean boolean61 = st1920.automaton.Wrapper.matches("hi!", rEString60);
		st1920.automaton.REString rEString62 = st1920.automaton.Wrapper.makeAndString(rEString16, rEString60);
		st1920.automaton.REString rEString63 = st1920.automaton.Wrapper.makeAlphaREString(rEString62);
		st1920.automaton.REString rEString64 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
	}

	@Test
	public void test091() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test091");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyChar(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeAnyString(rEString11);
		boolean boolean13 = st1920.automaton.Wrapper.matches("hi!", rEString11);
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString15, (int) (short) 1);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) (short) 1);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) 'a');
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOccurences(rEString23, 10);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNumREString(rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString26, 100);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeOrString(rEString17, rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeConcatenation(rEString11, rEString28);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) (short) 1);
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) 'a');
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString36, 10);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNumREString(rEString38);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNumREString(rEString38);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeAnyChar(rEString40);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeExact(rEString41);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNumBetween(rEString42, (int) ' ',
				(int) (short) 10);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeConcatenation(rEString11, rEString42);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeAnyChar(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
	}

	@Test
	public void test092() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test092");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, (int) ' ');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNotCharClass(rEString8);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString11, (-1));
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNothing(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
	}

	@Test
	public void test093() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test093");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) 'a');
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, 10);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNumREString(rEString19);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString20, 100);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeExcluded(rEString20);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeOrString(rEString11, rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeCharClass(rEString11);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeExact(rEString25);
		st1920.automaton.REString rEString28 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeNOccurences(rEString28, (int) (short) 1);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) (short) 1);
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) 'a');
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString36, 10);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNumREString(rEString38);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString39, 100);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeOrString(rEString30, rEString41);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeAlphaREString(rEString30);
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeNumREString(rEString43);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeConcatenation(rEString26, rEString43);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeNOccurences(rEString26, (int) (short) 1);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
	}

	@Test
	public void test094() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test094");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) 'a');
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, 10);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNumREString(rEString36);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString37, 100);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeExcluded(rEString37);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeConcatenation(rEString28, rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNOccurences(rEString43, (int) (short) 1);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOrString(rEString41, rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeNOccurences(rEString48, (int) (short) 1);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeNOccurences(rEString48, (int) 'a');
		st1920.automaton.REString rEString54 = st1920.automaton.Wrapper.makeNOccurences(rEString52, 10);
		st1920.automaton.REString rEString55 = st1920.automaton.Wrapper.makeNumREString(rEString54);
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString55, 100);
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeExcluded(rEString55);
		st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString62 = st1920.automaton.Wrapper.makeNOccurences(rEString60, (int) (short) 1);
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = st1920.automaton.Wrapper.makeNOccurences(rEString64, (int) (short) 1);
		st1920.automaton.REString rEString68 = st1920.automaton.Wrapper.makeNOccurences(rEString64, (int) 'a');
		st1920.automaton.REString rEString70 = st1920.automaton.Wrapper.makeNOccurences(rEString68, 10);
		st1920.automaton.REString rEString71 = st1920.automaton.Wrapper.makeNumREString(rEString70);
		st1920.automaton.REString rEString73 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString71, 100);
		st1920.automaton.REString rEString74 = st1920.automaton.Wrapper.makeOrString(rEString62, rEString73);
		st1920.automaton.REString rEString75 = st1920.automaton.Wrapper.makeAndString(rEString55, rEString62);
		st1920.automaton.REString rEString77 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString79 = st1920.automaton.Wrapper.makeNOccurences(rEString77, (int) (short) 1);
		st1920.automaton.REString rEString81 = st1920.automaton.Wrapper.makeNOccurences(rEString77, (int) 'a');
		st1920.automaton.REString rEString83 = st1920.automaton.Wrapper.makeNOccurences(rEString81, 10);
		st1920.automaton.REString rEString84 = st1920.automaton.Wrapper.makeNumREString(rEString83);
		st1920.automaton.REString rEString86 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString84, 100);
		st1920.automaton.REString rEString87 = st1920.automaton.Wrapper.makeExcluded(rEString84);
		st1920.automaton.REString rEString88 = st1920.automaton.Wrapper.makeConcatenation(rEString75, rEString87);
		st1920.automaton.REString rEString90 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString92 = st1920.automaton.Wrapper.makeNOccurences(rEString90, (int) (short) 1);
		st1920.automaton.REString rEString93 = st1920.automaton.Wrapper.makeOrString(rEString88, rEString92);
		st1920.automaton.REString rEString94 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString93);
		st1920.automaton.REString rEString95 = st1920.automaton.Wrapper.makeOrString(rEString45, rEString93);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString81);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString87);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString92);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString93);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString95);
	}

	@Test
	public void test095() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test095");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		java.lang.String str16 = rEString15.getREString();
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeExact(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{1}|{97}{10}1{100,}" + "'",
				str16.equals("{1}|{97}{10}1{100,}"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
	}

	@Test
	public void test096() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test096");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeAnyChar(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyChar(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeExact(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
	}

	@Test
	public void test097() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test097");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeNumBetween(rEString8, (int) (short) -1, 10);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString31,
				(int) (short) 1);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeAlphaREString(rEString31);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeNumREString(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
	}

	@Test
	public void test098() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test098");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeAlphaREString(rEString3);
		java.lang.String str17 = rEString16.getREString();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{1}a" + "'", str17.equals("{1}a"));
	}

	@Test
	public void test099() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test099");
		st1920.automaton.REString rEString0 = null;
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("{97}{10}");
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeAndString(rEString0, rEString2);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test100() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test100");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) (short) 1);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeConcatenation(rEString8, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString15);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString15, 1, 1);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeAlphaREString(rEString15);
		boolean boolean21 = st1920.automaton.Wrapper.matches("{1}a", rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
	}

	@Test
	public void test101() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test101");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString7, rEString13);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString14, (int) (byte) 1);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
	}

	@Test
	public void test102() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test102");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString2, (int) 'a');
		boolean boolean9 = st1920.automaton.Wrapper.matches("{97}{10}", rEString2);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString2);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeGroup(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
	}

	@Test
	public void test103() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test103");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNotCharClass(rEString14);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumBetween(rEString16, 10, (int) (byte) 10);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeAnyString(rEString16);
		java.lang.Class<?> wildcardClass21 = rEString20.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass21);
	}

	@Test
	public void test104() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test104");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeAnyChar(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) (short) 1);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) 'a');
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeNOccurences(rEString16, 10);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumREString(rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeExact(rEString18);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeOrString(rEString10, rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNotCharClass(rEString20);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString20);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeAnyString(rEString23);
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOccurences(rEString26, (int) (short) 1);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) 'a');
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, 10);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNumREString(rEString36);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString37, 100);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeOrString(rEString28, rEString39);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeExact(rEString28);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNumREString(rEString28);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeConcatenation(rEString23, rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
	}

	@Test
	public void test105() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test105");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyString(rEString8);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeAlphaREString(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeAnyChar(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString11);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString11, (int) '#',
				(int) (byte) 100);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
	}

	@Test
	public void test106() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test106");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
	}

	@Test
	public void test107() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test107");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeGroup(rEString5);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString5, 1, 0);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNumBetween(rEString5, 10, 10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
	}

	@Test
	public void test108() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test108");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeAlphaREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNumREString(rEString16);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString16, (int) ' ');
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeAlphaREString(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
	}

	@Test
	public void test109() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test109");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) 'a');
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, 10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNumREString(rEString12);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString13, 100);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeOrString(rEString4, rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeAnyString(rEString16);
		boolean boolean18 = st1920.automaton.Wrapper.matches("", rEString17);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeAnyString(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
	}

	@Test
	public void test110() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test110");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) 'a');
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, 10);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNumREString(rEString36);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString37, 100);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeExcluded(rEString37);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeConcatenation(rEString28, rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNOccurences(rEString43, (int) (short) 1);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOrString(rEString41, rEString45);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString46);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString46,
				(int) (short) 100, (int) (byte) 10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
	}

	@Test
	public void test111() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test111");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		java.lang.String str16 = rEString15.getREString();
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString15,
				(int) (short) 10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{1}|{97}{10}1{100,}" + "'",
				str16.equals("{1}|{97}{10}1{100,}"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
	}

	@Test
	public void test112() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test112");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) 'a');
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, 10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNumREString(rEString12);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString13, 100);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeOrString(rEString4, rEString15);
		boolean boolean17 = st1920.automaton.Wrapper.matches("", rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeAlphaREString(rEString16);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNothing(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
	}

	@Test
	public void test113() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test113");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) 'a');
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, 10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNumREString(rEString12);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString13, 100);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeOrString(rEString4, rEString15);
		boolean boolean17 = st1920.automaton.Wrapper.matches("", rEString16);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString16, (int) 'a',
				(int) (byte) 0);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNumREString(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
	}

	@Test
	public void test114() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test114");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		java.lang.String str4 = rEString1.getREString();
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNothing(rEString1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeAnyString(rEString1);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
	}

	@Test
	public void test115() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test115");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		java.lang.String str5 = rEString2.getREString();
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString7, (int) (short) 1);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString7, (int) 'a');
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, 10);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNumREString(rEString13);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString14, (int) ' ');
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeConcatenation(rEString2, rEString14);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeGroup(rEString14);
		boolean boolean19 = st1920.automaton.Wrapper.matches("{1}a", rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
	}

	@Test
	public void test116() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test116");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeAnyString(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeExact(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
	}

	@Test
	public void test117() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test117");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString3, (int) (short) 1);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString7, (int) (short) 1);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString7, (int) 'a');
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, 10);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNumREString(rEString13);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString14, 100);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeOrString(rEString5, rEString16);
		boolean boolean18 = st1920.automaton.Wrapper.matches("", rEString17);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString17, (int) 'a',
				(int) (byte) 0);
		boolean boolean22 = st1920.automaton.Wrapper.matches("hi!", rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
	}

	@Test
	public void test118() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test118");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString10, (int) 'a');
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString14, 10);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNumREString(rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeNumREString(rEString16);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeAnyChar(rEString18);
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, (int) (short) 1);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOccurences(rEString21, (int) 'a');
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOccurences(rEString25, 10);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNumREString(rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeExact(rEString27);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeOrString(rEString19, rEString29);
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeOrString(rEString8, rEString29);
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeGroup(rEString29);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNothing(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
	}

	@Test
	public void test119() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test119");
		st1920.automaton.REString rEString0 = null;
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeAnyString(rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeAlphaREString(rEString3);
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeAndString(rEString0, rEString4);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
	}

	@Test
	public void test120() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test120");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString5);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeCharClass(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeAlphaREString(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
	}

	@Test
	public void test121() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test121");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) 'a');
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, 10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNumREString(rEString12);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString13, 100);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeOrString(rEString4, rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeAlphaREString(rEString4);
		boolean boolean18 = st1920.automaton.Wrapper.matches("{97}{10}1", rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
	}

	@Test
	public void test122() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test122");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNumREString(rEString1);
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString8, (int) (short) 1);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) (short) 1);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) 'a');
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeNOccurences(rEString16, 10);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumREString(rEString18);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString19, 100);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeOrString(rEString10, rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeAnyString(rEString10);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeExcluded(rEString24);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeConcatenation(rEString6, rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString6,
				(int) (byte) 10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
	}

	@Test
	public void test123() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test123");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) 'a');
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, 10);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNumREString(rEString36);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString37, 100);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeExcluded(rEString37);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeConcatenation(rEString28, rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNOccurences(rEString43, (int) (short) 1);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOrString(rEString41, rEString45);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString41);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeAlphaREString(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
	}

	@Test
	public void test124() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test124");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeGroup(rEString5);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString8);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString8, (int) (short) 0,
				(int) (byte) -1);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
	}

	@Test
	public void test125() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test125");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString15);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) 'a');
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, 10);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNumREString(rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString25, 100);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeExcluded(rEString25);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, (int) (short) 1);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString34, (int) 'a');
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOccurences(rEString38, 10);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNumREString(rEString40);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString41, 100);
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeOrString(rEString32, rEString43);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeAndString(rEString25, rEString32);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString32);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeAndString(rEString15, rEString32);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNumREString(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
	}

	@Test
	public void test126() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test126");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString9 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, (int) (short) 1);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) 'a');
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, 10);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNumREString(rEString19);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString20, 100);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeOrString(rEString11, rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeOrString(rEString7, rEString11);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeExact(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
	}

	@Test
	public void test127() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test127");
		st1920.automaton.REString rEString0 = null;
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString3, (int) (short) 1);
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString3, (int) 'a');
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString7, 10);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNumREString(rEString9);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString10, 100);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeExcluded(rEString10);
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString15, (int) (short) 1);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) (short) 1);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) 'a');
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOccurences(rEString23, 10);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNumREString(rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString26, 100);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeOrString(rEString17, rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeAndString(rEString10, rEString17);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) (short) 1);
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) 'a');
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString36, 10);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNumREString(rEString38);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString39, 100);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeExcluded(rEString39);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeConcatenation(rEString30, rEString42);
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeNOccurences(rEString45, (int) (short) 1);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeOrString(rEString43, rEString47);
		boolean boolean49 = st1920.automaton.Wrapper.matches("", rEString43);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeExact(rEString43);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeNumREString(rEString50);
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeConcatenation(rEString0, rEString50);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
	}

	@Test
	public void test128() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test128");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeAlphaREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeAlphaREString(rEString16);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNumBetween(rEString17, (int) (byte) 0,
				(int) (short) 100);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
	}

	@Test
	public void test129() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test129");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString7, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString14, 1, 1);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString18);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNumBetween(rEString19, 100,
				(int) (short) 100);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeAnyChar(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
	}

	@Test
	public void test130() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test130");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString7, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
	}

	@Test
	public void test131() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test131");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeGroup(rEString3);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString17);
		java.lang.Class<?> wildcardClass19 = rEString17.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass19);
	}

	@Test
	public void test132() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test132");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString9, 100);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeExcluded(rEString9);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString14, (int) (short) 1);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) 'a');
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, 10);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNumREString(rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString25, 100);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeOrString(rEString16, rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeAndString(rEString9, rEString16);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) (short) 1);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) 'a');
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNOccurences(rEString35, 10);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNumREString(rEString37);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString38, 100);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeExcluded(rEString38);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeConcatenation(rEString29, rEString41);
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeNOccurences(rEString44, (int) (short) 1);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeOrString(rEString42, rEString46);
		boolean boolean48 = st1920.automaton.Wrapper.matches("", rEString42);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeExact(rEString42);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeCharClass(rEString49);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeAlphaREString(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
	}

	@Test
	public void test133() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test133");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeAlphaREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNumREString(rEString16);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString16, (int) ' ');
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNumREString(rEString16);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString20, (-1));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
	}

	@Test
	public void test134() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test134");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyString(rEString8);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeAnyString(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
	}

	@Test
	public void test135() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test135");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString2 = st1920.automaton.Wrapper.makeCharClass(rEString1);
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString4, (int) (short) 1);
		st1920.automaton.REString rEString8 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString8, (int) (short) 1);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString8, (int) 'a');
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString12, 10);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNumREString(rEString14);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString15, 100);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeOrString(rEString6, rEString17);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString18);
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, (int) (short) 1);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOccurences(rEString21, (int) 'a');
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOccurences(rEString25, 10);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNumREString(rEString27);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString28, 100);
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeExcluded(rEString28);
		st1920.automaton.REString rEString33 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeNOccurences(rEString33, (int) (short) 1);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOccurences(rEString37, (int) (short) 1);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNOccurences(rEString37, (int) 'a');
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNOccurences(rEString41, 10);
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeNumREString(rEString43);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString44, 100);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeOrString(rEString35, rEString46);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeAndString(rEString28, rEString35);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString35);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeAndString(rEString18, rEString35);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeAnyChar(rEString35);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeOrString(rEString2, rEString35);
		st1920.automaton.REString rEString53 = st1920.automaton.Wrapper.makeExcluded(rEString2);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
	}

	@Test
	public void test136() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test136");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeNumBetween(rEString8, (int) (short) -1, 10);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString31,
				(int) (short) 1);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeAlphaREString(rEString31);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeAlphaREString(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
	}

	@Test
	public void test137() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test137");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString2 = st1920.automaton.Wrapper.makeAnyString(rEString1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNumBetween(rEString2, (int) (byte) 1,
				(int) (short) 100);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
	}

	@Test
	public void test138() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test138");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		java.lang.String str4 = rEString1.getREString();
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString10, (int) 'a');
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString14, 10);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNumREString(rEString16);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString17, 100);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeOrString(rEString8, rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeExact(rEString8);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeAndString(rEString1, rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
	}

	@Test
	public void test139() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test139");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeGroup(rEString5);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString5, 1, 0);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeGroup(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
	}

	@Test
	public void test140() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test140");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeGroup(rEString1);
		st1920.automaton.REString rEString7 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString7, (int) (short) 1);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString7, (int) 'a');
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, 10);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNumREString(rEString13);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString14, 100);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeExcluded(rEString14);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) (short) 1);
		st1920.automaton.REString rEString23 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOccurences(rEString23, (int) (short) 1);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOccurences(rEString23, (int) 'a');
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeNOccurences(rEString27, 10);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeNumREString(rEString29);
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString30, 100);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeOrString(rEString21, rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeAndString(rEString14, rEString21);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNumBetween(rEString14, (int) (short) -1,
				10);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeAnyString(rEString14);
		boolean boolean39 = st1920.automaton.Wrapper.matches("", rEString38);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeAndString(rEString1, rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
	}

	@Test
	public void test141() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test141");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) 'a');
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, 10);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNumREString(rEString36);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString37, 100);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeExcluded(rEString37);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeConcatenation(rEString28, rEString40);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeAnyChar(rEString28);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
	}

	@Test
	public void test142() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test142");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) 'a');
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, 10);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNumREString(rEString36);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString37, 100);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeExcluded(rEString37);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeConcatenation(rEString28, rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNOccurences(rEString43, (int) (short) 1);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOrString(rEString41, rEString45);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString41, (int) (byte) 10,
				0);
		java.lang.String str50 = rEString41.getREString();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{97}{10}1&{1}~{97}{10}1" + "'",
				str50.equals("{97}{10}1&{1}~{97}{10}1"));
	}

	@Test
	public void test143() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test143");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeAlphaREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeAnyString(rEString3);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeAnyChar(rEString17);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) '4');
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
	}

	@Test
	public void test144() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test144");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString2 = st1920.automaton.Wrapper.makeCharClass(rEString1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNumBetween(rEString2, 100, (int) (short) 1);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
	}

	@Test
	public void test145() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test145");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyString(rEString8);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
	}

	@Test
	public void test146() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test146");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeAnyChar(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) (short) 1);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) 'a');
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeNOccurences(rEString16, 10);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumREString(rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeExact(rEString18);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeOrString(rEString10, rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNotCharClass(rEString20);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeGroup(rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
	}

	@Test
	public void test147() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test147");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeAlphaREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeAnyString(rEString3);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString17, (int) 'a',
				(int) 'a');
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
	}

	@Test
	public void test148() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test148");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		java.lang.Class<?> wildcardClass9 = rEString7.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass9);
	}

	@Test
	public void test149() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test149");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) 'a');
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, 10);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNumREString(rEString19);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString20, 100);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeExcluded(rEString20);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeOrString(rEString11, rEString23);
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOccurences(rEString26, (int) (short) 1);
		java.lang.String str29 = rEString26.getREString();
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) (short) 1);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) 'a');
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNOccurences(rEString35, 10);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNumREString(rEString37);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString38, (int) ' ');
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeConcatenation(rEString26, rEString38);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeGroup(rEString38);
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeNOccurences(rEString45, (int) (short) 1);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeNOccurences(rEString45, (int) 'a');
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeNOccurences(rEString49, 10);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeNumREString(rEString51);
		st1920.automaton.REString rEString53 = st1920.automaton.Wrapper.makeNumREString(rEString51);
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeNOccurences(rEString55, (int) (short) 1);
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeConcatenation(rEString51, rEString57);
		st1920.automaton.REString rEString59 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString58);
		st1920.automaton.REString rEString60 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString58);
		boolean boolean61 = st1920.automaton.Wrapper.matches("hi!", rEString58);
		st1920.automaton.REString rEString62 = st1920.automaton.Wrapper.makeNothing(rEString58);
		st1920.automaton.REString rEString63 = st1920.automaton.Wrapper.makeConcatenation(rEString38, rEString58);
		st1920.automaton.REString rEString65 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString67 = st1920.automaton.Wrapper.makeNOccurences(rEString65, (int) (short) 1);
		java.lang.String str68 = rEString65.getREString();
		st1920.automaton.REString rEString69 = st1920.automaton.Wrapper.makeNothing(rEString65);
		st1920.automaton.REString rEString72 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString69, (int) ' ',
				(int) (short) 1);
		st1920.automaton.REString rEString73 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString69);
		st1920.automaton.REString rEString74 = st1920.automaton.Wrapper.makeOrString(rEString58, rEString69);
		st1920.automaton.REString rEString75 = st1920.automaton.Wrapper.makeConcatenation(rEString11, rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str29 + "' != '" + "" + "'", str29.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str68 + "' != '" + "" + "'", str68.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
	}

	@Test
	public void test150() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test150");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNotCharClass(rEString14);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumBetween(rEString16, 10, (int) (byte) 10);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNothing(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
	}

	@Test
	public void test151() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test151");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString15);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) 'a');
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, 10);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNumREString(rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString25, 100);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeExcluded(rEString25);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, (int) (short) 1);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString34, (int) 'a');
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOccurences(rEString38, 10);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNumREString(rEString40);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString41, 100);
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeOrString(rEString32, rEString43);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeAndString(rEString25, rEString32);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString32);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeAndString(rEString15, rEString32);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNumREString(rEString47);
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeNOccurences(rEString50, (int) (short) 1);
		st1920.automaton.REString rEString54 = st1920.automaton.Wrapper.makeNOccurences(rEString50, (int) 'a');
		st1920.automaton.REString rEString56 = st1920.automaton.Wrapper.makeNOccurences(rEString54, 10);
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeNumREString(rEString56);
		st1920.automaton.REString rEString59 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString57, 100);
		st1920.automaton.REString rEString60 = st1920.automaton.Wrapper.makeExcluded(rEString57);
		st1920.automaton.REString rEString62 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString64 = st1920.automaton.Wrapper.makeNOccurences(rEString62, (int) (short) 1);
		st1920.automaton.REString rEString66 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString68 = st1920.automaton.Wrapper.makeNOccurences(rEString66, (int) (short) 1);
		st1920.automaton.REString rEString70 = st1920.automaton.Wrapper.makeNOccurences(rEString66, (int) 'a');
		st1920.automaton.REString rEString72 = st1920.automaton.Wrapper.makeNOccurences(rEString70, 10);
		st1920.automaton.REString rEString73 = st1920.automaton.Wrapper.makeNumREString(rEString72);
		st1920.automaton.REString rEString75 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString73, 100);
		st1920.automaton.REString rEString76 = st1920.automaton.Wrapper.makeOrString(rEString64, rEString75);
		st1920.automaton.REString rEString77 = st1920.automaton.Wrapper.makeAndString(rEString57, rEString64);
		st1920.automaton.REString rEString79 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString81 = st1920.automaton.Wrapper.makeNOccurences(rEString79, (int) (short) 1);
		st1920.automaton.REString rEString83 = st1920.automaton.Wrapper.makeNOccurences(rEString79, (int) 'a');
		st1920.automaton.REString rEString85 = st1920.automaton.Wrapper.makeNOccurences(rEString83, 10);
		st1920.automaton.REString rEString86 = st1920.automaton.Wrapper.makeNumREString(rEString85);
		st1920.automaton.REString rEString88 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString86, 100);
		st1920.automaton.REString rEString89 = st1920.automaton.Wrapper.makeExcluded(rEString86);
		st1920.automaton.REString rEString90 = st1920.automaton.Wrapper.makeConcatenation(rEString77, rEString89);
		st1920.automaton.REString rEString92 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString94 = st1920.automaton.Wrapper.makeNOccurences(rEString92, (int) (short) 1);
		st1920.automaton.REString rEString95 = st1920.automaton.Wrapper.makeOrString(rEString90, rEString94);
		st1920.automaton.REString rEString96 = st1920.automaton.Wrapper.makeConcatenation(rEString47, rEString90);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString68);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString81);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString89);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString90);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString95);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString96);
	}

	@Test
	public void test152() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test152");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		java.lang.String str4 = rEString1.getREString();
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) 'a');
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, 10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNumREString(rEString12);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString13, (int) ' ');
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeConcatenation(rEString1, rEString13);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeGroup(rEString13);
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString20, (int) (short) 1);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString20, (int) 'a');
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOccurences(rEString24, 10);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNumREString(rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNumREString(rEString26);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeConcatenation(rEString26, rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString33);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString33);
		boolean boolean36 = st1920.automaton.Wrapper.matches("hi!", rEString33);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNothing(rEString33);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeConcatenation(rEString13, rEString33);
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNOccurences(rEString40, (int) (short) 1);
		java.lang.String str43 = rEString40.getREString();
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeNothing(rEString40);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString44, (int) ' ',
				(int) (short) 1);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString44);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeOrString(rEString33, rEString44);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeExcluded(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
	}

	@Test
	public void test153() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test153");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeAnyChar(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
	}

	@Test
	public void test154() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test154");
		st1920.automaton.REString rEString0 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString1 = st1920.automaton.Wrapper.makeCharClass(rEString0);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test155() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test155");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeAnyChar(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExact(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNothing(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
	}

	@Test
	public void test156() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test156");
		st1920.automaton.REString rEString0 = null;
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyChar(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) 'a');
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, 10);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNumREString(rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeExact(rEString19);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeOrString(rEString11, rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNotCharClass(rEString21);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString21);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeAnyChar(rEString24);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeCharClass(rEString24);
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeAndString(rEString0, rEString24);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
	}

	@Test
	public void test157() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test157");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString9, 100);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeExcluded(rEString9);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString14, (int) (short) 1);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) 'a');
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, 10);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNumREString(rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString25, 100);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeOrString(rEString16, rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeAndString(rEString9, rEString16);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) (short) 1);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) 'a');
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNOccurences(rEString35, 10);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNumREString(rEString37);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString38, 100);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeExcluded(rEString38);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeConcatenation(rEString29, rEString41);
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeNOccurences(rEString44, (int) (short) 1);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeOrString(rEString42, rEString46);
		boolean boolean48 = st1920.automaton.Wrapper.matches("", rEString42);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeExact(rEString42);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeExcluded(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
	}

	@Test
	public void test158() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test158");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString7, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) (short) 1);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) 'a');
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOccurences(rEString23, 10);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNumREString(rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString26, 100);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeExcluded(rEString26);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) (short) 1);
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNOccurences(rEString35, (int) (short) 1);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOccurences(rEString35, (int) 'a');
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNOccurences(rEString39, 10);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNumREString(rEString41);
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString42, 100);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeOrString(rEString33, rEString44);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeAndString(rEString26, rEString33);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeNOccurences(rEString48, (int) (short) 1);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeNOccurences(rEString48, (int) 'a');
		st1920.automaton.REString rEString54 = st1920.automaton.Wrapper.makeNOccurences(rEString52, 10);
		st1920.automaton.REString rEString55 = st1920.automaton.Wrapper.makeNumREString(rEString54);
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString55, 100);
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeExcluded(rEString55);
		st1920.automaton.REString rEString59 = st1920.automaton.Wrapper.makeConcatenation(rEString46, rEString58);
		st1920.automaton.REString rEString60 = st1920.automaton.Wrapper.makeAnyChar(rEString46);
		boolean boolean61 = st1920.automaton.Wrapper.matches("hi!", rEString60);
		st1920.automaton.REString rEString62 = st1920.automaton.Wrapper.makeAndString(rEString16, rEString60);
		st1920.automaton.REString rEString63 = st1920.automaton.Wrapper.makeExact(rEString62);
		st1920.automaton.REString rEString64 = st1920.automaton.Wrapper.makeAnyString(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
	}

	@Test
	public void test159() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test159");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNotCharClass(rEString14);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumBetween(rEString16, 10, (int) (byte) 10);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeAnyString(rEString16);
		java.lang.String str21 = rEString20.getREString();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str21 + "' != '" + "[^{97}{10}1{100,}]@" + "'",
				str21.equals("[^{97}{10}1{100,}]@"));
	}

	@Test
	public void test160() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test160");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString15);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeCharClass(rEString29);
		java.lang.Class<?> wildcardClass31 = rEString30.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass31);
	}

	@Test
	public void test161() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test161");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeCharClass(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNumREString(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) 'a');
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, 10);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNumREString(rEString19);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString20, 100);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeAnyString(rEString20);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeAndString(rEString11, rEString20);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOccurences(rEString20, (int) '#');
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
	}

	@Test
	public void test162() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test162");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeGroup(rEString5);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString9,
				(int) (short) 0);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeExact(rEString15);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeNumREString(rEString15);
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString29,
				(int) (byte) 0);
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeOrString(rEString9, rEString31);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeNumBetween(rEString9, (int) (byte) 0, (-1));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
	}

	@Test
	public void test163() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test163");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyChar(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeAnyString(rEString11);
		boolean boolean13 = st1920.automaton.Wrapper.matches("hi!", rEString11);
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString15, (int) (short) 1);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) (short) 1);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) 'a');
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOccurences(rEString23, 10);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNumREString(rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString26, 100);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeOrString(rEString17, rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeConcatenation(rEString11, rEString28);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) (short) 1);
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) 'a');
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString36, 10);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNumREString(rEString38);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNumREString(rEString38);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeAnyChar(rEString40);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeExact(rEString41);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNumBetween(rEString42, (int) ' ',
				(int) (short) 10);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeConcatenation(rEString11, rEString42);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeNotCharClass(rEString46);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeAlphaREString(rEString47);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString47, (-1),
				(int) '#');
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
	}

	@Test
	public void test164() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test164");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeAnyChar(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) (short) 1);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) 'a');
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeNOccurences(rEString16, 10);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumREString(rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeExact(rEString18);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeOrString(rEString10, rEString20);
		java.lang.String str22 = rEString21.getREString();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{97}{10}1.|\"{97}{10}\"" + "'",
				str22.equals("{97}{10}1.|\"{97}{10}\""));
	}

	@Test
	public void test165() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test165");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString7, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, (int) (short) 1);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOccurences(rEString22, (int) 'a');
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOccurences(rEString26, 10);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeNumREString(rEString28);
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString29, 100);
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeOrString(rEString20, rEString31);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString32);
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNOccurences(rEString35, (int) (short) 1);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOccurences(rEString35, (int) 'a');
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNOccurences(rEString39, 10);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNumREString(rEString41);
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString42, 100);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeExcluded(rEString42);
		st1920.automaton.REString rEString47 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeNOccurences(rEString47, (int) (short) 1);
		st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = st1920.automaton.Wrapper.makeNOccurences(rEString51, (int) (short) 1);
		st1920.automaton.REString rEString55 = st1920.automaton.Wrapper.makeNOccurences(rEString51, (int) 'a');
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeNOccurences(rEString55, 10);
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeNumREString(rEString57);
		st1920.automaton.REString rEString60 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString58, 100);
		st1920.automaton.REString rEString61 = st1920.automaton.Wrapper.makeOrString(rEString49, rEString60);
		st1920.automaton.REString rEString62 = st1920.automaton.Wrapper.makeAndString(rEString42, rEString49);
		st1920.automaton.REString rEString63 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString49);
		st1920.automaton.REString rEString64 = st1920.automaton.Wrapper.makeAndString(rEString32, rEString49);
		st1920.automaton.REString rEString65 = st1920.automaton.Wrapper.makeAndString(rEString16, rEString32);
		st1920.automaton.REString rEString66 = st1920.automaton.Wrapper.makeCharClass(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
	}

	@Test
	public void test166() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test166");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeAnyChar(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyChar(rEString10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString10, (-1));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
	}

	@Test
	public void test167() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test167");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) 'a');
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, 10);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNumREString(rEString19);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString20, 100);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeExcluded(rEString20);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeOrString(rEString11, rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeCharClass(rEString11);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNotCharClass(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
	}

	@Test
	public void test168() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test168");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) (short) 1);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeConcatenation(rEString8, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString15);
		boolean boolean18 = st1920.automaton.Wrapper.matches("hi!", rEString15);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeAnyString(rEString15);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
	}

	@Test
	public void test169() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test169");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) 'a');
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, 10);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNumREString(rEString36);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString37, 100);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeExcluded(rEString37);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeConcatenation(rEString28, rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNOccurences(rEString43, (int) (short) 1);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOrString(rEString41, rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeNOccurences(rEString48, (int) (short) 1);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeNOccurences(rEString48, (int) 'a');
		st1920.automaton.REString rEString54 = st1920.automaton.Wrapper.makeNOccurences(rEString52, 10);
		st1920.automaton.REString rEString55 = st1920.automaton.Wrapper.makeNumREString(rEString54);
		st1920.automaton.REString rEString56 = st1920.automaton.Wrapper.makeNumREString(rEString54);
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeCharClass(rEString56);
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeAndString(rEString46, rEString56);
		st1920.automaton.REString rEString61 = st1920.automaton.Wrapper.makeNumBetween(rEString56, (int) (short) 10, 0);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
	}

	@Test
	public void test170() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test170");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeAnyString(rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeAlphaREString(rEString3);
		boolean boolean5 = st1920.automaton.Wrapper.matches("{97}{10}1&{1}~{97}{10}1", rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
	}

	@Test
	public void test171() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test171");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) 'a');
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, 10);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNumREString(rEString36);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString37, 100);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeExcluded(rEString37);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeConcatenation(rEString28, rEString40);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString40);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeCharClass(rEString40);
		java.lang.Class<?> wildcardClass44 = rEString43.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass44);
	}

	@Test
	public void test172() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test172");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeNumBetween(rEString8, (int) (short) -1, 10);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString31,
				(int) (short) 1);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNothing(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
	}

	@Test
	public void test173() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test173");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeAnyChar(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAlphaREString(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeExcluded(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
	}

	@Test
	public void test174() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test174");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyString(rEString8);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeAlphaREString(rEString11);
		java.lang.String str13 = rEString11.getREString();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{97}{10}1@" + "'", str13.equals("{97}{10}1@"));
	}

	@Test
	public void test175() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test175");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) 'a');
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, 10);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNumREString(rEString36);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString37, 100);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeExcluded(rEString37);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeConcatenation(rEString28, rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNOccurences(rEString43, (int) (short) 1);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOrString(rEString41, rEString45);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString46);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeCharClass(rEString46);
		st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = st1920.automaton.Wrapper.makeNOccurences(rEString51, (int) (short) 1);
		st1920.automaton.REString rEString55 = st1920.automaton.Wrapper.makeNOccurences(rEString51, (int) 'a');
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeNOccurences(rEString55, 10);
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeNumREString(rEString57);
		st1920.automaton.REString rEString59 = st1920.automaton.Wrapper.makeNumREString(rEString57);
		st1920.automaton.REString rEString60 = st1920.automaton.Wrapper.makeAnyChar(rEString59);
		st1920.automaton.REString rEString61 = st1920.automaton.Wrapper.makeAnyString(rEString60);
		boolean boolean62 = st1920.automaton.Wrapper.matches("hi!", rEString60);
		st1920.automaton.REString rEString64 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString66 = st1920.automaton.Wrapper.makeNOccurences(rEString64, (int) (short) 1);
		st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = st1920.automaton.Wrapper.makeNOccurences(rEString68, (int) (short) 1);
		st1920.automaton.REString rEString72 = st1920.automaton.Wrapper.makeNOccurences(rEString68, (int) 'a');
		st1920.automaton.REString rEString74 = st1920.automaton.Wrapper.makeNOccurences(rEString72, 10);
		st1920.automaton.REString rEString75 = st1920.automaton.Wrapper.makeNumREString(rEString74);
		st1920.automaton.REString rEString77 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString75, 100);
		st1920.automaton.REString rEString78 = st1920.automaton.Wrapper.makeOrString(rEString66, rEString77);
		st1920.automaton.REString rEString79 = st1920.automaton.Wrapper.makeConcatenation(rEString60, rEString77);
		st1920.automaton.REString rEString81 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString83 = st1920.automaton.Wrapper.makeNOccurences(rEString81, (int) (short) 1);
		st1920.automaton.REString rEString85 = st1920.automaton.Wrapper.makeNOccurences(rEString81, (int) 'a');
		st1920.automaton.REString rEString87 = st1920.automaton.Wrapper.makeNOccurences(rEString85, 10);
		st1920.automaton.REString rEString88 = st1920.automaton.Wrapper.makeNumREString(rEString87);
		st1920.automaton.REString rEString89 = st1920.automaton.Wrapper.makeNumREString(rEString87);
		st1920.automaton.REString rEString90 = st1920.automaton.Wrapper.makeAnyChar(rEString89);
		st1920.automaton.REString rEString91 = st1920.automaton.Wrapper.makeExact(rEString90);
		st1920.automaton.REString rEString94 = st1920.automaton.Wrapper.makeNumBetween(rEString91, (int) ' ',
				(int) (short) 10);
		st1920.automaton.REString rEString95 = st1920.automaton.Wrapper.makeConcatenation(rEString60, rEString91);
		st1920.automaton.REString rEString96 = st1920.automaton.Wrapper.makeOrString(rEString48, rEString91);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString87);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString88);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString89);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString90);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString91);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString94);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString95);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString96);
	}

	@Test
	public void test176() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test176");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString15, (int) '4');
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeAnyString(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
	}

	@Test
	public void test177() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test177");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString7, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, (int) (short) 1);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOccurences(rEString22, (int) 'a');
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOccurences(rEString26, 10);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeNumREString(rEString28);
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString29, 100);
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeOrString(rEString20, rEString31);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeAlphaREString(rEString20);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNumREString(rEString33);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeOrString(rEString14, rEString34);
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeExcluded(rEString34);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNothing(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
	}

	@Test
	public void test178() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test178");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) 'a');
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, 10);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNumREString(rEString36);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString37, 100);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeExcluded(rEString37);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeConcatenation(rEString28, rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNOccurences(rEString43, (int) (short) 1);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOrString(rEString41, rEString45);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString45,
				(int) (short) 100);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeCharClass(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
	}

	@Test
	public void test179() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test179");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		java.lang.String str4 = rEString1.getREString();
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) 'a');
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, 10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNumREString(rEString12);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString13, (int) ' ');
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeConcatenation(rEString1, rEString13);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumBetween(rEString16, (-1), 100);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString16, 0,
				(int) (short) 0);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeAnyChar(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
	}

	@Test
	public void test180() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test180");
		st1920.automaton.REString rEString0 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString2 = st1920.automaton.Wrapper.makeNOccurences(rEString0, (int) (short) 10);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test181() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test181");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString7, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeAnyString(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
	}

	@Test
	public void test182() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test182");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString15);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeCharClass(rEString29);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) (short) 1);
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString36, (int) (short) 1);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOccurences(rEString36, (int) 'a');
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNOccurences(rEString40, 10);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNumREString(rEString42);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString43, 100);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOrString(rEString34, rEString45);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeAlphaREString(rEString34);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNumREString(rEString47);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeConcatenation(rEString29, rEString47);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeExact(rEString29);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeGroup(rEString29);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeAnyChar(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
	}

	@Test
	public void test183() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test183");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeGroup(rEString5);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString9,
				(int) (short) 0);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeGroup(rEString12);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString13, 10,
				(int) (byte) 10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
	}

	@Test
	public void test184() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test184");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNotCharClass(rEString14);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumBetween(rEString16, 10, (int) (byte) 10);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNumBetween(rEString16, (int) (byte) 0, 100);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
	}

	@Test
	public void test185() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test185");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("{97}{10}1");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString1, (int) (short) -1,
				(int) (byte) 0);
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNumBetween(rEString4, (int) ' ',
				(int) (byte) 1);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
	}

	@Test
	public void test186() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test186");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString2 = st1920.automaton.Wrapper.makeAnyString(rEString1);
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeAlphaREString(rEString2);
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeGroup(rEString3);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		java.lang.String str9 = rEString6.getREString();
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNothing(rEString6);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString10, (int) ' ',
				(int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString3, rEString10);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeAnyChar(rEString10);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, (int) (short) 1);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOccurences(rEString21, (int) 'a');
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOccurences(rEString25, 10);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNumREString(rEString27);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString28, 100);
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeOrString(rEString19, rEString30);
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeAlphaREString(rEString19);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeAnyString(rEString19);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeOrString(rEString10, rEString33);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNumBetween(rEString34, (int) (byte) -1,
				(int) (short) 1);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeGroup(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
	}

	@Test
	public void test187() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test187");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString15);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeCharClass(rEString29);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) (short) 1);
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString36, (int) (short) 1);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOccurences(rEString36, (int) 'a');
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNOccurences(rEString40, 10);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNumREString(rEString42);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString43, 100);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOrString(rEString34, rEString45);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeAlphaREString(rEString34);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNumREString(rEString47);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeConcatenation(rEString29, rEString47);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
	}

	@Test
	public void test188() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test188");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString7, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) (short) 1);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) 'a');
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOccurences(rEString23, 10);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNumREString(rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString26, 100);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeExcluded(rEString26);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) (short) 1);
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNOccurences(rEString35, (int) (short) 1);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOccurences(rEString35, (int) 'a');
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNOccurences(rEString39, 10);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNumREString(rEString41);
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString42, 100);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeOrString(rEString33, rEString44);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeAndString(rEString26, rEString33);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeNOccurences(rEString48, (int) (short) 1);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeNOccurences(rEString48, (int) 'a');
		st1920.automaton.REString rEString54 = st1920.automaton.Wrapper.makeNOccurences(rEString52, 10);
		st1920.automaton.REString rEString55 = st1920.automaton.Wrapper.makeNumREString(rEString54);
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString55, 100);
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeExcluded(rEString55);
		st1920.automaton.REString rEString59 = st1920.automaton.Wrapper.makeConcatenation(rEString46, rEString58);
		st1920.automaton.REString rEString60 = st1920.automaton.Wrapper.makeAnyChar(rEString46);
		boolean boolean61 = st1920.automaton.Wrapper.matches("hi!", rEString60);
		st1920.automaton.REString rEString62 = st1920.automaton.Wrapper.makeAndString(rEString16, rEString60);
		st1920.automaton.REString rEString63 = st1920.automaton.Wrapper.makeAlphaREString(rEString62);
		st1920.automaton.REString rEString64 = st1920.automaton.Wrapper.makeNotCharClass(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
	}

	@Test
	public void test189() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test189");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		java.lang.String str4 = rEString1.getREString();
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) 'a');
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, 10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNumREString(rEString12);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString13, (int) ' ');
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeConcatenation(rEString1, rEString13);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeGroup(rEString13);
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString20, (int) (short) 1);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString20, (int) 'a');
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOccurences(rEString24, 10);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNumREString(rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNumREString(rEString26);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeConcatenation(rEString26, rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString33);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString33);
		boolean boolean36 = st1920.automaton.Wrapper.matches("hi!", rEString33);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNothing(rEString33);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeConcatenation(rEString13, rEString33);
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNOccurences(rEString40, (int) (short) 1);
		java.lang.String str43 = rEString40.getREString();
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeNothing(rEString40);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString44, (int) ' ',
				(int) (short) 1);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString44);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeOrString(rEString33, rEString44);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeAnyChar(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str43 + "' != '" + "" + "'", str43.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
	}

	@Test
	public void test190() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test190");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString2, (int) 'a');
		boolean boolean9 = st1920.automaton.Wrapper.matches("{97}{10}", rEString2);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString2);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNotCharClass(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) 'a');
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, 10);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNumREString(rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNumREString(rEString19);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeAnyChar(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeAnyString(rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeAndString(rEString11, rEString22);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeAnyChar(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
	}

	@Test
	public void test191() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test191");
		st1920.automaton.REString rEString0 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString1 = st1920.automaton.Wrapper.makeAlphaREString(rEString0);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test192() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test192");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeExact(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNumREString(rEString3);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString17,
				(int) (byte) 0);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeExact(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
	}

	@Test
	public void test193() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test193");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeAlphaREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeAnyString(rEString3);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeExact(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
	}

	@Test
	public void test194() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test194");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeAnyChar(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
	}

	@Test
	public void test195() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test195");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) 'a');
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, 10);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNumREString(rEString19);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString20, 100);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeExcluded(rEString20);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeOrString(rEString11, rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeCharClass(rEString11);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeExact(rEString25);
		java.lang.Class<?> wildcardClass27 = rEString26.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass27);
	}

	@Test
	public void test196() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test196");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("{97}{10}");
		st1920.automaton.REString rEString3 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString3, (int) (short) 1);
		java.lang.String str6 = rEString3.getREString();
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeAndString(rEString1, rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
	}

	@Test
	public void test197() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test197");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeGroup(rEString3);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeExcluded(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
	}

	@Test
	public void test198() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test198");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeGroup(rEString3);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeExcluded(rEString3);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNotCharClass(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
	}

	@Test
	public void test199() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test199");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, (int) ' ');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNotCharClass(rEString8);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString11, (-1));
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeAnyString(rEString13);
		java.lang.String str15 = rEString14.getREString();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str15 + "' != '" + "[^{97}{10}1]{-1,}@" + "'",
				str15.equals("[^{97}{10}1]{-1,}@"));
	}

	@Test
	public void test200() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test200");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeCharClass(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNumREString(rEString10);
		java.lang.Class<?> wildcardClass12 = rEString11.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass12);
	}

	@Test
	public void test201() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test201");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyChar(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeExact(rEString11);
		boolean boolean13 = st1920.automaton.Wrapper.matches("{97}{10}1&{1}~{97}{10}1", rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
	}

	@Test
	public void test202() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test202");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeAnyChar(rEString7);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
	}

	@Test
	public void test203() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test203");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString15);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeCharClass(rEString29);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) (short) 1);
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString36, (int) (short) 1);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOccurences(rEString36, (int) 'a');
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNOccurences(rEString40, 10);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNumREString(rEString42);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString43, 100);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOrString(rEString34, rEString45);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeAlphaREString(rEString34);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNumREString(rEString47);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeConcatenation(rEString29, rEString47);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeNOccurences(rEString29, 0);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString51);
		st1920.automaton.REString rEString54 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString51, (-1));
		st1920.automaton.REString rEString56 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeNOccurences(rEString56, (int) (short) 1);
		st1920.automaton.REString rEString60 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString62 = st1920.automaton.Wrapper.makeNOccurences(rEString60, (int) (short) 1);
		st1920.automaton.REString rEString64 = st1920.automaton.Wrapper.makeNOccurences(rEString60, (int) 'a');
		st1920.automaton.REString rEString66 = st1920.automaton.Wrapper.makeNOccurences(rEString64, 10);
		st1920.automaton.REString rEString67 = st1920.automaton.Wrapper.makeNumREString(rEString66);
		st1920.automaton.REString rEString69 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString67, 100);
		st1920.automaton.REString rEString70 = st1920.automaton.Wrapper.makeOrString(rEString58, rEString69);
		st1920.automaton.REString rEString71 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString58);
		st1920.automaton.REString rEString72 = st1920.automaton.Wrapper.makeGroup(rEString58);
		st1920.automaton.REString rEString73 = st1920.automaton.Wrapper.makeExact(rEString72);
		st1920.automaton.REString rEString74 = st1920.automaton.Wrapper.makeAndString(rEString51, rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
	}

	@Test
	public void test204() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test204");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeExact(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeGroup(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
	}

	@Test
	public void test205() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test205");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyChar(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeAnyString(rEString11);
		boolean boolean13 = st1920.automaton.Wrapper.matches("hi!", rEString11);
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString15, (int) (short) 1);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) (short) 1);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) 'a');
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOccurences(rEString23, 10);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNumREString(rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString26, 100);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeOrString(rEString17, rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeConcatenation(rEString11, rEString28);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) (short) 1);
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) 'a');
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString36, 10);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNumREString(rEString38);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNumREString(rEString38);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeAnyChar(rEString40);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeExact(rEString41);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNumBetween(rEString42, (int) ' ',
				(int) (short) 10);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeConcatenation(rEString11, rEString42);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeNotCharClass(rEString46);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeAlphaREString(rEString47);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString47,
				(int) (short) 1);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeCharClass(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
	}

	@Test
	public void test206() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test206");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) 'a');
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, 10);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNumREString(rEString36);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString37, 100);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeExcluded(rEString37);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeConcatenation(rEString28, rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNOccurences(rEString43, (int) (short) 1);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOrString(rEString41, rEString45);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeNOccurences(rEString48, (int) (short) 1);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeNOccurences(rEString48, (int) 'a');
		st1920.automaton.REString rEString54 = st1920.automaton.Wrapper.makeNOccurences(rEString52, 10);
		st1920.automaton.REString rEString55 = st1920.automaton.Wrapper.makeNumREString(rEString54);
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString55, 100);
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeAnyString(rEString55);
		st1920.automaton.REString rEString59 = st1920.automaton.Wrapper.makeAlphaREString(rEString58);
		st1920.automaton.REString rEString60 = st1920.automaton.Wrapper.makeAnyChar(rEString58);
		java.lang.String str61 = rEString58.getREString();
		st1920.automaton.REString rEString64 = st1920.automaton.Wrapper.makeNumBetween(rEString58, (int) (short) 100,
				10);
		st1920.automaton.REString rEString65 = st1920.automaton.Wrapper.makeAndString(rEString46, rEString58);
		st1920.automaton.REString rEString66 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{97}{10}1@" + "'", str61.equals("{97}{10}1@"));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
	}

	@Test
	public void test207() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test207");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) 'a');
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, 10);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNumREString(rEString19);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString20, 100);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeExcluded(rEString20);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeOrString(rEString11, rEString23);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeCharClass(rEString11);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeExact(rEString25);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNothing(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
	}

	@Test
	public void test208() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test208");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeGroup(rEString5);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString9,
				(int) (short) 0);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeCharClass(rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
	}

	@Test
	public void test209() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test209");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString15);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) 'a');
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, 10);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNumREString(rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString25, 100);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeExcluded(rEString25);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, (int) (short) 1);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString34, (int) 'a');
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOccurences(rEString38, 10);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNumREString(rEString40);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString41, 100);
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeOrString(rEString32, rEString43);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeAndString(rEString25, rEString32);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString32);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeAndString(rEString15, rEString32);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNumREString(rEString47);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeNumBetween(rEString48, (int) (byte) -1, 0);
		st1920.automaton.REString rEString53 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString55 = st1920.automaton.Wrapper.makeNOccurences(rEString53, (int) (short) 1);
		st1920.automaton.REString rEString57 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString59 = st1920.automaton.Wrapper.makeNOccurences(rEString57, (int) (short) 1);
		st1920.automaton.REString rEString61 = st1920.automaton.Wrapper.makeNOccurences(rEString57, (int) 'a');
		st1920.automaton.REString rEString63 = st1920.automaton.Wrapper.makeNOccurences(rEString61, 10);
		st1920.automaton.REString rEString64 = st1920.automaton.Wrapper.makeNumREString(rEString63);
		st1920.automaton.REString rEString66 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString64, 100);
		st1920.automaton.REString rEString67 = st1920.automaton.Wrapper.makeOrString(rEString55, rEString66);
		st1920.automaton.REString rEString69 = st1920.automaton.Wrapper.makeNOccurences(rEString67, (int) '4');
		st1920.automaton.REString rEString70 = st1920.automaton.Wrapper.makeAndString(rEString51, rEString69);
		st1920.automaton.REString rEString71 = st1920.automaton.Wrapper.makeAnyString(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
	}

	@Test
	public void test210() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test210");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString15);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) 'a');
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, 10);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNumREString(rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString25, 100);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeExcluded(rEString25);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, (int) (short) 1);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString34, (int) 'a');
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOccurences(rEString38, 10);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNumREString(rEString40);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString41, 100);
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeOrString(rEString32, rEString43);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeAndString(rEString25, rEString32);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString32);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeAndString(rEString15, rEString32);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNumREString(rEString47);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
	}

	@Test
	public void test211() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test211");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) 'a');
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, 10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNumREString(rEString12);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString13, 100);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeOrString(rEString4, rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString4);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeAnyString(rEString4);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeExcluded(rEString18);
		boolean boolean20 = st1920.automaton.Wrapper.matches("hi!", rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
	}

	@Test
	public void test212() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test212");
		st1920.automaton.REString rEString0 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNumBetween(rEString0, (-1), (-1));
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test213() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test213");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString8, (int) (byte) 10,
				(int) '#');
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
	}

	@Test
	public void test214() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test214");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeAnyString(rEString15);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumBetween(rEString16, 0, 10);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNumBetween(rEString19, (int) (short) 10,
				(int) (short) 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString19, 10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
	}

	@Test
	public void test215() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test215");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeAnyChar(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) (short) 1);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) 'a');
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeNOccurences(rEString16, 10);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumREString(rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeExact(rEString18);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeOrString(rEString10, rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString10);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOccurences(rEString24, (int) (short) 1);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOccurences(rEString24, (int) 'a');
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeNOccurences(rEString28, 10);
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeNumREString(rEString30);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString31, 100);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeExcluded(rEString31);
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString36, (int) (short) 1);
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNOccurences(rEString40, (int) (short) 1);
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeNOccurences(rEString40, (int) 'a');
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeNOccurences(rEString44, 10);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeNumREString(rEString46);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString47, 100);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeOrString(rEString38, rEString49);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeAndString(rEString31, rEString38);
		st1920.automaton.REString rEString54 = st1920.automaton.Wrapper.makeNumBetween(rEString31, (int) (short) -1,
				10);
		st1920.automaton.REString rEString55 = st1920.automaton.Wrapper.makeExcluded(rEString54);
		st1920.automaton.REString rEString56 = st1920.automaton.Wrapper.makeNothing(rEString54);
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeAndString(rEString22, rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
	}

	@Test
	public void test216() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test216");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) 'a');
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, 10);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNumREString(rEString36);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString37, 100);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeExcluded(rEString37);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeConcatenation(rEString28, rEString40);
		st1920.automaton.REString rEString43 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNOccurences(rEString43, (int) (short) 1);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOrString(rEString41, rEString45);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString41, (int) (byte) 10,
				0);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString41);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeAnyChar(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
	}

	@Test
	public void test217() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test217");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeAnyChar(rEString9);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) (short) 1);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) 'a');
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeNOccurences(rEString16, 10);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumREString(rEString18);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeExact(rEString18);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeOrString(rEString10, rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString10);
		st1920.automaton.REString rEString25 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOccurences(rEString25, (int) (short) 1);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeNOccurences(rEString25, (int) 'a');
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeNOccurences(rEString29, 10);
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNumREString(rEString31);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString32, 100);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeExcluded(rEString32);
		st1920.automaton.REString rEString37 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOccurences(rEString37, (int) (short) 1);
		st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNOccurences(rEString41, (int) (short) 1);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNOccurences(rEString41, (int) 'a');
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeNOccurences(rEString45, 10);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNumREString(rEString47);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString48, 100);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeOrString(rEString39, rEString50);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeAndString(rEString32, rEString39);
		st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString56 = st1920.automaton.Wrapper.makeNOccurences(rEString54, (int) (short) 1);
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeNOccurences(rEString54, (int) 'a');
		st1920.automaton.REString rEString60 = st1920.automaton.Wrapper.makeNOccurences(rEString58, 10);
		st1920.automaton.REString rEString61 = st1920.automaton.Wrapper.makeNumREString(rEString60);
		st1920.automaton.REString rEString63 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString61, 100);
		st1920.automaton.REString rEString64 = st1920.automaton.Wrapper.makeExcluded(rEString61);
		st1920.automaton.REString rEString65 = st1920.automaton.Wrapper.makeConcatenation(rEString52, rEString64);
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = st1920.automaton.Wrapper.makeNOccurences(rEString67, (int) (short) 1);
		st1920.automaton.REString rEString70 = st1920.automaton.Wrapper.makeOrString(rEString65, rEString69);
		boolean boolean71 = st1920.automaton.Wrapper.matches("", rEString65);
		st1920.automaton.REString rEString72 = st1920.automaton.Wrapper.makeExact(rEString65);
		st1920.automaton.REString rEString73 = st1920.automaton.Wrapper.makeNumREString(rEString72);
		st1920.automaton.REString rEString74 = st1920.automaton.Wrapper.makeAndString(rEString10, rEString72);
		java.lang.String str75 = rEString74.getREString();
		st1920.automaton.REString rEString76 = st1920.automaton.Wrapper.makeNumREString(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str75 + "' != '" + "{97}{10}1.&\"{97}{10}1&{1}~{97}{10}1\"" + "'",
				str75.equals("{97}{10}1.&\"{97}{10}1&{1}~{97}{10}1\""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
	}

	@Test
	public void test218() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test218");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) 'a');
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, 10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNumREString(rEString12);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString13, 100);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeOrString(rEString4, rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString4);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeGroup(rEString4);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeExcluded(rEString4);
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, (int) (short) 1);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOccurences(rEString21, (int) 'a');
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOccurences(rEString25, 10);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNumREString(rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeNumREString(rEString27);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) (short) 1);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeConcatenation(rEString27, rEString33);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString34);
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString34);
		st1920.automaton.REString rEString39 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNOccurences(rEString39, (int) (short) 1);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNOccurences(rEString39, (int) 'a');
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNOccurences(rEString43, 10);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeNumREString(rEString45);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString46, 100);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeExcluded(rEString46);
		st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = st1920.automaton.Wrapper.makeNOccurences(rEString51, (int) (short) 1);
		st1920.automaton.REString rEString55 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeNOccurences(rEString55, (int) (short) 1);
		st1920.automaton.REString rEString59 = st1920.automaton.Wrapper.makeNOccurences(rEString55, (int) 'a');
		st1920.automaton.REString rEString61 = st1920.automaton.Wrapper.makeNOccurences(rEString59, 10);
		st1920.automaton.REString rEString62 = st1920.automaton.Wrapper.makeNumREString(rEString61);
		st1920.automaton.REString rEString64 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString62, 100);
		st1920.automaton.REString rEString65 = st1920.automaton.Wrapper.makeOrString(rEString53, rEString64);
		st1920.automaton.REString rEString66 = st1920.automaton.Wrapper.makeAndString(rEString46, rEString53);
		st1920.automaton.REString rEString68 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString70 = st1920.automaton.Wrapper.makeNOccurences(rEString68, (int) (short) 1);
		st1920.automaton.REString rEString72 = st1920.automaton.Wrapper.makeNOccurences(rEString68, (int) 'a');
		st1920.automaton.REString rEString74 = st1920.automaton.Wrapper.makeNOccurences(rEString72, 10);
		st1920.automaton.REString rEString75 = st1920.automaton.Wrapper.makeNumREString(rEString74);
		st1920.automaton.REString rEString77 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString75, 100);
		st1920.automaton.REString rEString78 = st1920.automaton.Wrapper.makeExcluded(rEString75);
		st1920.automaton.REString rEString79 = st1920.automaton.Wrapper.makeConcatenation(rEString66, rEString78);
		st1920.automaton.REString rEString80 = st1920.automaton.Wrapper.makeAnyChar(rEString66);
		boolean boolean81 = st1920.automaton.Wrapper.matches("hi!", rEString80);
		st1920.automaton.REString rEString82 = st1920.automaton.Wrapper.makeAndString(rEString36, rEString80);
		st1920.automaton.REString rEString84 = st1920.automaton.Wrapper.makeNOccurences(rEString82, 0);
		st1920.automaton.REString rEString85 = st1920.automaton.Wrapper.makeConcatenation(rEString4, rEString82);
		st1920.automaton.REString rEString86 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString85);
		st1920.automaton.REString rEString89 = st1920.automaton.Wrapper.makeNumBetween(rEString85, 10, (int) ' ');
		boolean boolean90 = st1920.automaton.Wrapper.matches("", rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString70);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString72);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString75);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString80);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString82);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString86);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString89);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
	}

	@Test
	public void test219() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test219");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeGroup(rEString3);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString17);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString18, (int) (byte) -1,
				(int) (byte) 10);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeAnyString(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
	}

	@Test
	public void test220() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test220");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyString(rEString8);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeAlphaREString(rEString11);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeAlphaREString(rEString12);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
	}

	@Test
	public void test221() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test221");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString2 = st1920.automaton.Wrapper.makeAnyString(rEString1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNumBetween(rEString2, (int) 'a',
				(int) (short) 1);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
	}

	@Test
	public void test222() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test222");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString7, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, (int) (short) 1);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOccurences(rEString22, (int) 'a');
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOccurences(rEString26, 10);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeNumREString(rEString28);
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString29, 100);
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeOrString(rEString20, rEString31);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeAlphaREString(rEString20);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNumREString(rEString33);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeOrString(rEString14, rEString34);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOccurences(rEString38, (int) (short) 1);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNOccurences(rEString38, (int) 'a');
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeNOccurences(rEString42, 10);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeGroup(rEString42);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString42, 1, 0);
		boolean boolean49 = st1920.automaton.Wrapper.matches("hi!", rEString42);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeOrString(rEString35, rEString42);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeNotCharClass(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
	}

	@Test
	public void test223() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test223");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) 'a');
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, 10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNumREString(rEString12);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString13, 100);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeOrString(rEString4, rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNotCharClass(rEString15);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNumBetween(rEString17, 10, (int) (byte) 10);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNotCharClass(rEString17);
		boolean boolean22 = st1920.automaton.Wrapper.matches("{1}a", rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
	}

	@Test
	public void test224() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test224");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyChar(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeAnyString(rEString11);
		boolean boolean13 = st1920.automaton.Wrapper.matches("hi!", rEString11);
		st1920.automaton.REString rEString15 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString15, (int) (short) 1);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) (short) 1);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) 'a');
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOccurences(rEString23, 10);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNumREString(rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString26, 100);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeOrString(rEString17, rEString28);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeConcatenation(rEString11, rEString28);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) (short) 1);
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) 'a');
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString36, 10);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNumREString(rEString38);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNumREString(rEString38);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeAnyChar(rEString40);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeExact(rEString41);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNumBetween(rEString42, (int) ' ',
				(int) (short) 10);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeConcatenation(rEString11, rEString42);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeNotCharClass(rEString46);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeAlphaREString(rEString47);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeCharClass(rEString48);
		st1920.automaton.REString rEString51 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString53 = st1920.automaton.Wrapper.makeNOccurences(rEString51, (int) (short) 1);
		st1920.automaton.REString rEString55 = st1920.automaton.Wrapper.makeNOccurences(rEString51, (int) 'a');
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeNOccurences(rEString55, 10);
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeNumREString(rEString57);
		st1920.automaton.REString rEString59 = st1920.automaton.Wrapper.makeNumREString(rEString57);
		st1920.automaton.REString rEString60 = st1920.automaton.Wrapper.makeAnyChar(rEString59);
		st1920.automaton.REString rEString61 = st1920.automaton.Wrapper.makeAnyString(rEString60);
		st1920.automaton.REString rEString62 = st1920.automaton.Wrapper.makeOrString(rEString49, rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
	}

	@Test
	public void test225() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test225");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) 'a');
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, 10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNumREString(rEString12);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString13, 100);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeOrString(rEString4, rEString15);
		boolean boolean17 = st1920.automaton.Wrapper.matches("", rEString16);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString16, (int) 'a',
				(int) (byte) 0);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString20, 0);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeAlphaREString(rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNothing(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
	}

	@Test
	public void test226() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test226");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString7, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, (int) (short) 1);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOccurences(rEString22, (int) 'a');
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOccurences(rEString26, 10);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeNumREString(rEString28);
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString29, 100);
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeOrString(rEString20, rEString31);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeAlphaREString(rEString20);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNumREString(rEString33);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeOrString(rEString14, rEString34);
		java.lang.String str36 = rEString14.getREString();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{97}{10}{1}" + "'", str36.equals("{97}{10}{1}"));
	}

	@Test
	public void test227() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test227");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		java.lang.String str4 = rEString1.getREString();
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNothing(rEString1);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString5, (int) ' ',
				(int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString5);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
	}

	@Test
	public void test228() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test228");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) (short) 1);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeConcatenation(rEString8, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString15);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString15);
		boolean boolean18 = st1920.automaton.Wrapper.matches("hi!", rEString15);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString15, (int) 'a');
		java.lang.String str21 = rEString15.getREString();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{97}{10}{1}" + "'", str21.equals("{97}{10}{1}"));
	}

	@Test
	public void test229() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test229");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNotCharClass(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
	}

	@Test
	public void test230() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test230");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeAnyChar(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyString(rEString10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
	}

	@Test
	public void test231() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test231");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString15);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) 'a');
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, 10);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNumREString(rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString25, 100);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeExcluded(rEString25);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, (int) (short) 1);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString34, (int) 'a');
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOccurences(rEString38, 10);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNumREString(rEString40);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString41, 100);
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeOrString(rEString32, rEString43);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeAndString(rEString25, rEString32);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString32);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeAndString(rEString15, rEString32);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNumREString(rEString47);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeNumBetween(rEString48, (int) (byte) -1, 0);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
	}

	@Test
	public void test232() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test232");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		java.lang.String str4 = rEString1.getREString();
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) 'a');
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, 10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNumREString(rEString12);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString13, (int) ' ');
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeConcatenation(rEString1, rEString13);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumBetween(rEString16, (-1), 100);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNotCharClass(rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeCharClass(rEString20);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
	}

	@Test
	public void test233() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test233");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeAnyString(rEString15);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumBetween(rEString16, 0, 10);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNumBetween(rEString19, (int) (short) 10,
				(int) (short) 10);
		st1920.automaton.REString rEString24 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeAnyString(rEString24);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeAlphaREString(rEString25);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeGroup(rEString26);
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeNOccurences(rEString29, (int) (short) 1);
		java.lang.String str32 = rEString29.getREString();
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNothing(rEString29);
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString33, (int) ' ',
				(int) (short) 1);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeConcatenation(rEString26, rEString33);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeAnyChar(rEString33);
		st1920.automaton.REString rEString40 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNOccurences(rEString40, (int) (short) 1);
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeNOccurences(rEString44, (int) (short) 1);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNOccurences(rEString44, (int) 'a');
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeNOccurences(rEString48, 10);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeNumREString(rEString50);
		st1920.automaton.REString rEString53 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString51, 100);
		st1920.automaton.REString rEString54 = st1920.automaton.Wrapper.makeOrString(rEString42, rEString53);
		st1920.automaton.REString rEString55 = st1920.automaton.Wrapper.makeAlphaREString(rEString42);
		st1920.automaton.REString rEString56 = st1920.automaton.Wrapper.makeAnyString(rEString42);
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeOrString(rEString33, rEString56);
		st1920.automaton.REString rEString60 = st1920.automaton.Wrapper.makeNumBetween(rEString57, (int) (byte) -1,
				(int) (short) 1);
		st1920.automaton.REString rEString61 = st1920.automaton.Wrapper.makeConcatenation(rEString22, rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str32 + "' != '" + "" + "'", str32.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
	}

	@Test
	public void test234() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test234");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString2 = st1920.automaton.Wrapper.makeNothing(rEString1);
		st1920.automaton.REString rEString4 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString4, (int) (short) 1);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString4, (int) 'a');
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString8, 10);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNumREString(rEString10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString11, 100);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeExcluded(rEString11);
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeNOccurences(rEString16, (int) (short) 1);
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString20, (int) (short) 1);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString20, (int) 'a');
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOccurences(rEString24, 10);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNumREString(rEString26);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString27, 100);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeOrString(rEString18, rEString29);
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeAndString(rEString11, rEString18);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNumBetween(rEString11, (int) (short) -1,
				10);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeOrString(rEString1, rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString2);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
	}

	@Test
	public void test235() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test235");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		java.lang.String str4 = rEString1.getREString();
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) 'a');
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, 10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNumREString(rEString12);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString13, (int) ' ');
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeConcatenation(rEString1, rEString13);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumBetween(rEString16, (-1), 100);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString19);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString19,
				(int) (byte) -1);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
	}

	@Test
	public void test236() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test236");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString15);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeCharClass(rEString29);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) (short) 1);
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString36, (int) (short) 1);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOccurences(rEString36, (int) 'a');
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNOccurences(rEString40, 10);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNumREString(rEString42);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString43, 100);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOrString(rEString34, rEString45);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeAlphaREString(rEString34);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNumREString(rEString47);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeConcatenation(rEString29, rEString47);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeNOccurences(rEString29, 0);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString51);
		st1920.automaton.REString rEString53 = st1920.automaton.Wrapper.makeNothing(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
	}

	@Test
	public void test237() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test237");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		java.lang.String str4 = rEString1.getREString();
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNothing(rEString1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeExact(rEString5);
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeGroup(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
	}

	@Test
	public void test238() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test238");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeAnyChar(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNotCharClass(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
	}

	@Test
	public void test239() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test239");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString15);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeCharClass(rEString29);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) (short) 1);
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString36, (int) (short) 1);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOccurences(rEString36, (int) 'a');
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNOccurences(rEString40, 10);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNumREString(rEString42);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString43, 100);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOrString(rEString34, rEString45);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeAlphaREString(rEString34);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNumREString(rEString47);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeConcatenation(rEString29, rEString47);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeExact(rEString29);
		st1920.automaton.REString rEString53 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString29,
				(int) (short) 10, (int) (short) 10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
	}

	@Test
	public void test240() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test240");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString10, (int) 'a');
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString14, 10);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNumREString(rEString16);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeNumREString(rEString16);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeAnyChar(rEString18);
		st1920.automaton.REString rEString21 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, (int) (short) 1);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOccurences(rEString21, (int) 'a');
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOccurences(rEString25, 10);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNumREString(rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeExact(rEString27);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeOrString(rEString19, rEString29);
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeOrString(rEString8, rEString29);
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeGroup(rEString29);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
	}

	@Test
	public void test241() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test241");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeGroup(rEString3);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeExcluded(rEString3);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString18,
				(int) (byte) 100);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
	}

	@Test
	public void test242() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test242");
		st1920.automaton.REString rEString0 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString2 = st1920.automaton.Wrapper.makeNOccurences(rEString0,
					(int) (short) 100);
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test243() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test243");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeAlphaREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNumREString(rEString16);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString16, (int) ' ');
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNumREString(rEString16);
		java.lang.String str21 = rEString20.getREString();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{1}a1" + "'", str21.equals("{1}a1"));
	}

	@Test
	public void test244() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test244");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeGroup(rEString3);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString3, (int) 'a');
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeExact(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
	}

	@Test
	public void test245() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test245");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString11 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNOccurences(rEString11, (int) (short) 1);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeConcatenation(rEString7, rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString14);
		st1920.automaton.REString rEString19 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) (short) 1);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString19, (int) 'a');
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOccurences(rEString23, 10);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNumREString(rEString25);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString26, 100);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeExcluded(rEString26);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) (short) 1);
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNOccurences(rEString35, (int) (short) 1);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOccurences(rEString35, (int) 'a');
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNOccurences(rEString39, 10);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNumREString(rEString41);
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString42, 100);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeOrString(rEString33, rEString44);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeAndString(rEString26, rEString33);
		st1920.automaton.REString rEString48 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeNOccurences(rEString48, (int) (short) 1);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeNOccurences(rEString48, (int) 'a');
		st1920.automaton.REString rEString54 = st1920.automaton.Wrapper.makeNOccurences(rEString52, 10);
		st1920.automaton.REString rEString55 = st1920.automaton.Wrapper.makeNumREString(rEString54);
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString55, 100);
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeExcluded(rEString55);
		st1920.automaton.REString rEString59 = st1920.automaton.Wrapper.makeConcatenation(rEString46, rEString58);
		st1920.automaton.REString rEString60 = st1920.automaton.Wrapper.makeAnyChar(rEString46);
		boolean boolean61 = st1920.automaton.Wrapper.matches("hi!", rEString60);
		st1920.automaton.REString rEString62 = st1920.automaton.Wrapper.makeAndString(rEString16, rEString60);
		st1920.automaton.REString rEString65 = st1920.automaton.Wrapper.makeNumBetween(rEString16, (int) (byte) 10,
				(int) '#');
		st1920.automaton.REString rEString66 = st1920.automaton.Wrapper.makeCharClass(rEString65);
		st1920.automaton.REString rEString67 = st1920.automaton.Wrapper.makeAnyString(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString62);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString66);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString67);
	}

	@Test
	public void test246() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test246");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) 'a');
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, 10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNumREString(rEString12);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString13, 100);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeOrString(rEString4, rEString15);
		boolean boolean17 = st1920.automaton.Wrapper.matches("[^{97}{10}1]{-1,}@", rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
	}

	@Test
	public void test247() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test247");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeGroup(rEString6);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString9);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString10,
				(int) (short) 0);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString12);
		boolean boolean14 = st1920.automaton.Wrapper.matches("", rEString13);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeAlphaREString(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
	}

	@Test
	public void test248() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test248");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeAnyString(rEString15);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNumBetween(rEString16, 0, 10);
		java.lang.Class<?> wildcardClass20 = rEString16.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass20);
	}

	@Test
	public void test249() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test249");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeGroup(rEString3);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeAnyChar(rEString3);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeAnyString(rEString3);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeAlphaREString(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
	}

	@Test
	public void test250() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test250");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString9, 100);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeExcluded(rEString9);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString14, (int) (short) 1);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) 'a');
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, 10);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNumREString(rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString25, 100);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeOrString(rEString16, rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeAndString(rEString9, rEString16);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) (short) 1);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) 'a');
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNOccurences(rEString35, 10);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNumREString(rEString37);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString38, 100);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeExcluded(rEString38);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeConcatenation(rEString29, rEString41);
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeNOccurences(rEString44, (int) (short) 1);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeOrString(rEString42, rEString46);
		boolean boolean48 = st1920.automaton.Wrapper.matches("", rEString42);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeExact(rEString42);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeExact(rEString42);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeNotCharClass(rEString42);
		java.lang.Class<?> wildcardClass52 = rEString42.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass52);
	}

	@Test
	public void test251() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test251");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString9, 100);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeExcluded(rEString9);
		st1920.automaton.REString rEString14 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeNOccurences(rEString14, (int) (short) 1);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) 'a');
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, 10);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNumREString(rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString25, 100);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeOrString(rEString16, rEString27);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeAndString(rEString9, rEString16);
		st1920.automaton.REString rEString31 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) (short) 1);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeNOccurences(rEString31, (int) 'a');
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNOccurences(rEString35, 10);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNumREString(rEString37);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString38, 100);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeExcluded(rEString38);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeConcatenation(rEString29, rEString41);
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeNOccurences(rEString44, (int) (short) 1);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeOrString(rEString42, rEString46);
		boolean boolean48 = st1920.automaton.Wrapper.matches("", rEString42);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeExact(rEString42);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString49, (int) ' ');
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
	}

	@Test
	public void test252() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test252");
		st1920.automaton.REString rEString0 = null;
		// The following exception was thrown during execution in test generation
		try {
			st1920.automaton.REString rEString2 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString0, (int) 'a');
			org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test253() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test253");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString29 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString15);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeCharClass(rEString29);
		st1920.automaton.REString rEString32 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString32, (int) (short) 1);
		st1920.automaton.REString rEString36 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString36, (int) (short) 1);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOccurences(rEString36, (int) 'a');
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNOccurences(rEString40, 10);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNumREString(rEString42);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString43, 100);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOrString(rEString34, rEString45);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeAlphaREString(rEString34);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNumREString(rEString47);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeConcatenation(rEString29, rEString47);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeNOccurences(rEString29, 0);
		st1920.automaton.REString rEString53 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString29, (int) ' ');
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString29);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
	}

	@Test
	public void test254() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test254");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString7);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) (short) 1);
		st1920.automaton.REString rEString16 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeNOccurences(rEString16, (int) (short) 1);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString16, (int) 'a');
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString20, 10);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNumREString(rEString22);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString23, 100);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeOrString(rEString14, rEString25);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString26);
		st1920.automaton.REString rEString29 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString31 = st1920.automaton.Wrapper.makeNOccurences(rEString29, (int) (short) 1);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNOccurences(rEString29, (int) 'a');
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeNOccurences(rEString33, 10);
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNumREString(rEString35);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString36, 100);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeExcluded(rEString36);
		st1920.automaton.REString rEString41 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNOccurences(rEString41, (int) (short) 1);
		st1920.automaton.REString rEString45 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeNOccurences(rEString45, (int) (short) 1);
		st1920.automaton.REString rEString49 = st1920.automaton.Wrapper.makeNOccurences(rEString45, (int) 'a');
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeNOccurences(rEString49, 10);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeNumREString(rEString51);
		st1920.automaton.REString rEString54 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString52, 100);
		st1920.automaton.REString rEString55 = st1920.automaton.Wrapper.makeOrString(rEString43, rEString54);
		st1920.automaton.REString rEString56 = st1920.automaton.Wrapper.makeAndString(rEString36, rEString43);
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString43);
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeAndString(rEString26, rEString43);
		st1920.automaton.REString rEString59 = st1920.automaton.Wrapper.makeOrString(rEString7, rEString26);
		st1920.automaton.REString rEString60 = st1920.automaton.Wrapper.makeExcluded(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString31);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString49);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString59);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
	}

	@Test
	public void test255() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test255");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeGroup(rEString3);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString17);
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString20, (int) (short) 1);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString20, (int) 'a');
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOccurences(rEString24, 10);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNumREString(rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNumREString(rEString26);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeConcatenation(rEString26, rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString33);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString33);
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNumREString(rEString33);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString36, (int) '#');
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeOrString(rEString17, rEString36);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (byte) 1);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString41);
		st1920.automaton.REString rEString44 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeNOccurences(rEString44, (int) (short) 1);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNOccurences(rEString44, (int) 'a');
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeNOccurences(rEString48, 10);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString48);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeCharClass(rEString51);
		st1920.automaton.REString rEString53 = st1920.automaton.Wrapper.makeOrString(rEString41, rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
	}

	@Test
	public void test256() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test256");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrOneREString(rEString3);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeGroup(rEString3);
		st1920.automaton.REString rEString18 = st1920.automaton.Wrapper.makeExcluded(rEString3);
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString20, (int) (short) 1);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString20, (int) 'a');
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOccurences(rEString24, 10);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNumREString(rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNumREString(rEString26);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeConcatenation(rEString26, rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString33);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString33);
		st1920.automaton.REString rEString38 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOccurences(rEString38, (int) (short) 1);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNOccurences(rEString38, (int) 'a');
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeNOccurences(rEString42, 10);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeNumREString(rEString44);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString45, 100);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeExcluded(rEString45);
		st1920.automaton.REString rEString50 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeNOccurences(rEString50, (int) (short) 1);
		st1920.automaton.REString rEString54 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString56 = st1920.automaton.Wrapper.makeNOccurences(rEString54, (int) (short) 1);
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeNOccurences(rEString54, (int) 'a');
		st1920.automaton.REString rEString60 = st1920.automaton.Wrapper.makeNOccurences(rEString58, 10);
		st1920.automaton.REString rEString61 = st1920.automaton.Wrapper.makeNumREString(rEString60);
		st1920.automaton.REString rEString63 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString61, 100);
		st1920.automaton.REString rEString64 = st1920.automaton.Wrapper.makeOrString(rEString52, rEString63);
		st1920.automaton.REString rEString65 = st1920.automaton.Wrapper.makeAndString(rEString45, rEString52);
		st1920.automaton.REString rEString67 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString69 = st1920.automaton.Wrapper.makeNOccurences(rEString67, (int) (short) 1);
		st1920.automaton.REString rEString71 = st1920.automaton.Wrapper.makeNOccurences(rEString67, (int) 'a');
		st1920.automaton.REString rEString73 = st1920.automaton.Wrapper.makeNOccurences(rEString71, 10);
		st1920.automaton.REString rEString74 = st1920.automaton.Wrapper.makeNumREString(rEString73);
		st1920.automaton.REString rEString76 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString74, 100);
		st1920.automaton.REString rEString77 = st1920.automaton.Wrapper.makeExcluded(rEString74);
		st1920.automaton.REString rEString78 = st1920.automaton.Wrapper.makeConcatenation(rEString65, rEString77);
		st1920.automaton.REString rEString79 = st1920.automaton.Wrapper.makeAnyChar(rEString65);
		boolean boolean80 = st1920.automaton.Wrapper.matches("hi!", rEString79);
		st1920.automaton.REString rEString81 = st1920.automaton.Wrapper.makeAndString(rEString35, rEString79);
		st1920.automaton.REString rEString83 = st1920.automaton.Wrapper.makeNOccurences(rEString81, 0);
		st1920.automaton.REString rEString84 = st1920.automaton.Wrapper.makeConcatenation(rEString3, rEString81);
		st1920.automaton.REString rEString85 = st1920.automaton.Wrapper.makeNumREString(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString18);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString60);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString61);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString63);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString64);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString65);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString69);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString71);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString73);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString74);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString76);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString77);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString78);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString79);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString81);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString83);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString84);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString85);
	}

	@Test
	public void test257() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test257");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeCharClass(rEString9);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNumREString(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) 'a');
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, 10);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNumREString(rEString19);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString20, 100);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeAnyString(rEString20);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeAndString(rEString11, rEString20);
		st1920.automaton.REString rEString26 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNOccurences(rEString26, (int) (short) 1);
		st1920.automaton.REString rEString30 = st1920.automaton.Wrapper.makeNOccurences(rEString26, (int) 'a');
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, 10);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeNumREString(rEString32);
		st1920.automaton.REString rEString35 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNOccurences(rEString35, (int) (short) 1);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOccurences(rEString35, (int) 'a');
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNOccurences(rEString39, 10);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeNumREString(rEString41);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNumREString(rEString41);
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeAnyChar(rEString43);
		st1920.automaton.REString rEString46 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNOccurences(rEString46, (int) (short) 1);
		st1920.automaton.REString rEString50 = st1920.automaton.Wrapper.makeNOccurences(rEString46, (int) 'a');
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeNOccurences(rEString50, 10);
		st1920.automaton.REString rEString53 = st1920.automaton.Wrapper.makeNumREString(rEString52);
		st1920.automaton.REString rEString54 = st1920.automaton.Wrapper.makeExact(rEString52);
		st1920.automaton.REString rEString55 = st1920.automaton.Wrapper.makeOrString(rEString44, rEString54);
		st1920.automaton.REString rEString56 = st1920.automaton.Wrapper.makeOrString(rEString33, rEString54);
		st1920.automaton.REString rEString57 = st1920.automaton.Wrapper.makeGroup(rEString54);
		st1920.automaton.REString rEString58 = st1920.automaton.Wrapper.makeAndString(rEString20, rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString30);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString50);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString53);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString54);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString55);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString56);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString57);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString58);
	}

	@Test
	public void test258() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test258");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		java.lang.String str4 = rEString1.getREString();
		st1920.automaton.REString rEString6 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) (short) 1);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOccurences(rEString6, (int) 'a');
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNOccurences(rEString10, 10);
		st1920.automaton.REString rEString13 = st1920.automaton.Wrapper.makeNumREString(rEString12);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString13, (int) ' ');
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeConcatenation(rEString1, rEString13);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeGroup(rEString13);
		st1920.automaton.REString rEString20 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString20, (int) (short) 1);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString20, (int) 'a');
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOccurences(rEString24, 10);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNumREString(rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeNumREString(rEString26);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString33 = st1920.automaton.Wrapper.makeConcatenation(rEString26, rEString32);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString33);
		st1920.automaton.REString rEString35 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString33);
		boolean boolean36 = st1920.automaton.Wrapper.matches("hi!", rEString33);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNothing(rEString33);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeConcatenation(rEString13, rEString33);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNothing(rEString33);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNOccurences(rEString33, (int) '4');
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString13);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString33);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString35);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
	}

	@Test
	public void test259() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test259");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeExcluded(rEString8);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) (short) 1);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNOccurences(rEString17, (int) 'a');
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeNOccurences(rEString21, 10);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNumREString(rEString23);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString24, 100);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeOrString(rEString15, rEString26);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeAndString(rEString8, rEString15);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) 'a');
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, 10);
		st1920.automaton.REString rEString37 = st1920.automaton.Wrapper.makeNumREString(rEString36);
		st1920.automaton.REString rEString39 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString37, 100);
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeExcluded(rEString37);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeConcatenation(rEString28, rEString40);
		st1920.automaton.REString rEString42 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString40);
		java.lang.Class<?> wildcardClass43 = rEString42.getClass();
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString34);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString37);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString39);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString42);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(wildcardClass43);
	}

	@Test
	public void test260() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test260");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) (short) 1);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNOccurences(rEString5, (int) 'a');
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNOccurences(rEString9, 10);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12, 100);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeOrString(rEString3, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString15);
		st1920.automaton.REString rEString18 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) (short) 1);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeNOccurences(rEString18, (int) 'a');
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeNOccurences(rEString22, 10);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeNumREString(rEString24);
		st1920.automaton.REString rEString27 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString25, 100);
		st1920.automaton.REString rEString28 = st1920.automaton.Wrapper.makeExcluded(rEString25);
		st1920.automaton.REString rEString30 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString32 = st1920.automaton.Wrapper.makeNOccurences(rEString30, (int) (short) 1);
		st1920.automaton.REString rEString34 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString36 = st1920.automaton.Wrapper.makeNOccurences(rEString34, (int) (short) 1);
		st1920.automaton.REString rEString38 = st1920.automaton.Wrapper.makeNOccurences(rEString34, (int) 'a');
		st1920.automaton.REString rEString40 = st1920.automaton.Wrapper.makeNOccurences(rEString38, 10);
		st1920.automaton.REString rEString41 = st1920.automaton.Wrapper.makeNumREString(rEString40);
		st1920.automaton.REString rEString43 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString41, 100);
		st1920.automaton.REString rEString44 = st1920.automaton.Wrapper.makeOrString(rEString32, rEString43);
		st1920.automaton.REString rEString45 = st1920.automaton.Wrapper.makeAndString(rEString25, rEString32);
		st1920.automaton.REString rEString46 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString32);
		st1920.automaton.REString rEString47 = st1920.automaton.Wrapper.makeAndString(rEString15, rEString32);
		st1920.automaton.REString rEString48 = st1920.automaton.Wrapper.makeNumREString(rEString47);
		st1920.automaton.REString rEString51 = st1920.automaton.Wrapper.makeNumBetween(rEString48, (int) (byte) -1, 0);
		st1920.automaton.REString rEString52 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString27);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString28);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString32);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString36);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString38);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString40);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString41);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString43);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString44);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString45);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString46);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString47);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString48);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString51);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString52);
	}

	@Test
	public void test261() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test261");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeAlphaREString(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeGroup(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
	}

	@Test
	public void test262() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test262");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString2, (int) 'a');
		boolean boolean9 = st1920.automaton.Wrapper.matches("{97}{10}", rEString2);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeOneOrMoreREString(rEString2);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeNotCharClass(rEString10);
		st1920.automaton.REString rEString13 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) (short) 1);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeNOccurences(rEString13, (int) 'a');
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeNOccurences(rEString17, 10);
		st1920.automaton.REString rEString20 = st1920.automaton.Wrapper.makeNumREString(rEString19);
		st1920.automaton.REString rEString21 = st1920.automaton.Wrapper.makeNumREString(rEString19);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeAnyChar(rEString21);
		st1920.automaton.REString rEString23 = st1920.automaton.Wrapper.makeAnyString(rEString22);
		st1920.automaton.REString rEString24 = st1920.automaton.Wrapper.makeAndString(rEString11, rEString22);
		st1920.automaton.REString rEString25 = st1920.automaton.Wrapper.makeExcluded(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString20);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString21);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString23);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString24);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString25);
	}

	@Test
	public void test263() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test263");
		st1920.automaton.REString rEString2 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString4 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) (short) 1);
		st1920.automaton.REString rEString6 = st1920.automaton.Wrapper.makeNOccurences(rEString2, (int) 'a');
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNOccurences(rEString6, 10);
		st1920.automaton.REString rEString9 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNumREString(rEString8);
		st1920.automaton.REString rEString12 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOccurences(rEString12, (int) (short) 1);
		st1920.automaton.REString rEString15 = st1920.automaton.Wrapper.makeConcatenation(rEString8, rEString14);
		st1920.automaton.REString rEString16 = st1920.automaton.Wrapper.makeZeroOrMoreREString(rEString15);
		st1920.automaton.REString rEString19 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString15, 1, 1);
		st1920.automaton.REString rEString22 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString15, 100,
				(int) (short) 10);
		boolean boolean23 = st1920.automaton.Wrapper.matches("{97}{10}1", rEString15);
		st1920.automaton.REString rEString26 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString15, (int) (byte) 10,
				(int) (short) -1);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString4);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString6);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString9);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString15);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString16);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString19);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString22);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString26);
	}

	@Test
	public void test264() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "RegressionTest0.test264");
		st1920.automaton.REString rEString1 = new st1920.automaton.REString("");
		st1920.automaton.REString rEString3 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) (short) 1);
		st1920.automaton.REString rEString5 = st1920.automaton.Wrapper.makeNOccurences(rEString1, (int) 'a');
		st1920.automaton.REString rEString7 = st1920.automaton.Wrapper.makeNOccurences(rEString5, 10);
		st1920.automaton.REString rEString8 = st1920.automaton.Wrapper.makeNumREString(rEString7);
		st1920.automaton.REString rEString10 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString8, 100);
		st1920.automaton.REString rEString11 = st1920.automaton.Wrapper.makeAnyString(rEString8);
		st1920.automaton.REString rEString12 = st1920.automaton.Wrapper.makeNumREString(rEString11);
		st1920.automaton.REString rEString14 = st1920.automaton.Wrapper.makeNOrMoreOccurences(rEString12,
				(int) (byte) 0);
		st1920.automaton.REString rEString17 = st1920.automaton.Wrapper.makeBetweenNandMOcc(rEString14, (int) (short) 0,
				(int) (byte) 1);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString3);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString5);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString7);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString8);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString10);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString11);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString12);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString14);
		// Regression assertion (captures the current behavior of the code)
		org.junit.Assert.assertNotNull(rEString17);
	}

}
