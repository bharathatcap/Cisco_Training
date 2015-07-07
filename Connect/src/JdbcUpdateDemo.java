
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class JdbcUpdateDemo 
{
	//Connection and statement objects
	static Connection conn;
	static Statement stmt;
	public static void main(String[] args) {
		try {
			//Loading the driver 
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			System.out.println("driver is loaded successfully");
			//Establishing the Connection
			conn=DriverManager.getConnection("jdbc:derby://localhost:1527/jdbcDB;create=true", "user", "abc");
			System.out.println("success");
			//Statement for executing queries 
			stmt=conn.createStatement();
			System.out.println("Updating records in the Registration table...");
			String sql = "UPDATE  Registration " +
	                   "SET age = 30 WHERE id in (100, 101)";
			//executeUpdate is used as we are updating data in the query
	      stmt.executeUpdate(sql);
	     
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
