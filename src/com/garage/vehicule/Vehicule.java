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
	private double prix;
	private String nom;
	private List<Option> options = new ArrayList<Option>();
	private Marque nomMarque ;
	protected static Moteur moteur;
	//*********************************************************************************************
	
	//Default Constructor
	
	//*********************************************************************************************
	public Vehicule() {
		this.prix = 0.0d;
		this.nom = "Inconu";
		this.options = new ArrayList<>(options);
		this.nomMarque = null;
	}
	//**********************************************************************************************
	
	//constructor with parameter
	
	//*********************************************************************************************
	public Vehicule(double pprix, String pnom, Marque pnomMarque, List<Option> pOptions, Moteur pMoteur) {
		this.prix = pprix;
		this.nom = pnom;
		this.options = pOptions;
		this.nomMarque = pnomMarque;
		this.moteur = pMoteur;
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

	public void setPrix(double pprix) {
		this.prix = pprix;
	}

	protected String getNom() {
		return nom;
	}

	public void setNom(String pnom) {
		this.nom = pnom;
	}

	protected List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> poptions) {
		this.options = poptions;
	}

	public Marque getNomMarque() {
		return nomMarque;
	}

	public void setNomMarque(Marque pnomMarque) {
		this.nomMarque = pnomMarque;
	}
	//*********************************************************************************************

	//*********************************************************************************************
	//All setMoteur
	//*********************************************************************************************
	public void setMoteur(MoteurEssence moteurEssence, Moteur moteur) {
		this.moteur = moteur;
		
	}
	public void setMoteur(MoteurElectrique moteurElectrique, Moteur moteur) {
		this.moteur = moteur;
		
	}
	public void setMoteur(MoteurDiesel moteurDiesel, Moteur moteur) {
		this.moteur = moteur;
		
	}
	public void setMoteur(MoteurHybride moteurHybride, Moteur moteur) {
		this.moteur = moteur;
		
		
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
		public double getPrixTotal() {
			
			double prixTotal = 0.0d;
			for (int i = 0; i< this.getOptions().size(); i++)
			{
			
				prixTotal += this.getOptions().get(i).prix();
			}
			{
			
			this.setPrix(this.moteur.getPrix() + prixTotal);
			return getPrix();
			}
			
		}
	//*********************************************************************************************
	//toString
	//*********************************************************************************************
	public String toString() {
		return "Voiture " +this.getNomMarque()+ " : " +this.getNom()
				+" Moteur " +this.getMoteur().toString() + this.getOptions()
				+" Prix total : " + (this.getPrixTotal()) + "€";
	}
						
	
}
