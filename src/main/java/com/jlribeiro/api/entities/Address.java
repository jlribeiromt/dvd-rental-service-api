package com.jlribeiro.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="address")
@SequenceGenerator(name="address_address_id_seq", initialValue = 1, allocationSize = 5)
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6668796928795714140L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "actor_seq")
	@Column(name="adress_id")
	private Integer adressId;
	
	@Column(name="address", length = 50,  nullable = false)
	private String addressMain;
	
	@Column(name="address2", length = 50,  nullable = false)
	private String addressSecondary;
	
	@Column(name="district", length = 20,  nullable = false)
	private String district;
	
	@Column(name="district", length = 10,  nullable = true)
	private String postalCode;
	
	@Column(name="district", length = 20,  nullable = false)
	private String phone;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "city_id", nullable = false)
	private City city;

	public Integer getAdressId() {
		return adressId;
	}

	public void setAdressId(Integer adressId) {
		this.adressId = adressId;
	}

	public String getAddressMain() {
		return addressMain;
	}

	public void setAddressMain(String addressMain) {
		this.addressMain = addressMain;
	}

	public String getAddressSecondary() {
		return addressSecondary;
	}

	public void setAddressSecondary(String addressSecondary) {
		this.addressSecondary = addressSecondary;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Address() {		
	}

	public Address(Integer adressId, 
				   String addressMain, 
				   String addressSecondary, 
				   String district, 
				   String postalCode,
				   String phone, 
				   City city) {		
		this.adressId = adressId;
		this.addressMain = addressMain;
		this.addressSecondary = addressSecondary;
		this.district = district;
		this.postalCode = postalCode;
		this.phone = phone;
		this.city = city;
	}
	
	
	
}
