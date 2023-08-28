import java.util.Scanner;

public class separateEvenNOdd{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

        int[] a = new int[10]; // Declare and initialize the array
		for (int i=0;i<10;i++){
			System.out.print("Enter a number: ");
			try{
				a[i]=sc.nextInt();}
			catch(Exception e){
				System.out.println("Enter a valid numberr...");
			}
		}
		System.out.println("Odd Indexed Numbers: ");
		for (int j=0;j<10;j++){
			System.out.print(a[j] + "\t");
			j++;
		}

		System.out.println("\nEven Indexed Numbers: ");
		for (int k=1;k<10;k++){
			System.out.print(a[k]+"\t");
			k++;
		}
	}
}