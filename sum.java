import java.io.*;

class sum{
	public static void main(String [] args){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int a = Integer.parseInt(br.readLine());
			int b= Integer.parseInt(br.readLine());

			int sum=a+b;
			System.out.println("sum  "+sum);
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
}