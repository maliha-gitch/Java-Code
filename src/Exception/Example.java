package Exception;

public class Example {
    public static void main(String[] args) {
        try
        {
            int arr[] = new int[7];
            arr[10] = 10/0;
            System.out.println("Last statment of try block");

        }catch(ArithmeticException e)
        {
            System.out.println("You should not divided by zero");
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Accessing array element outside of the limit");
        }catch(Exception e)
        {
            System.out.println("Some other exception");
        }
        System.out.println("Out of the try-catch block");
    }
}
