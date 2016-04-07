package com.my.shop.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "title")
	private String title;
	@Column(name = "dollar")
	private int dollar;
	@Column(name = "cent")
	private int cent;
	@ManyToOne(cascade = CascadeType.ALL)
	private Category category;
	
	public Item() {	}

	public Item(long id, String name, String title, int dollar, int cent, Category category) {
		this.id = id;
		this.name = name;
		this.title = title;
		this.dollar = dollar;
		this.cent = cent;
		this.category = category;
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
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getDollar() {
		return dollar;
	}

	public void setDollar(int dollar) {
		this.dollar = dollar;
	}

	public int getCent() {
		return cent;
	}

	public void setCent(int cent) {
		this.cent = cent;
	}

	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Item {\nid : " + id + ", \nname=" + name + 
				", \ntitle : " + title + ", \nprice : " + dollar + '.' + cent + 
				", \ncategory : " + category + "\n}";
	}
	
}
