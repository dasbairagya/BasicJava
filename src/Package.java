import java.util.Scanner;//this package is used to get user input,

public class Package {
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = myobj.nextLine();//nextLine() method, which is used to read a complete line
        System.out.println("User name :"+ name);
    }
}
