package bankingsystem;

// SavingsAccount class
public class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.04; // 4% interest rate

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE; // Interest = balance * rate
    }

    @Override
    public boolean applyForLoan(double amount) {
        System.out.println("Savings account holders are not eligible for loans.");
        return false; // Savings account cannot apply for loans
    }

    @Override
    public double calculateLoanEligibility() {
        return 0; // Not applicable for savings accounts
    }
}
