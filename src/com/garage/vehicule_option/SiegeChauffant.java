package com.garage.vehicule_option;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public double prix() {
		
		return 562.9;
	}
	
	@Override
	public String toString() {
		return "Siege chauffant " + this.prix() + "€";
	}

}
