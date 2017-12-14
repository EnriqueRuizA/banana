package com.generation.jwd.p1.beans;

import java.io.Serializable;

public class TaskBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nameTask;
	private String description;
	private String dateStart;
	private String dateFinish;
	private String notes;
	private String responsable;
	private String priority;
	private String urlFile;
	private String status;
	
	public TaskBean() {};
	
	public TaskBean(String nameTask, String description, String dateStart, 
					String dateFinish, String notes, String responsable, 
					String priority, String urlFile, String status) {
		
		this.nameTask = nameTask;
		this.description = description;
		this.dateStart = dateStart;
		this.dateFinish = dateFinish;
		this.notes = notes;
		this.responsable = responsable;
		this.priority = priority;
		this.urlFile = urlFile;
		this.status = status;
	}
	
	public String getNameTask() {
		return nameTask;
	}

	public void setNameTask(String nameTask) {
		this.nameTask = nameTask;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getdateStart() {
		return dateStart;
	}

	public void setdateStart(String dateStart) {
		this.dateStart = dateStart;
	}

	public String getdateFinish() {
		return dateFinish;
	}

	public void setdateFinish(String dateFinish) {
		this.dateFinish = dateFinish;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getPriority() {
		return priority;
	}
	
	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getUrlFile() {
		return urlFile;
	}

	public void setUrlFile(String urlFile) {
		this.urlFile = urlFile;
	}	
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	public boolean validate () {
		return this.nameTask.equals("Task");
	}
}
