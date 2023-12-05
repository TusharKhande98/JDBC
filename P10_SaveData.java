import java.sql.*;
import java.util.Scanner;

public class P10_SaveData 
{
	public static void main(String[] args) throws SQLException
	{
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root", "7218719060");
		PreparedStatement ps = conn.prepareStatement("insert into students(id, name, age) values(?,?,?)");
		Scanner s = new Scanner(System.in);

		for (int i = 0; i <5 ; i++) // it will insert 5 values
		{
			System.out.print("Enter Id:- ");
			int id = s.nextInt();
			System.out.print("Enter age:- ");
			int  age = s.nextInt();
			System.out.print("Enter Name:- ");
			String name = s.next();

			ps.setInt(1,id);
			ps.setString(2, name);
			ps.setInt(3, age);

			ps.execute(); // without it data will not be saved
		}
	}
}
