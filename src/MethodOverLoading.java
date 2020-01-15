public class MethodOverLoading {

    static int addNumbers(int x, int y){
        return x+y;
    }
    static double addNumbers(double x, double y){
        return x+y;
    }

    public static void main(String [] args){
        int num1 = addNumbers(1,2);
        double num2 = addNumbers(1.5,2.5);
        System.out.println("int: "+ num1);
        System.out.println("double: "+ num2);

    }
}
