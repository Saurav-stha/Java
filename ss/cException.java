class customException extends Exception{
	public customException(String msg){
		super(msg);
	}
}

public class cException{
	public static void main(String [] a){
		try{
			int age = -10;
			if (age<0){
				throw new customException("Age can be negative?How...");
			}
			System.out.println("Age is : "+age);	
		}
		catch(customException ce){
			System.out.println(ce.getMessage());
		}
	}
}