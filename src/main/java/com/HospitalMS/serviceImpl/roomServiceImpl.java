package com.HospitalMS.serviceImpl;

import java.util.List;

import com.HospitalMS.dto.roomDTO;
import com.HospitalMS.exception.globalException;
import com.HospitalMS.model.room;
import com.HospitalMS.repository.roomRepository;
import com.HospitalMS.service.roomService;
import com.HospitalMS.util.valueMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class roomServiceImpl implements roomService {
	
	@Autowired
	private roomRepository roomrepo;
	
	public room addRoom(roomDTO r1) {
		
		room r2=valueMapper.convertoRoom(r1);
		return roomrepo.save(r2);
		
	}
	
	public List<room> getRoom(){
		return roomrepo.findAll();
	}
	
	
	public room updateRoom(roomDTO r1) {
		
		room r2=valueMapper.convertoRoom(r1);
		return roomrepo.save(r2);	
	}
	
	public String deleteRoom(int roomid) throws globalException {
		room r2=roomrepo.findByRoomId(roomid);
		if(r2!=null) {
			roomrepo.deleteById(roomid);
			return "deleted";
		}
		else {
			throw new globalException("Room Notfound");
		}
	}

}
