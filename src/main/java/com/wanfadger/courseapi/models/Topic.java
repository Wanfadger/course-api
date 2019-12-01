package com.wanfadger.courseapi.models;

import java.util.UUID;

public class Topic {
	
	private UUID uId;
private int id;
private String name;
private String description;


public Topic() {
	// TODO Auto-generated constructor stub
}

public Topic(int id , String name , String description) {
	this.id = id;
	this.name = name;
	this.description = description;
}


public Topic(UUID id , String name , String description) {
	this.uId = id;
	this.name = name;
	this.description = description;
}



public Topic(String name , String description) {
	this.name = name;
	this.description = description;
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}

public String getDescription() {
	return description;
}


public UUID getuId() {
	return uId;
}


public void setuId(UUID uId) {
	this.uId = uId;
}




}
