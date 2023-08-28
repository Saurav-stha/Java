import java.net.*;
import java.util.Scanner;
import java.io.*;

class server{
	
	public static void main(String [] args) throws IOException{
		ServerSocket s= new ServerSocket(80);// create server socket
											//can throw IOException

		Socket clientSocket = s.accept();// accept client socket connection (handshake complete)

		//create ip n op handler
		Scanner ins = new Scanner(clientSocket.getInputStream());
		PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);

		//receive msg from user
		int numb = ins.nextInt();

		//calculate factorial and result back to client
		out.println(fact(numb));

		// String string = ins.nextLine();

		// String string_edited = "Born Ready!!";

		// out.println(string+string_edited);

		//close all connections
		out.close();
		ins.close();
		clientSocket.close();
		s.close();

	}
	static int fact(int n){ // declared static cause main is static and static can only call static
		if(n==0) 
			return 1;
		else
			return n*fact(n-1);
	}
}