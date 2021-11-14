import java.util.*;

public class oops{

    public static void main(String[] Args){
        Person p1 = new Person();
        p1.name = "Babloo";
        p1.age = 12;
        // System.out.println(p1.name+" is my name & "+p1.age+" is my age");

        Person p2 = new Person();
        p2.name = "Radha";
        p2.age = 15;

        p1.walk();
        p2.eat();
        p1.walk(200);
    }


    
}

class Person{     // Every class has two attributes => Property & Methods
    String name;  //Property
    int age;      //Property

    public void walk(){ //Methods
        System.out.println(name + " goes for a walk daily.");
    }

    public void eat(){ //Methods
        System.out.println(age + " dishes were served.");
    }

    public void walk(int steps){ //Methods
        System.out.println(name + " walks " + steps + " steps.");
    }
}