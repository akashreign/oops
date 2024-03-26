
//  method overloading
public class polymer {
    void name(String name1,String name2)
    {
        System.out.println(name1);
        System.out.println(name2);
    }

    void naam(int name1,int name2)
    {
        System.out.println(name1);
        System.out.println(name2);
    }

    void nmva(String name1,String name2,String name3)
    {
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }

}
class cfg{
    public static void main(String[] args) {
        polymer p=new polymer();
        p.name("akash","ritesh");
        p.naam(1,2);
        p.nmva("akash","ritesh","raucky");
    }
}

