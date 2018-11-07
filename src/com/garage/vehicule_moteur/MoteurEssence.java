package com.garage.vehicule_moteur;

public class MoteurEssence extends Moteur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MoteurEssence(String pCylindre, double pPrix) {
		super(pCylindre, pPrix);
		this.setTypeMoteur(TypeMoteur.ESSENCE);
	}

}
