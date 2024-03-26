public class constru_pract {
       String name="akash";
       int age;
       constru_pract(String naam,int umar)      // parametrize constructor
       {
          name=naam;
          age=umar;
          System.out.println(name+" "+age);

      }


}
class r{
    public static void main(String[] args) {
        constru_pract cc=new constru_pract("vikash",21);

    }
}

