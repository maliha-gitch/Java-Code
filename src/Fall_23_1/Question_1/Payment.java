package Fall_23_1.Question_1;

abstract public class Payment implements Transaction {
    double amount;
    String currency="BDT";

    @Override
    public void give() {

        double totalAmount=amount+getCharge()+getTax();
        System.out.println(currency+" "+totalAmount+"is paid");
    }

    @Override
    public void receive() {
        System.out.println("[Nothing is received]");
    }
    public abstract double getCharge();
    public double getTax()
    {
        return amount*15.6/100;
    }
}

