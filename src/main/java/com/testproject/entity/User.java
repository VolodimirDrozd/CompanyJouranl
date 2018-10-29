package com.testproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@Column
	private Long id;
	@Column
	private String firstName;
	@Column
	private String sureName;
	// @Column
	// private LocalDate bith;
	// @Column
	// private UserStatus status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSureName() {
		return sureName;
	}

	public void setSureName(String sureName) {
		this.sureName = sureName;
	}

	/*
	 * public LocalDate getBith() { return bith; }
	 * 
	 * public void setBith(LocalDate bith) { this.bith = bith; }
	 * 
	 * public UserStatus getStatus() { return status; }
	 * 
	 * public void setStatus(UserStatus status) { this.status = status; }
	 */

}
