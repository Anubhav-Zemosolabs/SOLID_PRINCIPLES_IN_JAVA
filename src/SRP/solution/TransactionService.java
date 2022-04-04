package SRP.solution;

public class TransactionService {
    public long Deposit(long amount, String account_no){
        long bal = 5000;
        bal += amount;
        System.out.println("Balance updated in Account number: " + account_no);
        return bal;
    }
    public long Withdraw(long amount, String account_no){
        long bal = 5000;
        bal -= amount;
        System.out.println("Balance updated in Account number: " + account_no);
        return bal;
    }
}
