package com.cyepro.auth.model;

import java.time.Instant;

import javax.persistence.*;

@Entity(name = "refresh_token")
public class RefreshToken {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@OneToOne
	@JoinColumn(name = "emp_id", referencedColumnName = "emp_id")
	private DMSEmployee dmsEmployee;

	@Column(nullable = false, unique = true)
	private String token;

	@Column(nullable = false)
	private Instant expiryDate;

	public RefreshToken() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public DMSEmployee getDMSEmployee() {
		return dmsEmployee;
	}

	public void setDMSEmployee(DMSEmployee dmsEmployee) {
		this.dmsEmployee = dmsEmployee;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Instant getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Instant expiryDate) {
		this.expiryDate = expiryDate;
	}
}
