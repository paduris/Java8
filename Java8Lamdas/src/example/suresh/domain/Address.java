package example.suresh.domain;

import example.suresh.domain.type.AddressType;

public class Address {

	private long addressId;
	private String address;
	private String zipCode;
	private String city;
	private String state;
	private String county;
	private AddressType type;

	public AddressType getType() {
		return type;
	}

	public void setType(AddressType type) {
		this.type = type;
	}

	public Address(long addressId, String address, String zipCode, String city, String state, String county,
			AddressType type) {
		super();
		this.addressId = addressId;
		this.address = address;
		this.zipCode = zipCode;
		this.city = city;
		this.state = state;
		this.county = county;
		this.type = type;
	}

	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

}
