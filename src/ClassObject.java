public class ClassObject {
    String name = "Gopal";
    String title = "Dasbairagya";
    int age  = 26;
    public static void main(String[] args){
        ClassObject obj = new ClassObject();
        System.out.println("Name: "+obj.name +" \nTitle: "+obj.title);
        System.out.println("Age: "+obj.age);


        System.out.println("*************************");

        getName("Hello");// Call the static method, static methods are called without creating object
        // getTitle(); This would compile an error
        ClassObject myObj = new ClassObject(); // Create an object of MyClass
        myObj.getTitle("World"); // Call the public method on the object

    }
    static void getName(String name){
        //Static methods can be called without creating objects
        System.out.println(name);
    }
    public void getTitle(String title){
        //Public methods must be called by creating objects
        System.out.println(title);

    }
}
