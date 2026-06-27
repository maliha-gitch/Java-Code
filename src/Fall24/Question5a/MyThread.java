package Fall24.Question5a;

public class MyThread extends Thread{
    int startVal;
    double x;
    private int sum;
    MyThread(int startVal,double x)
    {
        this.startVal=startVal;
        this.x=x;
        int sum=0;
    }

    public void run()
    {
        for(int i=startVal;i<=50;i+=2)
        {
            sum+=Math.pow(x,i)/i+1;
        }

    }
    int getSum()
    {
        return sum;
    }
}
