package bankingsystem;

// Abstract class BankAccount representing a generic bank account
public abstract class BankAccount {
    private String accountNumber; // Unique account number
    private String holderName; // Name of the account holder
    private double balance; // Current account balance

    // Constructor to initialize account details
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters and Setters for encapsulation
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) { // Encapsulation to restrict direct access
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Deposited $" + amount + " to account: " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew $" + amount + " from account: " + accountNumber);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    // Abstract method to calculate interest
    public abstract double calculateInterest();
}
