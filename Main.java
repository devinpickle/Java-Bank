import java.util.Scanner;  // Import the Scanner class
import java.io.File; // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

public class Main {

	public static void main(String[] args) {
		// Start off with welcome and login options
		Bank b = new Bank();
		System.out.println("Welcome to the Bank!");
		
		
		Scanner input = new Scanner(System.in);
		
		boolean validOption = false;
		do {
		System.out.println("Please Select an Option:");
		System.out.println("1) New User");
		System.out.println("2) Existing User");
		int option = input.nextInt();
		
		if (option == 1) {
			System.out.println("You've selected new user");
			String[] inputs = createUser();
			b.addUser(inputs[0], inputs[1]);
			b.userLogin(inputs[0]);
			//Show the newly added user
			b.getUsers();
			validOption = true;
			
		} else if (option == 2) {
			System.out.println("You've selected Existing User\n This feature currently isn't working");
			
			System.out.println("Enter your account ID");
            Scanner scannerID = new Scanner(System.in);
			String enteredID = scannerID.nextLine();
			
            if (b.getUser(enteredID)) {
				// Create current user object
				b.userLogin(enteredID);
				validOption = true;
			} else {
				System.out.println("Not a valid ID");
			}

			
			
		} else {
			System.out.println("Not a valid option");
		}
		} while (validOption == false);
		
		System.out.println("Select an option");
		System.out.println("1) Withdraw");
		System.out.println("2) Deposit");

		int transaction = input.nextInt();
		
		if (transaction == 1) {
			System.out.println("Withdrawal amount:");
			float withdraw = input.nextFloat();
			b.withdraw(withdraw, b.enteredID);
			System.out.print("New Balance: " + b.getBalance(b.enteredID));

		} else if (transaction == 2) {
			System.out.println("Deposit amount:");
			float deposit = input.nextFloat();
			b.deposit(deposit, b.enteredID);
			System.out.println("New Balance: " + b.getBalance(b.enteredID));
		}


	}
	
	public static String[] createUser() {
		// Create a new user object
		//Get an account id for the user
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Please enter an account ID: ");
		String accountID = input.nextLine();
		
		//Set the user balance
		System.out.println();
		System.out.println("Please enter an account balance: ");
		float balance = input.nextFloat();
		String[] inputs = new String[2];
		inputs[0] = accountID;
		inputs[1] = String.valueOf(balance);
		
		return inputs;
	}
	
	
	
//	try {
//	File myObj = new File("userList.txt");
//	if (myObj.createNewFile()) {
//		System.out.println("File created: " + myObj.getName());
//	} else {
//		System.out.println("File already exists.");
//	}
//} catch (IOException e ){
//	System.out.println("An error occured.");
//	e.printStackTrace();
//}
//
//try {
//      FileWriter myWriter = new FileWriter("userList.txt");
//      myWriter.write("Files in Java might be tricky, but it is fun enough!");
//      myWriter.close();
//      System.out.println("Successfully wrote to the file.");
//    } catch (IOException e) {
//      System.out.println("An error occurred.");
//      e.printStackTrace();
//    }
//
}
