import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrs = new ArrayList<String>();
        arrs.add("Gopal");
        arrs.add("Kartick");
        System.out.println(arrs);

        for(String arr: arrs){
            System.out.println(arr);
        }
    }
}

