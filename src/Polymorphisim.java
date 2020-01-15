class Creatures {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pigs extends Creatures {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Cows extends Creatures {
    public void animalSound() {
        System.out.println("The dog says: Hamba Hamba");
    }
}


public class Polymorphisim {
    public static void main(String[] args) {
        Creatures myAnimal = new Creatures();  // Create a Animal object
        Creatures myPig = new Pigs();  // Create a Pig object
        Pigs mypig1 = new Pigs();
        Creatures myDog = new Cows();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        mypig1.animalSound();
        myDog.animalSound();
    }
}
