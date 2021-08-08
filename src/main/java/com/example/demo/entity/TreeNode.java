package com.example.demo.entity;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;


import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


@Entity
@Table(name="t_treenode")
@JsonInclude(value=Include.NON_NULL)
public class TreeNode {
	@Id
	@GenericGenerator(name="idGenerator", strategy="uuid") //这个是hibernate的注解/生成32位UUID
    @GeneratedValue(generator="idGenerator")
	private String id;
	private String name;
	private Boolean haschk;
	private Boolean checked;
	private Boolean haschid;
	private int datatype;

	
	@ManyToOne
	@JoinColumn(name = "pid")
	@JsonIgnore
	private TreeNode parent;
	

	@Transient 
	private Set<TreeNode> children = null;
	
	
	public TreeNode() {
		super();
	}


	public TreeNode(String name,int datatype,Boolean haschk, Boolean checked, Boolean haschid) {
		super();
		this.name = name;
		this.haschk = haschk;
		this.checked = checked;
		this.haschid = haschid;
		this.datatype = datatype;
	}





	public int getDatatype() {
		return datatype;
	}





	public void setDatatype(int datatype) {
		this.datatype = datatype;
	}





	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Boolean getHaschk() {
		return haschk;
	}


	public void setHaschk(Boolean haschk) {
		this.haschk = haschk;
	}


	public Boolean getChecked() {
		return checked;
	}


	public void setChecked(Boolean checked) {
		this.checked = checked;
	}


	public Boolean getHaschid() {
		return haschid;
	}


	public void setHaschid(Boolean haschid) {
		this.haschid = haschid;
	}


	public TreeNode getParent() {
		return parent;
	}


	public void setParent(TreeNode parent) {
		this.parent = parent;
	}


	public Set<TreeNode> getChildren() {
		return children;
	}


	public void setChildren(Set<TreeNode> children) {
		this.children = children;
	}
	
	public String getPid(){
		if(this.parent==null){
			return "";
		}
		return this.parent.getId();
	}
	
	

	
}
