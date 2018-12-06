package com.jlribeiro.api.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="language")
@SequenceGenerator(name="language_seq", sequenceName="language_language_id_seq",  initialValue = 1, allocationSize = 5)
public class Language implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1885113480658295192L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "language_seq")
	@Column(name="language_id")
	private Integer languageId;
	
	@Column(name="name", length = 20, nullable = false)
	private String name;

	@OneToMany(mappedBy="language")
	private List<Film> film;
	
	public Integer getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Integer languageId) {
		this.languageId = languageId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Film> getFilm() {
		return film;
	}

	public void setFilm(List<Film> film) {
		this.film = film;
	}

	public Language() {		
	}

	public Language(Integer languageId, String name) {		
		this.languageId = languageId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Language [languageId=" + languageId + ", name=" + name + "]";
	}	
}
