package com.everis.taskmanager.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_project")
public class EverisProject implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer projectId;
	
	private String projectName;
	
	private String projectDescription;
	
	private List<EverisUser> users =  new ArrayList<>();

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	@Column(name="project_name", unique=false,nullable=false)
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	@Column(name="project_description", unique=false,nullable=false)
	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	@OneToMany(cascade = CascadeType.ALL, targetEntity = EverisUser.class)
	public List<EverisUser> getUsers() {
		return users;
	}

	public void setUsers(List<EverisUser> users) {
		this.users = users;
	}
	
	public void addUser(EverisUser user) {
		this.users.add(user);
	}
}
