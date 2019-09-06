package test1.AddressBooknew.com.bridgeit.model;

public class Address {
	private String streetName;
	private String buildingname;
	private String state;
	private String city;
	private String Roomnumber;

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getBuildingname() {
		return buildingname;
	}

	public void setBuildingname(String buildingname) {
		this.buildingname = buildingname;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRoomnumber() {
		return Roomnumber;
	}

	public void setRoomnumber(String roomnumber) {
		Roomnumber = roomnumber;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", buildingname=" + buildingname + ", state=" + state + ", city="
				+ city + ", Roomnumber=" + Roomnumber + "]";
	}

}
