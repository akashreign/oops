

class stud
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
    stud(String fname, String lname)
    {
        this.fname=fname;
        this.lname=lname;
        System.out.println(fname);
        System.out.println(lname);
    }


}

public class constructor2 {
    public static void main(String[] args)
    {
        stud ob=new stud("akash","Yadav");

    }
}
