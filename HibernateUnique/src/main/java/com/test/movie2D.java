package com.test;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
//@Table(name="2D_movie")
//@DiscriminatorValue("2D_MOVIE")
public class movie2D extends Movie {

	private String cast;

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}
	
	
}
