package Exercise;
import java.util.Scanner;
import java.util.Arrays;
public class Question1 {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array you are giving: ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int arr[]=new int[input];
		
		System.out.println("Enter the elements of the array: "); 
		for(int i=0;i<input;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Array elements are: ");  
		for (int i=0; i<input; i++)   
		{  
		System.out.println(arr[i]);  
		}  
		Arrays.sort(arr);
		System.out.print("Array in sorting order\n");
		for(int i=0;i<input;i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n"+"Second number after sorting an array is: "+arr[1]);
	}}


		

