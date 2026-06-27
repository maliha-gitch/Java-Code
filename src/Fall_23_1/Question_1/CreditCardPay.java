package Fall_23_1.Question_1;

public class CreditCardPay extends Payment {
    public CreditCardPay(double amount){
        this.amount=amount;
    }
    @Override
    public double getCharge() {
        return amount*2.5/100;
    }
}
