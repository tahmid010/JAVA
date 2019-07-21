package regex;

import java.util.regex.Pattern;

public class RegEx3 {

    public static void main(String[] args) {
        
        System.out.println(Pattern.matches("[ABC]?", "")); //x occers zero or once
        System.out.println(Pattern.matches("[ABC]+", "BACA")); //x occers one or more time
        System.out.println(Pattern.matches("[ABC]*", "")); //x occers zero or more time
        System.out.println(Pattern.matches("[ABC]{2}", "AC")); //x occers n time
        System.out.println(Pattern.matches("[ABC]{2,}", "ACBA")); //x occers n or more time
        System.out.println(Pattern.matches("[ABC]{2,3}", "ACA")); //x occers n to m time
    }
    
}
