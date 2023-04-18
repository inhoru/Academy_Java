package com.jdbc.member.model.dto;

import java.io.Serializable;
import java.sql.Date;
import java.util.Arrays;
import java.util.Objects;

public class MemberDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3712068441092746837L;
	private String memberId;
	private String memberPw;
	private String memberName;
	private char gender;
	private int age;
	private String email;
	private String phone;
	private String address;
	private String [] hobby;
	private Date enrollDate;
	
	public MemberDTO() {
	
	}

	public MemberDTO(String memberId, String memberPw, String memberName, char gender, int age, String email,
			String phone, String address) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(hobby);
		result = prime * result
				+ Objects.hash(address, age, email, enrollDate, gender, memberId, memberName, memberPw, phone);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberDTO other = (MemberDTO) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(email, other.email)
				&& Objects.equals(enrollDate, other.enrollDate) && gender == other.gender
				&& Arrays.equals(hobby, other.hobby) && Objects.equals(memberId, other.memberId)
				&& Objects.equals(memberName, other.memberName) && Objects.equals(memberPw, other.memberPw)
				&& Objects.equals(phone, other.phone);
	}

	@Override
	public String toString() {
		return "MemberDTO [memberId=" + memberId + ", memberPw=" + memberPw + ", memberName=" + memberName + ", gender="
				+ gender + ", age=" + age + ", email=" + email + ", phone=" + phone + ", address=" + address
				+ ", hobby=" + Arrays.toString(hobby) + ", enrollDate=" + enrollDate + "]";
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}