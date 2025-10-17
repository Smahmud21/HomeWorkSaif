package assignment3JavaVariablesInitialized.copy;

import java.lang.reflect.Method;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe saif = new AboutMe(); // constructor initialized
		saif.myName = "Saif mahmud"; // variables initialized
		saif.myAge = 34;
		saif.myGrade = 3.4f;
		saif.mySex = 'M';
		saif.fullTimeStudent = true;
		saif.myID = 110;

		saif.aboutMe(); // method initialized

		AboutMe alex = new AboutMe(); // constructor initialized
		alex.myName = "Alex"; // variables initialized
		alex.myAge = 45;
		alex.myGrade = 2.5f;
		alex.mySex = 'F';
		alex.fullTimeStudent = false;
		alex.myID = 100;

		alex.aboutMe(); // method initialized

	}

}
