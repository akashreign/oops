interface multiple_inheritance {

   public void run();

}
interface multiple_inheritance2{

   public void play();
}
class sports implements multiple_inheritance,multiple_inheritance2{

   public void run()
    {
        System.out.println("multiple inheritance run method");
    }
   public void play()
    {
        System.out.println("multiple inheritance2 play method");
    }


}
class interface_main
{
    public static void main(String[] args) {

        sports s=new sports();
        s.play();
        s.run();

    }
}

