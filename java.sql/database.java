import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

class database{
	/**
	 * @param args
	 */
	public static void main(String [] args){
		try{
			//register JDBC driver
			// Class.forName("com.mysql.cj.jdbc.Driver");
			
			//open jdbc connection
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB","root","");
			System.out.println("Connection created!");
			//create stmt
			Statement stmt = conn.createStatement();
			String sql="";

			//DDL query -- create drop alter 
			//create table
			sql = "CREATE TABLE employee (id INTEGER PRIMARY KEY, name VARCHAR(255) NOT NULL, address VARCHAR(255) NOT NULL)";
			stmt.executeUpdate(sql); //for create n insert
			System.out.println("Table created!!");

			//insert into tables valuessss
			sql = "INSERT INTO employee ('name','address','salary') VALUES(1,'john','malepatan',999999)";
			stmt.executeUpdate(sql);
			sql= "INSERT INTO employee VALUES(2,'wick','ny',100000)";
			stmt.executeUpdate(sql);
			sql="INSERT INTO employee VALUES(3,'dog','avergae',20)";
			int rowAffected = stmt.executeUpdate(sql);
			System.out.println("insertion succes!\nRows affected: "+rowAffected);

			//using prepared statement
			
			String insertUsingPrepStmt = "INSERT INTO employee(id,name,address,salary) VALUES(?,?,?,?)";
			PreparedStatement prepStmt = conn.prepareStatement(insertUsingPrepStmt);
			Scanner scanner = new Scanner(System.in);
			for (int i = 0; i < 3; i++) {
            	System.out.println("Enter id: ");
            	int id = scanner.nextInt();

         	   	System.out.println("Enter name: ");
           		String name = scanner.next();

           		System.out.println("Enter address: ");
            	String address = scanner.next();

            	System.out.println("Enter salary: ");
            	int salary = scanner.nextInt();

            	prepStmt.setInt(1, id);
            	prepStmt.setString(2, name);
            	prepStmt.setString(3, address);
            	prepStmt.setInt(4,salary);
            	prepStmt.executeUpdate();
			}

			String selectQuery = "SELECT * FROM employee WHERE salary > 50000";
			PreparedStatement selectPrep = conn.prepareStatement(selectQuery);
			// selectPrep.setInt(1,50000);
			ResultSet rs = selectPrep.executeQuery();
			while (rs.next()){
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String ad = rs.getString("address");
				System.out.println("Id: "+id+"\nName: "+name+"\nAddress: "+ad);
			}

			
			conn.close();
			System.out.println("Connection closed!!");
		}
		catch(Exception e){
			e.getMessage();
		}
	}
}