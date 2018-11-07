package com.garage.vehicule_option;

import java.io.Serializable;

public class BarreDeToit implements Option, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public double prix() {
		return 29.9;
	}
	
	@Override
	public String toString() {
		return "Barre de toit " + this.prix() + "€";
	}

}
