package SRP.solution;

public class LoanServices {
        public void GetLoanInterrestInfo(String loanType){
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
}
