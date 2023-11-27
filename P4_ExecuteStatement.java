
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement; // use to create statement class

public class P4_ExecuteStatement 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); // 1. register driver by giving path every time in every class file

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "7218719060"); // 2. establish connection between application & database

 		Statement st = conn.createStatement(); // 3. create statement (using Statement class)
 		
 		st.execute("create database CreateDatabaseByJavaCommand"); // 4. Execute statement
 		System.out.println("databse created succesfully\nGo to Mysql & check it there by refreshing");
  		
	}
}