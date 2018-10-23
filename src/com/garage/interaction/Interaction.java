package com.garage.interaction;
import java.util.Scanner;

public class Interaction {
	Scanner sc = new Scanner(System.in);
	char choiceMark;
	char choiceTypeMoteur;
	char choiceOption;
	char reponse;
	
	public Interaction (){
	
	do {
	//**********************************************************************************************************************************
	//****************************************** CHOIX DE LA MARQUE DE LA VOITURE ******************************************************
		do {
			System.out.println("************************************************************\n");
			System.out.println("*** Bienvenue dans la partie Ajout de Vehicule du GARAGE ***\n");
			System.out.println("************************************************************\n");
			System.out.println("************************************************************\n");
			System.out.println("***             QUEL MARQUE DESIREZ - VOUS               ***\n");
			System.out.println("***                                                      ***\n");
			System.out.println("***                  1 - RENO - LAG                      ***\n");
			System.out.println("***                  2 - PIGEOT - A300B                  ***\n");
			System.out.println("***                  3 - TROEN - D4                      ***\n");
			System.out.println("***                                                      ***\n");
			System.out.println("***           CHOISISSEZ L'OPTION 1 OU 2 OU 3            ***\n");
			System.out.println("************************************************************\n");
		
			choiceMark = sc.nextLine().charAt(0);
			System.out.println("VOUS AVEZ CHOISIT L'OPTION : " + choiceMark );

			if(choiceMark != '1'&& choiceMark != '2' && choiceMark != '3')
				System.out.println("CHOIX INCONNU, VEUILLEZ CHOISIR L'OPTION 1 OU 2 OU 3\n");

		}while (choiceMark != '1'&& choiceMark != '2' && choiceMark != '3');
	
	//*********************************************************************************************************************************
	//****************************************** CHOIX DE DU TYPE DE MOTEUR ******************************************************
		sc.nextLine();
		if (choiceMark == '1')
			{
			
				System.out.println("VOUS AVEZ CHOISIT UNE RENO - LAG \n");
				System.out.println("************************************************************\n");
				System.out.println("***    SECTION RENO - LAG - TYPE DE MOTEUR DU GARAGE     ***\n");
				System.out.println("************************************************************\n");
				System.out.println("************************************************************\n");
				System.out.println("***         QUEL TYPE DE MOTEUR DESIREZ - VOUS           ***\n");
				System.out.println("***                                                      ***\n");
				System.out.println("***                  1 - ESSENCE   1                      ***\n");
				System.out.println("***                  2 - DIESEL     1                     ***\n");
				System.out.println("***                  3 - ELECTRIQUE  1                    ***\n");
				System.out.println("***                  4 - HYBRIDE      1                   ***\n");
				System.out.println("***                                                      ***\n");
				System.out.println("***        CHOISISSEZ L'OPTION 1 OU 2 OU 3 OU 4          ***\n");
				System.out.println("************************************************************\n");
				choiceTypeMoteur = sc.nextLine().charAt(0);
				
				switch (choiceTypeMoteur)
				{
					case '1':
						System.out.println("VOUS AVEZ CHOISIT UN MOTEUR ESSENCE ");
						break;
					
					case '2':
						System.out.println("VOUS AVEZ CHOISIT UN MOTEUR DIESEL ");
						break;
					
					case '3':
						System.out.println("VOUS AVEZ CHOISIT UN MOTEUR ELECTRIQUE ");
						break;
					
					case '4':
						System.out.println("VOUS AVEZ CHOISIT UN MOTEUR HYBRIDE ");
						break;
					default:
						System.out.println("VOUS AVEZ CHOISIT L'OPTION : " + choiceTypeMoteur );
				}
				sc.nextLine();
				
	//*************************************** CHOIX DES OPTIONS **************************************************************************

				System.out.println("************************************************************\n");
				System.out.println("***        SECTION RENO - LAG - OPTION DU GARAGE         ***\n");
				System.out.println("************************************************************\n");
				System.out.println("************************************************************\n");
				System.out.println("***          QUEL TYPE D'OPTION DESIREZ - VOUS           ***\n");
				System.out.println("***                                                      ***\n");
				System.out.println("***                  1 - AUCUNE                          ***\n");
				System.out.println("***                  2 - GPS                             ***\n");
				System.out.println("***                  3 - VITRE ELECTRIQUE                ***\n");
				System.out.println("***                  4 - CLIMATISATION                   ***\n");
				System.out.println("***                  5 - SIEGE CHAUFFANT                 ***\n");
				System.out.println("***                  6 - BARRE DE TOIT                   ***\n");
				System.out.println("***                                                      ***\n");
				System.out.println("*** CHOISISSEZ L'OPTION 1 OU 2 OU 3 OU 4 OU 5 OU 6       ***\n");
				System.out.println("************************************************************\n");
				choiceOption = sc.nextLine().charAt(0);
				
				switch (choiceOption)
				{
					case '1':
						System.out.println("VOUS AVEZ CHOISIT AUCUNE OPTION ");
						break;
					
					case '2':
						System.out.println("VOUS AVEZ CHOISIT L'OPTION GPS ");
						break;
					
					case '3':
						System.out.println("VOUS AVEZ CHOISIT L'OPTION VITRE ELECTRIQUE ");
						break;
					
					case '4':
						System.out.println("VOUS AVEZ CHOISIT L'OPTION CLIMATISATION ");
						break;
					
					case '5':
						System.out.println("VOUS AVEZ CHOISIT L'OPTION SIEGE CHAUFFANT ");
						break;
						
					case '6':
						System.out.println("VOUS AVEZ CHOISIT L'OPTION BARRE DE TOIT ");
						break;
					default:
						System.out.println("VOUS AVEZ CHOISIT L'OPTION : " + choiceOption );
				}
				sc.nextLine();
				
			}
			
		 else if(choiceMark == '2')
		
		 	{
				System.out.println("VOUS AVEZ CHOISIT UNE PIGEOT - A300B \n");
				System.out.println("************************************************************\n");
				System.out.println("***    Bienvenue dans la section RENO - LAG du GARAGE    ***\n");
				System.out.println("************************************************************\n");
				System.out.println("************************************************************\n");
				System.out.println("***         QUEL TYPE DE MOTEUR DESIREZ - VOUS           ***\n");
				System.out.println("***                                                      ***\n");
				System.out.println("***                  1 - ESSENCE      2                   ***\n");
				System.out.println("***                  2 - DIESEL        2                  ***\n");
				System.out.println("***                  3 - ELECTRIQUE     2                 ***\n");
				System.out.println("***                  3 - HYBRIDE         2                ***\n");
				System.out.println("***                                                      ***\n");
				System.out.println("***           CHOISISSEZ L'OPTION 1 OU 2 OU 3            ***\n");
				System.out.println("************************************************************\n");

		 	}
		else
			{
				System.out.println("VOUS AVEZ CHOISIT UNE TROEN - D4 \n");
				System.out.println("************************************************************\n");
				System.out.println("***    Bienvenue dans la section RENO - LAG du GARAGE    ***\n");
				System.out.println("************************************************************\n");
				System.out.println("************************************************************\n");
				System.out.println("***         QUEL TYPE DE MOTEUR DESIREZ - VOUS           ***\n");
				System.out.println("***                                                      ***\n");
				System.out.println("***                  1 - ESSENCE  3                       ***\n");
				System.out.println("***                  2 - DIESEL    3                      ***\n");
				System.out.println("***                  3 - ELECTRIQUE 3                     ***\n");
				System.out.println("***                  3 - HYBRIDE     3                    ***\n");
				System.out.println("***                                                      ***\n");
				System.out.println("***           CHOISISSEZ L'OPTION 1 OU 2 OU 3            ***\n");
				System.out.println("************************************************************\n");
				
			}
	//**********************************************************************************************************************************
		
		do {
			System.out.println("VOULEZ VOUS EFFECTUER UNE AUTRE OPERATION ? (O/N)");
			reponse = sc.nextLine().charAt(0);
		}while(reponse != 'O' && reponse != 'N');
		
	}while(reponse == 'O');
	
System.out.println("AU REVOIR !\n");
}
}

