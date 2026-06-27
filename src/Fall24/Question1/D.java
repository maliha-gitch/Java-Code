package Fall24.Question1;

public class D extends C{
    int u;
    int v;
    D(int u,int v)
    {
        this.u=u;
        this.v=v;
    }
    public int a()
    {
        return u+v;
    }
    public int b()
    {
        return u*v;
    }
    public int x()
    {
        return u%v;
    }
    public int y()
    {
        return (int)Math.pow(u,v);
    }
    public void p()
    {
        System.out.println(a());
        System.out.println(b());
        System.out.println(x());
        System.out.println(y());

    }
}
