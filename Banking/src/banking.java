//Importing io.file
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

//Main Class 
public class banking {
	/*
	 * Scanner object,Creating an array list of type customer
	 */
	static Scanner scanner = new Scanner(System.in);
	String pwd;
	ArrayList<Customer> customers = new ArrayList<Customer>();

	ToFile tofile = new ToFile();

	/*
	 * This method creates a new customer of type customer It then adds it to
	 * the arraylist.
	 */
	public void enterDetails() {

		System.out.println("Enter your First Name:");
		String name = scanner.next();

		Customer newcustomer = new Customer(name);
		customers.add(newcustomer);

		tofile.addRecords(customers);

	}

	/*
	 * This method gets a user name from the user. Then it retreives all the
	 * data in the file and stores it in a array.Then it checks if any name in
	 * the array matches the name in the parameter.If so user is logged in and
	 * an another menu is shown.
	 */
	private void Login() {
		System.out.println("Enter your  Name:");
		String name = scanner.next();

		ArrayList<Customer> customers = tofile.read();

		for (Customer customer : customers) {
			System.out.println("Customer Details");
			if (customers.contains(customer)) {
				if (customer.getCustomerName().equalsIgnoreCase(name)) {
					System.out.println("Login SuccessFul");

					mainMenu(customer);
					break;
				} else {
					System.out.println("Unable to Login!! Invalid Credentials");
				}

			}
		}

	}

	/*
	 * This displays the create customer/login menu if 1 is selected new
	 * customer gets created else if 2 is selected login() is invoked
	 */
	private void showMenu(Customer customer) {
		System.out.println("Welcome " + customer.getCustomerName());

		System.out.println("Enter 1 to Create New Account!!");
		System.out.println("Enter 2 for Account Details!!");

		int decision = scanner.nextInt();
		switch (decision) {
		case 1:
			createNewAccount(customer);
			showAccountDetails(customer);

			break;
		case 2:

			showAccountDetails(customer);
			break;

		}

		System.out.println("Do you Wanna Continue with Main Menu");
		String reply = scanner.next();
		if (reply.equalsIgnoreCase("yes")) {
			mainMenu(customer);
		} else {
			mainMenu(customer);
		}

	}

	/*
	 * this is the menu that gets created after login is selected Here there are
	 * 3 choices.1 for deposit,2 for balance ,3 for withdrawl.
	 */
	private void mainMenu(Customer customer) {
		System.out.println("Select an Option");
		System.out.println("Enter 1 to deposit");
		System.out.println("Enter 2 for balanceEnquiry");
		System.out.println("Enter 3 for withDrawal");
		int option = scanner.nextInt();
		switch (option) {
		case 1:
			/*
			 * This gets the accout number from the user. The account numbers
			 * that aldredy exist are stored in a temporary account object and
			 * compared with the account no provided by the user. If those 2
			 * match deposit() is called
			 */
			System.out.println("Enter account number to deposit:");
			int accountNumber = scanner.nextInt();
			for (Account account : customer.getAccount()) {
				if (account.getAccountNumber() == accountNumber) {
					System.out.println("Enter Amount to deposit:");
					double amount = scanner.nextDouble();
					account.deposit(amount);
					saveCustomer(customer);
					break;
				}
			}

			break;
		case 2:
			/*
			 * This gets the account number from the user. The account numbers
			 * that aldredy exist are stored in a temporary account object and
			 * compared with the account no provided by the user. If those 2
			 * match checkbalance() is called
			 */

			System.out.println("Enter account number for checking balance:");
			int accountNumber1 = scanner.nextInt();
			for (Account acc : customer.getAccount()) {
				if (acc.getAccountNumber() == accountNumber1) {
					System.out.println("Your Balance:" + +acc.Checkbalance());
					break;
				}
			}

			break;
		case 3:
			/*
			 * This gets the account number from the user. The account numbers
			 * that aldredy exist are stored in a temporary account object and
			 * compared with the account no provided by the user. If those 2
			 * match withdraw() is called
			 */
			System.out.println("Enter accountno for WithDrawal:");
			int accountNumber2 = scanner.nextInt();
			for (Account acc : customer.getAccount()) {
				if (acc.getAccountNumber() == accountNumber2) {
					System.out.println("Enter Amount to withdraw:");
					double amount = scanner.nextDouble();
					try {
						acc.withDraw(amount);
					} catch (Exception e) {
						System.out.println("Unable to withdraw amount");
						e.printStackTrace();
					}
					saveCustomer(customer);
					break;
				}
			}

			break;
		default:
			System.out.println("Invalid Input!!");
		}

		System.out.println("Do you Wanna continue ?");
		String reply = scanner.next();
		if (reply.equalsIgnoreCase("yes")) {
			mainMenu(customer);
		} else {
			System.out.println("Your Logged out!!");
		}
	}

	// Creating a new Account with account type in parameter
	private void createNewAccount(Customer customer) {
		System.out.println("Enter Account Type");
		String type = scanner.next();

		customer.addAccount(type);
		saveCustomer(customer);

	}

	// Displaying the account details
	private void showAccountDetails(Customer customer) {
		System.out.println("Your Account Details are:");
		ArrayList<Account> accounts = customer.getAccount();
		for (Account acc : accounts) {
			System.out.println(acc);

		}

	}

	// Whenever a customer is created it has to be written to the toFile Class
	private void saveCustomer(Customer customer) {
		customers.add(customer);
		tofile.addRecords(customers);

	}

	// Main Method
	public static void main(String args[]) {

		banking bankingobject2 = new banking();
		// Creating customer 1 with credit type account

		Customer customer1 = new Customer("shyam");
		customer1.addAccount("credit");
		customer1.addAccount("credit");
		// Creating customer 2 with debit as well as credit
		Customer customer2 = new Customer("shree");
		customer2.addAccount("debit");
		customer2.addAccount("credit");
		// Customers are added
		bankingobject2.customers.add(customer1);
		bankingobject2.customers.add(customer2);
		bankingobject2.tofile.addRecords(bankingobject2.customers);
		// 1 for new customer 2 for login
		Scanner input = new Scanner(System.in);
		System.out.println("Select an Option:");
		System.out.println("Enter 1 for NewCustomer");
		System.out.println("Enter 2 for Login");
		int selectOption = input.nextInt();

		banking bankingobject3 = new banking();

		switch (selectOption) {
		case 1:
			// Creeating new customer by passing it to enterDetails()
			System.out.println("You have selected NEW Customer");
			bankingobject3.enterDetails();
			System.out.println("Login?");
			if (scanner.next().equalsIgnoreCase("yes"))
				try {
					bankingobject3.Login();
				} catch (Exception e) {
					System.out.println("Please Login Again!!!");
					e.printStackTrace();

				}
			break;
		case 2:
			// Logging in by login()
			System.out.println("You have selected to Login");
			try {
				bankingobject3.Login();
			} catch (Exception e) {
				System.out.println("Please Login Again!!!");
				e.printStackTrace();
			}
			break;
		default:
			System.out.println("Invalid option");
		}

	}

}
