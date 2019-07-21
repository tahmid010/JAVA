package regex;

import java.util.regex.Pattern;

public class regex2 {

    public static void main(String[] args) {
        
        System.out.println(Pattern.matches("[abc]", "abc"));
        System.out.println(Pattern.matches("[mjk]", "m"));
        System.out.println(Pattern.matches("[^mjk]", "l"));
        System.out.println(Pattern.matches("[a-zA-Z]", "l"));
    }
    
}
