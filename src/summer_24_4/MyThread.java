package summer_24_4;

public class MyThread extends Thread{
    int start,end;
   private int sum;
    MyThread(int start,int end)
    {
        this.start=start;
        this.end=end;
        int sum=0;
    }
    public void run()
    {
        for(int i=start;i<=end;i+=2)
        {
            sum+=i;
        }
    }
    public int getSum()
    {
        return sum;
    }
}
