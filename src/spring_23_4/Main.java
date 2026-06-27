package spring_23_4;

public class Main {
    public static void main(String[] args) {
        thread tk = new thread();
        Thread td = new Thread(tk);
        td.start();
        try {
            td.join();
        }catch(InterruptedException e)
        {
            System.out.println("not completed yet");
        }
    }
}
