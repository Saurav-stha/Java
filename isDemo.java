import java.io.*;

public class isDemo{
	public static void main(String [] args){
		String raw = null; int intval=0;
		System.out.println("input an in: " );
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			raw = br.readLine();
			intval = Integer.parseInt(raw);
		}
		
		catch(IOException i){
			System.err.println("unexpected io error: "+i);
		}
		catch(Exception e){
			System.err.println("invalid number: "+raw);
		}
		System.out.println("evaluated number : "+intval);
	}
}