class akash
{
    String name;
    String fname;
    String lname;
    int age;

    public void showinfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.fname);
        System.out.println(this.lname);

    }

    // create a constructor (parametrise)
    akash(akash a2)
    {
        this.fname=a2.fname;
        this.lname=a2.lname;
       // System.out.println(fname);
      //  System.out.println(lname);
    }
    akash()
    {

    }

}

public class copyconstructor {
    public static void main(String[] args)
    {
        akash ob=new akash();
        ob.fname="Akash";
        ob.lname="Yadav";

        akash a2=new akash(ob);
        a2.showinfo();

    }
}
