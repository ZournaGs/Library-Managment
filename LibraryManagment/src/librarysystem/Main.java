package librarysystem;

import java.util.Scanner;



public class Main {
	//Global scanner
	static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		//Testing
		
		//User user=new User(12,"JohnZour","tungtungsahur123");
		//Book book= new Book("A12HV639D8G7W","A Random Book","John Pork");
		//Transaction trans=new Transaction(user,book,TransactionType.BUY,true);
		//trans.ShowValues();
		
		//Start the main interface
		MainInterface();
		//Read input int and make a choice from switch case forever
		while(true) {
		String choice=scanner.nextLine();
		switch(choice) {
		
		case "1"://Dumb testing
			   UserChoise();
			   break;
		case "2":
			   BookChoice();
			   break;
		case "3":
			   TransactionChoice();
			   break;
		case "4":
		       Exit();
		default:
			   System.out.println("Wrong input, please try again\n");
			   break;
		}
	  }
	}
	
	//methods
	public static void MainInterface(){
		//CLI GUI main interface
		System.out.println("Welcome to the Library System! Please choose an option"+
				"\n======================================================"+
				"\n 1.Users"+
				"\n 2.Books"+
				"\n 3.Transactions"+
				"\n 4.Exit");
	}

	public static void Interface(){
		System.out.println(
				"======================================================"+
				"\n 1.Users"+
				"\n 2.Books"+
				"\n 3.Transactions"+
				"\n 4.Exit");
	}


	public static void UserChoise() {
		//User options
		System.out.println("You chose users\n"+
		"---------------\n"+
		"Choose: \n>Create\n>Edit\n>Delete\n>Cancel");
		
		//Selection switch case
		String input=scanner.nextLine().toLowerCase();
		switch(input) {
		case "create": System.out.println("Creating user...");
		               break;
		case "edit": System.out.println("Editing user...");
		             break;
		case "delete": System.out.println("Deleting user...");
		               break;
		case "cancel": System.err.println("Canceling choice...");
		               break;
		default: System.out.println("Wrong input, please try again");
		         UserChoise();
		}
		Interface();
	}
	//TO DO
	//Create,Edit,Delete user methods in User class

	public static void BookChoice(){
	
		//User options
		System.out.println("You chose books\n"+
		"---------------\n"+
		"Choose: \n>Insert\n>Edit\n>Remove\n>Cancel");
		
		//Selection switch case
		String input=scanner.nextLine().toLowerCase();
		switch(input) {
		case "insert": System.out.println("Inserting book...");
		               break;
		case "edit": System.out.println("Editing book...");
		             break;
		case "remove": System.out.println("Removing book...");
		               break;
		case "cancel": System.err.println("Canceling choice...");
		               break;
		default: System.out.println("Wrong input, please try again");
		         BookChoice();
		}
		Interface();
	}
	//TO DO
	//Make Book class methods

	public static void TransactionChoice(){
		//User options
		System.out.println("You chose transactions\n"+
		"---------------\n"+
		"Choose: \n>Create\n>Edit\n>Delete\n>Cancel");
		
		//Selection switch case
		String input=scanner.nextLine().toLowerCase();
		switch(input) {
		case "create": System.out.println("Creating transaction...");
		               break;
		case "edit": System.out.println("Editing transaction...");
		             break;
		case "delete": System.out.println("Deleting transaction...");
		               break;
		case "cancel": System.err.println("Canceling choice...");
		               break;
		default: System.out.println("Wrong input, please try again");
		         TransactionChoice();
		}
		Interface();
	}

    //TO DO
	//Create Transaction class methods

	public static void Exit(){
		System.out.println("Exiting...");
		System.exit(0);
	}
}