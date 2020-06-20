package chp6;

public class Address {
	private String address;//表示地址
	private String zipCode;//表示邮编
	public Address(String address, String zipCode) {
		super();
		this.address = address;
		this.zipCode = zipCode;
	}
	public Address() {
		super();
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
	
}
