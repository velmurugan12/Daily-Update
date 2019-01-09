package Mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Crudoperation {
	public static void main(String args[]) throws SQLException {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydatabase", "root",
					"vaticancameious");

			Statement statement = con.createStatement();
			
			ResultSet resultset = statement.executeQuery("select * from employee");

			while (resultset.next()) {
				System.out.println(resultset.getInt(1) + "  " + resultset.getString(2));
			}
			Statement statement1 = con.createStatement();
			statement.executeUpdate("INSERT INTO employee(empid,empname)VALUES('23','vel');");
			ResultSet resultset1 = statement1.executeQuery("select * from employee");
			
			System.out.println("");
			while (resultset1.next()) {
			
				System.out.println(resultset1.getInt(1) + "  " + resultset1.getString(2));
			}
			statement.execute("UPDATE employee SET empname='tim' WHERE empid=23");
			Statement statement2 = con.createStatement();
			
            ResultSet resultset2 = statement2.executeQuery("select * from employee");
			
        	System.out.println("");
			while (resultset2.next()) {
				
				System.out.println(resultset2.getInt(1) + "  " + resultset2.getString(2));
			}
			
			statement.execute("DELETE FROM employee WHERE empid='23'");
			
            Statement statement3 = con.createStatement();
			
            ResultSet resultset3 = statement3.executeQuery("select * from employee");
			
        	System.out.println("");
			while (resultset3.next()) {
			
				System.out.println(resultset3.getInt(1) + "  " + resultset3.getString(2));
			}
			
			

		} catch (Exception e) {
			System.out.println(e);
		}
		finally
		{
			Connection con = null ;
			con.close();
		}

	}
}
