import java.util.Scanner; 

class store{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[10];
		for (int i=0;i<10;i++){
			System.out.println("Enter an element: ");
			arr[i]=sc.nextInt();
		}
		int n=0, m=0;
		for(int i=0;i<10;i++){
			if(arr[i]%2==0){
				n++;//for size of even array
			}else{
				m++;//for size of odd array
			}
		}
		int evena[]=new int[n];
		int odda[]=new int[m];
		int k=0,l=0;
		for (int i = 0 ;i<10;i++){
			if (arr[i]%2==0){
				evena[k]=arr[i];
				k++;
			}else{
				odda[l]=arr[i];
				l++;
			}
		}
		System.out.println("\n\nEven elements are: ");
		for (int i = 0 ;i<n;i++){

			System.out.println(evena[i]+"\t");
		}
	}
}