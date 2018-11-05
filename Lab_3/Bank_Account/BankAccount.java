// Ahmad Turan Naimey
// CS 136L-003
// Lab 3 - Bank Account Class & Methods
import java.util.Date; // Importing date class

public class BankAccount

{
	// Declaring variables with the right data type
	double balance;
	String ownerName;
	Date OpeningDate;
	boolean accountType;
	int numtransactions;

	BankAccount (double initialBalance) // Constructor
	{
		balance = initialBalance;
	}
	BankAccount () // default constructor
	{
		balance = 0.0;
	}

	void deposit (double depositAmount)
	{
		balance = balance + depositAmount;
		numtransactions++;
	}
	void withdraw (double withdrawAmount)
	{
		balance = balance - withdrawAmount;
		numtransactions++;
	}
	public void setName(String name) // Setter
	{
		ownerName = name;
	}
	public String getName() // Getter
	{
		return ownerName;
	}

	public void setBalance(double bal) //setter
	{
		balance = bal;
	}
	public double getBalance() // getter
	{
		return balance;
	}
	public void chargeFee() // used if statements to determine if chargefee was
	//  necessary
	{
		if(numtransactions > 5)
			balance = balance - (numtransactions - 5);
	}
	public void addInterest(double rate) // The add interest method
	{
		balance = balance + (balance * (rate/100));
	}



}
