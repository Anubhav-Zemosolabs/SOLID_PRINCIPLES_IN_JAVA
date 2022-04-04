package ISP;

public class ISPDemo {
    public static void main(String[] args) {
        GPay gpay = new GPay();
        Paytm paytm = new Paytm();
        PhonePay phonePay = new PhonePay();

        gpay.payMoney();
        gpay.getScratchCards();
        gpay.getScratchCardsAndPayBalance();

        paytm.payMoney();
        paytm.getScratchCards();

        phonePay.payMoney();
        phonePay.getScratchCards();
    }
}
