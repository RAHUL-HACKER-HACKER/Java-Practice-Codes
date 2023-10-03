package EclipseJavaCodes.AdvancedJava;
import java.sql.*;;
public class Connectivity1 {

	public static void main(String[] args) throws Exception {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		String conn_string="jdbc:mysql://localhost:3306/Student?"+"user=root&password=7261888792";
		//Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","7261888792");
		conn=DriverManager.getConnection(conn_string);
		stmt=conn.createStatement();
		
		//statement"stmt" for update in sql;
		//stmt.executeUpdate("insert into Employee1(Eid,Ename,location,age) values(104,\"Anand\",\"Abcde\",25)");
		//ResultSet use for fetch data
		rs=stmt.executeQuery("select* from Employee1;");
		while(rs.next()) {
			int Eid=rs.getInt("Eid");
			String Ename=rs.getString("Ename");
			String location=rs.getString("location");
			int age=rs.getInt("age");
			System.out.println(Eid+" "+Ename+" "+location+" "+age);
		}
		System.out.println("Executed Successfuly");                                      
		rs.close();
		stmt.close();
		conn.close();
	}

}
