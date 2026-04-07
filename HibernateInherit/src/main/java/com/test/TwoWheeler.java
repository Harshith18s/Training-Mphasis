package com.test;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Two_wheeler")
//@DiscriminatorValue("Bike")
public class TwoWheeler extends Vehicle {
	private String Handle;

	public String getHandle() {
		return Handle;
	}

	public void setHandle(String Handle) {
		this.Handle = Handle;
	}

}
