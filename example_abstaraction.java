abstract class example_abstaraction {

      abstract void read();
      abstract void write(int salary);

}
class business extends example_abstaraction{

    void read()
    {
        System.out.println("business_name");
    }
    void write(int salary)
    {
        System.out.println(salary);
    }

}
class technical extends example_abstaraction{

    void read()
    {
        System.out.println("technical_name");

    }

    void write(int salary)
    {
        System.out.println(salary);
    }


}
class main_abstract
{

    public static void main(String[] args)
    {

        business b=new business();
        b.read();
        b.write(30000);

        technical t=new technical();
        t.read();
        t.write(80000);
    }

}



