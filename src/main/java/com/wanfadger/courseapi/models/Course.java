package com.wanfadger.courseapi.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Course {
	
@Id()
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String name;
private String description;

//@Column(name = "topic_id" , nullable = false)
@ManyToOne
private Topic topic;


public Course() {
	// TODO Auto-generated constructor stub
}

public Course(int id , String name , String description) {
	this.id = id;
	this.name = name;
	this.description = description;
}



public Course(String name , String description) {
	this.name = name;
	this.description = description;
}

public Course(long courseId) {
this.id = courseId;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Topic getTopic() {
	return topic;
}

public void setTopic(Topic topic) {
	this.topic = topic;
}






}
