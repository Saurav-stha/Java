public class exceptionHandling{
    public static void main(String [] args){
        try{
            int res = divide(1,0);
        }
        catch( ArithmeticException e){
            System.out.println("Result = "+e.getMessage());
        }
        finally{
            System.out.println("Finally block...");
        }
    }
    public static int divide(int num,int den) throws ArithmeticException {
        if (den==0){
            throw new ArithmeticException ("Divided by zero not possible");
        }
        return num/den;
    }
}
    