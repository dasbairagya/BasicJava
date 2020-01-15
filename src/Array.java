import java.util.Arrays;
public class Array {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,10,6};

        System.out.println(Arrays.toString(numbers));
        //for loop
        for(int i=0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("********************************");
        //foreach loop
        for(int number: numbers){
            System.out.println(number);

        }
        System.out.println("********************************");
        getArrayValue();
        System.out.println("********************************");
        loopThroughMultidimentionArray();

    }


//multi dimentional array of intiger
    static void getArrayValue() {
        int[][] multinums = {{1, 2, 3}, {4, 5, 6}};
//        multinums[0][1] specify two indexes: one for the array, and one for the element inside that array.
        try {
            System.out.println(multinums[0][1]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }


//multi dimentional array of strings
    private static void loopThroughMultidimentionArray(){
        String[][] arrs = {{"Man","Car","Birds"},{"Gopal","Habib","Sudipta"},{"BMW","LAMBERGINI","FARARI"},{"Parrot","Crow","Owl"}};
        for(int i = 0; i<arrs.length; i++){
            for (int j = 0; j<arrs[i].length; j++){
                System.out.println(arrs[i][j]);
            }
            System.out.println("*********");
        }
    }


}
