package com.jlribeiro.api.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="actor")
@SequenceGenerator(name="actor_seq", sequenceName="actor_actor_id_seq",  initialValue = 1, allocationSize = 5)
public class Actor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8277959540299493878L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "actor_seq")
	@Column(name="actor_id")
	private Integer actorId;
	
	@Column(name="first_name", length = 45,  nullable = false)
	private String firstName;
	
	@Column(name="last_name", length = 45, nullable = false)
	private String lastName;

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "film_actor",
			   joinColumns = @JoinColumn(name = "actor_id"),
			   inverseJoinColumns = @JoinColumn(name = "film_id"))
	private List<Film> films = new ArrayList<>();
	
	public Integer getActorId() {
		return actorId;
	}

	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Actor() {		
	}

	public Actor(Integer actorId, String firstName, String lastName) {		
		this.actorId = actorId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}	
}
