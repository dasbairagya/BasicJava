abstract class Abstract {
    String name = "Gopal";
    String title = "Dasbairagya";
    int age = 25;
    public abstract void persion();

}


class Persion extends Abstract{
    public void persion(){
        System.out.println("Persion is the child of Abstract class");
    }

}

class Main{
    public static void main(String [] args){
        Persion obj = new Persion();
        obj.persion();
        System.out.println("Name: "+ obj.name+" "+obj.title);
        System.out.println("Age: "+ obj.age);

    }
}