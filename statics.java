//static used for make it common for objects

class employeee{
    String name;
    static String company;

    static void info(){
        System.out.println("he is ritesh yadav");
    }
}

public class statics {
    public static void main(String[] args) {
        employeee.company="ABC";
        employeee.info();

        employeee emp=new employeee();
        emp.name="Ritesh";

        System.out.println(employeee.company);
        System.out.println(emp.name);
    }

}
