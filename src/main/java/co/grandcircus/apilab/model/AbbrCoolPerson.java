package co.grandcircus.apilab.model;

public class AbbrCoolPerson {
	
	private String name;
	private String invented;
	private int year;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInvented() {
		return invented;
	}
	public void setInvented(String invented) {
		this.invented = invented;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "AbbrCoolPerson [name=" + name + ", invented=" + invented + ", year=" + year + "]";
	}

}
