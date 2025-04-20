package librarysystem;

public class User {
	private Integer usrid;
	private String usrname;
	private String passwd;
	private Boolean isadmin;
	
	//Constructors
	public User()
	{
		this.usrid=null;
		this.usrname="";
		this.passwd="";
		this.isadmin=null;
	}
	
	public User(Integer usrid)
	{
		this.usrid=usrid;
		this.usrname="";
		this.passwd="";
		this.isadmin=null;
	}
	
	public User(Integer usrid, String usrname)
	{
		this.usrid=usrid;
		this.usrname=usrname;
		this.passwd="";
		this.isadmin=null;
	}
	
	public User(Integer usrid, String usrname, String passwd)
	{
		this.usrid=usrid;
		this.usrname=usrname;
		this.passwd=passwd;
		this.isadmin=null;
	}
	
	public User(Integer usrid, String usrname, String passwd, Boolean isadmin)
	{
		this.usrid=usrid;
		this.usrname=usrname;
		this.passwd=passwd;
		this.isadmin=isadmin;
	}
	
	// Getters
    public Integer getUsrid() {
        return usrid;
    }

    public String getUsrname() {
        return usrname;
    }

    public String getPasswd() {
        return passwd;
    }

    public Boolean getIsadmin() {
        return isadmin;
    }

    // Setters
    public void setUsrid(Integer usrid) {
        this.usrid = usrid;
    }

    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setIsadmin(Boolean isadmin) {
        this.isadmin = isadmin;
    }
    
    public void ShowValues()
    {
    	//get the data
    	String[] data= {
    			String.valueOf(this.usrid),
    			this.usrname,
    			this.passwd,
    			String.valueOf(this.isadmin)
    	};
    	//print in series in a for loop
    	for(int i=0;i<data.length;i++) {
    		System.out.println(data[i]);
    	}
    }
}
	