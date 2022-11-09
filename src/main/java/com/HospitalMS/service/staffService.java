package com.HospitalMS.service;

import java.util.List;

import com.HospitalMS.dto.staffDTO;
import com.HospitalMS.exception.globalException;
import com.HospitalMS.model.staff;

public interface staffService {
	
	public staff addstaff(staffDTO u1) ;
	public List<staff> getstaff();
	public staff updatestaff(staffDTO u1);
	public String deletestaff(int staffid) throws globalException;
	public String updatePhone(int staffid,String phone)throws globalException;
	public String allotRoom(int staffid,int roomid)throws globalException;
	public String updateFee(int staffid,int stafffee)throws globalException;
	
	

	
	
	
	
}
