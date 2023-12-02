
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

public class P7_UpdateTheData 
{

	public static void main(String[] args) throws SQLException 
	{
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "7218719060");		
		Statement st = conn.createStatement();
		st.execute("update Engg_1st_year set name = 'Mr. Unknown' where id=1");

		// NOT WORKING IN MYSQL
//		st.execute("delete table students");

		
	}


}
