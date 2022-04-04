package SRP.solution;

public class BankServiceApplication {
    public static void main(String[] args) {
        LoanServices loanServices = new LoanServices();
        NotificationService notificationService = new NotificationService();
        PrinterServices printerServices = new PrinterServices();
        TransactionService transactionService = new TransactionService();
        loanServices.GetLoanInterrestInfo("Car");
        notificationService.SendOtp("mobile");
        printerServices.PrintPassbook();
        transactionService.Deposit(80000,"878953311");
        transactionService.Withdraw(20000, "878953311");
    }
}
