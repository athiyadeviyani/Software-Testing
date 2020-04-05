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
        st1920.automaton.MatcherWrapper matcherWrapper0 = new st1920.automaton.MatcherWrapper();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
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
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
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
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0);
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        st1920.automaton.MatchString matchString0 = null;
        st1920.automaton.MatchString matchString1 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.MatchString matchString2 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString0, matchString1);
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
            st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNothing(rEString3);
        java.lang.Class<?> wildcardClass5 = rEString3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0);
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
            st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyChar(rEString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNothing(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOrString(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnyString(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeExcluded(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNothing(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeCharClass(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString1, rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExcluded(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnyString(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString4);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOrString(rEString3, rEString4);
        java.lang.Class<?> wildcardClass8 = rEString7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeCharClass(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAnyChar(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeCharClass(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeCharClass(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeCharClass(rEString3);
        java.lang.Class<?> wildcardClass5 = rEString3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString1);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnyString(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeExcluded(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNothing(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeGroup(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAndString(rEString0, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNothing(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnyString(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeExcluded(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNothing(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeGroup(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeOrString(rEString4, rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAnyString(rEString9);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
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
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeExcluded(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeCharClass(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString5);
        java.lang.Class<?> wildcardClass7 = rEString6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExcluded(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNothing(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNothing(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNothing(rEString5);
        boolean boolean7 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnyString(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeExcluded(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNothing(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeCharClass(rEString11);
        boolean boolean13 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAnyString(rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString14);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString16);
        boolean boolean19 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
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
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeCharClass(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAnyChar(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeExcluded(rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeAlpha();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        st1920.automaton.REString rEString0 = null;
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOrString(rEString1, rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnyString(rEString2);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnyString(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeExcluded(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNothing(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeGroup(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAndString(rEString2, rEString8);
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeOrString(rEString0, rEString8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
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
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeExact(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        st1920.automaton.REString rEString0 = null;
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString1);
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString0);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnyString(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeCharClass(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOrString(rEString5, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNothing(rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeExcluded(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
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
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeZeroOrOneREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0);
        java.lang.Class<?> wildcardClass3 = rEString0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeZeroOrMoreREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNothing(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAnyString(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeExcluded(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNothing(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeCharClass(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeGroup(rEString10);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeGroup(rEString10);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString6, rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExcluded(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNothing(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNothing(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNothing(rEString5);
        boolean boolean7 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnyString(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeExcluded(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNothing(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeCharClass(rEString11);
        boolean boolean13 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeNothing(rEString12);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeGroup(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExcluded(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNothing(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNothing(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNothing(rEString5);
        boolean boolean7 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnyString(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeExcluded(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNothing(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeCharClass(rEString11);
        boolean boolean13 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeNothing(rEString12);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeCharClass(rEString14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString16);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnyString(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeExcluded(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNothing(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNothing(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNothing(rEString6);
        boolean boolean8 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAnyString(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeExcluded(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNothing(rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeCharClass(rEString12);
        boolean boolean14 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString13);
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeAnyString(rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeExcluded(rEString17);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeNothing(rEString18);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeNothing(rEString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeNothing(rEString20);
        boolean boolean22 = st1920.automaton.MatcherWrapper.matches(matchString15, rEString20);
        st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString1, matchString15);
        st1920.automaton.MatchString matchString24 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString0, matchString23);
        st1920.automaton.REString rEString25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = st1920.automaton.MatcherWrapper.matches(matchString23, rEString25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString24);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnyString(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeExcluded(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString4);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOrString(rEString1, rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeZeroOrOneREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExact(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExcluded(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnyString(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString4);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOrString(rEString3, rEString4);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString4);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOrString(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnyString(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeExcluded(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNothing(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeGroup(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAndString(rEString0, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeExcluded(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeExcluded(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeCharClass(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAnyString(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeExcluded(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNothing(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNothing(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNothing(rEString11);
        boolean boolean13 = st1920.automaton.MatcherWrapper.matches(matchString6, rEString11);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAnyString(rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeExcluded(rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeNothing(rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeCharClass(rEString17);
        boolean boolean19 = st1920.automaton.MatcherWrapper.matches(matchString6, rEString18);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeNothing(rEString18);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeAnyString(rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeExcluded(rEString22);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeNothing(rEString23);
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeAnyString(rEString24);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString20, rEString25);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeOrString(rEString3, rEString20);
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeCharClass(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAnyString(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeExcluded(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNothing(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNothing(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNothing(rEString11);
        boolean boolean13 = st1920.automaton.MatcherWrapper.matches(matchString6, rEString11);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAnyString(rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeExcluded(rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeNothing(rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeCharClass(rEString17);
        boolean boolean19 = st1920.automaton.MatcherWrapper.matches(matchString6, rEString18);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeNothing(rEString18);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeAnyString(rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeExcluded(rEString22);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeNothing(rEString23);
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeAnyString(rEString24);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString20, rEString25);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeOrString(rEString3, rEString20);
        st1920.automaton.MatchString matchString28 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeAnyString(rEString29);
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeExcluded(rEString30);
        st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeNothing(rEString31);
        st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeNothing(rEString32);
        st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeNothing(rEString33);
        boolean boolean35 = st1920.automaton.MatcherWrapper.matches(matchString28, rEString33);
        st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeAnyString(rEString36);
        st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeExcluded(rEString37);
        st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeNothing(rEString38);
        st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeCharClass(rEString39);
        boolean boolean41 = st1920.automaton.MatcherWrapper.matches(matchString28, rEString40);
        st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeNothing(rEString40);
        st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString44 = st1920.automaton.MatcherWrapper.makeAnyString(rEString43);
        st1920.automaton.REString rEString45 = st1920.automaton.MatcherWrapper.makeExcluded(rEString44);
        st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeNothing(rEString45);
        st1920.automaton.REString rEString47 = st1920.automaton.MatcherWrapper.makeCharClass(rEString46);
        st1920.automaton.REString rEString48 = st1920.automaton.MatcherWrapper.makeGroup(rEString46);
        st1920.automaton.REString rEString49 = st1920.automaton.MatcherWrapper.makeAndString(rEString42, rEString46);
        st1920.automaton.REString rEString50 = st1920.automaton.MatcherWrapper.makeOrString(rEString27, rEString46);
        st1920.automaton.REString rEString51 = st1920.automaton.MatcherWrapper.makeCharClass(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString28);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnyString(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeExcluded(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNothing(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAnyString(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeExcluded(rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeNothing(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString13);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNothing(rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeAndString(rEString9, rEString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
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
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExcluded(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExcluded(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNothing(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNothing(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNothing(rEString5);
        boolean boolean7 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeGroup(rEString5);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExcluded(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnyString(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString4);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOrString(rEString3, rEString4);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAnyString(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnyString(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeExcluded(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNothing(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNothing(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNothing(rEString6);
        boolean boolean8 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAnyString(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeExcluded(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNothing(rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeCharClass(rEString12);
        boolean boolean14 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString13);
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeAnyString(rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeExcluded(rEString17);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeNothing(rEString18);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeNothing(rEString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeNothing(rEString20);
        boolean boolean22 = st1920.automaton.MatcherWrapper.matches(matchString15, rEString20);
        st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString1, matchString15);
        st1920.automaton.MatchString matchString24 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString0, matchString23);
        st1920.automaton.MatchString matchString25 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeAnyString(rEString26);
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeExcluded(rEString27);
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeNothing(rEString28);
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeNothing(rEString29);
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeNothing(rEString30);
        boolean boolean32 = st1920.automaton.MatcherWrapper.matches(matchString25, rEString30);
        st1920.automaton.MatchString matchString33 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString24, matchString25);
        st1920.automaton.MatchString matchString34 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.MatchString matchString35 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString33, matchString34);
        st1920.automaton.MatchString matchString36 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.MatchString matchString37 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeAnyString(rEString38);
        st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeExcluded(rEString39);
        st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeNothing(rEString40);
        st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeNothing(rEString41);
        st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeNothing(rEString42);
        boolean boolean44 = st1920.automaton.MatcherWrapper.matches(matchString37, rEString42);
        st1920.automaton.REString rEString45 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeAnyString(rEString45);
        st1920.automaton.REString rEString47 = st1920.automaton.MatcherWrapper.makeExcluded(rEString46);
        st1920.automaton.REString rEString48 = st1920.automaton.MatcherWrapper.makeNothing(rEString47);
        st1920.automaton.REString rEString49 = st1920.automaton.MatcherWrapper.makeCharClass(rEString48);
        boolean boolean50 = st1920.automaton.MatcherWrapper.matches(matchString37, rEString49);
        st1920.automaton.MatchString matchString51 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString52 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString53 = st1920.automaton.MatcherWrapper.makeAnyString(rEString52);
        st1920.automaton.REString rEString54 = st1920.automaton.MatcherWrapper.makeExcluded(rEString53);
        st1920.automaton.REString rEString55 = st1920.automaton.MatcherWrapper.makeNothing(rEString54);
        st1920.automaton.REString rEString56 = st1920.automaton.MatcherWrapper.makeNothing(rEString55);
        st1920.automaton.REString rEString57 = st1920.automaton.MatcherWrapper.makeNothing(rEString56);
        boolean boolean58 = st1920.automaton.MatcherWrapper.matches(matchString51, rEString56);
        st1920.automaton.MatchString matchString59 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString37, matchString51);
        st1920.automaton.MatchString matchString60 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString36, matchString59);
        st1920.automaton.MatchString matchString61 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString62 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString63 = st1920.automaton.MatcherWrapper.makeAnyString(rEString62);
        st1920.automaton.REString rEString64 = st1920.automaton.MatcherWrapper.makeExcluded(rEString63);
        st1920.automaton.REString rEString65 = st1920.automaton.MatcherWrapper.makeNothing(rEString64);
        st1920.automaton.REString rEString66 = st1920.automaton.MatcherWrapper.makeNothing(rEString65);
        st1920.automaton.REString rEString67 = st1920.automaton.MatcherWrapper.makeNothing(rEString66);
        boolean boolean68 = st1920.automaton.MatcherWrapper.matches(matchString61, rEString66);
        st1920.automaton.MatchString matchString69 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString60, matchString61);
        st1920.automaton.MatchString matchString70 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString34, matchString61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString25);
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
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
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
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString51);
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString61);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString70);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnyString(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeExcluded(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNothing(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeGroup(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAndString(rEString0, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnyString(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAnyString(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeExcluded(rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeNothing(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeGroup(rEString13);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAndString(rEString8, rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeExcluded(rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeAndString(rEString0, rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
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
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeOrString(rEString1, rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnyString(rEString2);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnyString(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeExcluded(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNothing(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeGroup(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAndString(rEString2, rEString8);
        boolean boolean11 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString8);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeCharClass(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOrString(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExact(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnyChar(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        st1920.automaton.MatchString matchString0 = null;
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExcluded(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeExcluded(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnyString(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString5);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOrString(rEString4, rEString5);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnyString(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNothing(rEString8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
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
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExcluded(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNothing(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNothing(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNothing(rEString5);
        boolean boolean7 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeOrString(rEString8, rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAnyString(rEString9);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeAnyString(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeExcluded(rEString13);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeNothing(rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeGroup(rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeAndString(rEString9, rEString15);
        boolean boolean18 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString9);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeAnyString(rEString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeExcluded(rEString20);
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeExcluded(rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeAnyString(rEString23);
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString23);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeOrString(rEString22, rEString23);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString23);
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeAnyString(rEString28);
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString28);
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeNothing(rEString30);
        st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeGroup(rEString31);
        st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeAnyString(rEString33);
        st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeExcluded(rEString34);
        st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeNothing(rEString35);
        st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString31, rEString36);
        st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeOrString(rEString23, rEString37);
        st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeAndString(rEString9, rEString38);
        st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeNothing(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
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
        org.junit.Assert.assertNotNull(rEString13);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOrString(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString0);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOrString(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        st1920.automaton.REString rEString0 = null;
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNothing(rEString3);
        java.lang.Class<?> wildcardClass5 = rEString4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExcluded(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNothing(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNothing(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNothing(rEString5);
        boolean boolean7 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnyString(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeExcluded(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNothing(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeCharClass(rEString11);
        boolean boolean13 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString12);
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeAnyString(rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeExcluded(rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeNothing(rEString17);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeNothing(rEString18);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeNothing(rEString19);
        boolean boolean21 = st1920.automaton.MatcherWrapper.matches(matchString14, rEString19);
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeAnyString(rEString22);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeExcluded(rEString23);
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeNothing(rEString24);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeCharClass(rEString25);
        boolean boolean27 = st1920.automaton.MatcherWrapper.matches(matchString14, rEString26);
        st1920.automaton.MatchString matchString28 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeAnyString(rEString29);
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeExcluded(rEString30);
        st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeNothing(rEString31);
        st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeNothing(rEString32);
        st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeNothing(rEString33);
        boolean boolean35 = st1920.automaton.MatcherWrapper.matches(matchString28, rEString33);
        st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeAnyString(rEString36);
        st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeExcluded(rEString37);
        st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeNothing(rEString38);
        st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeCharClass(rEString39);
        boolean boolean41 = st1920.automaton.MatcherWrapper.matches(matchString28, rEString40);
        st1920.automaton.MatchString matchString42 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString44 = st1920.automaton.MatcherWrapper.makeAnyString(rEString43);
        st1920.automaton.REString rEString45 = st1920.automaton.MatcherWrapper.makeExcluded(rEString44);
        st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeNothing(rEString45);
        st1920.automaton.REString rEString47 = st1920.automaton.MatcherWrapper.makeNothing(rEString46);
        st1920.automaton.REString rEString48 = st1920.automaton.MatcherWrapper.makeNothing(rEString47);
        boolean boolean49 = st1920.automaton.MatcherWrapper.matches(matchString42, rEString47);
        st1920.automaton.MatchString matchString50 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString28, matchString42);
        st1920.automaton.MatchString matchString51 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString14, matchString28);
        st1920.automaton.MatchString matchString52 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString53 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString54 = st1920.automaton.MatcherWrapper.makeAnyString(rEString53);
        st1920.automaton.REString rEString55 = st1920.automaton.MatcherWrapper.makeExcluded(rEString54);
        st1920.automaton.REString rEString56 = st1920.automaton.MatcherWrapper.makeNothing(rEString55);
        st1920.automaton.REString rEString57 = st1920.automaton.MatcherWrapper.makeNothing(rEString56);
        st1920.automaton.REString rEString58 = st1920.automaton.MatcherWrapper.makeNothing(rEString57);
        boolean boolean59 = st1920.automaton.MatcherWrapper.matches(matchString52, rEString57);
        st1920.automaton.REString rEString60 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString61 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString62 = st1920.automaton.MatcherWrapper.makeOrString(rEString60, rEString61);
        st1920.automaton.REString rEString63 = st1920.automaton.MatcherWrapper.makeAnyString(rEString61);
        st1920.automaton.REString rEString64 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString65 = st1920.automaton.MatcherWrapper.makeAnyString(rEString64);
        st1920.automaton.REString rEString66 = st1920.automaton.MatcherWrapper.makeExcluded(rEString65);
        st1920.automaton.REString rEString67 = st1920.automaton.MatcherWrapper.makeNothing(rEString66);
        st1920.automaton.REString rEString68 = st1920.automaton.MatcherWrapper.makeGroup(rEString67);
        st1920.automaton.REString rEString69 = st1920.automaton.MatcherWrapper.makeAndString(rEString61, rEString67);
        boolean boolean70 = st1920.automaton.MatcherWrapper.matches(matchString52, rEString61);
        st1920.automaton.MatchString matchString71 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString51, matchString52);
        st1920.automaton.MatchString matchString72 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString0, matchString52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
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
        org.junit.Assert.assertNotNull(matchString14);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString28);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString42);
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString52);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString72);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOrString(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnyString(rEString1);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnyChar(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString2);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnyString(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExcluded(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNothing(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNothing(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNothing(rEString5);
        boolean boolean7 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeOrString(rEString8, rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAnyString(rEString9);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeAnyString(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeExcluded(rEString13);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeNothing(rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeGroup(rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeAndString(rEString9, rEString15);
        boolean boolean18 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString9);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeAnyString(rEString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeExcluded(rEString20);
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeExcluded(rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeAnyString(rEString23);
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString23);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeOrString(rEString22, rEString23);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString23);
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeAnyString(rEString28);
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString28);
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeNothing(rEString30);
        st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeGroup(rEString31);
        st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeAnyString(rEString33);
        st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeExcluded(rEString34);
        st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeNothing(rEString35);
        st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString31, rEString36);
        st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeOrString(rEString23, rEString37);
        st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeAndString(rEString9, rEString38);
        st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeExcluded(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
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
        org.junit.Assert.assertNotNull(rEString13);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeCharClass(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAnyChar(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnyString(rEString6);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAnyString(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeExcluded(rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeExcluded(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAnyString(rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString14);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeOrString(rEString13, rEString14);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeAnyString(rEString17);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeNothing(rEString17);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeAndString(rEString9, rEString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeExcluded(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOrString(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnyString(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeExcluded(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExcluded(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNothing(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNothing(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNothing(rEString5);
        boolean boolean7 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnyString(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeExcluded(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNothing(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeCharClass(rEString11);
        boolean boolean13 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeNothing(rEString12);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString16);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOrString(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString0);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnyString(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnyChar(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeOrString(rEString6, rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString6);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAnyString(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeAndString(rEString4, rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
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
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyChar(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeOneOrMoreREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString1);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString3);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        java.lang.Class<?> wildcardClass4 = rEString3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeCharClass(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAnyChar(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeExact(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnyChar(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExcluded(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNothing(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNothing(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNothing(rEString5);
        boolean boolean7 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnyString(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeExcluded(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNothing(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeCharClass(rEString11);
        boolean boolean13 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAnyString(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
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
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeCharClass(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        st1920.automaton.MatchString matchString6 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAnyString(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeExcluded(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNothing(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNothing(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNothing(rEString11);
        boolean boolean13 = st1920.automaton.MatcherWrapper.matches(matchString6, rEString11);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAnyString(rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeExcluded(rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeNothing(rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeCharClass(rEString17);
        boolean boolean19 = st1920.automaton.MatcherWrapper.matches(matchString6, rEString18);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeNothing(rEString18);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeAnyString(rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeExcluded(rEString22);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeNothing(rEString23);
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeAnyString(rEString24);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString20, rEString25);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeOrString(rEString3, rEString20);
        st1920.automaton.MatchString matchString28 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeAnyString(rEString29);
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeExcluded(rEString30);
        st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeNothing(rEString31);
        st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeNothing(rEString32);
        st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeNothing(rEString33);
        boolean boolean35 = st1920.automaton.MatcherWrapper.matches(matchString28, rEString33);
        st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeAnyString(rEString36);
        st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeExcluded(rEString37);
        st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeNothing(rEString38);
        st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeCharClass(rEString39);
        boolean boolean41 = st1920.automaton.MatcherWrapper.matches(matchString28, rEString40);
        st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeNothing(rEString40);
        st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString44 = st1920.automaton.MatcherWrapper.makeAnyString(rEString43);
        st1920.automaton.REString rEString45 = st1920.automaton.MatcherWrapper.makeExcluded(rEString44);
        st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeNothing(rEString45);
        st1920.automaton.REString rEString47 = st1920.automaton.MatcherWrapper.makeCharClass(rEString46);
        st1920.automaton.REString rEString48 = st1920.automaton.MatcherWrapper.makeGroup(rEString46);
        st1920.automaton.REString rEString49 = st1920.automaton.MatcherWrapper.makeAndString(rEString42, rEString46);
        st1920.automaton.REString rEString50 = st1920.automaton.MatcherWrapper.makeOrString(rEString27, rEString46);
        st1920.automaton.REString rEString51 = st1920.automaton.MatcherWrapper.makeGroup(rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString28);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString42);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString51);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExcluded(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNothing(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeCharClass(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeGroup(rEString4);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAnyChar(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString7);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAnyString(rEString7);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString7);
        boolean boolean12 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
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
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExcluded(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnyString(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString4);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOrString(rEString3, rEString4);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString4);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAnyString(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString9);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNothing(rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeGroup(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAnyString(rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeExcluded(rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeNothing(rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString12, rEString17);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeOrString(rEString4, rEString18);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeAnyString(rEString20);
        st1920.automaton.REString rEString22 = st1920.automaton.MatcherWrapper.makeExcluded(rEString21);
        st1920.automaton.REString rEString23 = st1920.automaton.MatcherWrapper.makeNothing(rEString22);
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeNothing(rEString23);
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeAnyString(rEString25);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeExcluded(rEString26);
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeNothing(rEString27);
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeGroup(rEString28);
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeOrString(rEString24, rEString29);
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeAnyString(rEString29);
        st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString31);
        st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString31);
        st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeOrString(rEString19, rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
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
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString34);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeCharClass(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAnyChar(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExcluded(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnyString(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString4);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOrString(rEString3, rEString4);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAnyString(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnyString(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeExcluded(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNothing(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeCharClass(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
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
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOrString(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnyString(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeExcluded(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNothing(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeCharClass(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString1, rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.MatchString matchString1 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnyString(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeExcluded(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNothing(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNothing(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNothing(rEString6);
        boolean boolean8 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAnyString(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeExcluded(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNothing(rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeCharClass(rEString12);
        boolean boolean14 = st1920.automaton.MatcherWrapper.matches(matchString1, rEString13);
        st1920.automaton.MatchString matchString15 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeAnyString(rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeExcluded(rEString17);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeNothing(rEString18);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeNothing(rEString19);
        st1920.automaton.REString rEString21 = st1920.automaton.MatcherWrapper.makeNothing(rEString20);
        boolean boolean22 = st1920.automaton.MatcherWrapper.matches(matchString15, rEString20);
        st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString1, matchString15);
        st1920.automaton.MatchString matchString24 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString0, matchString23);
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeAnyString(rEString25);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeAnyString(rEString27);
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeExcluded(rEString28);
        st1920.automaton.REString rEString30 = st1920.automaton.MatcherWrapper.makeNothing(rEString29);
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeGroup(rEString30);
        st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeAndString(rEString25, rEString31);
        boolean boolean33 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString31);
        st1920.automaton.MatchString matchString34 = st1920.automaton.MatcherWrapper.makeSpecialCharacter();
        st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString36 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString37 = st1920.automaton.MatcherWrapper.makeOrString(rEString35, rEString36);
        st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeAnyString(rEString36);
        st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeAnyString(rEString39);
        st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeExcluded(rEString40);
        st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeNothing(rEString41);
        st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeGroup(rEString42);
        st1920.automaton.REString rEString44 = st1920.automaton.MatcherWrapper.makeAndString(rEString36, rEString42);
        boolean boolean45 = st1920.automaton.MatcherWrapper.matches(matchString34, rEString42);
        st1920.automaton.MatchString matchString46 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString0, matchString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString15);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString25);
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
        org.junit.Assert.assertNotNull(rEString31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString37);
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
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString46);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString3);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnyString(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnyString(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOrString(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString0);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExcluded(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNothing(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNothing(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNothing(rEString5);
        boolean boolean7 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnyString(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeExcluded(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNothing(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeCharClass(rEString11);
        boolean boolean13 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeNothing(rEString12);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString16);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeCharClass(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAnyChar(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeGroup(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExcluded(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNothing(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNothing(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNothing(rEString5);
        boolean boolean7 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString5);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAnyString(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeExcluded(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNothing(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeCharClass(rEString11);
        boolean boolean13 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString12);
        st1920.automaton.MatchString matchString14 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeAnyString(rEString15);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeExcluded(rEString16);
        st1920.automaton.REString rEString18 = st1920.automaton.MatcherWrapper.makeNothing(rEString17);
        st1920.automaton.REString rEString19 = st1920.automaton.MatcherWrapper.makeNothing(rEString18);
        st1920.automaton.REString rEString20 = st1920.automaton.MatcherWrapper.makeNothing(rEString19);
        boolean boolean21 = st1920.automaton.MatcherWrapper.matches(matchString14, rEString19);
        st1920.automaton.MatchString matchString22 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString0, matchString14);
        st1920.automaton.MatchString matchString23 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString24 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString25 = st1920.automaton.MatcherWrapper.makeAnyString(rEString24);
        st1920.automaton.REString rEString26 = st1920.automaton.MatcherWrapper.makeExcluded(rEString25);
        st1920.automaton.REString rEString27 = st1920.automaton.MatcherWrapper.makeNothing(rEString26);
        st1920.automaton.REString rEString28 = st1920.automaton.MatcherWrapper.makeNothing(rEString27);
        st1920.automaton.REString rEString29 = st1920.automaton.MatcherWrapper.makeNothing(rEString28);
        boolean boolean30 = st1920.automaton.MatcherWrapper.matches(matchString23, rEString28);
        st1920.automaton.REString rEString31 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString32 = st1920.automaton.MatcherWrapper.makeAnyString(rEString31);
        st1920.automaton.REString rEString33 = st1920.automaton.MatcherWrapper.makeExcluded(rEString32);
        st1920.automaton.REString rEString34 = st1920.automaton.MatcherWrapper.makeNothing(rEString33);
        st1920.automaton.REString rEString35 = st1920.automaton.MatcherWrapper.makeCharClass(rEString34);
        boolean boolean36 = st1920.automaton.MatcherWrapper.matches(matchString23, rEString35);
        st1920.automaton.MatchString matchString37 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString38 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString39 = st1920.automaton.MatcherWrapper.makeAnyString(rEString38);
        st1920.automaton.REString rEString40 = st1920.automaton.MatcherWrapper.makeExcluded(rEString39);
        st1920.automaton.REString rEString41 = st1920.automaton.MatcherWrapper.makeNothing(rEString40);
        st1920.automaton.REString rEString42 = st1920.automaton.MatcherWrapper.makeNothing(rEString41);
        st1920.automaton.REString rEString43 = st1920.automaton.MatcherWrapper.makeNothing(rEString42);
        boolean boolean44 = st1920.automaton.MatcherWrapper.matches(matchString37, rEString42);
        st1920.automaton.REString rEString45 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString46 = st1920.automaton.MatcherWrapper.makeAnyString(rEString45);
        st1920.automaton.REString rEString47 = st1920.automaton.MatcherWrapper.makeExcluded(rEString46);
        st1920.automaton.REString rEString48 = st1920.automaton.MatcherWrapper.makeNothing(rEString47);
        st1920.automaton.REString rEString49 = st1920.automaton.MatcherWrapper.makeCharClass(rEString48);
        boolean boolean50 = st1920.automaton.MatcherWrapper.matches(matchString37, rEString49);
        st1920.automaton.MatchString matchString51 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString52 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString53 = st1920.automaton.MatcherWrapper.makeAnyString(rEString52);
        st1920.automaton.REString rEString54 = st1920.automaton.MatcherWrapper.makeExcluded(rEString53);
        st1920.automaton.REString rEString55 = st1920.automaton.MatcherWrapper.makeNothing(rEString54);
        st1920.automaton.REString rEString56 = st1920.automaton.MatcherWrapper.makeNothing(rEString55);
        st1920.automaton.REString rEString57 = st1920.automaton.MatcherWrapper.makeNothing(rEString56);
        boolean boolean58 = st1920.automaton.MatcherWrapper.matches(matchString51, rEString56);
        st1920.automaton.MatchString matchString59 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString37, matchString51);
        st1920.automaton.MatchString matchString60 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString23, matchString37);
        st1920.automaton.MatchString matchString61 = st1920.automaton.MatcherWrapper.makeConcatenationMatchString(matchString0, matchString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
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
        org.junit.Assert.assertNotNull(matchString14);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString37);
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
        org.junit.Assert.assertNotNull(rEString43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString51);
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString61);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeCharClass(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeAnyString(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeExcluded(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeNothing(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNOccurences(rEString10);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeCharClass(rEString11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeCharClass(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAnyChar(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeExact(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeGroup(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnyString(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeExcluded(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        st1920.automaton.MatchString matchString0 = st1920.automaton.MatcherWrapper.makeNum();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAnyString(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeExcluded(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNothing(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeGroup(rEString4);
        boolean boolean6 = st1920.automaton.MatcherWrapper.matches(matchString0, rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(matchString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString0);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAnyString(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeExcluded(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNothing(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeGroup(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
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
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString1);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNothing(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeCharClass(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeOrString(rEString5, rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeNothing(rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString3, rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeExact(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
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
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOrString(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnyString(rEString1);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeAnyString(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeExcluded(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNothing(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeGroup(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAndString(rEString1, rEString7);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeGroup(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeExcluded(rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
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
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeCharClass(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAnyChar(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAnyString(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString9);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeGroup(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeOrString(rEString8, rEString12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString14);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeCharClass(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeGroup(rEString3);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeNOrMoreOccurences(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        st1920.automaton.REString rEString0 = null;
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeNumREString();
        // The following exception was thrown during execution in test generation
        try {
            st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString0, rEString1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeExcluded(rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeNothing(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeNothing(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNothing(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAnyString(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeExcluded(rEString7);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeNothing(rEString8);
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeCharClass(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeGroup(rEString9);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString11);
        st1920.automaton.REString rEString13 = st1920.automaton.MatcherWrapper.makeAnyChar(rEString12);
        st1920.automaton.REString rEString14 = st1920.automaton.MatcherWrapper.makeBetweenNandMOcc(rEString12);
        st1920.automaton.REString rEString15 = st1920.automaton.MatcherWrapper.makeExcluded(rEString14);
        st1920.automaton.REString rEString16 = st1920.automaton.MatcherWrapper.makeAndString(rEString4, rEString14);
        st1920.automaton.REString rEString17 = st1920.automaton.MatcherWrapper.makeNumBetween(rEString16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
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
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeNumREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeOrString(rEString0, rEString1);
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeAnyString(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeExcluded(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeNothing(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeCharClass(rEString6);
        st1920.automaton.REString rEString8 = st1920.automaton.MatcherWrapper.makeConcatenation(rEString1, rEString6);
        st1920.automaton.REString rEString9 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString10 = st1920.automaton.MatcherWrapper.makeAnyString(rEString9);
        st1920.automaton.REString rEString11 = st1920.automaton.MatcherWrapper.makeNotCharClass(rEString9);
        st1920.automaton.REString rEString12 = st1920.automaton.MatcherWrapper.makeOrString(rEString6, rEString9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
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
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        st1920.automaton.REString rEString0 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString1 = st1920.automaton.MatcherWrapper.makeAnyString(rEString0);
        st1920.automaton.REString rEString2 = st1920.automaton.MatcherWrapper.makeAlphaREString();
        st1920.automaton.REString rEString3 = st1920.automaton.MatcherWrapper.makeAnyString(rEString2);
        st1920.automaton.REString rEString4 = st1920.automaton.MatcherWrapper.makeExcluded(rEString3);
        st1920.automaton.REString rEString5 = st1920.automaton.MatcherWrapper.makeNothing(rEString4);
        st1920.automaton.REString rEString6 = st1920.automaton.MatcherWrapper.makeGroup(rEString5);
        st1920.automaton.REString rEString7 = st1920.automaton.MatcherWrapper.makeAndString(rEString0, rEString6);
        java.lang.Class<?> wildcardClass8 = rEString7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rEString7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

