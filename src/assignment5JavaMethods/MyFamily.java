package assignment5JavaMethods;

public class MyFamily {

	
	public int child1Age = 12;
	public int child2Age = 9;
	public int child3Age = 6;
	public int child4Age = 3;
	
	public int myFamily () {
		System.out.println("The sum of my children age is: "  + child1Age + child2Age + child3Age + child4Age);
		return child1Age + child2Age + child3Age + child4Age;
	}
	
	public static void main(String[] args) {
		MyFamily myFam = new MyFamily();
		myFam.myFamily();
	}
}
