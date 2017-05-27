package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.dao.TelPhoneRepository;
import com.example.demo.entity.Employee;
import com.example.demo.entity.TelPhone;


@RunWith(SpringRunner.class)  
@SpringBootTest(classes = DemoApplication.class) 
public class ZxRepositoryTest {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private TelPhoneRepository telPhoneRepository;
	
	@Test  
    public void testRepository() {  
 
//		 Employee em1 = new Employee();
//		 em1.setObjID("rrrrrrrrrr");
//		 em1.setAge(10);
//		 em1.setName("小飞2"); 
//		 TelPhone t1 = new TelPhone();
//		 t1.setColor("red");
//		 t1.setTel("13961956443");
//		 em1.getTelPhones().add(t1);
//		 
//		 this.employeeRepository.save(em1);
    } 

	
	@Test  
    public void testRepository2() {  
 
		 Employee em1 = new Employee();
		 //em1.setObjID("rrrrrrrrrr");
		 em1.setAge(10);
		 em1.setName("小飞6"); 
		 TelPhone t1 = new TelPhone();
		 t1.setColor("red");
		 t1.setTel("13961956443");
		 em1.getTelPhones().add(t1);
		 t1.setEmployee(em1);
		 this.employeeRepository.save(em1);
		 System.out.println(em1.getObjID());
		 this.telPhoneRepository.save(t1);
		 System.out.println(t1.getObjID());
		 
		 //Employee fe1 = this.employeeRepository.findByObjID("cc99734f-9d33-4ee7-b382-75ea7a18d030");
		 //TelPhone ft1 = this.telPhoneRepository.findByObjID("4d80c868-737f-402f-a3c1-f9eaaee5e4b0");
		 TelPhone ft1 = this.telPhoneRepository.findTelPhone("cc99734f-9d33-4ee7-b382-75ea7a18d030");
		 System.out.println(ft1.getObjID());
		 System.out.println(ft1.getEmployee().getObjID());
		 //System.out.println(f1.getTelPhones().size());
		
		 
    } 
}
