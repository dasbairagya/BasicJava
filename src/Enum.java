//An enum is a special "class" that represents a group of constants
//Note that they should be in uppercase letters:
enum Level{
    LOW,MEDIUM,HIGH
}

//enum inside a class
public class Enum {

    enum Level{
        LOW,MEDIUM,HIGH
    }
    public static void main(String[] args){
        Level myconst = Level.HIGH;
        //System.out.println(myconst); o/p: HIGH
        switch(myconst) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }


}


