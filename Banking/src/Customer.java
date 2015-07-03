
import java.io.Serializable;
import java.util.ArrayList;

//Customer implementing Serializable
public class Customer implements Serializable {

	// DAta members
	private String customerName;

	private ArrayList<Account> account = new ArrayList<Account>();
	int temporary = 0;

	// Setters using constructor
	public Customer(String customerName) {
		this.customerName = customerName;

		this.account = getAccount();

		System.out.println("Customer Created.");

	}

	// Getters and Setters
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public ArrayList<Account> getAccount() {
		return account;
	}

	public void setAccount(ArrayList<Account> account) {
		this.account = account;
	}

	/*
	 * Creating a new account by passing it to the account constructor
	 */
	public void addAccount(String accountType) {
		Account accountobject = new Account(this.customerName, accountType);
		this.account.add(accountobject);
		setAccount(account);
	}

	@Override
	// To String()
	public String toString() {
		return "Customer [customerName=" + customerName + ", account="
				+ account + "]";
	}

}