public class TypeCasting {
    public static void main(String[] args){
        //widening cating means value might be increasing : int to double
        int num = 9;
        double dnum = num;
        System.out.println(dnum);
        // Explicit casting: double to int
        int num1 = (int)dnum;
        System.out.println(num1);

    }
}
