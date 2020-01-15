
class Employee{

    private String name = "Asit";

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}



public class Encapsulation {
    public static void main(String[] args){
        Employee obj = new Employee();
        //System.out.println(obj.name);  // error
        String name = obj.getName();
        System.out.println(name);
        obj.setName("Gopal");
        System.out.println(obj.getName());

    }

}




