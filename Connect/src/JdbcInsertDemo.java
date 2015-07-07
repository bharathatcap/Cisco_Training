import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class JdbcInsertDemo 
{
	static Connection conn;
	static Statement stmt;
	public static void main(String[] args) {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			System.out.println("driver is loaded successfully");
			conn=DriverManager.getConnection("jdbc:derby://localhost:1527/jdbcDB;create=true", "user", "abc");
			System.out.println("success");
			stmt=conn.createStatement();
			System.out.println("Inserting records into the table...");
			String sql = "INSERT INTO Registration " +
	                   "VALUES (100, 'Zara', 'Ali', 18)";
	      stmt.executeUpdate(sql);
	      sql = "INSERT INTO Employee " +
	                   "VALUES (101, 'Saloni', 'Fatma', 25)";
	      stmt.executeUpdate(sql);
	      sql = "INSERT INTO Registration " +
	                   "VALUES (102, 'Salman', 'Khan', 30)";
	      stmt.executeUpdate(sql);
	      sql = "INSERT INTO Registration " +
	                   "VALUES(103, 'Sumit', 'Mittal', 28)";
	      stmt.executeUpdate(sql);
	     
			System.out.println("Values inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
