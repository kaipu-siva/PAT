import java.sql.*;
import java.util.*;
class JDBC1 {
	public static void main(String rags[]) throws Exception {
		// the following driver class connects us oracle DB
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pat", "pat");
		
		Statement stmt=con.createStatement();

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter FirstName");
		String fname=sc.next();
		System.out.println("Enter LastName");
		String lname=sc.next();
		System.out.println("Enter Email");
		String email=sc.next();
		System.out.println("Enter Pass");
		String pass=sc.next();
		System.out.println("Enter Mobile");
		long mobile=sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Address");
		String address=sc.next();
		
		// pk generation
		int regid=0;
		ResultSet rs=stmt.executeQuery("select max(regid) from register");
		if(rs.next()) {
			regid=rs.getInt(1);
		}
		regid++;
		
		PreparedStatement pstmt=con.prepareStatement("INSERT INTO register VALUES (?,?,?,?,?,?,?)");
		
		pstmt.setInt(1, regid);
		pstmt.setString(2, fname);
		pstmt.setString(3, lname);
		pstmt.setString(4, email);
		pstmt.setString(5, pass);
		pstmt.setLong(6, mobile);
		pstmt.setString(7, address);
		int i=pstmt.executeUpdate();
		if(i==1)
			System.out.println("Record inserted");
		pstmt.close(); rs.close(); stmt.close(); con.close();
	}
}