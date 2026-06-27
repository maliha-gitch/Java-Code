package Thread;

public class SUm extends Thread{
    public void run()
    {
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            if(i<=5)
            {
                sum=sum+i;

            }
        }
    }
}
