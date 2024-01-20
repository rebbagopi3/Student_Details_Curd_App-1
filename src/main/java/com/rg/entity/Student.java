package com.rg.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
//@Table(name="STU_DTLS")
public class Student {
	@Id
//	@Column(name="s_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

//	@Column(name="s_name")
	private String name;

//	@Column(name="s_email")
	private String email;

//	@Column(name="s_addharno")
	private Integer aadharno;

//	@Column(name="s_phone")
	private Integer phono;

//	@Column(name="s_address")
	private String address;

//	@Column(name="s_qualification")
	private String qualification;

//	@Column(name="s_pincode")
	private Integer pincode;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAadharno() {
		return aadharno;
	}

	public void setAadharno(Integer aadharno) {
		this.aadharno = aadharno;
	}

	public Integer getPhono() {
		return phono;
	}

	public void setPhono(Integer phono) {
		this.phono = phono;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", aadharno=" + aadharno + ", phono="
				+ phono + ", address=" + address + ", qualification=" + qualification + ", pincode=" + pincode + "]";
	}

}
