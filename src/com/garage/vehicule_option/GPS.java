package com.garage.vehicule_option;

import java.io.Serializable;

public class GPS implements Option, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public double prix() {
		return 113.5;
	}

	@Override
	public String toString() {
		return "Climatisation " + this.prix() + "€";
	}
}
