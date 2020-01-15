//interface is completely abstract class
interface Flower{
    public void flowerName();
    public void flowerColor();
}

interface  Tree{
    public void treeName();
}


class Rose implements Flower{
    public void flowerName(){
        System.out.println("Rose");

    }
    public void flowerColor(){
        System.out.println("Pink");

    }

}


//multiple inheritance
class MangoTree implements Tree, Flower{
    //all the abstract method must be define here.
    public void flowerName(){
        System.out.println("Mango Flower");
    }
    public void flowerColor(){
        System.out.println("Green");

    }
    public void treeName(){
        System.out.println("mango Tree");
    }

}


public class Interface {
    public static void main(String[] args){
        Rose obj = new Rose();
        obj.flowerName();
        obj.flowerColor();
        System.out.println("***********");
        MangoTree mobj = new MangoTree();
        mobj.treeName();
        mobj.flowerName();
        mobj.flowerColor();

    }
}

