import java.io.*;

class readFile{
	public static void main(String [] args){
		try{
			String line="";
			BufferedReader br = new BufferedReader(new FileReader("text.txt"));
			while(( line=br.readLine())!=null){
				System.out.println(line);
			}
			System.out.println("... End");
		}
		catch(Exception e){
			System.out.println("Error: "+e.getMessage());
		}
	}
}