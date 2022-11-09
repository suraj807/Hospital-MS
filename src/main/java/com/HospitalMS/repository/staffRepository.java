package com.HospitalMS.repository;

import com.HospitalMS.model.staff;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface staffRepository  extends JpaRepository<staff,Integer >{
	
	
//	@Query("select *from user where user_id=?1")
	//staff findByStaffId(int staffid);
	
	@Query(value="select * from user where staff_id=?1",nativeQuery=true)
	staff findBystaffId(int staffid);

	@Query(value="select * from user where staff_name=?1",nativeQuery=true)
	staff findBystaffName(String staffname);

	//staff findByStaffId(int staffid);

}
