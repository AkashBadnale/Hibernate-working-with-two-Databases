package com.ab.HB_two_DBs;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
    private  int  houseNo;
    private  String  streetName;
    private  String  areaName;
    private int pinCode;
    private  String  villageName;
    private  String   districtName;
    private  String  stateName;
    private String  countryName;
	
    public Address() {
		super();
	}

    public Address(int houseNo, String streetName, String areaName, int pinCode, String villageName,
			String districtName, String stateName, String countryName) {
		super();
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.areaName = areaName;
		this.pinCode = pinCode;
		this.villageName = villageName;
		this.districtName = districtName;
		this.stateName = stateName;
		this.countryName = countryName;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", streetName=" + streetName + ", areaName=" + areaName + ", pinCode="
				+ pinCode + ", villageName=" + villageName + ", districtName=" + districtName + ", stateName="
				+ stateName + ", countryName=" + countryName + "]";
	}
    
}//Address
