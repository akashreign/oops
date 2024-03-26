
class thread1 extends Thread
{

        public void run()
        {
            while(true)
            {
                System.out.println("THREAD1 IS RUNNING");
                System.out.println("THREAD1 IS COOKING");
            }
        }
}


class thread2 extends Thread{

    public void run()
    {
       while(true)
       {
           System.out.println("THREAD2 IS RUNNING");
           System.out.println("THREAD2 IS CHATTING");
       }
    }

}

public class multithread {

    public static void main(String[] args) {

        thread1 t1=new thread1();
        thread2 t2=new thread2();

        t1.start();
        t2.start();
    }
}



