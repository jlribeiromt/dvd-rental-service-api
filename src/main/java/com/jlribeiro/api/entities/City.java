package com.jlribeiro.api.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="city")
@SequenceGenerator(name= "city_seq", sequenceName="city_city_id_seq",  initialValue = 1, allocationSize = 5)
public class City implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7424845233218276800L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "city_seq")
	@Column(name="city_id")
	private Integer cityId;
	
	@Column(name="city", length = 50,nullable = false)
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade= CascadeType.ALL)
	@JoinColumn(name="country_id")
	private Country country;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "city")
	private Address address;

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public City() {		
	}

	public City(Integer cityId, String name, Country country) {	
		this.cityId = cityId;
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", city=" + name + ", country=" + country + "]";
	}	
}
