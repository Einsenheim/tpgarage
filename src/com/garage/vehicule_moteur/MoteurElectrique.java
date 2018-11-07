package com.garage.vehicule_moteur;

public class MoteurElectrique extends Moteur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MoteurElectrique(String pCylindre, double pPrix) {
			super(pCylindre, pPrix);
			this.setTypeMoteur(TypeMoteur.ELECTRIQUE);
			
		
	}

}
