import java.util.Scanner;

public class simple{
	public static void main(String [] ar){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any string: ");

		try{
			String str = sc.next();
			System.out.println("You typed the string: "+str);

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}