
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class P11_InsertDataDyamically 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Scanner s = new Scanner(System.in);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "7218719060");		

		PreparedStatement ps = conn.prepareStatement("insert into Engg_1st_year(id, name, branch)values(?, ?, ?)");
		
		System.err.print("Enter ID:- ");
		int id = s.nextInt();
		
		System.err.print("Enter Name:- ");
		String name = s.next();

		System.err.print("Enter Branch:- ");
		String branch = s.next();

		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, branch); 
		
		ps.execute(); // if we didn't write this, data will not be saved 
		System.err.println("Data inserted");
		
		
	}

}
