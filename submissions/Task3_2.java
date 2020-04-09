package st1920.automaton;

import org.junit.Test;
import static org.junit.Assert.*;

public class Task3_2 {
	
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
	

}
