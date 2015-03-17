package MainPackage;

public class Student extends Person {
	private String classStatus;
	
	Student(String name, String address, String phoneNumber, String email, final String classStatus){
		
		
	}
	
	
	 @Override
	    public String toString() {
	        return this.getName() + " " + this.getClass();
	    }


}
