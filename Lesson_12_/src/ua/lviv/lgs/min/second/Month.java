package ua.lviv.lgs.min.second;

public class Month {
	
	private String name;
	private int numberOfDays;
	private Season season;
	
	public Month(String name, int numberOfDays, Season season) {
		super();
		this.name = name;
		this.numberOfDays = numberOfDays;
		this.season = season;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	@Override
	public String toString() {
		return "Month [name=" + name + ", numberOfDays=" + numberOfDays + ", season=" + season + "]";
	}

	
}
