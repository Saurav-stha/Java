import java.io.*;

class readNStore{
	public static void main(String [] args){
		try{
			BufferedReader br = new BufferedReader(new FileReader("text.txt"));
			PrintWriter pw = new PrintWriter("ss.txt");

			String line="";
			while((line=br.readLine())!=null){
				pw.write(line);
			}
			pw.flush();
			pw.close();
			br.close();
		}catch(IOException e){e.printStackTrace();};
	}
}