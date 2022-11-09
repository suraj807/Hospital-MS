package com.HospitalMS.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.HospitalMS.model.room;
import com.HospitalMS.model.staff;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class staffDTO {

	
	@NotNull(message = "user id cannot be null")
	public int staffId;
	@NotNull(message = "use name cannot be null")
	public String staffName;
	@Pattern(regexp ="[a-zA-Z0-9@#]{6,15}")
	public String staffPassword;
	@Pattern(regexp = "[0-9]{10}")
	public String staffPhone;
	@Email
	public  String staffEmail;
	@NotNull(message = "user roll cannot be null")
	public String  staffRole;
	@Min(1000)
	@Max(6000)
	public String staffFee;
	private room staffRoom;
	
	
	
	
	
	
}
