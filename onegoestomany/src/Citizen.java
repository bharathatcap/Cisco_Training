
import java.util.Collection;
import java.util.LinkedList;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Citizen {
private String name;
@Id
private int age;
@ManyToOne
private List<Vehicle> vehicle=new LinkedList<Vehicle>();
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public List<Vehicle> getVehicle() {
	return vehicle;
}
public void setVehicle(List<Vehicle> vehicle) {
	this.vehicle = vehicle;
}




}
