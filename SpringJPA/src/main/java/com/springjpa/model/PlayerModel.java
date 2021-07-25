package com.springjpa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROM_PROFILE_MANAGEMENT")
public class PlayerModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "PROFILE_CD")
	private String profileCd;
	@Column(name = "NAME")
	private String name;
	@Column(name = "GENDER")
	private String gender;
	@Column(name = "DOB")
	private Date DOB;
	@Column(name = "TECHNOLOGY")
	private String technology;
	@Column(name = "PRIMARY_SKILLS")
	private String primarySkills;
	@Column(name = "SECONDARY_SKILLS")
	private String secondarySkills;
	@Column(name = "EXP_MONTHS")
	private String expMonths;
	@Column(name = "LOCATION")
	private String location;
	@Column(name = "PH_NUM")
	private String phnum;

	public String getPhnum() {
		return phnum;
	}

	public void setPhnum(String phnum) {
		this.phnum = phnum;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProfileCd() {
		return profileCd;
	}

	public void setProfileCd(String profileCd) {
		this.profileCd = profileCd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDOB() {
		return this.DOB;
	}

	public void setDOB(Date dOB) {
		this.DOB = dOB;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getPrimarySkills() {
		return primarySkills;
	}

	public void setPrimarySkills(String primarySkills) {
		this.primarySkills = primarySkills;
	}

	public String getSecondarySkills() {
		return secondarySkills;
	}

	public void setSecondarySkills(String secondarySkills) {
		this.secondarySkills = secondarySkills;
	}

	public String getExpMonths() {
		return expMonths;
	}

	public void setExpMonths(String expMonths) {
		this.expMonths = expMonths;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	

	@Override
	public String toString() {
		return "PlayerModel [id=" + id + ", profileCd=" + profileCd + ", name=" + name + ", gender=" + gender + ", DOB="
				+ DOB + ", technology=" + technology + ", primarySkills=" + primarySkills + ", secondarySkills="
				+ secondarySkills + ", expMonths=" + expMonths + ", location=" + location + ", phnum=" + phnum + "]";
	}
    
	public PlayerModel(String profileCd, String name, String gender, Date dOB, String technology, String primarySkills,
			String secondarySkills, String expMonths, String location, String phnum) {
		super();
		this.profileCd = profileCd;
		this.name = name;
		this.gender = gender;
		DOB = dOB;
		this.technology = technology;
		this.primarySkills = primarySkills;
		this.secondarySkills = secondarySkills;
		this.expMonths = expMonths;
		this.location = location;
		this.phnum = phnum;
	}

	public PlayerModel() {
		// TODO Auto-generated constructor stub
	}
}
