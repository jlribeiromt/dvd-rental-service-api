package com.jlribeiro.api.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="country")
@SequenceGenerator(name="country_country_id_seq", allocationSize=25)
public class Country implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4303577098033991240L;

	@Id
	@Column(name="country_id")
	private Integer CountryId;
	
	@Column(name="country", nullable = false)
	private String Country;
	
	@OneToMany(mappedBy="country")
	private List<City> city;

	public Integer getCountryId() {
		return CountryId;
	}

	public void setCountryId(Integer countryId) {
		CountryId = countryId;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public List<City> getCity() {
		return city;
	}

	public void setCity(List<City> city) {
		this.city = city;
	}

	public Country() {		
	}

	public Country(Integer countryId, String country, List<City> city) {		
		CountryId = countryId;
		Country = country;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Country [CountryId=" + CountryId + ", Country=" + Country + "]";
	}			
}
