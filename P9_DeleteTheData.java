
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P9_DeleteTheData 
{
	public static void main(String[] args) throws SQLException 
	{
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "7218719060");		
		Statement st = conn.createStatement();
		
		st.execute("delete from Engg_1st_year where id = 1");
		System.err.println("Data deleted successfully");
	}
}
