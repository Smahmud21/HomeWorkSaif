package assignment08Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee myInfo = new Employee();
		myInfo.setName("Saif Mahmud");
		myInfo.setAge(34);
		myInfo.setSex('M');
		myInfo.setCitizen(true);
		
		System.out.println("My Name is " + myInfo.getName()+ "\nmy age is " + myInfo.getAge()+ "\nmy gender is "+ myInfo.getSex()+ "\nam i US citizen?" +myInfo.isCitizen());
	}
}
