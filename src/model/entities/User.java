package model.entities;

public class User {
	
	private String userName;
	private static User instance;
	private String password;
	
	public User () {};
	
	public User (String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public static User getInstance ()
	{
		if (instance == null)
		{
			instance = new User ();
		}
		return instance;
		
	}
	
}
