import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class JdbcInsertDemo 
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
			System.out.println("Inserting records into the table...");
			String sql = "INSERT INTO emp " +
	                   "VALUES ('Bharath',381,50000)";
	      stmt.execute(sql);
	      sql = "INSERT INTO emp " +
                  "VALUES ('Sharath',382,50005)";
     
	      stmt.execute(sql);
	      
	     
			System.out.println("Values inserted");
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
