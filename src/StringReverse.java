import java.util.Scanner;

public class StringReverse {
    String reverseOfReverse = "";
    public static void main(String[] args) {
        String reverse ="";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word to reverse: ");
        String str = scan.nextLine();

        for(int i = str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Revarsed string is: ");
        System.out.println(reverse);

        StringReverse sr = new StringReverse();
        sr.StringBuilder(reverse);

    }
    public void StringBuilder(String str){ //can't be static method as reverseOfReverse is called dynamically
        StringBuilder sb = new StringBuilder(str);
        this.reverseOfReverse = sb.reverse().toString();
        System.out.println(this.reverseOfReverse);

    }
}
