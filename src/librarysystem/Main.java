package librarysystem;

public class Main {

	public static void main(String[] args) {
		User user=new User(12,"JohnZour","tungtungsahur123");
		Book book= new Book("A12HV639D8G7W","A Random Book","John Pork");
		Transaction trans=new Transaction(user,book,TransactionType.BUY,true);
		trans.ShowValues();
    }
}