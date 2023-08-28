import java.lang.reflect.*;

public class ReflectDemo{
	public static void main(String [] args){
		try{
			Class c =Class.forName("java.io.InputStreamReader");
			Method methods[]=c.getDeclaredMethods();

			for (int i=0;i<methods.length;i++){
				System.out.println(methods[i].toString());
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
		}
	}
}