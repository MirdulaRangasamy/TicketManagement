package com.himanshu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Ticket {
	@Id
	private int tno;
	 private String name;
	 private int age;
	 private String gender;
	 private String nationality;
	 private String mobile;
	 @Column(name="source")
	 private String from;
	 @Column(name="destination")
	 private String to;
	 private String date;
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(int tno, String name, int age, String gender, String nationality, String mobile, String from,
			String to, String date) {
		super();
		this.tno = tno;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.nationality = nationality;
		this.mobile = mobile;
		this.from = from;
		this.to = to;
		this.date = date;
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Ticket [tno=" + tno + ", name=" + name + ", age=" + age + ", gender=" + gender + ", nationality="
				+ nationality + ", mobile=" + mobile + ", from=" + from + ", to=" + to + ", date=" + date + "]";
	}
	 
}
