package com.yash.HibDemo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_TABLE")
public class Student {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="STUDENT_ID")
	int stud_id;
	
	@Column(name="STUDENT_NAME")
	String stud_name;
	@Column(name="STUDENT_AGE")
	int stud_age;
	
//	  @Column(name="ADDRESS")
//	    @Embedded
//	    @AttributeOverrides({
//	    @AttributeOverride(name="street", column=@Column(name="HOME_STREET_NAME")),
//	    @AttributeOverride(name="city", column=@Column(name="HOME_CITY_NAME")),
//	    @AttributeOverride(name="state", column=@Column(name="HOME_STATE_NAME")),
//	    @AttributeOverride(name="pincode", column=@Column(name="HOME_PIN_CODE"))})
//	    private Address homeAddress;
//	   
//	    @Embedded
//	    private Address permanentAddress;
	
	@Column(name="ADDRESS")
	
	
	@ElementCollection
	@JoinTable(name="STUDENT_ADDRESS")
	
	private Collection<Address> lisOfAddresses = new ArrayList<Address>();
	
	
	public Collection<Address> getLisOfAddresses() {
		return lisOfAddresses;
	}
	public void setLisOfAddresses(Collection<Address> lisOfAddresses) {
		this.lisOfAddresses = lisOfAddresses;
	}
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public int getStud_age() {
		return stud_age;
	}
	public void setStud_age(int stud_age) {
		this.stud_age = stud_age;
	}
	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_age=" + stud_age
				+ ", lisOfAddresses=" + lisOfAddresses + "]";
	}
	

	
	
	
	
	
}
