package librarysystem;
public class Testing {
    public static void main(String[] args) {
        Book book=new Book();
        book=book.InsertBook("AJF83NV7EL0F8", "Little Scientist", "SomeOldDude", 24);
        book.ShowValues();

    }

}
