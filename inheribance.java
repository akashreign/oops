public class inheribance {
    String name="ritesh";
    int age=23;
    void response(){
        System.out.println(name);
        System.out.println(age);
    }

}
class first extends inheribance{
    String a="akash";
    void name(){
        System.out.println(name);
        System.out.println(age);
    }
}
class second extends first{
    void cond(){
        System.out.println(a);
    }

}
class man{
    public static void main(String[] args) {
        first f=new first();
        second s=new second();
        f.name();
        s.cond();

    }
}



