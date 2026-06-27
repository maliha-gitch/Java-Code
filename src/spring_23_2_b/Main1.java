package spring_23_2_b;


public class Main1 {
    public static void main(String[] args) {
        Math1 m = new Math1();
        try{
            int n=5;
            int d=0;
            System.out.println(m.divided(n,d));

        }catch (DivbyZero e)
        {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("completed");
        }
    }
}
