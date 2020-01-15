import java.util.ArrayList;
//import java.util.HashMap; : for associative arry: https://www.w3schools.com/java/java_hashmap.asp

public class Array_List {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(0));
    }
}
