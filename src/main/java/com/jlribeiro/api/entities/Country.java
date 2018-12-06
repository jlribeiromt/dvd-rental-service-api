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
@Table(name="country")
@SequenceGenerator(name = "country_seq", sequenceName="country_country_id_seq",  initialValue = 1, allocationSize = 5)
public class Country implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4303577098033991240L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_seq")
	@Column(name="country_id")
	private Integer countryId;
	
	@Column(name="country", length = 50, nullable = false)
	private String name;
	
	@OneToMany(mappedBy="country")
	private List<City> city;

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCity() {
		return city;
	}

	public void setCity(List<City> city) {
		this.city = city;
	}

	public Country() {		
	}

	public Country(Integer countryId, String name, List<City> city) {		
		this.countryId = countryId;
		this.name = name;		
	}
}
