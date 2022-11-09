package com.HospitalMS.service;

import java.util.List;

import com.HospitalMS.dto.roomDTO;
import com.HospitalMS.exception.globalException;
import com.HospitalMS.model.room;

public interface roomService {
	
	public room addRoom(roomDTO r1);
	
	public List<room>getRoom();
	
	
	public room updateRoom(roomDTO r1) ;
	
	
	public String deleteRoom(int roomid) throws globalException ;

}
