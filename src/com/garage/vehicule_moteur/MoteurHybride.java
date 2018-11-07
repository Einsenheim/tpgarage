package com.garage.vehicule_moteur;

public class MoteurHybride extends Moteur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MoteurHybride(String pCylindre, double pPrix) {
		super(pCylindre, pPrix);
		this.setTypeMoteur(TypeMoteur.HYBRIDE);
	}

	

}
