package Exercise1;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number till which you want to get the prime numbers: ");
		int number = input.nextInt();
		int temp=0;
		
		for (int i=1; i<=number;i++) {
			
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					temp=temp+1;
				}
			}
			if(temp==0) {
				System.out.print(i+" ");
			}
			else {
				temp=0;
			}

	}

}}
