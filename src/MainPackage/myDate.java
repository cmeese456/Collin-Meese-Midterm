package MainPackage;

public class myDate {
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	private String day;
	private String month;
	private String year;
	private String dateFormat;
	
	myDate(String day, String month, String year){
		
		this.dateFormat = this.month + " " + this.day + ", " + this.year;
	}

	
	
}
