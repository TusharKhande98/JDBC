import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P8_FetchTheData 
{
	public static void main(String[] args) throws SQLException 
	{
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "7218719060");		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select * from Engg_1st_year where id=2");
		
		boolean b = rs.next(); // it checks is there any data in next line in resultset
		System.err.println(b);
		
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
		System.out.println(rs.getString(3));

		boolean b1 = rs.next(); // again it checks is there any data in next line in resultset
		System.err.println(b1);		// it gives false, cauz we have only 1 data
	}
}
