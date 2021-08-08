package com.example.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.dao.EmployeeRepository;
import com.example.demo.dao.TelPhoneRepository;
import com.example.demo.dao.TreeRepository;
import com.example.demo.entity.Employee;
import com.example.demo.entity.TelPhone;
import com.example.demo.entity.TreeNode;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;



@RunWith(SpringRunner.class)  
@SpringBootTest(classes = DemoApplication.class) 
public class ZxRepositoryTest {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private TelPhoneRepository telPhoneRepository;
	 @Autowired
	 private TreeRepository treeRepository;
	 
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
	@Test
	public void testTreeRepository(){
		
//		this.treeRepository.deleteAll();
//		TreeNode top = new TreeNode("顶级节点",false,false,true);
//		TreeNode t1 = new TreeNode("部门0-1",false,false,true);
//		t1.setParent(top);
//		TreeNode t2 = new TreeNode("部门0-2",false,false,true);
//		t2.setParent(top);
//		TreeNode t3 = new TreeNode("部门0-3",false,false,true);
//		t3.setParent(top);
//		top.getChildren().add(t1);
//		top.getChildren().add(t2);
//		top.getChildren().add(t3);
//		this.treeRepository.save(top);
		
		TreeNode tr = new TreeNode("测试部门",1,true,false,true);
		TreeNode top = this.treeRepository.findById("402881055caed5c2015caed5c9fe0000");
		tr.setParent(top);
		this.treeRepository.save(tr);
		
//		TreeNode top = new TreeNode("顶级部门节点",0,true,false,true);
//		this.treeRepository.save(top);
//		String dept0[] = new String[]{"苏州市公安局"};
//		TreeNode tsz = new TreeNode(dept0[0],1,true,false,true); //苏州市公安局 
//		tsz.setParent(top);
//		this.treeRepository.save(tsz);
//		
//		String users0[] = new String[]{"尹保松 ","石巍 ","卢军 ","马波 ","谢婷婷 ","王冬生 ","吴晓伟 ","蒋浩 ","钱津津 ","徐宝 ","周小俊 ","仲小波 ","吴舒华 ","周黎 ","王晓辉 ","陈浩峰"};
//		
//		for(int i=0;i<users0.length;i++){
//			TreeNode u = new TreeNode(users0[i],2,true,false,false); //苏州市公安局下人员
//			u.setParent(tsz);
//			this.treeRepository.save(u);
//		}
//		
//		String users1[] = new String[]{"胡月 ","大生 ","大伟 ","大振 ","施华 ","庄魏 ","唯琦 ","汤仁"};
//		String dept2[] = new String[]{"科技信息化处处长室 ","科信处处长室 ","政秘科 ","网络保障科 ","查询科 ","无线科 ","网络安全管理科 ","推广指导科 ","信息中心 ","科技项目管理科 ","技术防范办公室"};
//		String users2[] = new String[]{"吴大奖","沈颖","杨梦煜","徐清"};
//		String dept3[] = new String[]{"处长室 ","政治部主任室 ","人事处 ","教育训练处 ","综合处 ","组织处 ","辅管处 ","离退休干部处"};
//		
//		String dept1[] = new String[]{"科技信息化处 ","局长室","纪委","办公室","政治部"};
//		for(int i=0;i<dept1.length;i++){
//			TreeNode d = null;
//			if(i==0){
//				d = new TreeNode(dept1[i],1,true,false,true);
//				d.setParent(tsz);
//				for(int j=0;j<dept2.length;j++){
//					
//					if(j==2){
//						TreeNode t = new TreeNode(dept2[j],1,true,false,true);
//						t.setParent(d);						
//						for(int k=0;k<users2.length;k++){
//							TreeNode m = new TreeNode(users2[k],2,true,false,true);
//							m.setParent(t);
//							t.getChildren().add(m);
//						}
//						d.getChildren().add(t);
//					}else{
//						TreeNode m = new TreeNode(dept2[j],1,true,false,false);
//						m.setParent(d);
//						d.getChildren().add(m);
//					}
//					
//					
//					
//				}
//				
//                for(int j=0;j<users1.length;j++){
//                	TreeNode m = new TreeNode(users1[j],2,true,false,false);
//                	m.setParent(d);
//                	d.getChildren().add(m);
//                }				
//                this.treeRepository.save(d);
//			}else if(i==4){
//				
//				d = new TreeNode(dept1[i],1,true,false,true);
//				d.setParent(tsz);
//				for(int j=0;j<dept3.length;j++){
//					TreeNode m = new TreeNode(dept3[j],1,true,false,false);
//					m.setParent(d);
//					d.getChildren().add(m);
//				}
//				this.treeRepository.save(d);
//			}else{
//				TreeNode m = new TreeNode(dept1[i],1,true,false,false);
//				m.setParent(tsz);
//				this.treeRepository.save(m);
//			}
//			
//		}
//		
//
//		String tags[] =  new String[]{"辅警","民警","职工","警卫","退休人员"};
//		TreeNode tag1 = new TreeNode("我的标签",3,false,false,true);
//		TreeNode tag2 = new TreeNode("你的标签",3,false,false,true);
//		tag1.setParent(top);
//		tag2.setParent(top);
//		for(int i=0;i<tags.length;i++){
//			TreeNode m = new TreeNode(tags[i],3,true,false,false);
//			m.setParent(tag1);
//			tag1.getChildren().add(m);
//		}
//		this.treeRepository.save(tag1);
//		this.treeRepository.save(tag2);
//		
//		
//		
//		
//		List<TreeNode> bb= this.treeRepository.findByPid("402881055cab3e53015cab3e5b270000");
//		ObjectMapper mapper = new ObjectMapper();
//		try {
//			String bb1 = mapper.writeValueAsString(bb);
//			System.out.println(bb1);
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
	}
	
}
