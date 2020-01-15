public class Animal {

    void animalName(){
        System.out.println("Animal class");
    }

    public void animalSound() {
    }
}


class Dog extends Animal{

    void animalName(){
        System.out.println("Dog class");
    }
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.animalName();
    }

}