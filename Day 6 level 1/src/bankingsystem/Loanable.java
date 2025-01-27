package bankingsystem;

// Interface Loanable for accounts that can apply for loans
public interface Loanable {
    boolean applyForLoan(double amount); // Method to apply for a loan
    double calculateLoanEligibility(); // Method to calculate loan eligibility
}
