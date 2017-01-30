package istic.sir.tp3;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.*;

@Entity
public class Article {
	@Id
	ObjectId id;
	String name;
	int stars;
	
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
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	
	@Override
	public String toString() {
		return "Article [name=" + name + ", stars=" + stars + "]";
	}
	
}
