package Exercise;
import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(isPositiveString(str));

	}

	private static boolean isPositiveString(String str) {
		// TODO Auto-generated method stub
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)>str.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}

}
