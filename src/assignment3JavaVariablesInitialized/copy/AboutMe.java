package assignment3JavaVariablesInitialized.copy;

public class AboutMe {

	

	public String myName; // variables declared 
	public int myAge;
	public float myGrade;
	public char mySex;
	public boolean fullTimeStudent;
	public byte myID;
	public long bankBal;
	public short myHouseNo;
	
	public AboutMe() { // constructor declared
		System.out.println(": -------------> This is all about Myself <-------------:");

	}

	public void aboutMe() { // aboutMe method implemented
		System.out.println("\tMy name is " + myName + "\nMy age is "+ myAge + ", \nMy grade is " + myGrade + ", \nMy sex is : " + mySex + "\nAm i full time: " + fullTimeStudent + "\nMy student ID#:" + myID);


	}

}
