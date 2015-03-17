package MainPackage;

public class Staff extends Employee {
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private String title;
	
	Staff jeromeWallace = new Staff();
	
	 @Override
	    public String toString() {
	        return this.getName() + " " + this.getClass();
	    }

}
