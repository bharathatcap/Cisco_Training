package org.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle extends Workers {
	
private int vehicleno;
private String vehiclename;
public int getVehicleno() {
	return vehicleno;
}
public void setVehicleno(int vehicleno) {
	this.vehicleno = vehicleno;
}
public String getName() {
	return vehiclename;
}
public void setName(String name) {
	this.vehiclename = name;
}

}
