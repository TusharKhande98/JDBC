
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

public class P4_HandleWrongQueryInputError 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "7218719060");
 		Statement st = conn.createStatement();
 		
 		try
 		{
 			st.execute("create data javadatabse"); // we inout wrong query here			
 		}
 		catch(SQLSyntaxErrorException c)
 		{
 			System.out.println("Its not a valid query format please write it again");
 		}			
	}
}