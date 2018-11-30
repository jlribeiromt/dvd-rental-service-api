package com.jlribeiro.api.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="city")
@SequenceGenerator(name="city_city_id_seq", allocationSize=25)
public class City implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7424845233218276800L;
	
	@Id
	@Column(name="city_id")
	private Integer CityId;
	
	@Column(name="city", nullable = false)
	private String City;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade= CascadeType.ALL)
	@JoinColumn(name="country_id")
	private Country country;

	public Integer getCityId() {
		return CityId;
	}

	public void setCityId(Integer cityId) {
		CityId = cityId;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
	public City() {	
	}

	public City(Integer cityId, String city, Country country) {		
		CityId = cityId;
		City = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "City [CityId=" + CityId + ", City=" + City + ", country=" + country + "]";
	}	
}
