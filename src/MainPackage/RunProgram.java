package MainPackage;

public class RunProgram extends Person {
	public static void main(String[] args){
		
		myDate date1 = new myDate("12", "October", "1974");
		
		Student student1 = new Student("Collin Meese", "365 Mourning Dove Dr, Newark DE 19711", "302-444-4444", "DumbEmail@Gmail.com", "Senior");
		
		Employee emp1 = new Employee("John Meese", "365 Mourning Dove Dr, Newark DE 19711", "302-555-5555", "DumbEmail2@gmail.com", "Wilmington", 125000, date1);
		
		Student student2 = new Student("Frank Meese", "365 Mourning Dove Dr, Newark DE 19711", "302-666-5555", "DumbEmail2@gmail.com", "Freshman");
		
		getPersons();
		
		deletePerson(student1);
		
		getPersons();
		
		
		
	
	}
	
	 

}
