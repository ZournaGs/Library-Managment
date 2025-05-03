package librarysystem;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private Integer stock;

    // Constructors
    public Book() {
        this.isbn = "";
        this.title = "";
        this.author = "";
        this.stock = null;
    }

    public Book(String isbn) {
        this.isbn = isbn;
        this.title = "";
        this.author = "";
        this.stock = null;
    }

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
        this.author = "";
        this.stock = null;
    }

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.stock = null;
    }

    public Book(String isbn, String title, String author, Integer stock) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.stock = stock;
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getStock() {
        return stock;
    }

    // Setters
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    // ShowValues method
    public void ShowValues() {
        String[] data = {
            this.isbn,
            this.title,
            this.author,
            String.valueOf(this.stock)
        };
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    //methods

    
}
