package Fall24.Question5a;

public class Main {
    public static void main(String[] args) {
        double x = 1.15;
        MyThread t1 = new MyThread(0,x);
        MyThread t2 = new MyThread(1,x);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result = t1.getSum()-t2.getSum();
    }
}
