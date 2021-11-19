import java.util.*;

class interfaces implements Car, Person{
    
    public static void main(String[] args) {
    
        Transformer t1 = new Transformer();    
        
    }


    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void walk() {
        System.out.println("Person is walking.");
    }
}

interface Car{

    void start();

    // void start(){ // By default methods are public & abstract in interface.
    //     System.out.println("Car is starting");
    // }
}

interface Person{

    void walk();

}

// No Multiple Inheritance in Java