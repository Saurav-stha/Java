import java.io.*;

public class createAbc{
	public static void main(String [] args){
		try(FileWriter fw = new FileWriter("abc.txt")){
			fw.write("Test on File Handling");
			fw.flush();
			fw.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}