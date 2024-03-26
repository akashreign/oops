abstract class absraction_bank {

      String name;
      void read(String name) {
          System.out.println("enter your name :"+name);

      }
      abstract void write(String salary);

}
class admin extends absraction_bank {

    void write(String salary)
    {
        System.out.println(salary);
    }


}
class marketing extends absraction_bank{

    void write(String salary)
    {
        System.out.println(salary);
    }

}

class test{
    public static void main(String[] args) {

        admin a=new admin();

        a.read("akash");
        a.write("ritesh");

        marketing m=new marketing();
        m.read("rauky");
        m.write("vikash");

    }
}



