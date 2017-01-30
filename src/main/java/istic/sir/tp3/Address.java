package istic.sir.tp3;

import com.google.code.morphia.annotations.Embedded;

@Embedded	
public class Address {
	String street;
	String city;
	String postCode;
	String country;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", postCode=" + postCode + ", country=" + country + "]";
	}
	
}
