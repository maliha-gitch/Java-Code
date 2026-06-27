package fall_23_2_b;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[4];
        int x=10,y=1;
        try {
            try {
                arr[4] = x/(y-1);
                System.out.println("a");
            }catch (ArithmeticException e)
            {
                System.out.println("b");
                arr[4] = x/(y-1);
            }catch (IndexOutOfBoundsException e)
            {
                System.out.println("c");
                arr[4] = x/(y-1);
            }
            finally {
                System.out.println("d");
            }

    }catch(Exception e)
    {
        System.out.println("e");
    }finally
    {
        System.out.println("f");
    }
}
}