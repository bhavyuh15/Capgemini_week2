package bankingsystem;

// CurrentAccount class
public class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02; // 2% interest rate
    private static final double LOAN_ELIGIBILITY_MULTIPLIER = 3.0; // Loan eligibility = 3x balance

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE; // Interest = balance * rate
    }

    @Override
    public boolean applyForLoan(double amount) {
        double eligibility = calculateLoanEligibility();
        if (amount <= eligibility) {
            System.out.println("Loan of $" + amount + " approved for account: " + getAccountNumber());
            return true;
        } else {
            System.out.println("Loan of $" + amount + " exceeds eligibility for account: " + getAccountNumber());
            return false;
        }
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * LOAN_ELIGIBILITY_MULTIPLIER; // Loan eligibility = balance * multiplier
    }
}
