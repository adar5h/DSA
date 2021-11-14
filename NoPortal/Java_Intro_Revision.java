import java.util.*;

public class Java_Intro_Revision{ //Same as the name of the file

    public static void main(String[] Args){
       
        // Datatypes => int, float, char, String, long, double, boolean
        // int 1marks = 20; // Can't start a variable name from a Number.
        // int $marks = 20; // Variable name can start from alphanumeric chrs, $ and _.
        // float eMarks = 20.005f; // If 'f' won't be there, it would be considered as a double value. // Less accuracy, Takes less space(4 bytes) as comparerd to double
        // double exactMarks = 20.5; // More accurate, takes (8 bytes) of spaces
        // char ch = 'A';
        // String str = "Heya!";
        // boolean isValid = true; 

        // long bigNumber = 9876532265498l; // 'l' is neccesary in case of long, otherwise it will be considered an int.

        // System.out.println(bigNumber);

        // Assignment Operator => [ +, -, /, *, %, ++, -- ]
		
//		int firstNumber = 1234;
//		int secondNumber = 234;
//		
//		double sum = (double)firstNumber % (double)secondNumber; //TypeCasting
//		System.out.println(sum);
		
//		int a = 12;
		// a++; // this statement increments by 1
//		a = a + 1;
//		System.out.println(++a);
//		System.out.println(a);
//		a--;
//		System.out.println(a);
		// assignment =
		
		//Taking user input
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your name: ");
//		String name = sc.nextLine();
//		
//		System.out.println(name);
		
//		int age = 12;
		
		// Conditional Operators => [ >, <, >=, <=, ==, != ]
		
//		if ( age > 18 ) {
//			System.out.println("you can vote");
//		} else {
//			System.out.println("you can not vote");
//		}

    // char grade = 'A';

    // switch(grade){
    //     case 'A': 
    //             System.out.println("You have scored Grade: " + grade);
    //             break; //Break is neccesary, other after the defined case, the other cases below it will also get executed.
    //     case 'B': 
    //             System.out.println("You have scored Grade: " + grade);
    //             break;
    //     case 'C': 
    //             System.out.println("You have scored Grade: " + grade);
    //             break;
    //     default: 
    //             System.out.println("Default Case");
    //             // break; No need of break statement in default.
    // }

    // Logical Operators

        // &&, ||, !

        // int age = 12;
        //		if ( (age > 18) ) {
        //			System.out.println("you can vote");
        //		} else {
        //			System.out.println("you can not vote");
        //		}
                
                
        //		boolean isEqual = 18 == 18;
        //		System.out.println(19 != 18);
        

        // Loops => for, while, do-while
		
		// for(;;) => Infinite Loop but a valid one.
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println("Hello" + i);
//		}

// While Loop
//		int a = 23;
//		while(a <= 100) {
//			a++;
//			if ( a == 65 ) continue;
//			System.out.println(a);
//		}

// do-while
//		int a = 23;
//		do {
//			System.out.println(a);
//			a++;
//		} while(a > 100);
		
// int i = 23;
//         while(i<=100){
//             if(i==65) continue; // If there's only one line of code after a if,else,for you could skip the curly braces. & Continue skips the iteration.
//             System.out.println(i);
//             i++;
//         } // In this loop, the loop will get stuck at 64 but the program won't terminate

//         while(i<=100){
//             i++;
//             if(i==65) continue; // If there's only one line of code after a if,else,for you could skip the curly braces. & Continue skips the iteration.
//             System.out.println(i);
//         } // Would simply skip 65


        // DS -> Arrays
		// 23, 12, 56, 34, 99
		
//		int marks[] = new int[5];
//		marks[0] = 23;
//		marks[1] = 12;
//		marks[2] = 56;
//		marks[3] = 34;
//		marks[4] = 99;
		
//		int marks[] = {23, 12, 56, 34, 99, 12, 34};
//		
//		for(int i = 0; i<=marks.length; i++) {
//			System.out.println(marks[i]);
//		}
		
		// int arr[][] = new int[2][3];
		// int arr[][] = {
		// 		{
		// 			1, 2
		// 		}, {
		// 			3, 4
		// 		}
		// 	};
		// System.out.println(arr[0][2]);
		
//		System.out.println(average(3, 6)); //Function call
//		System.out.println(average(4, 6));
		
		
		String a = "hi";
		String b = "hi";
		
		String state = "  New Delhi  ";
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		System.out.println(1 + (int)(6*Math.random()));
        System.out.println(Math.random()); // Would randomly give an output b/w 0 & 1.
		
	// }
	
	
	// Methods
	
	// Syntax -> returnType functionName (arguments) {}
	
//	static int average(int firstNumber, int secondNumber) { //Static keyword -> states that to use this method you don't need to create an object of this class.
//		int sum = firstNumber + secondNumber;
//		return sum / 3;
//	}


// EXCEPTION HANDLING (TRY AND CATCH)    

		// int a[] = new int[3];
            
        //     try {
    	// 		System.out.println(2/0);
        //     }
    	// 	//  catch(ArrayIndexOutOfBoundsException e) {
    	// 	// 	System.out.println("There's an error!");
    	// 	// 	System.out.println(e.getLocalizedMessage());
    	// 	// } catch(ArithmeticException e) {
    	// 	// 	System.out.println("Arithmetic Error");
    	// 	// }
        //      catch(Exception e){ //Smart way -> Would catch all kinds of exception in it
        //         System.out.println("Exception has been handled");
        //         System.out.println(e.getLocalizedMessage()); //To display the exception
        //     }

        // System.out.println("Line after the error!");

    }


    
}