import java.util.Scanner;

public class Int2String {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scan.nextInt();
        String Num = Integer.toString(num);
        System.out.println(Num);
    }

}
