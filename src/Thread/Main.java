package Thread;

public class Main {
    public static void main(String[] args)  {
        A t1= new A();
        B t2=new B();
        t1.start();
        try
        {
            t1.join();
        }catch (InterruptedException e){

            System.out.println("CHild interrupted");
        }

        t2.start();
    }
}
