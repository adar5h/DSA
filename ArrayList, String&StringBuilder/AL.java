import java.util.*;

public class AL{

    public static void main(String[] args) {
        
        ArrayList<Integer>list = new ArrayList<>();

        //To add values
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(45);

        //System.out.println(list.size());

        System.out.println(list);

        //to get a value
        System.out.println(list.get(2));

        //to set a value
        System.out.println(list.set(3,36));
        System.out.println(list);

        //to remove a value
        System.out.println(list.remove(2));

        System.out.println(list);
    }
}