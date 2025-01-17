import java.util.Scanner;
public class main {
	public static void main(String args[]){
		BankAccount obj = new BankAccount();
		obj.display("Ishan",12,115666);
		obj.depositing(BankAccount.Balance);
		obj.withdrawing(BankAccount.Balance);
	}
}
	
class BankAccount{
	public 
	   String AccountHolder ;
		int AccountNumber ;
	   static int Balance;
		public  void display(String AccountHolder,int AccountNumber, int Balance){
			this.AccountHolder=AccountHolder;
			this.AccountNumber=AccountNumber;
			this.Balance=Balance;
			System.out.println("Account Holder = " + AccountHolder);
			System.out.println("Account Number = " + AccountNumber);
			System.out.println("Current Balance = " + Balance);
		}
		public  void depositing(int Balance){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Deposit Amount or Enter 0");
			int deposit = sc.nextInt();
			Balance +=deposit; 
			System.out.println("current balance = " + Balance);
		}
		public void withdrawing(int Balance){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter withdrawing amount or Enter 0 ");
			int withdrawl=sc.nextInt();
			if(withdrawl>Balance){
			System.out.println("current balance is less than withdrawing amount ");
}
else{
	System.out.println("current balance = "+ (Balance - withdrawl));
}
		}
}