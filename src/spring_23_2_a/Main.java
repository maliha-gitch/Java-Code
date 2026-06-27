package spring_23_2_a;

public class Main {
    public static void main(String[] args) {
        Math m = new Math();
        try{
            int n=5;
            int d=0;
            System.out.println(m.divided(n,d));

        }catch (ArithmeticException e)
        {
            System.out.println("not possible divided by zero");
        }finally {
            System.out.println("completed");
        }
    }
}
