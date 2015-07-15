
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class JdbcUpdateDemo 
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
			System.out.println("Updating records in the table...");
			String sql = "Update  emp " +
	                  "Set salary=90000 where name ='Bharath'";
	      stmt.execute(sql);
	      
	     
			
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
