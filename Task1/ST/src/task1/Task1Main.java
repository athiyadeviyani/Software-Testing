package task1;

import st1920.automaton.RegExpMatcher;

public class Task1Main {

    public static void main(String[] args) {
        
//        String s1 = "foo@bar.com";
//        String re = "([a-zA-Z0-9])+\\@([a-zA-Z0-9])+\\.([a-z]){2,3}";
                
        // Bug 3 found (easy)
        // System.out.println(RegExpMatcher.matches(s1, re));
        
        // Bug 1 found (easy)
        // System.out.println(RegExpMatcher.matches("", ""));
        
        // Bug 2 found (easy)
        // System.out.println(RegExpMatcher.matches("tia", ""));
        
        // Bug 3 found (easy)
        // System.out.println(RegExpMatcher.matches("ab", "[a&b]"));
        
        // Bug 3 found (easy)
        // System.out.println(RegExpMatcher.matches("ab", "[a|b]"));
        
        // Bug 11 found (easy)
        // System.out.println(RegExpMatcher.matches("ab", "a?b"));

        // Bug 15 found (medium)
        // System.out.println(RegExpMatcher.matches("aabc", "a+bc"));
        // System.out.println(RegExpMatcher.matches("com", "([a-z]){2,3}"));
        
        // Bug 13 found (hard)
        // System.out.println(RegExpMatcher.matches("a", "()a"));
        
        // Bug 12 found (hard)
        // System.out.println(RegExpMatcher.matches("(a)", "((a))"));
        
        // Bug 4 found (easy)
        // System.out.println(RegExpMatcher.matches("a9", "(a)\\[0-9]"));
        
        // Bug 14 found (medium)
        // System.out.println(RegExpMatcher.matches("abcabc", "[abc][abc"));
        
        // Bug 8 found (medium)
        // System.out.println(RegExpMatcher.matches("aaaaaaa", "a**"));
        
        // Bug 10 found (hard)
        // System.out.println(RegExpMatcher.matches("a1342aaaa", "a+"));
        
        // Bug 9 found (medium)
        // System.out.println(RegExpMatcher.matches("100", "<-100>"));
        
        System.out.println(RegExpMatcher.matches("100", "<-100>"));
        

    }

}