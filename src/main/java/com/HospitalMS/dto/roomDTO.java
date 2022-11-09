package com.HospitalMS.dto;

import javax.validation.constraints.NotNull;

import com.HospitalMS.model.room;
import com.HospitalMS.model.staff;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class roomDTO {
	
	
	@NotNull(message = "room id cannot be null")
	public int roomId;
	@NotNull(message = "room name cannot be null")
	public String roomName;
	@NotNull(message = "room type cannot be null")
	public String roomType;
	

}
