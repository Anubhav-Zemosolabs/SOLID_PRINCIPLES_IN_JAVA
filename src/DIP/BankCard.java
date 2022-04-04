package DIP;

public interface BankCard {
        default void doTransaction(long amount){
            System.out.println("do transactions using Credit Card");
        }

}
