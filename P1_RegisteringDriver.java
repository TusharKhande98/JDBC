
public class P1_RegisteringDriver 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		// line we passed inside string is a path for JDBC driver
		// here we call 'forName()' a static method, which is present inside a class
		System.out.println("Driver registered successfully");
		
	}

}
