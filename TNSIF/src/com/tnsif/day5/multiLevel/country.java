package com.tnsif.day5.multiLevel;

public class country {
	
	private String countryName;
	private String capital;
	
	public country() {
		
	}

	public country(String countryName, String capital) {
		super();
		this.countryName = countryName;
		this.capital = capital;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "country [countryName=" + countryName + ", capital=" + capital + "]";
	}
	
	
	
	
}
