package spring_23_4;

public class thread implements Runnable{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(i+1);
        }
    }
}
