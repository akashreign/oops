class pen{
    String color;
    String type;
    public void display(){
        System.out.println(this.color);
        System.out.println(this.type);
        System.out.println("use for writing");
    }


}

class student {
    String name;
    int age;
    public void showinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


public class classs {
    public static void main(String[] args) {
        pen obj=new pen();
        obj.color="red";
        obj.type="gel";

        obj.display();

        pen obj2=new pen();
        obj2.color="green";
        obj2.type="ballpount";
        obj2.display();

        student ob=new student();
        ob.name="ritesh";
        ob.age=24;
        ob.showinfo();
    }
}
