import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

 class askInsert{
	public static void main(String [] a){
		try{
			Class.forName ("com.mysql.cj.jdbc.Driver");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost-999/testdb");

			String query = "INSERT INTO Student(id,name,address) VALUES(?,?,?)";

			PreparedStatement pstmt = conn.prepareStatement(query);
			Scanner sc = new Scanner(System.in);
			String choice = "y";
			while(choice.equalsIgnoreCase("y")){
				System.out.print("ID: ");
				int id =sc.nextInt();
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Address: ");
				String ad =sc.nextLine();

				pstmt.setInt(1,id);
				pstmt.setString(2,name);
				pstmt.setString(3,ad);
				int rowsAffected = pstmt.executeUpdate();

				System.out.println("\nSuccesffullyy inseorted yololo\nRows affected: "+rowsAffected);

				System.out.print("\n\nDo you want to insert more? (y/n)");
				choice = sc.nextLine();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}