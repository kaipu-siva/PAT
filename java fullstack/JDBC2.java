import java.sql.*;
import java.util.*;
class JDBC2 {
	public static void main(String rags[]) throws Exception {
		// the following driver class connects us oracle DB
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pat", "pat");
		
		Statement stmt=con.createStatement();

		ResultSet rs=stmt.executeQuery("select * from register");
		
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");
			System.out.print(rs.getString(4)+" ");
			System.out.print(rs.getString(5)+" ");
			System.out.print(rs.getLong(6)+" ");
			System.out.println(rs.getString(7));
		}
		
	}
}
	
create table task_pk (regid number references register(regid), taskid number);

insert into task_pk values (1, 21);
insert into task_pk values (2, 1);

taskid=select taskid from task_pk where regid=(select regid from register where email='abc@gmail.com');

taskid++;

insert into task values (taskid,  'something', '19-3-2024', 1, (select regid from register where email='abc@gmail.com'));

update task_pk set taskid=taskid where regid=(select regid from register where email='abc@gmail.com');