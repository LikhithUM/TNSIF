package com.tnsif.day5.multiLevel;

public class city extends state{
	
	private String CityName;
	private float Area;
	public city() {
		super();
	}
	public city(String countryName,String capital,String stateName, String language,String cityName, float area) {
		super(countryName,capital,stateName,language);
		CityName = cityName;
		Area = area;
	}
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public float getArea() {
		return Area;
	}
	public void setArea(float area) {
		Area = area;
	}
	@Override
	public String toString() {
		return "city [CityName=" + CityName + ", Area=" + Area + ", StateName=" + getStateName()
				+ ", Language=" + getLanguage() + ", CountryName=" + getCountryName() + ", Capital="
				+ getCapital() + "]";
	}
	
	
	
	
}
