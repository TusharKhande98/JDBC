
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class P14_UpdateDataDyamically 
{

	public static void main(String[] args) throws SQLException
	{
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "7218719060");		
		Scanner s = new Scanner(System.in);

		System.err.print("Enter Id to update the data:- ");
		int id = s.nextInt();
	
		System.err.print("Enter branch name to change it:- ");
		String branch = s.next();
		
		PreparedStatement ps = conn.prepareStatement("update Engg_1st_year set branch=? where id=?");
		
		ps.setString(1, branch);
		ps.setInt(2, id); 
		ps.executeUpdate();
		System.err.println("Data updated succcessfully");
		
	}

}
