import java.util.Scanner;

public class Armstrong {

    private int sum =0;
    private int r;
    private int temp;

    public static void main(String[] args) {
        int n;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no: ");
        n = scan.nextInt();
        Armstrong obj = new Armstrong();
        obj.CheckArmstrong(n);
    }
    private void CheckArmstrong(int num){
        this.temp = num;
        try{
            while(num>0) {
                this.r = num % 10;//3,5,1
                num = num / 10;//15,1,0
                this.sum = this.sum + (r * r * r);//0+3*3*3, +5*5*5, +1*1*1
            }
            if(this.sum == this.temp) {
                System.out.println("Armstrong number!");
            }
            else {
                System.out.println("Not Armstrong number.");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
