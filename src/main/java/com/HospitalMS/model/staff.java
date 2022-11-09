package com.HospitalMS.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int staffId;
	public String staffName;
	public String staffPassword;
	public String staffPhone;
	public  String staffEmail;
	public String  staffRole;
	public String staffFee;
	
@ManyToOne
	private room staffRoom;

}
