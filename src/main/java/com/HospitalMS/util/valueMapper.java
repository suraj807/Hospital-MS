package com.HospitalMS.util;

import com.HospitalMS.dto.roomDTO;
import com.HospitalMS.dto.staffDTO;
import com.HospitalMS.model.room;
import com.HospitalMS.model.staff;

public class valueMapper {
	
	public static staff converttostaff(staffDTO u1) {
		
		staff u2=new staff(u1.getStaffId(),u1.getStaffName(),u1.getStaffPassword(),u1.getStaffPhone(),u1.getStaffEmail(),u1.getStaffRole(),u1.getStaffFee(),u1.getStaffRoom());
		
		
		return u2;
		
	}
	
public static room convertoRoom(roomDTO r1) {
		
		room r2=new room(r1.getRoomId(),r1.getRoomName(),r1.getRoomType());
		return r2;
	}



}
