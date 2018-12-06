package com.jlribeiro.api.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.jlribeiro.api.enumerators.Rating;

@Entity
@Table(name="film")
@SequenceGenerator(name="film_seq", sequenceName="film_film_id_seq",  initialValue = 1, allocationSize = 5)
public class Film implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5901730354517017760L;
		
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "film_seq")
	@Column(name="film_id")
	private Integer filmId;
	
	@Column(name="title", length = 255, nullable = false)
	private String title;
	
	@Column(name="description", nullable = true)
	private String description;
	
	@Column(name="realease_year", nullable = true)
	private Integer realeaseYear;
	
	@Column(name="rental_duration", nullable = true)
	private short rentalDuration;
	
	@Column(name="rental_rate", nullable = false)
	private double rentalRate;
	
	@Column(name="length", nullable = true)
	private short length;
	
	@Column(name="replacement_cost", nullable = false)
	private double replacementCost;
	
	@Column(name="special_features", nullable = true)
	private String specialFeatures;
	
	@Column(name="full_text", nullable = false)
	private String fullText;
	
	@Enumerated(EnumType.STRING)
	private Rating ranting;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="language_id")
	private Language language;
	
	@ManyToMany(mappedBy = "films")
    private List<Actor> posts = new ArrayList<>(); 
	
	public Integer getFilmId() {
		return filmId;
	}
	
	public void setFilmId(Integer filmId) {
		this.filmId = filmId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Integer getRealeaseYear() {
		return realeaseYear;
	}
	
	public void setRealeaseYear(Integer realeaseYear) {
		this.realeaseYear = realeaseYear;
	}
	
	public short getRentalDuration() {
		return rentalDuration;
	}
	
	public void setRentalDuration(short rentalDuration) {
		this.rentalDuration = rentalDuration;
	}
	
	public double getRentalRate() {
		return rentalRate;
	}
	
	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}
	
	public short getLength() {
		return length;
	}
	
	public void setLength(short length) {
		this.length = length;
	}
	
	public double getReplacementCost() {
		return replacementCost;
	}
	
	public void setReplacementCost(double replacementCost) {
		this.replacementCost = replacementCost;
	}
	
	public String getSpecialFeatures() {
		return specialFeatures;
	}
	
	public void setSpecialFeatures(String specialFeatures) {
		this.specialFeatures = specialFeatures;
	}
	
	public String getFullText() {
		return fullText;
	}
	
	public void setFullText(String fullText) {
		this.fullText = fullText;
	}
	
	public Rating getRanting() {
		return ranting;
	}
	
	public void setRanting(Rating ranting) {
		this.ranting = ranting;
	}
	
	public Language getLanguage() {
		return language;
	}
	
	public void setLanguage(Language language) {
		this.language = language;
	}
	
	public Film() {		
	}
	
	public Film(Integer filmId, 
				String title, 
				String description, 
				Integer realeaseYear, 
				short rentalDuration,
				double rentalRate, 
				short length, 
				double replacementCost, 
				String specialFeatures, 
				String fullText,
				Rating ranting, 
				Language language){		
		this.filmId = filmId;
		this.title = title;
		this.description = description;
		this.realeaseYear = realeaseYear;
		this.rentalDuration = rentalDuration;
		this.rentalRate = rentalRate;
		this.length = length;
		this.replacementCost = replacementCost;
		this.specialFeatures = specialFeatures;
		this.fullText = fullText;
		this.ranting = ranting;
		this.language = language;
	}

	@Override
	public String toString() {
		return "Film [filmId=" + filmId + ", title=" + title + ", description=" + description + ", ranting=" + ranting
				+ "]";
	}
	
	
}
