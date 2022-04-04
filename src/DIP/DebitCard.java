package DIP;

public class DebitCard implements BankCard{
        public void doTransaction(long amount){
            System.out.println("do transactions using Debit Card");
        }
}
