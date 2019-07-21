package regex;

import java.util.regex.Pattern;

public class RegEx4 {

    public static void main(String[] args) {
        
        System.out.println(Pattern.matches("\\d", "1"));
        System.out.println(Pattern.matches("\\d", "13"));
    }
    
}
