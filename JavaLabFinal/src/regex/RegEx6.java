package regex;

import java.util.regex.Pattern;

public class RegEx6 {

    public static void main(String[] args) {
        
        Pattern p = Pattern.compile("[0][1][56789][0-9]{8}");
        System.out.println(p.matcher("01790375697").matches());
        System.out.println(p.matcher("01521548301").matches());
        System.out.println(p.matcher("12321548301").matches());
        System.out.println(p.matcher("01748301").matches());
    }
    
}
