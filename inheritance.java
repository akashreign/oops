//in this inheritance other classes inherit the properties(String shape) of base class

class shape{
    String shape;
}

class rectangle extends shape
{
    public void show(){
        System.out.println(this.shape);
    }

}

class circle extends shape
{
    public void show()
    {
        System.out.println(this.shape);
    }
}

class  square extends shape
{
    public void show()
    {
        System.out.println(this.shape);
    }
}

public class inheritance {
    public static void main(String[] args)
    {
          rectangle r=new rectangle();
          r.shape="rectanleshape";
          r.show();


//         circle c=new circle();
//         c.shape="circleshape";
//         c.show();


//         square s=new square();
//         s.shape="squareshape";
//         s.show();


    }
}
