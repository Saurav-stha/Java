import java.sql.*;
import java.awt.*;
import java.util.Scanner;

public class employeeNameSearch{
	public static void main(String [] args){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost-80/pu","root","root");

			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			String sql = "SELECT * FROM Employee where name = ?";

			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,name);

			ResultSet resultSet= pstmt.executeQuery();

			int total=0;
			while(resultSet.next()){
				total++;
			}

			if(total==0)
				System.out.println("no employee with name "+name);
			else
				System.out.println(total+" employees with name "+name);

			resultSet.close();pstmt.close();conn.close();
		}	
		catch(Exception e){
			e.printStackTrace();
		}
	}
}