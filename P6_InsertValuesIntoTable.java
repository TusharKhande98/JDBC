import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

public class P6_InsertValuesIntoTable 
{
	public static void main(String[] args) throws SQLException 
	{
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "7218719060");		
		Statement st = conn.createStatement();
		
		try
		{
			st.execute("create table Engg_1st_year(id int, name varchar(20), branch varchar(20))");			
		}
		catch(SQLSyntaxErrorException synt)
		{
			System.out.println("Same table name error handled");			
		}

		// 	WE COMMENT IT BEACUSE IT HAS ALREADY ADDED
//		st.execute("insert into Engg_1st_year values(2, 'Pratik Dahikar', 'Computer')");
//		st.execute("insert into Engg_1st_year values(3, 'Anand Gend', 'Mechanical')");
//		st.execute("insert into Engg_1st_year values(4, 'Saurabh Mankar', 'Civil')");
//		st.execute("insert into Engg_1st_year values(5, 'Lucifer Morningstar', 'ExTC')");
//		st.execute("insert into Engg_1st_year values(6, 'Flash Point', 'AI & ML')");		
		
	}
}