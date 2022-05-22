package model.business;
import java.sql.SQLException;

import model.dataccess.LoginDataAccess;
import model.entities.MessageException;

// LoginBusiness that will conduct all business rules of the project, including 
// field validation and user authentication by using the LoginDataAccess class. 
public class LoginBusiness 
{	
	private String userName;
	private String password;
	private static LoginBusiness instance;
	
	
	private LoginBusiness ()
	{
		
	}
	public void setUserName(String username)
	{
		this.userName = username;
	}
	public void setPassword (String password)
	{
		this.password = password;
	}

	public boolean verifyCredentials () throws ClassNotFoundException, SQLException
	{
		
		if (userName.equals("")) {
			throw new MessageException("Username not informed.");
		} else if (password.equals("")) {
			throw new MessageException("Password not informed.");
		} 
	
		
		LoginDataAccess loginDataAccess = LoginDataAccess.getInstance();
		if (!(loginDataAccess.verifyCredentials())) {
			throw new MessageException("Incorrect credentials.");
		}
		return true;
	}


	public static LoginBusiness getInstance()
	{
		if (instance == null)
		{
			instance = new LoginBusiness();
		}
		return instance;
		
	}
	

	
}
