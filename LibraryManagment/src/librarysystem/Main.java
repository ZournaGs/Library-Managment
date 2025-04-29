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
		
		//CLI GUI
		System.out.println("Welcome to the Library System! Please choose an option"+
				"\n======================================================"+
				"\n 1.Users"+
				"\n 2.Books"+
				"\n 3.Transactions");
		//Read input int and make a choice from switch case forever
		while(true) {
		String choice=scanner.nextLine();
		switch(choice) {
		
		case "1"://Dumb testing
			   System.out.println("You chose users\n");
			   UserChoise();
			   break;
		case "2":
			   System.out.println("You chose books\n");
			   break;
		case "3":
			   System.out.println("You chose transactions\n");
			   break;
		default:
			   System.out.println("Wrong input, please try again\n");
			   break;
		}
	  }
	}
	
	//methods
	public static void UserChoise() {
		String input=scanner.nextLine().toLowerCase();
		
		switch(input) {
		case "create": System.out.println("Creating user...");
		               break;
		case "edit": System.out.println("Editing user...");
		             break;
		case "delete": System.out.println("Deleting user...");
		               break;
		}
		
	}
}