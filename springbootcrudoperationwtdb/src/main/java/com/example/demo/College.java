package com.example.demo;

public class College {
	private int collegeId;
	private String collegeName;
	private String collegecontactNo;
	private String collegeAddress;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(int collegeId, String collegeName, String collegecontactNo, String collegeAddress) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegecontactNo = collegecontactNo;
		this.collegeAddress = collegeAddress;
	}
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegecontactNo() {
		return collegecontactNo;
	}
	public void setCollegecontactNo(String collegecontactNo) {
		this.collegecontactNo = collegecontactNo;
	}
	public String getCollegeAddress() {
		return collegeAddress;
	}
	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	



}
