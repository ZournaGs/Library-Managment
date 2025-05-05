package librarysystem;

public class Transaction {
    private User user_t;
    private Book book_t;
    private TransactionType type; // "BORROW or "BUY"
    //Date is handled by DB
    private Boolean completed;
    
  //Constructors
  
  //No nulls are allowed
    public Transaction(User user_t, Book book_t, TransactionType type, Boolean completed) {
    	if (user_t == null || book_t == null || type == null || completed == null) {
            throw new IllegalArgumentException("No null values allowed in Transaction.");
        }
    	this.user_t=user_t;
    	this.book_t=book_t;
    	this.type=type;
    	this.completed=completed;
    }
    //Empty Constructor
    public Transaction(){
        this.user_t=null;
        this.book_t=null;
        this.type=null;
        this.completed=null;
    }


    //Getters
    public User getUser_t(){
    	return this.user_t;
    }
    
    public Book getBook_t() {
    	return this.book_t;
    }
    
    public TransactionType getType() {
    	return this.type;
    }
    
    public Boolean getCompleted() {
    	return completed;
    }
    
    //Setters
    public void setUser_t(User user) {
    	this.user_t=user;
    }
    
    public void setBook_t(Book book) {
    	this.book_t=book;
    }
    
    public void setType(TransactionType type) {
    	this.type=type;
    }
    
    public void setCompleted(Boolean completed) {
    	this.completed=completed;
    }
    
    //methods
    
    public void ShowValues() {
    	String[] data= {
        		this.user_t.getUsrname(),
        		this.book_t.getTitle(),
        		String.valueOf(type),
        		String.valueOf(completed)
        	};
        	//print in series in a for loop
        	for(int i=0;i<data.length;i++) {
        		System.out.println(data[i]);
        }
    }

    public Transaction CreateTransaction(User user_t, Book book_t, TransactionType type) {
        if (type == null) {
            throw new IllegalArgumentException("Error: Transaction type cannot be null. User must BUY or BORROW.");
        }
    
        boolean completedFlag;
        switch (type) {
            case BUY:
                completedFlag = true;
                break;
            case BORROW:
                completedFlag = false;
                break;
            default:
                throw new IllegalArgumentException("Error: Invalid Transaction type.");
        }
        Transaction trans = new Transaction(user_t, book_t, type, completedFlag);
        return trans;
    }
    
    
}


