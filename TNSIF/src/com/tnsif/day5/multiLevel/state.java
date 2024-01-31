package com.tnsif.day5.multiLevel;

public class state extends country{
	
	private String StateName;
	private String Language;
	
	public state() {
		super();
	}
	public state(String countryName,String capital,String stateName, String language) {
		super(countryName,capital);
		StateName = stateName;
		Language = language;
	}
	public String getStateName() {
		return StateName;
	}
	public void setStateName(String stateName) {
		StateName = stateName;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	@Override
	public String toString() {
		return "state [StateName=" + StateName + ", Language=" + Language + ", getCountryName()=" + getCountryName()
				+ ", getCapital()=" + getCapital() + "]";
	}
	
	
	
}
	
	
	