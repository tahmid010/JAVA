package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx7 {

    public static void main(String[] args) {
        
        String pattern = "[\\w\\d.%_-]+@[\\w\\d._-]+\\.[\\w]{2,4}";
        String str = "My name is Mredul Jaman. My email id is konikkhan00@gmail.com.";
        
        email(pattern, str);
    }
    
    static void email(String pattern, String str) {
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        
        while(m.find()) {
            if(m.group().length() != 0) {
                System.out.println(m.group());
            }
            System.out.println("Starting index: " + m.start());
            System.out.println("Ending index: " + m.end());
        }
    }
}
