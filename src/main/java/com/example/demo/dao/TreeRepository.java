package com.example.demo.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.TreeNode;

public interface TreeRepository extends JpaRepository<TreeNode, Long>{
	
	
//	Tree findByObjID(String objid);
//	
//	@Query(value = "select * from tel_phone t where t.employee_id = ?1",nativeQuery = true)
//	Tree findTelPhone(String employeeid);
	
	TreeNode findById(String id);
	@Query(value = "select * from t_treenode t where t.pid = ?1",nativeQuery = true)
	Set<TreeNode> findByPid(String pid);
}
