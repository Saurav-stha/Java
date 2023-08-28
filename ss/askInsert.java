import java.sql.*;
import java.util.*;

 class askInsert{
	public static void main(String [] a){
		try{
			Class.forName ("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost-999/testdb");

			String query = "INSERT INTO Student(id,name,address) VALUES(?,?,?)";

			PreparedStatement pstmt = conn.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
			boolean choice = true;
			while(choice){
				System.out.print("ID: ");
				int id =sc.nextInt();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Address: ");
				String ad =sc.nextLine();

				pstmt.setInt(1,id);
				pstmt.setString(2,name);
				pstmt.setString(3,ad);
				pstmt.executeUpdate();

				System.out.println("\nSuccesffullyy inseorted yololo");

				System.out.print("\n\nDo you want to insert more? (y/n)");
				String ch = sc.nextLine();
				if (ch.equals("n"))
					choice=false;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}