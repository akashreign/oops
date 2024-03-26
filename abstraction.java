abstract class animal {
    abstract void walk();
    abstract void food();
    public void eat()
    {
        System.out.println("all animal are innocent");
    }
     void live()
    {
        System.out.println("all animal are live in land and water");
    }

}
class horse extends animal{
    public void walk()
    {
        System.out.println("walk on 4 legs");
    }

    public void food()
    {
        System.out.println("harbivorous");
    }
}

class hens extends animal{
    public void walk(){
        System.out.println("walk on two legs");
    }

    public void food()
    {
        System.out.println("both herbivorous and carnivorous");
    }


}

class fish extends animal {
    public void walk(){
        System.out.println("walk on no legs");
    }

    public void food()
    {
        System.out.println("both herbivorous and carnivorous");
    }
}


public class abstraction {
    public static void main(String[] args) {
        fish h=new fish();
        h.walk();
        h.eat();
        h.food();
        h.live();
    }
}
