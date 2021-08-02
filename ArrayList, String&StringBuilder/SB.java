import java.util.*;

public class SB{

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("hello");

        System.out.println(sb);

        sb.append(" world"); //Concatenation

        System.out.println(sb);

        char ch = sb.charAt(7);

        System.out.println(ch);

        //mutability
        sb.setCharAt(5,'_');

        System.out.println(sb);

    }
}