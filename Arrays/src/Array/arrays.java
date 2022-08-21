package Array;

public class arrays {

	public static void main(String[] args) {

		int[] x = new int[5];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		
		System.out.println(x[0]);
		System.out.println(x[2]);
		
		
		String[] strArr = new String[5];
		strArr[0] = "aa";
		strArr[4] = "bb";

		for (String str : strArr) {
			System.out.println(str);
		}
		
		
		
		int[] intArr2 = { 5, 10, 15 };

		int indx = 0;
		while (indx < intArr2.length) {
			// logic
			System.out.print(intArr2[indx]);
			indx++;
		}
		System.out.println();
		System.out.println(intArr2[2]); // 15
		intArr2[1] = 100;
		System.out.println(intArr2[1]);// 100
		
		
		
		char[] arrey = new char[] {'h','e','l'};
		for(char ch:arrey) {
			System.out.println(ch);
		}
		int ix=0;
		while(ix<arrey.length) {
			System.out.println(arrey[ix] + " ");
			ix++;
		}
		
	}
	

}
