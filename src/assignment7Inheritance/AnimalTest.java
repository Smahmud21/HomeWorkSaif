package assignment7Inheritance;

import java.awt.image.SinglePixelPackedSampleModel;

import javax.swing.plaf.multi.MultiButtonUI;

public class AnimalTest {

	public static void main(String[] args) {
		Animal a = new Animal();
		a.animalInfo();
		
		Birds b = new Birds();
		b.birdsInfo(); // single inheritance
		b.animalInfo();
		
		BullDog bd = new BullDog(); // multi-level inheritance from bulldog -> dog -> mammal->animal
		bd.bullDogInfo();
		bd.dogInfo();
		bd.mammalInfo();
		bd.animalInfo();

		Cobra c = new Cobra();
		                      // multi level inheritance cobra -> snake -> reptile -> animal
		c.cobraInfo();  
		c.snakeInfo();
		c.reptileInfo();
		c.animalInfo();
		
		Dog d = new Dog(); //multi-level inheritance from dog -> mammal-> animal
		d.dogInfo();  //
		d.mammalInfo();
		d.animalInfo();
		
		Mammal m = new Mammal(); // single inheritance
		m.mammalInfo();
		m.animalInfo();
		
		Reptile r = new Reptile(); // single inheritance
		r.reptileInfo(); 
		r.animalInfo();
		
		Robin rn = new Robin(); //multi-level inheritance from robin -> birds -> animal
		rn.robinInfo();
		rn.birdsInfo();
		rn.animalInfo();
		
		Snake s = new Snake(); // multi-level inheritance
		s.snakeInfo();
		s.reptileInfo();
		s.animalInfo();
		 
		// hierarchical inheritance : animal -> mammal, animal -> reptile, animal -> birds
		
	}

}
