//it have two type 1.function overloading and function overriding
//its function overloading example which have same function call many times



class car{
    String name;
    int price;

    public void info(String name)
    {
        System.out.println(name);
    }

    public void info(int price)
    {
        System.out.println(price);
    }

    public void info(String name,int price)
    {
        System.out.println(name+ "" +price);
    }
}

public class polymorhism {
    public static void main(String[] args) {
        car c=new car();
        c.name="honda";
        c.price=10000;

        c.info(c.name);
      //  c.info(c.price);
       // c.info(c.name,c.price);
    }
}
