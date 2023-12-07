
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class P13_DeleteDataDyamically 
{
	public static void main(String[] args) throws SQLException
	{
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "7218719060");		
		PreparedStatement ps = conn.prepareStatement("delete from Engg_1st_year where name=?");
		
		Scanner s = new Scanner(System.in);
		System.err.print("Enter name to delete the data:- ");
		String name = s.next();
		
		ps.setString(1, name);
		ps.executeUpdate();
		System.err.println("Data deleted succcessfully");
		
	}
}
