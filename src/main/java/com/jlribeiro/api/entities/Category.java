package com.jlribeiro.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="category")
@SequenceGenerator(name="category_seq", sequenceName="category_category_id_seq",  initialValue = 1, allocationSize = 5)
public class Category implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = -6037405719490158257L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_seq")
	@Column(name="category_id")
	private Integer categoryId;
	
	@Column(name="name", length = 25, nullable = false)
	private String name;

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category() {		
	}

	public Category(Integer categoryId, String name) {		
		this.categoryId = categoryId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", name=" + name + "]";
	}			
}
