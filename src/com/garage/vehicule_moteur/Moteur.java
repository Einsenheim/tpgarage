package com.garage.vehicule_moteur;

import java.io.Serializable;

public abstract class Moteur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Declarations of variables
	//**********************************************************************************************
	protected TypeMoteur type;
	protected String cylindre;
	protected double prix;
	//**********************************************************************************************
	
	//Default constructor
	//**********************************************************************************************
	public Moteur() {
		type = null;
		cylindre = "";
		prix = 0;
	
	}
	//**********************************************************************************************
	//constructor with parameter
	
	//**********************************************************************************************
		public Moteur(String pcylindre, double pprix) {
			cylindre = pcylindre;
			prix = pprix;
		
		}
	//**********************************************************************************************

	//Getter and Setter
	
	//**********************************************************************************************
		

	protected TypeMoteur getType() {
		return type;
	}

	protected void setType(TypeMoteur type) {
		this.type = type;
	}

	protected String getCylindre() {
		return cylindre;
	}

	protected void setCylindre(String cylindre) {
		this.cylindre = cylindre;
	}
	
	public double getPrix() {
		return prix;
	}

	protected void setPrix(double prix) {
		this.prix = prix;
	}
	//*********************************************************************************************
	
	//toString
	
	//*********************************************************************************************
	public String toString() {
		return this.getType() + " " + this.getCylindre() + " " + this.getPrix() + "€" ;
		
	}
	

}
