package com.jlribeiro.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="category")
@SequenceGenerator(name="category_category_id_seq", allocationSize=25)
public class Category implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = -6037405719490158257L;

	@Id
	@Column(name="category_id")
	private Integer CategoryId;
	
	@Column(name="name", nullable = false)
	private String Name;
		
	public Integer getCategoryId() {
		return CategoryId;
	}
	
	public void setCategoryId(Integer categoryId) {
		CategoryId = categoryId;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public Category() {		
	}
		
	public Category(Integer categoryId, String name) {		
		CategoryId = categoryId;
		Name = name;
	}
	
	@Override
	public String toString() {
		return "Category [CategoryId=" + CategoryId + ", Name=" + Name + "]";
	}
}
