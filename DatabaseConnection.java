package EclipseJavaCodes.AdvancedJava;
import java.sql.*;

import java.util.*;

import javax.swing.JOptionPane;
public class DatabaseConnection {
   
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","7261888792");
			java.sql.Statement stmt=connection.createStatement();
			
		    //String rahu="rahul";
		    //String kuch="kuchaikote";
			//String query="insert into Employee1(Eid,Ename,location,age) values(100,'"+rahu+"','"+kuch+"',19)";
			
		    String query="insert into Employee1(Eid,Ename,location,age) values(105,\"anand\",\"bihar\",19)";
			stmt.executeUpdate(query);
			
			
			ResultSet rs=stmt.executeQuery("select* from Employee1;");
			while(rs.next()) {
				int Eid=rs.getInt("Eid");
				String Ename=rs.getString("Ename");
				String location=rs.getString("location");
				int age=rs.getInt("age");
				System.out.println(Eid+" "+Ename+" "+location+" "+age);
			}
			
			stmt.close();
			connection.close();
			System.out.println("Completed successfuly");
			JOptionPane.showMessageDialog(null, "Submit Successfuly");
			
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		

	}

}
