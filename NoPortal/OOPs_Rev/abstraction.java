import java.util.*;

class abstraction{

    // Abstraction is a process of hiding the implementation details and showing only functionality to the user.

    
    public static void main(String[] args) {
        // Car c1 = new Car(); //We don't need any object of car. Thus this is not needed. And after using the abstract keyword before the class, it won't be allowed. 
        // c1.start();

        McLaren P1 = new McLaren();
        P1.start();

    }
}


class McLaren extends Car{

    @Override
    void start(){
        System.out.println("McLaren doesn't needs a key.");
    }
}

class Lambhorghini extends Car{

    @Override
    void start(){
        System.out.println("Lambhorghini me aagyi mujhe nini.");
    }

}

abstract class Car{  
    // Using abstract keyword, now there can't be any object of this class.
    // Although objects of it's children class can be initiated.
    
    int price;
    abstract void start(); // No need to define start().
    // void start(){
    //     System.out.println("Car is starting");
    // }
}