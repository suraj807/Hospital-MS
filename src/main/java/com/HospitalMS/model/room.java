package com.HospitalMS.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class room {
	
	
	@Id
	public int roomId;
	public String roomName;
	public String roomType;
	

}
