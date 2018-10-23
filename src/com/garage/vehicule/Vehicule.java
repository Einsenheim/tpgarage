package com.garage.vehicule;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.garage.vehicule_moteur.Moteur;
import com.garage.vehicule_moteur.MoteurDiesel;
import com.garage.vehicule_moteur.MoteurElectrique;
import com.garage.vehicule_moteur.MoteurEssence;
import com.garage.vehicule_moteur.MoteurHybride;
import com.garage.vehicule_option.Option;

public class Vehicule implements Serializable {
	
	// declarations of variable
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//**********************************************************************************************
	protected double prix;
	protected String nom;
	List<Option> options;
	Marque nomMarque;
	protected Moteur moteur;
	//*********************************************************************************************
	
	//Default Constructor
	
	//*********************************************************************************************
	public Vehicule() {
		prix = 0;
		nom = "";
		options = new ArrayList<Option>();
		nomMarque = null;
	}
	//**********************************************************************************************
	
	//constructor with parameter
	
	//*********************************************************************************************
	public Vehicule(double pprix, String pnom, Marque pnomMarque, List<Option> pOptions) {
		prix = pprix;
		nom = pnom;
		options = pOptions;
		nomMarque = pnomMarque;
	}
	//**********************************************************************************************

	//Getter and setter
	
	//***********************************************************************************************
	
	protected Moteur getMoteur() {
		return moteur;
	}

	public void setMoteur(Moteur moteur) {
		this.moteur = moteur;
	}
	
	protected double getPrix() {
		return prix;
	}

	protected void setPrix(double prix) {
		this.prix = prix;
	}

	protected String getNom() {
		return nom;
	}

	protected void setNom(String nom) {
		this.nom = nom;
	}

	protected List<Option> getOptions() {
		return options;
	}

	protected void setOptions(List<Option> options) {
		this.options = options;
	}

	protected Marque getNomMarque() {
		return nomMarque;
	}

	protected void setNomMarque(Marque nomMarque) {
		this.nomMarque = nomMarque;
	}
	//*********************************************************************************************

	//*********************************************************************************************
	//All setMoteur
	//*********************************************************************************************
	protected void setMoteur(MoteurEssence moteurEssence) {
		// TODO Auto-generated method stub
		
	}
	protected void setMoteur(MoteurElectrique moteurElectrique) {
		// TODO Auto-generated method stub
		
	}
	protected void setMoteur(MoteurDiesel moteurDiesel) {
		// TODO Auto-generated method stub
		
	}
	protected void setMoteur(MoteurHybride moteurHybride) {
		// TODO Auto-generated method stub
		
	}
	
	//*********************************************************************************************
	//All addOption
	//*********************************************************************************************
	public void addOption(Option opt) {
		this.options.add(opt);
	}
	//*********************************************************************************************
	//Total Price
	//*********************************************************************************************
		protected double getPrixTotal(double prixTotal, int i) {
			for (i = 0; i< this.getOptions().size(); i++)
			{prixTotal += this.getOptions().get(i).getPrix();}
			this.setPrix(this.moteur.getPrix() + prixTotal);
			return getPrix();
			
		}
	//*********************************************************************************************
	//toString
	//*********************************************************************************************
	public String toString() {
		return "Voiture " +this.getNomMarque()+ " : " +this.getNom()
				+" Moteur " +this.getMoteur().toString() + this.getOptions()
				+" Prix total : " + this.getPrixTotal(prix, 0);
	}
	

	
	
}
