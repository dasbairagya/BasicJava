import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = obj.nextLine();
        System.out.println("your name: "+ name);

        MyClass mycls = new MyClass();
        mycls.input();
    }
}

class MyClass {
    public void input() {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        // String input
        String name = myObj.nextLine();

        // Numerical input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();
        try {
            // Output input by user
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
        }
        catch(Exception e){
            System.out.println("Enter the correct value.");
        }
    }
}


/*
Method	                Description
nextBoolean()	Reads a boolean value from the user
nextByte()	    Reads a byte value from the user
nextDouble()	Reads a double value from the user
nextFloat()	    Reads a float value from the user
nextInt()	    Reads a int value from the user
nextLine()	    Reads a String value from the user
nextLong()	    Reads a long value from the user
nextShort()	    Reads a short value from the user
*/


//todo: use try catch