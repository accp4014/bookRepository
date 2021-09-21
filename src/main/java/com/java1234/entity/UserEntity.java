package com.java1234.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 431776646725993912L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "USERNAME",length=50)
	private String userName;
	
	@Column(name = "PASSWORD",length=50)
	private String password;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
