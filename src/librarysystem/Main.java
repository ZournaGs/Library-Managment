package src.librarysystem;

import java.util.Scanner;



public class Main {
	//Global scanner
	static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		//Start the main interface
		MainInterface();
		//Read input int and make a choice from switch case forever
		while(true) {
		String choice=scanner.nextLine();
		switch(choice) {
		
		case "1":
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

    //USER
	public static void UserChoise() {
		//User options
		System.out.println("You chose users\n"+
		"---------------\n"+
		"Choose: \n>Create\n>Edit\n>Delete\n>Cancel");
		
		//Selection switch case
		String input=scanner.nextLine().toLowerCase();
		switch(input) {
		case "create": System.out.println("Creating user...");
		               EnterUser();
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
	public static void EnterUser(){
		String username = null;
        String password = null;
        String email = null;

        try {
            System.out.print("Give username: ");
            username = scanner.nextLine().trim();

            System.out.print("Give password: ");
            password = scanner.nextLine().trim();

            System.out.print("Give email: ");
            email = scanner.nextLine().trim();

            // Validate inputs (simple check)
            if (username.isEmpty() || password.isEmpty() || email.isEmpty()) {
                throw new IllegalArgumentException("None of the fields can be empty.");
            }

            // Create and hash password
            User user = new User();
			user=user.CreateUser(username, password, email);
            user.ShowValues();

        } catch (IllegalArgumentException e) {
            System.err.println("Invalid input: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Something went wrong: " + e.getMessage());
        }
	};

	//TO DO
	//Edit,Delete user methods in User class

    //BOOKS
	public static void BookChoice(){
	
		//User options
		System.out.println("You chose books\n"+
		"---------------\n"+
		"Choose: \n>Insert\n>Edit\n>Remove\n>Cancel");
		
		//Selection switch case
		String input=scanner.nextLine().toLowerCase();
		switch(input) {
		case "insert": System.out.println("Inserting book...");
		               EnterBook();
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

	public static void EnterBook(){
		String isbn = null;
        String title = null;
        String author = null;
		String stock_string=null;

        try {
            System.out.print("Give ISBN: ");
            isbn = scanner.nextLine().trim();

            System.out.print("Give title: ");
            title = scanner.nextLine().trim();

            System.out.print("Give author: ");
            author = scanner.nextLine().trim();

			System.out.print("Give stock: ");
            stock_string= scanner.nextLine().trim();
			Integer stock=Integer.valueOf(stock_string);

            // Validate inputs (simple check)
            if (isbn.isEmpty() || title.isEmpty() || author.isEmpty()|| stock==null) {
                throw new IllegalArgumentException("None of the fields can be empty.");
            }

            // Insert a new Book
            Book book = new Book();
			book=book.InsertBook(isbn, title, author,stock);
            book.ShowValues();

        } catch (IllegalArgumentException e) {
            System.err.println("Invalid input: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Something went wrong: " + e.getMessage());
        }
	}
	//TO DO
	//Make Edit,Delete methods for Books

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