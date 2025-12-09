package assignment9Abstraction;

import javax.sound.midi.VoiceStatus;

public abstract class MedicalSchool {
	
	public MedicalSchool() {
		System.out.println("yes, abstract class can have a constructor");
	}

	
	public abstract void anatomyLab(); 
	
	public void biochemistryLab() {
		System.out.println("the study of the chemistry of life");
	}
		
	
}
