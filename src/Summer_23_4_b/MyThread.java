package Summer_23_4_b;

public class MyThread extends Thread{
    private int tid;
    private int startVal;
    private int endVal;
    int inc;
    private double z;
    MyThread(int d,int sv,int ev)
    {
        inc=3;
        z=1.0;
        this.tid=d;
        this.startVal=sv;
        this.endVal=ev;

    }
    public void run()
    {
        for(int i=startVal;i<=endVal;i+=inc)
        {
            z*=(1.0/i);
        }
    }
    public double getZ()
    {
        return z;
    }
}
