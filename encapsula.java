public class encapsula {
    private String name;   // data hiding using private
    public void setname(String namer)
    {
        name=namer;
    }
    public String getname()
    {
        return name;

    }

}
class main{
    public static void main(String[] args) {
        encapsula e=new encapsula();
        e.setname("akash");
        System.out.println( e.getname());

    }
}
