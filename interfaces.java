interface  pashu {
    public void walk();
}
interface herbivores{

}
class goat implements pashu,herbivores{
    public void walk()
    {
        System.out.println("walk on 4 legs");
    }
}

public class interfaces {
    public static void main(String[] args) {
        goat h=new goat();
        h.walk();

    }
}

