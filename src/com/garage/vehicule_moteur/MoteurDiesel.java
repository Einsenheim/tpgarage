package com.garage.vehicule_moteur;

public class MoteurDiesel extends Moteur{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MoteurDiesel(String pCylindre, double pPrix) {
		super(pCylindre, pPrix);
		this.setTypeMoteur(TypeMoteur.DIESEL);
		
	}

}
