import java.sql.*;

public class MySql 
{
	public static Connection getConn()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=null;
			String url="jdbc:mysql://localhost:3306/text";
			String user="root";
			String password="root";
			conn=DriverManager.getConnection(url, user, password);
			return conn;
		}catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
}
