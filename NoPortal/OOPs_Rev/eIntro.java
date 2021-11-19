// A package extension to understand the concept of Encapsulation with oops.java
import java.util.*;

public class eIntro{

    public static void main(String[] args) {
        
        Laptop l1 = new Laptop();
        l1.setPrice(34);

        System.out.println(l1.getPrice());

    }
    // private void doWork(){
    //     System.out.println("Person is working - eIntro.java");
    // }

}
    class Laptop{

            int ram;
            private int price;

            public void setPrice(int price) {
                // is the user an Admin
                boolean isAdmin = true;
                if(!isAdmin){
                    System.out.println("You don't have the access");
                }else{
                        this.price = price;
                }
            }

            // GETTER & SETTERS
            public int getRam(){
                return ram;
            }

            public void setRam(int ram){
                this.ram = ram;
            }

            public int getPrice(){
                return price;
            }

    }