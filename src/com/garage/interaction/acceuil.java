package com.garage.interaction;

import java.util.Scanner;

import com.garage.principal.Garage;

public class acceuil {
	
	Scanner sc = new Scanner(System.in);
	protected char reponse = ' ';
	protected char choix = ' ';
	protected Garage garage = new Garage();
	Interaction interaction;
	
	public acceuil() {
		
	
		do {
			
			do {
				System.out.println("***********************************************************\n");
				System.out.println("***             Bienvenue dans le GARAGE                 ***\n");
				System.out.println("***********************************************************\n");
				System.out.println("***********************************************************\n");
				System.out.println("***                 QUE DESIREZ - VOUS                  ***\n");
				System.out.println("***   1 - VERIFIER UN VEHICULE PRESENT DANS LE GARAGE   ***\n");
				System.out.println("***   2 - INSCRIRE UN NOUVEAU VEHICULE DANS LE GARAGE   ***\n");
				System.out.println("***                                                     ***\n");
				System.out.println("***             CHOISISSEZ L'OPTION 1 OU 2              ***\n");
				System.out.println("***********************************************************\n");
				
				try {
					choix = sc.nextLine().charAt(0);
					System.out.println("VOUS AVEZ CHOISIT L'OPTION : " + choix );
				} catch (Exception e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					System.out.println("CHOIX INCONNU, VEUILLEZ CHOISIR L'OPTION 1 OU 2\n");
				}
				
		
				if(choix != '1' && choix != '2')
					System.out.println("CHOIX INCONNU, VEUILLEZ CHOISIR L'OPTION 1 OU 2\n");

			}while (choix != '1' && choix != '2');
			
			if (choix == '1')
					{System.out.println(garage);}
			
			if (choix == '2')
			 interaction = new Interaction ();
				sc.nextLine();
					{System.out.println(interaction);}
			
					
			do {
				sc.nextLine();
				System.out.println("VOULEZ VOUS EFFECTUER UNE AUTRE OPERATION ? (O/N)");
				reponse = sc.nextLine().charAt(0);
			}while(reponse != 'O' && reponse != 'N');
			
		}while(reponse == 'O');
		
	System.out.println("AU REVOIR !\n");
	
}
}

