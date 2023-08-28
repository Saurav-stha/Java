import java.io.*;

public class fileWriterExample{
	public static void main(String [] args){
		try {
			String fname="text.txt";
			FileWriter fw = new FileWriter(fname);
			fw.write("this is it just these 16lines of code");
			// fw.write("\nThis is another line of code/stmt");
			fw.write("\nthis is another one");
			fw.write("\sand another one");
			System.out.println("Done writing...");
			// fw.flush();
			fw.close();

			BufferedReader fr = new BufferedReader(new FileReader(fname));
			String line="";
			while ( ( line=fr.readLine()) != null){
				System.out.println(line);
			}
			fr.close();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}