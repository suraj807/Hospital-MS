package com.HospitalMS.serviceImpl;

import java.util.List;

import com.HospitalMS.dto.staffDTO;
import com.HospitalMS.exception.globalException;
import com.HospitalMS.model.staff;
import com.HospitalMS.repository.staffRepository;
import com.HospitalMS.service.staffService;
import com.HospitalMS.util.valueMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class staffServiceImpl implements staffService {
	
	@Autowired
	private staffRepository staffrepo;
	
	
//	@Autowired
  //  private valueMapper map;
	
	//adding user to db
	//public staff addstaff(staffDTO u1) {
		//staff u2=map.converttostaff(u1);
	//	return staffrepo.save(u2);
		
	//}
	
	//adding user to db
		public staff addUser(staffDTO u1) {
			staff u2=valueMapper.converttostaff(u1);
			return staffrepo.save(u2);
		}
	
	
	//retrive users from db
	public List<staff> getstaff(){
		return staffrepo.findAll();
	}
	
	// update user
	public staff updatestaff(staffDTO u1) {
		staff u2=valueMapper.converttostaff(u1);
		return staffrepo.save(u2);
		
	}
	
	
	
	///
	public  String deletestaff(int staffid) throws globalException {
		staff u2=staffrepo.findBystaffId(staffid);
		if(u2!=null) {
			staffrepo.deleteById(null);
			return"deleted";
		}
		else {
			throw new globalException("staff not found");
		}
	}


	@Override
	public String updatePhone(int staffid, String phone) throws globalException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String allotRoom(int staffid, int roomid) throws globalException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String updateFee(int staffid, int stafffee) throws globalException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public staff addstaff(staffDTO u1) {
		// TODO Auto-generated method stub
		return null;
	}


	


	
	
	

}
