// Ahmad Turan Naimey
// CS 136L-003
// Lab 3 - Bank Account Tester Class
public class BankAccountTester
{
	public static void main (String args[])
	{
	BankAccount acc = new BankAccount(1000);
	acc.setName("New Account"); // TO test the method setName
	System.out.println("The account name was changed to " + acc.getName()); // To test the method getName
	System.out.println ("Balance is "+acc.getBalance()); // To test the method getBalance
	acc.deposit(200);// To test the method deposit
	System.out.println("Balance after deposit is " + acc.getBalance());
	acc.withdraw(50);// To test the withdraw method
	System.out.println("Balance after withdraw is " + acc.getBalance());
	acc.withdraw(50);
	acc.withdraw(50);
	acc.deposit(150);
	acc.deposit(100);
	acc.chargeFee(); // To test chargeFee method
	System.out.println("Balance after transactions penalty is " + acc.getBalance());
	acc.addInterest(12); // To test add interest method
	System.out.println("The balance for " + acc.getName() + " is " + acc.getBalance());


	}


}
