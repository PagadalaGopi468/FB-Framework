package GenericUtility;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class JDBC_Connection {
@Test
	public void connection() throws Exception {
		
		Driver d=new Driver();
		
		DriverManager.registerDriver(d);
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "root");
		
		Statement state = con.createStatement();
		
		int value=state.executeUpdate("update sys_config set set_by='surya' where variable='diagnostics.allow_i_s_tables'");
		ResultSet q = state.executeQuery("select * from sys_config");
		while(q.next())
		{
			String data=q.getString(1)+" "+q.getString(2)+" "+q.getString(3)+" "+q.getString(4);
		   System.out.println(data);
		   System.out.println("");
		}
		con.close();
	}
}
