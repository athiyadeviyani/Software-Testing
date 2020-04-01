package st1920.automaton;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeExact(rEString0);
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
        st1920.automaton.REString rEString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOrString(rEString0, rEString1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        st1920.automaton.MatchString matchString0 = null;
        st1920.automaton.REString rEString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
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
            st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeCharClass(rEString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
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
        st1920.automaton.REString rEString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAndString(rEString0, rEString1);
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
            st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNum(rEString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        st1920.automaton.MatchString matchString0 = null;
        st1920.automaton.MatchString matchString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeZeroOrOne(rEString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlpha(rEString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeZeroOrMore(rEString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeOneOrMore(rEString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeExcluded(rEString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.REString rEString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        st1920.automaton.REString rEString0 = null;
        st1920.automaton.REString rEString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        java.lang.Class<?> wildcardClass3 = matchString1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNothing(rEString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        java.lang.Class<?> wildcardClass3 = matchString2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyChar(rEString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.REString rEString3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeGroup(rEString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.REString rEString3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = st1920.automaton.MatcherWrapper.matches(matchString2, rEString3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString5);
        st1920.automaton.REString rEString7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString5);
        java.lang.Class<?> wildcardClass7 = matchString5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        java.lang.Class<?> wildcardClass3 = matchString0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString8);
        st1920.automaton.REString rEString11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = st1920.automaton.MatcherWrapper.matches(matchString8, rEString11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        st1920.automaton.MatcherWrapper matcherWrapper0 = new st1920.automaton.MatcherWrapper();
        java.lang.Class<?> wildcardClass1 = matcherWrapper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.REString rEString3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.REString rEString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString8);
        st1920.automaton.MatchString matchString11 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString2);
        java.lang.Class<?> wildcardClass5 = matchString2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString5);
        java.lang.Class<?> wildcardClass7 = matchString1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString5);
        java.lang.Class<?> wildcardClass7 = matchString5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString2);
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString6);
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString9);
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString10);
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString11);
        st1920.automaton.REString rEString13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString5);
        java.lang.Class<?> wildcardClass7 = matchString6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString2);
        st1920.automaton.REString rEString5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = st1920.automaton.MatcherWrapper.matches(matchString4, rEString5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString2);
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString6);
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString9);
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString10);
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString11);
        java.lang.Class<?> wildcardClass13 = matchString11.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString8);
        st1920.automaton.MatchString matchString11 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString10, matchString11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString5);
        st1920.automaton.REString rEString7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString8);
        java.lang.Class<?> wildcardClass11 = matchString10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString10, matchString11);
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13, matchString14);
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString11, matchString15);
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString17, matchString18);
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString16, matchString18);
        st1920.automaton.MatchString matchString21 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString16);
        st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString16);
        st1920.automaton.REString rEString23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = st1920.automaton.MatcherWrapper.matches(matchString5, rEString23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString22);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString5);
        st1920.automaton.REString rEString7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = st1920.automaton.MatcherWrapper.matches(matchString5, rEString7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString8);
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString11, matchString12);
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString14, matchString15);
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString11, matchString16);
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString16);
        java.lang.Class<?> wildcardClass19 = matchString8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString4, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString6);
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString9);
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString11, matchString12);
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString14, matchString15);
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString12, matchString16);
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString18, matchString19);
        st1920.automaton.MatchString matchString21 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString17, matchString19);
        st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString17);
        st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString17);
        st1920.automaton.MatchString matchString24 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString17);
        st1920.automaton.REString rEString25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = st1920.automaton.MatcherWrapper.matches(matchString24, rEString25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString24);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString7);
        java.lang.Class<?> wildcardClass9 = matchString8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString7);
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString4, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString10, matchString11);
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString9, matchString11);
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString9);
        java.lang.Class<?> wildcardClass15 = matchString0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString10, matchString11);
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13, matchString14);
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString11, matchString15);
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString17, matchString18);
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString16, matchString18);
        st1920.automaton.MatchString matchString21 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString16);
        st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString16);
        st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString24 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString25 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString23, matchString24);
        st1920.automaton.MatchString matchString26 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString27 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString28 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString26, matchString27);
        st1920.automaton.MatchString matchString29 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString24, matchString28);
        st1920.automaton.MatchString matchString30 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString31 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString32 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString30, matchString31);
        st1920.automaton.MatchString matchString33 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString24, matchString31);
        st1920.automaton.MatchString matchString34 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString16, matchString31);
        java.lang.Class<?> wildcardClass35 = matchString31.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString5);
        java.lang.Class<?> wildcardClass7 = matchString6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.REString rEString3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString7);
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString9, matchString10);
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString10);
        st1920.automaton.REString rEString13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = st1920.automaton.MatcherWrapper.matches(matchString7, rEString13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString8);
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString11, matchString12);
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString14, matchString15);
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString11, matchString16);
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString16);
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString21 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString19, matchString20);
        st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString21);
        st1920.automaton.REString rEString23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = st1920.automaton.MatcherWrapper.matches(matchString22, rEString23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString22);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString10, matchString11);
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13, matchString14);
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString11, matchString15);
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString17, matchString18);
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString16, matchString18);
        st1920.automaton.MatchString matchString21 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString16);
        st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString16);
        st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString24 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString25 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString23, matchString24);
        st1920.automaton.MatchString matchString26 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString27 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString28 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString26, matchString27);
        st1920.automaton.MatchString matchString29 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString24, matchString28);
        st1920.automaton.MatchString matchString30 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString31 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString32 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString30, matchString31);
        st1920.automaton.MatchString matchString33 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString24, matchString31);
        st1920.automaton.MatchString matchString34 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString16, matchString31);
        st1920.automaton.REString rEString35 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = st1920.automaton.MatcherWrapper.matches(matchString16, rEString35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString34);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString8);
        java.lang.Class<?> wildcardClass11 = matchString8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString8);
        java.lang.Class<?> wildcardClass11 = matchString10.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString8);
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString11, matchString12);
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString14, matchString15);
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString11, matchString16);
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString16);
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString21 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString19, matchString20);
        st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString21);
        java.lang.Class<?> wildcardClass23 = matchString21.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString2);
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString6);
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString9);
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString10);
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString11);
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString14, matchString15);
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13, matchString15);
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString18, matchString19);
        st1920.automaton.MatchString matchString21 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString21, matchString22);
        st1920.automaton.MatchString matchString24 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString19, matchString23);
        st1920.automaton.MatchString matchString25 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13, matchString24);
        st1920.automaton.MatchString matchString26 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString13);
        st1920.automaton.MatchString matchString27 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString28 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString29 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString30 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString28, matchString29);
        st1920.automaton.MatchString matchString31 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString27, matchString29);
        st1920.automaton.MatchString matchString32 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString33 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString34 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString32, matchString33);
        st1920.automaton.MatchString matchString35 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString36 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString37 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString35, matchString36);
        st1920.automaton.MatchString matchString38 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString33, matchString37);
        st1920.automaton.MatchString matchString39 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString27, matchString38);
        st1920.automaton.MatchString matchString40 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString26, matchString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString40);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString4, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString6);
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString9);
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString11, matchString12);
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString14, matchString15);
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString12, matchString16);
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString18, matchString19);
        st1920.automaton.MatchString matchString21 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString17, matchString19);
        st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString17);
        st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString17);
        st1920.automaton.MatchString matchString24 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString17);
        java.lang.Class<?> wildcardClass25 = matchString0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.REString rEString3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString8);
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString12, matchString13);
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString11, matchString13);
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString15);
        st1920.automaton.REString rEString17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = st1920.automaton.MatcherWrapper.matches(matchString15, rEString17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString4, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString6);
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString9);
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString11, matchString12);
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString14, matchString15);
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString12, matchString16);
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString18, matchString19);
        st1920.automaton.MatchString matchString21 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString17, matchString19);
        st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString17);
        st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString17);
        st1920.automaton.MatchString matchString24 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString17);
        st1920.automaton.REString rEString25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = st1920.automaton.MatcherWrapper.matches(matchString17, rEString25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString24);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString8);
        st1920.automaton.MatchString matchString11 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString10, matchString11);
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13, matchString14);
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString11, matchString15);
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString17, matchString18);
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString16, matchString18);
        st1920.automaton.MatchString matchString21 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString16);
        st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString16);
        st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString24 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString25 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString23, matchString24);
        st1920.automaton.MatchString matchString26 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString27 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString28 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString26, matchString27);
        st1920.automaton.MatchString matchString29 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString24, matchString28);
        st1920.automaton.MatchString matchString30 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString31 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString32 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString30, matchString31);
        st1920.automaton.MatchString matchString33 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString24, matchString31);
        st1920.automaton.MatchString matchString34 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString16, matchString31);
        st1920.automaton.MatchString matchString35 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString36 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString37 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString38 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString36, matchString37);
        st1920.automaton.MatchString matchString39 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString35, matchString37);
        st1920.automaton.MatchString matchString40 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString16, matchString35);
        java.lang.Class<?> wildcardClass41 = matchString16.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString7);
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString9, matchString10);
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString10);
        java.lang.Class<?> wildcardClass13 = matchString12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString9);
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString9);
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString12, matchString13);
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString15, matchString16);
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13, matchString17);
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString18);
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString21 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString21, matchString22);
        st1920.automaton.MatchString matchString24 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString20, matchString22);
        st1920.automaton.MatchString matchString25 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString26 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString27 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString25, matchString26);
        st1920.automaton.MatchString matchString28 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString29 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString30 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString28, matchString29);
        st1920.automaton.MatchString matchString31 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString26, matchString30);
        st1920.automaton.MatchString matchString32 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString20, matchString31);
        st1920.automaton.MatchString matchString33 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString20);
        st1920.automaton.MatchString matchString34 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString34);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        st1920.automaton.MatchString matchString0 = null;
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString2);
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString4, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString2, matchString6);
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString8, matchString9);
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString9);
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString12, matchString13);
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString15, matchString16);
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString12, matchString17);
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString9, matchString17);
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString21 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString20, matchString21);
        st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString9, matchString22);
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.MatchString matchString24 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString23);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString10, matchString11);
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13, matchString14);
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString11, matchString15);
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString17, matchString18);
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString16, matchString18);
        st1920.automaton.MatchString matchString21 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString16);
        st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString16);
        st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString24 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString25 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString23, matchString24);
        st1920.automaton.MatchString matchString26 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString27 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString28 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString26, matchString27);
        st1920.automaton.MatchString matchString29 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString24, matchString28);
        st1920.automaton.MatchString matchString30 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString31 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString32 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString30, matchString31);
        st1920.automaton.MatchString matchString33 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString24, matchString31);
        st1920.automaton.MatchString matchString34 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString16, matchString31);
        java.lang.Class<?> wildcardClass35 = matchString16.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString10, matchString11);
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13, matchString14);
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString11, matchString15);
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString17, matchString18);
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString16, matchString18);
        st1920.automaton.MatchString matchString21 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString16);
        st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString16);
        java.lang.Class<?> wildcardClass23 = matchString22.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString6, matchString7);
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString4, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString10, matchString11);
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString9, matchString11);
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString9);
        st1920.automaton.REString rEString15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = st1920.automaton.MatcherWrapper.matches(matchString14, rEString15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString7);
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString9, matchString10);
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString12, matchString13);
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString9, matchString14);
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString16, matchString17);
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString21 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString19, matchString20);
        st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString24 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString22, matchString23);
        st1920.automaton.MatchString matchString25 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString20, matchString24);
        st1920.automaton.MatchString matchString26 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString27 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString28 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString26, matchString27);
        st1920.automaton.MatchString matchString29 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString25, matchString27);
        st1920.automaton.MatchString matchString30 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString16, matchString25);
        st1920.automaton.MatchString matchString31 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString14, matchString25);
        st1920.automaton.MatchString matchString32 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString32);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString8);
        java.lang.Class<?> wildcardClass11 = matchString1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString10, matchString11);
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString13, matchString14);
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString11, matchString15);
        st1920.automaton.MatchString matchString17 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString18 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString19 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString17, matchString18);
        st1920.automaton.MatchString matchString20 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString16, matchString18);
        st1920.automaton.MatchString matchString21 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString16);
        st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString5, matchString16);
        st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString24 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString25 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString23, matchString24);
        st1920.automaton.MatchString matchString26 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString27 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString28 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString26, matchString27);
        st1920.automaton.MatchString matchString29 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString24, matchString28);
        st1920.automaton.MatchString matchString30 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString31 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString32 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString30, matchString31);
        st1920.automaton.MatchString matchString33 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString24, matchString31);
        st1920.automaton.MatchString matchString34 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString16, matchString31);
        st1920.automaton.MatchString matchString35 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString36 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString37 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString35, matchString36);
        st1920.automaton.MatchString matchString38 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString39 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString40 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString38, matchString39);
        st1920.automaton.MatchString matchString41 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString36, matchString40);
        st1920.automaton.MatchString matchString42 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString43 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString44 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString42, matchString43);
        st1920.automaton.MatchString matchString45 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString41, matchString43);
        st1920.automaton.MatchString matchString46 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString16, matchString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString46);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString0, matchString1);
        st1920.automaton.MatchString matchString3 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString4 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString5 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString3, matchString4);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString5);
        st1920.automaton.MatchString matchString7 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString8 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString9 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString7, matchString8);
        st1920.automaton.MatchString matchString10 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString8);
        st1920.automaton.MatchString matchString11 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString12 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString13 = st1920.automaton.MatcherWrapper.makeAlpha();
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString12, matchString13);
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString11, matchString13);
        st1920.automaton.MatchString matchString16 = st1920.automaton.MatcherWrapper.makeConcatenation(matchString1, matchString15);
        st1920.automaton.REString rEString17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString16);
    }
}

