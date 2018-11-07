package com.garage.interaction;

import com.garage.principal.Garage;
import com.garage.vehicule.Lagouna;
import com.garage.vehicule.Vehicule;
import com.garage.vehicule_moteur.MoteurDiesel;
import com.garage.vehicule_moteur.MoteurElectrique;
import com.garage.vehicule_moteur.MoteurEssence;
import com.garage.vehicule_moteur.MoteurHybride;
import com.garage.vehicule_option.BarreDeToit;
import com.garage.vehicule_option.Climatisation;
import com.garage.vehicule_option.GPS;
import com.garage.vehicule_option.Option;
import com.garage.vehicule_option.SiegeChauffant;
import com.garage.vehicule_option.VitreElectrique;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Reno extends acceuil {

	 {
		char choiceTypeMoteur = ' ';
		char choiceOption = ' ';
		Scanner sc = new Scanner(System.in);
		Vehicule lag1 = new Lagouna();
		Garage garage = new Garage();
		
		
		
			//****************************************** CHOIX DE DU TYPE DE MOTEUR ******************************************************
	
				do {
					sc.nextLine();
						System.out.println("VOUS AVEZ CHOISIT UNE RENO - LAGUNA \n");
						System.out.println("************************************************************\n");
						System.out.println("***    SECTION RENO - LAG - TYPE DE MOTEUR DU GARAGE     ***\n");
						System.out.println("************************************************************\n");
						System.out.println("************************************************************\n");
						System.out.println("***         QUEL TYPE DE MOTEUR DESIREZ - VOUS           ***\n");
						System.out.println("***                                                      ***\n");
						System.out.println("***                  1 - ESSENCE - LAG                   ***\n");
						System.out.println("***                  2 - DIESEL - LAG                    ***\n");
						System.out.println("***                  3 - ELECTRIQUE - LAG                ***\n");
						System.out.println("***                  4 - HYBRIDE - LAG                   ***\n");
						System.out.println("***                                                      ***\n");
						System.out.println("***        CHOISISSEZ L'OPTION 1 OU 2 OU 3 OU 4          ***\n");
						System.out.println("************************************************************\n");
						
						try {
						choiceTypeMoteur = sc.nextLine().charAt(0);
						
						} catch (Exception e) {
							System.out.println("CHOIX INCONNU, VEUILLEZ CHOISIR L'OPTION 1 OU 2 OU 3 OU 4\n");
						}
						
						switch (choiceTypeMoteur)
						{
							case '1':
								System.out.println("VOUS AVEZ CHOISIT UN MOTEUR ESSENCE ");
								 lag1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
								 lag1.setPrix(23123.0);
								 garage.addVoiture(lag1);
								break;
							
							case '2':
								System.out.println("VOUS AVEZ CHOISIT UN MOTEUR DIESEL ");
								lag1.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
								lag1.setPrix(25147.0);
								garage.addVoiture(lag1);
								break;
							
							case '3':
								System.out.println("VOUS AVEZ CHOISIT UN MOTEUR ELECTRIQUE ");
								lag1.setMoteur(new MoteurElectrique("100 KW", 1224d));
								lag1.setPrix(27457.0);
								garage.addVoiture(lag1);
								break;
							
							case '4':
								System.out.println("VOUS AVEZ CHOISIT UN MOTEUR HYBRIDE ");
								lag1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
								lag1.setPrix(29457.0);
								garage.addVoiture(lag1);
								break;
							default:
								System.out.println("VOUS AVEZ CHOISIT L'OPTION : " + choiceTypeMoteur );
						}

				} while (choiceTypeMoteur != '1'&& choiceTypeMoteur != '2' && choiceTypeMoteur != '3' && choiceTypeMoteur != '4');
						
						
			//*************************************** CHOIX DES OPTIONS **************************************************************************
					do {
						sc.nextLine();
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
						
						try {
						choiceOption = sc.nextLine().charAt(0);
						} catch (Exception e) {
							System.out.println("CHOIX INCONNU, VEUILLEZ CHOISIR L'OPTION 1 OU 2 OU 3 OU 4 OU 5 OU 6\n");
						}
						
						switch (choiceOption)
						{
							case '1':
								System.out.println("VOUS AVEZ CHOISIT AUCUNE OPTION ");
								garage.addVoiture(lag1);
								break;
							
							case '2':
								System.out.println("VOUS AVEZ CHOISIT L'OPTION GPS ");
								 lag1.addOption(new GPS());
								 garage.addVoiture(lag1);
								break;
							
							case '3':
								System.out.println("VOUS AVEZ CHOISIT L'OPTION VITRE ELECTRIQUE ");
								lag1.addOption(new VitreElectrique());
								garage.addVoiture(lag1);
								break;
							
							case '4':
								System.out.println("VOUS AVEZ CHOISIT L'OPTION CLIMATISATION ");
								lag1.addOption(new Climatisation());
								garage.addVoiture(lag1);
								break;
							
							case '5':
								System.out.println("VOUS AVEZ CHOISIT L'OPTION SIEGE CHAUFFANT ");
								lag1.addOption(new SiegeChauffant());
								garage.addVoiture(lag1);
								break;
								
							case '6':
								System.out.println("VOUS AVEZ CHOISIT L'OPTION BARRE DE TOIT ");
								lag1.addOption(new BarreDeToit());
								garage.addVoiture(lag1);
								break;
							default:
								System.out.println("VOUS AVEZ CHOISIT L'OPTION : " + choiceOption );
						}
					}while (choiceOption != '1'&& choiceOption != '2' && choiceOption != '3' && choiceOption != '4' && choiceOption != '5' 
							&& choiceOption != '6');
						sc.nextLine();
					}
	 
	
}
					
	


