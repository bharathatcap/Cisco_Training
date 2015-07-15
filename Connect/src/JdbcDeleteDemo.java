
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class JdbcDeleteDemo 
{
	static Connection conn;
	static Statement stmt;
	public static void main(String[] args) {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			System.out.println("driver is loaded successfully");
			conn=DriverManager.getConnection("jdbc:derby:D:\\Users\\bkumar4\\MyDB;create=true");
			System.out.println("success");
			stmt=conn.createStatement();
			System.out.println("Deleting records from the table...");
			String sql = "delete from thugss " +
	                   "where name='bharath'";
	      stmt.executeUpdate(sql);
	      
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
