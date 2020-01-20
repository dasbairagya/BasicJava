import java.util.Scanner;
//if the reverse of a given no is equal to itseslf then it is called a palindrome no.
public class Palindrome {
    public static void main(String[] args) {
        int n,r,s=0;
        n = getNumber();
        int t=n;
        while (n>0) {
            r = n % 10;
            n = n / 10;
            s = s * 10 + r;
            System.out.println("r: "+r+", n: "+n+", s: "+s);
        }
        if(s==t){
            System.out.println("The number is plaindrome!");
        }
        else{
            System.out.println("The number is not a palindrome.");
        }

    }
    static int getNumber(){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = number.nextInt();
        return num;

    }
}
