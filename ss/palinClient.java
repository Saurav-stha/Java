import java.net.*;
import java.util.*;
import java.io.*;
public class palinClient{
	public static void main(String [] arg){
		try{
			Socket sock = new Socket("localhost",90);

			Scanner scann = new Scanner(sock.getInputStream());
			PrintWriter out = new PrintWriter(sock.getOutputStream(),true);

			Scanner scanner = new Scanner(System.in);
			System.out.println("INput a string... ");
			String strin = scanner.nextLine();

			out.println(strin);
			String result = scann.nextLine();
			System.out.println(result);

			out.close();
			scann.close();
			sock.close();

		}
		catch(Exception e){ e.printStackTrace();}
	}
}