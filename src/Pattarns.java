public class Pattarns {

    public void starTriangle(int row){

        for(int i=0; i<row; i++){

            for(int j=0; j<i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }

    }

/*o/p
 *
 **
 ***
 ****
 *****
 */
//    ---------------------------------------------------

    public static void reverseStarTriangle(int row){

        for (int i=row; i>0; i--){
            for (int j=i; j>0;j--){
                System.out.print("*");
            }
            System.out.println();

        }


    }
/*o/p
 ****
 ***
 **
 *
 */

//    ---------------------------------------------------

    public static void starSquare(int row){


        for (int i=0; i<row; i++){
            for (int j=0; j<row; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

/*o/p
 ****
 ****
 ****
 ****
*/
//    ---------------------------------------------------

    public static void main(String[] args) {
        Pattarns pattarn = new Pattarns();
        pattarn.starTriangle(5);
        System.out.println("--------------");
        starSquare(4);
        System.out.println("--------------");
        reverseStarTriangle(4);

    }
}

