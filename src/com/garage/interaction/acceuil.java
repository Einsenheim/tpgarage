
package com.garage.interaction;

import java.util.Scanner;

import com.garage.principal.Garage;
import com.garage.principal.principal;

public class acceuil extends principal{
	
	Scanner sc = new Scanner(System.in);
	protected char reponse = ' ';
	protected char choix = ' ';
	protected char choiceMark = ' ';
	Garage garage = new Garage();
	public acceuil() {
		super();
	}



	public void acceuil1() {
		
	
		do {
		//****************************************** MENU DE DEMARRAGE **************************************	
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
				} catch (Exception e) {
					//e.printStackTrace();
					System.out.println("CHOIX INCONNU, VEUILLEZ CHOISIR L'OPTION 1 OU 2\n");
				}
				
		
				if(choix != '1' && choix != '2')
					System.out.println("CHOIX INCONNU, VEUILLEZ CHOISIR L'OPTION 1 OU 2\n");

			}while (choix != '1' && choix != '2');
		//******************************************FIN DU MENU *********************************************
		//***************************************************************************************************
		//***************************************APPLICATION DU CHOIX *************************************** 
			if (choix == '1')
					{System.out.println(garage);}
		
			if (choix == '2')
				{
		//****************************************** CHOIX DE LA MARQUE DE LA VOITURE ***********************
				do {
					System.out.println("************************************************************\n");
					System.out.println("*** Bienvenue dans la partie Ajout de Vehicule du GARAGE ***\n");
					System.out.println("************************************************************\n");
					System.out.println("************************************************************\n");
					System.out.println("***             QUEL MARQUE DESIREZ - VOUS               ***\n");
					System.out.println("***                                                      ***\n");
					System.out.println("***                  1 - RENO - LAGUNA                   ***\n");
					System.out.println("***                  2 - PIGEOT - A300B                  ***\n");
					System.out.println("***                  3 - TROEN - D4                      ***\n");
					System.out.println("***                                                      ***\n");
					System.out.println("***           CHOISISSEZ L'OPTION 1 OU 2 OU 3            ***\n");
					System.out.println("************************************************************\n");
					
					try {	
					choiceMark = sc.nextLine().charAt(0);
					} catch (Exception e) {
						System.out.println("CHOIX INCONNU, VEUILLEZ CHOISIR L'OPTION 1 OU 2 OU 3\n");
					}
				}while (choiceMark != '1'&& choiceMark != '2' && choiceMark != '3');
			
		//***************************************************************************************************
		//*************************************************************************************************** 
				if(choiceMark == '1') 
				{
					Reno reno = new Reno();
					System.out.println(reno);
				}
				
				else if (choiceMark == '2')
				{
					Pigeot pigeot = new Pigeot ();
					System.out.println(pigeot);
				}
				
				else  
				{ 
					Troen troen = new Troen();
					System.out.println(troen);	
				}
		//***************************************************************************************************									
			}
					
			do {
				
				sc.nextLine();
				System.out.println("VOULEZ VOUS EFFECTUER UNE AUTRE OPERATION ? (O/N)");
				try {
				reponse = sc.nextLine().charAt(0);
				} catch (Exception e) {
					System.out.println("CHOIX INCONNU,VOULEZ VOUS EFFECTUER UNE AUTRE OPERATION ? (O/N)");
				}	
			}while(reponse != 'O' && reponse != 'N');
			
		}while(reponse == 'O');
		
	System.out.println("AU REVOIR !\n");
	
}

}

