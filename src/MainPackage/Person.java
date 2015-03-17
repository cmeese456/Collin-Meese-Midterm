package MainPackage;

public class Person {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String name;
	private String address;
	private String phoneNumber;
	private String email;
	private int id;
	private static int numberOfPersons = 0;
	
	public Person(){
		
		id = numberOfPersons++;
		
	}
	
	public Person(String name, String address, String phoneNumber, String email){
		name = this.name;
		address = this.address;
		phoneNumber = this.phoneNumber;
		email = this.email;
		
		id = numberOfPersons++;
		
	}
	
	public Person(String name, String address, String phoneNumber, String email, String classStatus){
		name = this.name;
		address = this.address;
		phoneNumber = this.phoneNumber;
		email = this.email;
		
		id = numberOfPersons++;
		
	}
	
	 @Override
	    public String toString() {
	        return this.getName() + " " + this.getClass();
	    }

	 
	 public static void getPersons() {
		 System.out.println(numberOfPersons);
	 }
	 
	 public static void deletePerson(Person aPerson) {
		 numberOfPersons--;
		 aPerson = null;
	 }

}
