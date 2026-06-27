package spring_23_2_b;

public class Math1 {
    public  int divided(int x,int y) throws DivbyZero
    {
        if(y==0){
            throw new DivbyZero("The denominator can be zero");
        }
        return x/y;
    }
}
