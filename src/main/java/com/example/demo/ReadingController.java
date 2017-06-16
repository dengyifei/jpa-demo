package com.example.demo;

import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.dao.TreeRepository;
import com.example.demo.entity.Employee;
import com.example.demo.entity.TelPhone;
import com.example.demo.entity.TreeNode;

@RestController
public class ReadingController {

	
	 @Autowired
	 private ReadingListRepository readingListRepository; 
	 @Autowired
	 private EmployeeRepository employeeRepository;
	 @Autowired
	 private TreeRepository treeRepository;
	 
	 @RequestMapping("/q1")
	 public List<Book> q1(String reader) {
	        List<Book> book = readingListRepository.findByReader(reader);
	        return book;
	 }
	 
	 @RequestMapping("/q2")
	 public Book q2(String reader) {
		 Book bb=  this.readingListRepository.findXxx(reader);
		 if (bb==null){
			 return null;
		 }
	        return bb;
	 }
	 
	 @RequestMapping("/qtree")
	 public TreeNode qtree(HttpServletRequest request, HttpServletResponse response,String id) {
		 response.addHeader("Access-Control-Allow-Origin", "*");
		 TreeNode td = this.treeRepository.findById(id);
		 Set<TreeNode> lt = this.treeRepository.findByPid(id);
		 td.setChildren(lt);
		 return td;
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
	 public Book delete(Long id) {
		    
		     Book book = readingListRepository.findOne(id);
		     readingListRepository.delete(book);
	        return book;
	 }	 
	 
}
