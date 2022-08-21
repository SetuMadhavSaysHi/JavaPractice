package String;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		StringBuffer sb2 = new StringBuffer("Hello");
		System.out.println(sb2.capacity());
		
		StringBuffer sb3 = new StringBuffer("Hello");


		System.out.println(sb2==sb3); 	//This is refernce comparision.

		sb2.append(" adgadfaggga");
		System.out.println(sb2);
		System.out.println(sb2==sb3);
		
		
		StringBuilder sbd1 = new StringBuilder();
		System.out.println(sbd1.capacity()); // 16
		
		StringBuilder sbd2 = new StringBuilder("Hello");
		System.out.println(sbd2.capacity()); //21
		
		StringBuilder sbd3 = new StringBuilder("HelloSB");
		
		System.out.println(sbd2==sbd3);// reference comparison-false
		System.out.println(sbd2.equals(sbd3));// reference comparison - false
		
		sb3.reverse();
		System.out.println(sb3);
		
		String str1= new String(sbd3);
		String str2= new String(sb2);
		System.out.println(str1);
		System.out.println(str1.getClass());
		
	}

}
