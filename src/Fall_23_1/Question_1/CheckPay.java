package Fall_23_1.Question_1;

public class CheckPay extends Payment {
    public CheckPay(double amount){
        this.amount=amount;
    }
    @Override
    public double getCharge() {
        return 10;
    }
}
