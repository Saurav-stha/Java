import java.sql.*;
import java.util.Scanner;

public class dataBase{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/mysql";
			Connection con = DriverManager.getConnection(url,"root","root");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("CREATE DATABASE IF NOT EXIST formdb");
			stmt.executeUpdate("USE fromdb");
			stmt.executeUpdate("CREATE TABLE IF NOT EXIST userinfo ("
				+"id INT PRIMARY KEY, "
				+" name VARCHAR(255),"
				+"address VARCHAR(255),"
				+"age INT)"
			);
			stmt.executeUpdate("INSERT INTO userinfo VALUES( 1, 'Sulav','Rambazar',21)");
			stmt.executeUpdate("INSERT INTO userinfo VALUES(2, 'Nirdesh','malepatan',22)");
			
			Scanner scanner = new Scanner(System.in);
			PreparedStatement prepStmt = con.prepareStatement("INSERT INTO userinfo VALUES(?,?,?,?)");
			System.out.println("ENter how many data you want to insert");
			int num = scanner.nextInt();
			for(int i =0;i<num;i++){
				System.out.println("ENter id");
				int id = scanner.nextInt();
				System.out.println("ENter name");
				String name = scanner.nextLine();
				System.out.println("Enter address");
				String address = scanner.nextLine();
				System.out.println("Enter age");
				int age = scanner.nextInt();
			
				prepStmt.setInt(1,id);
				prepStmt.setString(2,name);
				prepStmt.setString(3,address);
				prepStmt.setInt(4,age);
				
				prepStmt.executeUpdate();
			}
			
			
			String input = "yes";
			while(input.equalsIgnoreCase("yes")){
				System.out.println("ENter id");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.println("ENter name");
				String name = scanner.nextLine();
				System.out.println("Enter address");
				String address = scanner.nextLine();
				System.out.println("Enter age");
				int age = scanner.nextInt();
				scanner.nextLine();
				
				stmt.executeUpdate("INSERT INTO userinfo VALUES("+id+"','"+name+"','"+address+"',"+age+")");
				System.out.println("Do you want to enter more data");
				input = scanner.nextLine();
			}
			ResultSet resultSet = stmt.executeQuery("SELECT name, COUNT(name) AS count FROM userinfo GROUP BY name HAVING count>1");//for searching same name ppl
			while(resultSet.next()){
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name"):
				String address = resultSet.getString("address");
				int age = resultSet.getInt("age");
				System.out.println("Id :"+id+" Name: "+name+ " Address : "+address+ " Age : "+age);
			}
				
			stmt.executeUpdate("UPDATE userinfo SET age = 25 WHERE name = 'Sulav'");
			ResultSet resultSet = stmt.executeQuery("SELECT * FROM userinfo");
			while(resultSet.next()){
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String address = resultSet.getString("address");
				int age = resultSet.getInt("age");
				System.out.println("Id :"+id+" Name: "+name+ " Address : "+address+ " Age : "+age);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}