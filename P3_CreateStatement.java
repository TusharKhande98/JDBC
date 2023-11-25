
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class P3_CreateStatement 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
 		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "7218719060");
 		System.out.println("Establish Connection");
 		System.out.println(conn.getClass()); // it will gives, which type of object is stored inside that reference variable

 		Statement st = conn.createStatement();
 		System.out.println("Statement created successfully");
 		
 		// here we have non-static method inside connection interface's implementing class
 		// we call it by connection's reference variable
 		
	}

}
