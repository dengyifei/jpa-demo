package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.entity.Employee;
import com.example.demo.entity.TelPhone;

@RestController
public class ReadingController {

	
	 @Autowired
	 private ReadingListRepository readingListRepository; 
	 @Autowired
	 private EmployeeRepository employeeRepository;

	 
	 @RequestMapping("/q1")
	 public List<Book> q1(String reader) {
	        List<Book> book = readingListRepository.findByReader(reader);
	        return book;
	 }
	 
	 @RequestMapping("/q2")
	 public Book q2(String reader) {
		 Book bb=  this.readingListRepository.findXxx(reader);
	        return bb;
	 }	 
	 @RequestMapping("/q3")
	 public Employee q3() {
		 Employee em1 = new Employee();
		 em1.setAge(10);
		 em1.setName("小飞2"); 
		 TelPhone t1 = new TelPhone();
		 t1.setColor("red");
		 t1.setTel("13961956443");
		 em1.getTelPhones().add(t1);
		 
		 this.employeeRepository.save(em1);
		
		 return em1;
	 }
	 
	 
	 
	 
	 @RequestMapping("/save")
	 public Book save(String title,String author,String reader,String desctription ) {
		    
		    Book book = this.readingListRepository.save(new Book(null,title,author,reader,desctription));
		    
	        return book;
	 }
	 @RequestMapping("/delete")
	 public Book save(Long id) {
		    
		     Book book = readingListRepository.findOne(id);
		     readingListRepository.delete(book);
	        return book;
	 }	 
	 
}
