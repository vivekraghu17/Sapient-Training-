package com.sapient.day3;

public class Device implements Comparable<Device> {

private int dId;
private String dName;
private double dPrice;

public Device(int dId, String dName, int dPrice)
{
	this.dId=dId;
	this.dName=dName;
	this.dPrice=dPrice;
}

public int hashCode()
{
	return this.dName.charAt(0);
}

/*public boolean equals(Device device)
{
	return this.dId==device.getdId()&&this.dName.equals(device.getdName())&&this.dPrice==device.getdPrice();
}*/

@Override
public String toString() {
	return "Device [dId=" + dId + ", dName=" + dName + ", dPrice=" + dPrice + "]";
}

public int getdId() {
	return dId;
}

public void setdId(int dId) {
	this.dId = dId;
}

public String getdName() {
	return dName;
}

public void setdName(String dName) {
	this.dName = dName;
}

public double getdPrice() {
	return dPrice;
}

public void setdPrice(double dPrice) {
	this.dPrice = dPrice;
}
@Override
public int compareTo(Device d)
{
	return d.getdName().compareTo(this.getdName());
}


}
