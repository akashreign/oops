public class polymer_overriding {
    void method(){
        System.out.println("ak of method");
    }
    void method1(){
        System.out.println("vk of method 1");
    }

}
class sec extends polymer_overriding
{
    void method1()
    {
        System.out.println("vk of method 1");
    }


}
class s{
    public static void main(String[] args) {
        polymer_overriding po=new polymer_overriding();
        po.method();
        po.method1();

        sec s=new sec();
        s.method1();
    }
}

