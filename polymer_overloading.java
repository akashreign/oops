public class polymer_overloading {
    void method1()
    {
        System.out.println("ritesh");
    }
    void method1(int n)
    {
        System.out.println("ritesh"+n);
    }
    void method1(int n,String a)
    {
        System.out.println(a+" and rank is "+n);
    }




}
class m{
    public static void main(String[] args) {
        polymer_overloading po=new polymer_overloading();
        po.method1();
        po.method1(2);
        po.method1(5,"akash");
    }

}
