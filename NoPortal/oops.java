import java.util.*;

public class oops{

    public static void main(String[] Args){

        Person p1 = new Person(); // Default Constructor 
        p1.name = "Babloo";
        p1.age = 12;
        // System.out.println(p1.name+" is my name & "+p1.age+" is my age");
        
        Person p2 = new Person(); // Default Contructor Person() constructs and returns a new object. 
        // Default contructor doesn't takes any arguments.
        p2.name = "Radha";
        p2.age = 15;

        p2.eat();
        p1.walk();        // An example of Polymorphism(Compile time polymorphism -> 
        p1.walk(200);     //Because it's checking and the decision whether which of the method will get called for after the function call, is happening at the compile time.) 
    }
    

    
}

class Person{     // Every class has two attributes => Property & Methods
    
    public Person(){ // Proof that default constructor is being called.
        System.out.println("creating an object");
    }

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