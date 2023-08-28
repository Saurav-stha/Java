import java.net.*;
import java.util.Scanner;
import java.io.*;

class client{
	public static void main(String [] args) throws IOException{
		Socket socket = new Socket("localhost",80);

		Scanner sc = new Scanner(socket.getInputStream());
		PrintWriter outs = new PrintWriter(socket.getOutputStream(),true);

		Scanner scanner = new Scanner(System.in);

		//-----------Working Codee----------///
		System.out.println("Enter a number to get a FActOrialof : ");
		int num = scanner.nextInt();
		outs.println(num);
		int a = sc.nextInt();

		System.out.println("Sent Number: "+num);

		System.out.println("FActOrial: "+ a);

		// String str = "Are you readdy??";
		// outs.println(str);

		// String str_edited = sc.nextLine();

		// System.out.println("Sent: "+str);

		// System.out.println("Received: "+ str_edited);


		//close all conn
		outs.close();
		sc.close();
		socket.close();

	}
}