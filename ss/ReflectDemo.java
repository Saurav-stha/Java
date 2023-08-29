import java.lang.reflect.*;

public class ReflectDemo{
	public static void main(String [] args){
		try{
			Class c =Class.forName("java.io.InputtreamReader");
			Method methods[]=c.getDeclaredMethods();

			// for (int i=0;i<methods.length;i++){
			// 	System.out.println(methods[i].toString());
			// }
			for(Method meth: methods){
				System.out.println(meth);
			}
		}
		catch(Exception e){
			// e.printStackTrace();
			System.out.println(e);
		}
	}
}