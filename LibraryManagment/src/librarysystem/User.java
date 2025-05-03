package librarysystem;

import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class User {
	private Integer usrid;//Handled by DB
	private String usrname;
	private String passwd;
	private String email;
	private String salt;//Handled by HashPassword method
	private Boolean isadmin;//Always false, admins are handled by IT
	//Hashing settings
	private static final int ITERATIONS = 100_000;
    private static final int KEY_LENGTH = 256;
    private static final String ALGORITHM = "PBKDF2WithHmacSHA256";


	
	//Constructors,no nulls
	public User(String usrname, String passwd,String email)
	{
		if(usrname==null|passwd==null|email==null){
			System.err.println("Cannot insert nulls!");
		}else{
		this.usrname=usrname;
		this.passwd=passwd;
		this.email=email;
		this.isadmin=false;
		}
	}
	//Empty Constructor
	public User() {
		this.usrid = null;//ID handled by DB
		this.usrname = "";
		this.passwd = "";
		this.email = "";
		this.salt = "";
		this.isadmin =false;// Will be set false for security
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

	public String getSalt(){
		return salt;
	}

	public String getEmail(){
		return email;
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

	public void setSalt(String salt){
		this.salt=salt;
	}

	public void setEmail(String email){
		this.email=email;
	}
    
    public void ShowValues()
    {
    	//get the data
    	String[] data= {
    			this.usrname,
    			this.passwd,
				this.email,
				this.salt,
    			String.valueOf(this.isadmin)
    	};
    	//print in series in a for loop
    	for(int i=0;i<data.length;i++) {
    		System.out.println(data[i]);
    	}
    }
	//methods

	public void HashPassword() {
        try {
            SecureRandom random = new SecureRandom();
            byte[] saltBytes = new byte[16];
            random.nextBytes(saltBytes);
            this.salt = Base64.getEncoder().encodeToString(saltBytes);

            PBEKeySpec spec = new PBEKeySpec(this.passwd.toCharArray(), saltBytes, ITERATIONS, KEY_LENGTH);
            SecretKeyFactory factory = SecretKeyFactory.getInstance(ALGORITHM);
            byte[] hashBytes = factory.generateSecret(spec).getEncoded();

            this.passwd = Base64.getEncoder().encodeToString(hashBytes);

        } catch (Exception e) {
            throw new RuntimeException("Error hashing password", e);
        }
    }

	public User CreateUser(String usrname,String passwd,String email){
		User user=new User(usrname,passwd,email);
		user.HashPassword();
		return user;
	}
}
	