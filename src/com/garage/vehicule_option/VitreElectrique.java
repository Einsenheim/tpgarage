package com.garage.vehicule_option;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public double prix() {
		return 212.35;
	}
	
	@Override
	public String toString() {
		return "Vitre Electrique " + this.prix() + "€";
	}

}
