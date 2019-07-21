package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[^A-Za-z0-9]).{6,10}$");
        Matcher m = p.matcher("mj98HH&");
        System.out.println(m.matches());
    }
    
}
