package com.jlribeiro.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="language")
@SequenceGenerator(name="language_language_id_seq", allocationSize=25)
public class Language implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1885113480658295192L;

	@Id
	@Column(name="language_id")
	private Integer LamguageId;
	
	@Column(name="name", nullable = false)
	private String Name;
		
	public Integer getLamguageId() {
		return LamguageId;
	}
	
	public void setLamguageId(Integer lamguageId) {
		LamguageId = lamguageId;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
		
	public Language() {		
	}
	
	public Language(Integer lamguageId, String name) {		
		LamguageId = lamguageId;
		Name = name;
	}
	
	@Override
	public String toString() {
		return "Language [LamguageId=" + LamguageId + ", Name=" + Name + "]";
	}	
}
