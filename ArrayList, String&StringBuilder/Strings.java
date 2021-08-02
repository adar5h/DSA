import java.util.*;

public class Strings{

    public static void main(String[] args) {
        
        String s1 = "hello";
        String s2 = s1;
        String s3 = "hello";
        String s4 = new String("hello");

        // if(s1==s4){ //== compares the refernces, whereas function .equals() compares content
        //     System.out.println("yes");
        // }else{
        //     System.out.println("no");
        // }

        System.out.println(s1);
        s1 = s1 + " world"; // Concatenation
        System.out.println(s1);

        char ch = s1.charAt(4);
        System.out.println(ch);

        System.out.println(s1.substring(0,5));
        System.out.println(s1.length());

    }
}