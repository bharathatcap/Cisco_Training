import java.io.Serializable;

/*
 * Class for Account Details implementing Serializable
 */

public class Account implements Serializable {

	/**
	 * 
	 */
	 // Data members
	private int accountNumber;
	private String accountHolderName;
	private String accountType;
	private double balance;
	private static int temporarycount = 0;

	/*
	 * Parameterised Constructor taking name and account type Sets values to the
	 * data members in the Account class
	 */
	public Account(String accountHolderName, String accountType) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = AccountNumber();
		this.accountType = accountType;
		this.balance = initialBalance(accountType);

	}

	/*
	 * Sets initial balance for both credit and debit accounts
	 */
	private double initialBalance(String accountType) {

		switch (accountType) {
		case "debit":
			setbalance(0.0);
			break;
		case "credit":
			setbalance(1000);
			break;
		default:
			System.out.println("Enter either debit or credit ");
		}

		return getbalance();
	}

	// Generates account number for every customer created
	private int AccountNumber() {

		int numb = 750;
		numb = numb + temporarycount + 1;
		return numb;
	}

	// Getters and Setters
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getbalance() {
		return balance;
	}

	public void setbalance(double balance) {
		this.balance = balance;
	}

	public double Checkbalance() {
		return this.balance;
	}

	/*
	 * It first checks if amount is greater than 0 Then it adds the amount to
	 * the existing balance We implement this in a try block so invalid input
	 * can be avoided
	 */
	public void deposit(double amount) {
		try {
			if (amount > 0) {
				this.balance = this.balance + amount;
				System.out.println("Amount" + amount
						+ "deposited in account. Your balance : "
						+ this.balance);

			} else {
				System.out.println("Please enter valid amount ");

			}
		} catch (Exception e) {
			System.out.println("Please enter a numerical value ");
		}
	}

	/*
	 * This first checks if amount to be withdrawn is atleast 100 rs.Then it
	 * checks if minimum balance is stillmaintained.If yes amount is withdrawn
	 * from the existingbalance
	 */
	public void withDraw(double amount) {
		try {
			if (amount > 100) {

				double bal = Checkbalance();
				double tempbal = bal;
				if ((tempbal - amount) > 0) {
					this.balance = this.balance - amount;
					System.out
							.println("WithDrawal Successfully complete. Your curent balance:"
									+ this.balance);
				} else {
					System.out.println("You have insufficient funds ");

				}

			} else {
				System.out.println("You got to withdraw atleast Rs 100");
			}
		} catch (Exception e) {
			System.out.println("Your amount should be a numeric value ");
		}
	}

	@Override
	// ToString() function
	public String toString() {
		return "CustomerName: " + accountHolderName + "\n" + "AccountNumber:"
				+ accountNumber + " \n" + "Type:" + accountType + "\n"
				+ "Balance:" + balance;
	}
}