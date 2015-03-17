package MainPackage;

public class Faculty extends Employee {
	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	private String officeHours;
	private String rank;
	
	 @Override
	    public String toString() {
	        return this.getName() + " " + this.getClass();
	    }


}
