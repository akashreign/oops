interface absraction_interface {


     void read(String name);
     void write(String salary);

}
class admin_block implements absraction_interface {

    public  void write(String name)
    {

        System.out.println(name);
    }
    public void read(String salary)
    {
        System.out.println(salary);

    }



}
class marketteam implements absraction_interface{

    public void write(String name)
    {
        System.out.println(name);
    }

   public  void read(String salary)
    {
        System.out.println(salary);

    }

}

class testing {
    public static void main(String[] args) {

        admin_block a=new admin_block();
        a.read("ritesh");
        a.write("50000");

    }
}




