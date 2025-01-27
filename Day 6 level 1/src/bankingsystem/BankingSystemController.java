package bankingsystem;

import java.util.ArrayList;
import java.util.List;

// Main Controller
public class BankingSystemController {
    public static void main(String[] args) {
        // List of bank accounts
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SAV123", "Pradeep", 5000)); // Savings Account
        accounts.add(new CurrentAccount("CUR456", "raja", 10000)); // Current Account

        // Processing each account
        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: $" + account.getBalance());

            // Calculate and display interest
            double interest = account.calculateInterest();
            System.out.println("Calculated Interest: $" + interest);

            // Check if account is Loanable
            if (account instanceof Loanable) {
                Loanable loanableAccount = (Loanable) account;
                System.out.println("Loan Eligibility: $" + loanableAccount.calculateLoanEligibility());
                loanableAccount.applyForLoan(15000); // Attempt a loan
            }


        }
    }
}
