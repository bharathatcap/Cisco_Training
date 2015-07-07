

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JdbcQueryDemo 
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
			System.out.println("Updating records in the Registration table...");
			String sql = "SELECT id, first, last, age FROM Registration";
		      ResultSet rs = stmt.executeQuery(sql);

		      while(rs.next()){
		         //Retrieve by column name
		         int id  = rs.getInt("id");
		         int age = rs.getInt("age");
		         String first = rs.getString("first");
		         String last = rs.getString("last");

		         //Display values
		         System.out.print("ID: " + id);
		         System.out.print(", Age: " + age);
		         System.out.print(", First: " + first);
		         System.out.println(", Last: " + last);
		      }
		      rs.close();
	     
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}

