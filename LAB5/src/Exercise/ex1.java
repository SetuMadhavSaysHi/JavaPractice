package Exercise;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) throws myException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
			if(age>=15) {
				System.out.println("valid age");
			}
			else {
				throw new myException("age should be above 15");
			}

		
	}

}
