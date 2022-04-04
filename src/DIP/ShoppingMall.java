package DIP;

public class ShoppingMall {
    private BankCard bankCard;
    public ShoppingMall(BankCard bankCard){
        this.bankCard=bankCard;
    }

    public void doPurchaseSomething(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard bankCard = new DebitCard();
       // BankCard CreditCard = new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(58992);

    }
}
