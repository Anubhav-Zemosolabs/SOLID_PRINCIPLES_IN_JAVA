package SRP;

class BankService{
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

    public void PrintPassbook(){
        System.out.println("Updating Transaction info in Passbook");
    }

    public void GetLoanInterestInfo(String loanType){
        if(loanType.equals("HomeLoan")){
            System.out.println("Providing HomeLoan");
        }
        if(loanType.equals("PersonalLoan")){
            System.out.println("Providing Personal Loan");
        }
        if(loanType.equals("Car")){
            System.out.println("Providing Car Loan");
        }
    }
    public void SendOtp(String medium){
        if(medium.equals("email")){
            //sending otp through email
            System.out.println("Sending the otp through email");
        }
    }
}

public class SRP_ViolationDemo {
    public static void main(String[] args) {
        BankService obj = new BankService();
        long balance;
        balance=obj.Deposit(10000,"84554632");
        System.out.println(balance);
        balance=obj.Withdraw(90000,"845546662");
        System.out.println(balance);
        obj.PrintPassbook();
        obj.GetLoanInterestInfo("email");
        obj.SendOtp("Account Details Updated");
    }
}
