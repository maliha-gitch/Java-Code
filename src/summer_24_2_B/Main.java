package summer_24_2_B;

public class Main {
    public static void main(String[] args) {
        int a[] = new int[3];
        int c = 10, d = 2;
        for(int i = 4; i >= 0; i--){
            if(i == 2) d = 0;
            try{
                a[i] = c / d;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("a");
            }
            catch(ArithmeticException e){
                System.out.println("b");
            }
        }
    }
}
