package com.jlribeiro.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="actor")
@SequenceGenerator(name="actor_actor_id_seq", allocationSize=25)
public class Actor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8277959540299493878L;

	@Id
	@Column(name="actor_id")
	private Integer ActorId;
	
	@Column(name="first_name", nullable = false)
	private String FirstName;
	
	@Column(name="last_name", nullable = false)
	private String LastName;
	
	public Integer getActorId() {
		return ActorId;
	}
	
	public void setActorId(Integer actorId) {
		ActorId = actorId;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	
	public String getLastName() {
		return LastName;
	}
	
	public void setLastName(String lastName) {
		LastName = lastName;
	}
		
	public Actor() {		
	}
	
	public Actor(Integer actorId, String firstName, String lastName) {		
		ActorId = actorId;
		FirstName = firstName;
		LastName = lastName;
	}
	@Override
	public String toString() {
		return "Actor [ActorId=" + ActorId + ", FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
}
