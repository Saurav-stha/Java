

public class sth{
	public static void main(String [] args){
		String arr[]={"ram","shyam","hari","someone"};
		try{
			for (int i=1;i<5;i++){
				System.out.println("selected : "+arr[i]);
			}	
		}catch(Exception e){
			// System.out.println(e);
			e.printStackTrace();
		}
		
	}
}


