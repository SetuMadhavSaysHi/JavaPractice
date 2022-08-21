package Exercise1;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number for which you want to find the fibonacci term: ");
		
		int number=scan.nextInt();
		int a=1,b=1;
		int c;
		System.out.print(a+" "+b);
		
		for(int i=1;i<=number;i++) {
			
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
		
	}

}