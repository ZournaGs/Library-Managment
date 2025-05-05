package librarysystem;
public class Testing {
    public static void main(String[] args) {
        Book book=new Book();
        book=book.InsertBook("AJF83NV7EL0F8", "Little Scientist", "SomeOldDude", 24);
        User user= new User();
        user=user.CreateUser("Tralalero", "tralala123", "iamshark@gmail.com");
        Transaction trans = new Transaction();
        trans=trans.CreateTransaction(user, book, TransactionType.BUY);
        trans.ShowValues();

    }

}
