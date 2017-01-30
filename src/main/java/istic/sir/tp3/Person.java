package istic.sir.tp3;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.*;

@Entity
public class Person {
	@Id
	ObjectId id;
	String name;
	
	Address address;
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address.toString() + "]";
	}
	
}
