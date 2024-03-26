class study {
    String name;
    int age;
    public void showinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // create a constructor (non parametrise)
    study()
    {
        System.out.println("non parametrise constuctor");
    }

}

public class constructor {
    public static void main(String[] args) {
        study obj=new study();

    }
}
