package com.everis.taskmanager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_task")
public class EverisTask implements Serializable{

	/** SERIAL ID */
	private static final long serialVersionUID = 1L;
	
	private Integer taskId;
	
	private String taskName;
	
	private String taskDescription;
	
	private int daysToDelivery;
	
	//private EverisUser user;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	@Column(name="task_name", unique=false,nullable=false)
	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@Column(name="task_username", unique=false,nullable=false)
	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	@Column(name="task_daystodelivery", unique=false,nullable=false)
	public int getDaysToDelivery() {
		return daysToDelivery;
	}

	public void setDaysToDelivery(int daysToDelivery) {
		this.daysToDelivery = daysToDelivery;
	}

//	@ManyToOne
//	@JoinColumn(name = "user_id")
//	public EverisUser getUser() {
//		return user;
//	}
//
//	public void setUser(EverisUser user) {
//		this.user = user;
//	}
}
