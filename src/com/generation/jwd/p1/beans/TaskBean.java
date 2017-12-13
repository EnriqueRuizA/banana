package com.generation.jwd.p1.beans;

public class TaskBean {
	
	String nameTask;
	String description;
	String dateStart;
	String dateFinish;
	String notes;
	String responsable;
	String priority;
	String urlFile;
	
	TaskBean(){
		
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

	public void setFechaInicio(String dateStart) {
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
}