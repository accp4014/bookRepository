package com.java1234.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "db_boot")
public class BookEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4448496100969385316L;

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "name",length=100)
	private String name;
	
	@Column(name = "author",length=50)
	private String author;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}
