
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class P2_EstablishConnection 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); // URL of JDBC driver
 		System.out.println("Driver registered successfully");
 	
 		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "7218719060");
 		// here we need to give databse--> url, username, password in string format to verify the user to get access of databse
 		System.out.println("Connection established successfully");

 		// DriverManager is a helper method
		
	}
}