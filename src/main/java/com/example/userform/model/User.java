package com.example.userform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String city;
    private int age;
    private String mobileNumber;
    
    private String hobby;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

    // Getters and setters
//    public Long getId() { return id; }
//    public void setId(Long id) { this.id = id; }
//    public String getUsername() { return username; }
//    public void setUsername(String username) { this.username = username; }
//    public String getCity() { return city; }
//    public void setCity(String city) { this.city = city; }
//    public int getAge() { return age; }
//    public void setAge(int age) { this.age = age; }
//    public String getMobileNumber() { return mobileNumber; }
//    public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }
    
    
}
