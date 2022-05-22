package model.dataccess;
import java.sql.SQLException;
public class ConnectionFactory 
{
	public ConnectionFactory (){}
	public static DataBaseConnection getConnection (String database) throws ClassNotFoundException, SQLException
	{
		//DataBaseConnection myConnection = null;
		if (database == null)
		{
			return null;
		}
		else if (database.equalsIgnoreCase("postgres"))
		{
			
			return new PostgresConnection();
		}
		else if (database.equalsIgnoreCase("mysql"))
		{
			
			return new MySqlConnection();
		}
		return null;
		
		
		
	}
}
