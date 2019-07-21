package regex;

import java.util.regex.Pattern;

public class RegEx5 {

    public static void main(String[] args) {
        
        System.out.println(Pattern.matches("[a-zA-Z1-9]{6}", "Mredul"));
        System.out.println(Pattern.matches("[a-zA-Z1-9]{6}", "mRE49j"));
        System.out.println(Pattern.matches("[a-zA-Z1-9]{7}", "mRE496"));
        System.out.println(Pattern.matches("[a-zA-Z1-9]{7}", "9RE4969"));
    }
    
}
