package pkg1;

//ORDER AND STRUCTURE OF THE CODE
//pkg statement
//import statements
//class declaration
//variables/fields
//constructors
//methods
//comments can be given anywhere


public class Student {
	
			//variables
	int rollNo;
	public String name;
	private static int contactNo = 31;
	private static String collegeName = "Hili8 college";
	
	
			//constructors
	public Student(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}
			
			
			//methods
	public void m1() {
		//code 
		int x=10;
		System.out.println(x);
		System.out.println(contactNo);
		System.out.println(collegeName);
	}
			

	public static void main(String[] args) {
		System.out.println("hi frendz.!!");
		System.out.println("Hello".indexOf('l'));
		Student s1 = new Student(55,"Jimbambe1");
		System.out.println(s1.rollNo);
		System.out.println(collegeName);
		s1.m1();
		
		//System.out.println(Student(34,"Jimbambe"));
	}

}
