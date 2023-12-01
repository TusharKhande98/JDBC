
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

public class P5_CreateTable 
{
	public static void main(String[] args) throws SQLException 
	{
		// After JDK-1.4 registering the driver is not mandatory, it will be done internally after loading process(BUT ITS GOOD TO KNOW)
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "7218719060");
																		// here 'college' is a name of our database that we going to use
		Statement st = conn.createStatement();
		
		// once we create an table & again run this file we get error-exception
		// so to avoid that use try catch block
		try
		{
			// before inserting values we need to give a database name to jdbc, so we gave it in after url path
			st.execute("create table Engg_1st_year(id int, name varchar(20), branch varchar(20))");
		}
		catch(SQLSyntaxErrorException synt)
		{
			System.out.println("Same table name error handled");			
		}		
	}
}