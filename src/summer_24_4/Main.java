package summer_24_4;

public class Main {
    public static void main(String[] args) {
        MyThread t1= new MyThread(1,49);
        MyThread t2= new MyThread(2,50);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();

        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        int result=t1.getSum()-t2.getSum();
        System.out.println("result");

    }
}
