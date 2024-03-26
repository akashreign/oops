public class oerriding {
    void meth1()
    {
        System.out.println("this is method 1 of class 1 ");
    }

    void meth2()
    {
        System.out.println("this is method 2 of class 1");
    }


}
class two extends oerriding {
    void meth2()    // method overriding from class oerriding
    {
        System.out.println("this is method 2 of class 2");
    }

}

class n{
    public static void main(String[] args) {
        oerriding o=new oerriding();
        o.meth1();
        o.meth2();
        two t=new two();
        t.meth2();
    }
}

