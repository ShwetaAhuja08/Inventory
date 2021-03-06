package com.cg.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This is an entity class for login with getters, setters, and constructors
 * 
 * @author Usha Nanga
 *
 */
@Entity(name = "login")
public class Login {

	@Id
	@Column(name = "user_id")
	private String userId;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "email_id", nullable = false)
	private String emailId;

	@Column(name = "contact_number", nullable = false)
	private String contactNumber;

	@Column(name = "type", nullable = false)
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getcontactNumber() {
		return contactNumber;
	}

	public void setcontactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Login() {
	}

	public Login(String userId, String password, String emailId, String contactNumber) {
		super();
		this.userId = userId;
		this.password = password;
		this.emailId = emailId;
		this.contactNumber = contactNumber;
	}
}
