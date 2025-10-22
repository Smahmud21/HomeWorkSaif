package assignment5JavaMethods;

public class FullName {
  
	public String fName;
	public String lName;
	
	public String fullName (String fName, String lName) {
		System.out.println( "Family Member: " + fName + " "+ lName);
		return  fName + " " +lName;
	}
	
	public static void main(String[] args) {
		FullName person = new FullName();
		person.fullName("Saif", "Mahmud");
        person.fullName("ayesha", "rahman");
	}
}
