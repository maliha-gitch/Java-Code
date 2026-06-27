package Fall_23_1.Question_1;

public class CashPay extends Payment{
public CashPay(double amount){
    this.amount=amount;
}
    @Override
    public double getCharge() {
        return 0;
    }
}
