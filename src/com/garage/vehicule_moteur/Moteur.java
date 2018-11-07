package com.garage.vehicule_moteur;

import java.io.Serializable;

public abstract class Moteur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Declarations of variables
	//**********************************************************************************************
	private TypeMoteur type;
	private String cylindre;
	protected double prix;
	//**********************************************************************************************
	
	//Default constructor
	//**********************************************************************************************
	public Moteur() {
		this.type = null;
		this.cylindre = "Inconnu";
		this.prix = 0.0d;
	
	}
	//**********************************************************************************************
	//constructor with parameter
	
	//**********************************************************************************************
		public Moteur(String pcylindre, double pPrix) {
			cylindre = pcylindre;
			prix = pPrix;
		
		}
	//**********************************************************************************************

	//Getter and Setter
	
	//**********************************************************************************************
		

	public TypeMoteur getTypeMoteur() {
		return type;
	}

	public void setTypeMoteur(TypeMoteur pType) {
		this.type = pType;
	}

	public String getCylindre() {
		return cylindre;
	}

	public void setCylindre(String pCylindre) {
		this.cylindre = pCylindre;
	}
	
	public double getPrix() {
		return prix;
	}

	public void setPrix(double pPrix) {
		this.prix = pPrix;
	}
	//*********************************************************************************************
	
	//toString
	
	//*********************************************************************************************
	public String toString() {
		return this.getTypeMoteur() + " " + this.getCylindre() + " " + this.getPrix() + "€" ;
		
	}
	

}
