import java.net.*;
import java.util.Scanner;
import java.io.*;

class client{
	public static void main(String [] args) throws IOException{
		Socket socket = new Socket("localhost",80);

		Scanner sc = new Scanner(socket.getInputStream());
		PrintWriter outs = new PrintWriter(socket.getOutputStream(),true);

		outs.println(3);
		
		int a = sc.nextInt();

		System.out.println("Sent Number: "+3);

		System.out.println("FActOrial: "+ a);

		outs.close();
		sc.close();
		socket.close();

	}
}