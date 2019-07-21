package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {

    public static void main(String[] args) {
        
        Pattern p = Pattern.compile(".d");
        Matcher m = p.matcher("Md");
        boolean b = m.matches();
        System.out.println(b);
        
        m = p.matcher("Tahmid Rahman");
        b = m.matches();
        System.out.println(b);
        
        p = Pattern.compile("..h.i.");
        m = p.matcher("Tahmid");
        b = m.matches();
        System.out.println(b);
        
        b = Pattern.compile("K....").matcher("monik").matches();
        System.out.println(b);
        
        b = Pattern.matches("..h...", "Rahman");
        System.out.println(b);
    }
    
}
