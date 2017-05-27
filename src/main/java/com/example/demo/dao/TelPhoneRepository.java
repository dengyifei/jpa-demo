package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.example.demo.entity.TelPhone;

public interface TelPhoneRepository extends JpaRepository<TelPhone, Long>{
	
	
	TelPhone findByObjID(String objid);
	
	@Query(value = "select * from tel_phone t where t.employee_id = ?1",nativeQuery = true)
	TelPhone findTelPhone(String employeeid);
	
	
	

}
