package com.sgte.domain;

public class Product {
	
	private String name;
	private String content;
	private String date;
	
	public Product() {
		
	}
	
	public Product(String name,String content,String date) {
		this.name=name;
		this.content=content;
		this.date=date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}
