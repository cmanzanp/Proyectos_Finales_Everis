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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="t_user")
public class EverisUser implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer userId;
	
	private String userName;
	
	private String userSurname;
	
	private int userAge;
	
	//private EverisProject project;
	
	
	private List<EverisTask> tasks =  new ArrayList<>();

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name="user_name", unique=false,nullable=false)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name="user_surname", unique=false,nullable=false)
	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public int getUserAge() {
		return userAge;
	}

	@Column(name="user_age", unique=false,nullable=false)
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

//	@ManyToOne
//	@JoinColumn(name = "project_id")
//	public EverisProject getProject() {
//		return project;
//	}
//
//	public void setProject(EverisProject project) {
//		this.project = project;
//	}
	

	@OneToMany(cascade = CascadeType.ALL, targetEntity=EverisTask.class)
	public List<EverisTask> getTasks() {
		return tasks;
	}

	public void setTasks(List<EverisTask> tasks) {
		this.tasks = tasks;
	}
	
	public void addTask(EverisTask task) {
		this.tasks.add(task);
	}
}
