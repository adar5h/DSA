import java.util.*;

public class oops{

    public static void main(String[] Args){

        // Person p1 = new Person(); // Default Constructor 
        // p1.name = "Babloo";
        // p1.age = 12;
        // System.out.println(p1.name+" is my name & "+p1.age+" is my age");
        
        // Person p2 = new Person(); // Default Contructor Person() constructs and returns a new object. 
        // // Default contructor doesn't takes any arguments.
        // p2.name = "Radha";
        // p2.age = 15;

        Person p3 = new Person(34, "John Doe");
        // p3.name = "John Doe"; No need to write these now, as we are using the overloaded constructor here.
        // p3.age = 34;

        // p2.eat();
        // p1.walk();        // An example of Polymorphism ( Compile time polymorphism -> 
        // p1.walk(200);     //Because it's checking and the decision whether which of the method will get called for after the function call, is happening at the compile time.) 
        // System.out.println((Person.count)); // Accessing static variable 'count' directly from the class 'Person' without creating an object of the class.
    
        // Developer d1 = new Developer(25,"Jane");
        // d1.walk();

        eIntro obj = new eIntro();
        obj.doWork(); // Accesing eIntro.java's eIntro.class from oops.java // Accessible because of the access modifier public in eIntro.java 
        
        /* Access Modifiers -> public -> Accesbile to any class.
            private -> The value is only visible to the class it is declared in. 
            protected -> only visible to the class it is declared and it's children class. Children could be in any other package too.
            default -> Access only inside the package.
        */  
    
    }
    

    
}

class Developer extends Person{ // Children Class of parent class "Person".
    // IN JAVA, OBJECT CLASS IS THE PARENT OF ALL CLASSES AND OBJECTS.
    public Developer(int age, String name){
        super(age,name); // Super keyword calls the constructor of it's parents class.
    }

    public void walk(){ //Methods  // Run time Polymorphism
        System.out.println("Developer " + name + " goes for a walk daily.");
    }


}

class Person{     // Every class has two attributes => Property & Methods
    
    String name;  //Property
    int age;      //Property

    static int count; // Static keyword in variables signifies that now it is a property of a class now, not the object. i.e. variable count can be accessed from the class without creating an object.

    // public Person(){ // Proof that default constructor is being called.
    //     count++;
    //     System.out.println("creating an object");
    // }

    // public Person(int newAge, String newName){ // Constructor Overloading
    //     this(); // this keyword -> The this keyword can be used to refer current class instance variable. Here it will call the Person() i.e. default constructor first and then the lines below it will be executed.
    //     name = newName;
    //     age = newAge;
    // }

    public Person(int age, String name){ 
        // this(); 
        this.name = name; // Another use of this keyword. It is being used to access the other variables of this class.
        this.age = age; 
    }


    public void walk(){ //Methods
        System.out.println(name + " goes for a walk daily.");
    }

    public void eat(){ //Methods
        System.out.println(age + " dishes were served.");
    }

    public void walk(int steps){ //Methods
        System.out.println(name + " walks " + steps + " steps.");
    }

    public void doWork(){
        System.out.println("Person is working.");
    }
}