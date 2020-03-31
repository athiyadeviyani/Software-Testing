import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.String str0 = st1920.automaton.RegExpMatcher.makeNum();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "1" + "'", str0.equals("1"));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("1", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.String str0 = st1920.automaton.RegExpMatcher.makeAlpha();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "a" + "'", str0.equals("a"));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("1", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11" + "'", str2.equals("11"));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("1", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a" + "'", str2.equals("a"));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("11", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!" + "'", str2.equals("11hi!"));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a", "11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a11" + "'", str2.equals("a11"));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        st1920.automaton.RegExpMatcher regExpMatcher0 = new st1920.automaton.RegExpMatcher();
        java.lang.Class<?> wildcardClass1 = regExpMatcher0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("1", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1a" + "'", str2.equals("1a"));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("11hi!", "11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!11" + "'", str2.equals("11hi!11"));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa" + "'", str2.equals("aa"));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("1", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("11", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!", "1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a" + "'", str2.equals("hi!1a"));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!", "aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!aa" + "'", str2.equals("hi!aa"));
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a11", "11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("11hi!", "hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!1a", "hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!aa" + "'", str2.equals("hi!1ahi!aa"));
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("11hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!" + "'", str2.equals("11hi!"));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("aa", "11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a", "hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ahi!1a" + "'", str2.equals("ahi!1a"));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!1a", "11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11" + "'", str2.equals("hi!1a11hi!11"));
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("11hi!", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1" + "'", str2.equals("11hi!1"));
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a11", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("11hi!", "hi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("11", "aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a11", "hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!1a", "hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!1ahi!aa" + "'", str2.equals("hi!1ahi!1ahi!aa"));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("aa", "hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!1a11hi!11", "aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11aa" + "'", str2.equals("hi!1a11hi!11aa"));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("ahi!1a", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!1a", "aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("11hi!", "11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!11hi!1" + "'", str2.equals("11hi!11hi!1"));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!1a11hi!11", "hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aa"));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("11hi!11", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!11" + "'", str2.equals("11hi!11"));
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("11hi!11hi!1", "hi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!1a11hi!11aa", "hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("1a", "ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1a" + "'", str2.equals("1aahi!1a"));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!", "hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("1a", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("1a", "hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("11hi!1", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!1" + "'", str2.equals("11hi!1"));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a", "hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("aa", "11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("1a", "11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1a11hi!1" + "'", str2.equals("1a11hi!1"));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!1a11hi!11", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("11hi!", "ahi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!ahi!1a" + "'", str2.equals("11hi!ahi!1a"));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("", "11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11" + "'", str2.equals("11"));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!1a", "hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!1ahi!aa", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!aa" + "'", str2.equals("hi!1ahi!aa"));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!1a", "hi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!1a11hi!11hi!1ahi!aa", "hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a11", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a111" + "'", str2.equals("a111"));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!1a11hi!11", "hi!1a11hi!11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11"));
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!aa", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("1a11hi!1", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1a11hi!1a11" + "'", str2.equals("1a11hi!1a11"));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("11", "hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!aa" + "'", str2.equals("11hi!aa"));
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11hi!" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11hi!"));
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!1a11hi!11", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11hi!1ahi!hi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("1ahi!1a11hi!11aahi!1ahi!aa", "1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("11", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!1ahi!hi!1a11hi!11aahi!1ahi!aa", "aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa" + "'", str2.equals("hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa"));
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("1a", "hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("11", "hi!1a11hi!11aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!1a", "1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("a11", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa" + "'", str2.equals("a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa"));
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("11hi!ahi!1a", "1a11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("1aahi!1a", "hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!1a", "11hi!11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("aa", "a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aaa11" + "'", str2.equals("aaa11"));
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("11hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11hi!", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("aa", "hi!1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa", "11hi!11hi!1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1" + "'", str2.equals("1aahi!1ahi!1a1ahi!1a11hi!11aahi!1ahi!aa11hi!11hi!1"));
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!1a11hi!11hi!1a11hi!11hi!", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("1aahi!1a", "hi!1a11hi!11aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1aahi!1ahi!1a11hi!11aa" + "'", str2.equals("1aahi!1ahi!1a11hi!11aa"));
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("a11", "aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!1a11hi!11aa", "a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("aa", "hi!1ahi!hi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("1a11hi!1a11", "11hi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1a11hi!1a1111hi!aa" + "'", str2.equals("1a11hi!1a1111hi!aa"));
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("1", "1a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!1a", "hi!1a11hi!11hi!1a11hi!11hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("11hi!", "hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa" + "'", str2.equals("11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa"));
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("11hi!ahi!1a", "11hi!hi!1a1ahi!1a11hi!11aahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test94");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1ahi!aa", "a");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aaa" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aaa"));
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test95");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1a11hi!11", "a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa" + "'", str2.equals("hi!1a11hi!11hi!1a11hi!11a11hi!1ahi!hi!1a11hi!11aahi!1ahi!aaaa"));
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test96");
        java.lang.String str2 = st1920.automaton.RegExpMatcher.makeConcatenation("hi!1a11hi!11hi!1ahi!aaa", "hi!1a11hi!11hi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa" + "'", str2.equals("hi!1a11hi!11hi!1ahi!aaahi!1a11hi!11hi!1ahi!aa"));
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test97");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("11hi!1", "hi!1ahi!1ahi!aa");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test98() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test98");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!hi!1a11hi!11aahi!1ahi!aa", "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test99() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test99");
        boolean boolean2 = st1920.automaton.RegExpMatcher.matches("hi!1a11hi!11aa", "1a11hi!1a11");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

