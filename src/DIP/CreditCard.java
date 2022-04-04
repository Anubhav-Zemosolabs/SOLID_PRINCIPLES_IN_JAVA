package DIP;

public class CreditCard implements BankCard{
        public void doTransaction (long amount){
            System.out.println("do transactions using Credit Card");
        }
}
