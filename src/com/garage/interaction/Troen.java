package com.garage.interaction;

import java.util.Scanner;

import com.garage.principal.Garage;
import com.garage.vehicule.D4;
import com.garage.vehicule.Vehicule;
import com.garage.vehicule_moteur.MoteurDiesel;
import com.garage.vehicule_moteur.MoteurElectrique;
import com.garage.vehicule_moteur.MoteurEssence;
import com.garage.vehicule_moteur.MoteurHybride;
import com.garage.vehicule_option.BarreDeToit;
import com.garage.vehicule_option.Climatisation;
import com.garage.vehicule_option.GPS;
import com.garage.vehicule_option.SiegeChauffant;
import com.garage.vehicule_option.VitreElectrique;

public class Troen extends acceuil {
	 {
			char choiceTypeMoteur = ' ';
			char choiceOption = ' ';
			Scanner sc = new Scanner(System.in);
			Vehicule d4_1 = new D4();
			Garage garage = new Garage();
			
			
			
				//****************************************** CHOIX DE DU TYPE DE MOTEUR ******************************************************
		
					do {
						sc.nextLine();
							System.out.println("VOUS AVEZ CHOISIT UNE TROEN - D4 \n");
							System.out.println("************************************************************\n");
							System.out.println("***    SECTION TROEN - D4 - TYPE DE MOTEUR DU GARAGE     ***\n");
							System.out.println("************************************************************\n");
							System.out.println("************************************************************\n");
							System.out.println("***         QUEL TYPE DE MOTEUR DESIREZ - VOUS           ***\n");
							System.out.println("***                                                      ***\n");
							System.out.println("***                  1 - ESSENCE - D4                    ***\n");
							System.out.println("***                  2 - DIESEL - D4                     ***\n");
							System.out.println("***                  3 - ELECTRIQUE - D4                 ***\n");
							System.out.println("***                  4 - HYBRIDE - D4                    ***\n");
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
									d4_1.setMoteur(new MoteurEssence("150 Chevaux", 10256d));
									d4_1.setPrix(23123.0);
									 garage.addVoiture(d4_1);
									break;
								
								case '2':
									System.out.println("VOUS AVEZ CHOISIT UN MOTEUR DIESEL ");
									d4_1.setMoteur(new MoteurDiesel("500 Hdi", 456987d));
									d4_1.setPrix(25147.0);
									garage.addVoiture(d4_1);
									break;
								
								case '3':
									System.out.println("VOUS AVEZ CHOISIT UN MOTEUR ELECTRIQUE ");
									d4_1.setMoteur(new MoteurElectrique("100 KW", 1224d));
									d4_1.setPrix(27457.0);
									garage.addVoiture(d4_1);
									break;
								
								case '4':
									System.out.println("VOUS AVEZ CHOISIT UN MOTEUR HYBRIDE ");
									d4_1.setMoteur(new MoteurHybride("ESSENCE/Electrique", 12345.95d));
									d4_1.setPrix(29457.0);
									garage.addVoiture(d4_1);
									break;
								default:
									System.out.println("VOUS AVEZ CHOISIT L'OPTION : " + choiceTypeMoteur );
							}

					} while (choiceTypeMoteur != '1'&& choiceTypeMoteur != '2' && choiceTypeMoteur != '3' && choiceTypeMoteur != '4');
							
							
				//*************************************** CHOIX DES OPTIONS **************************************************************************
						do {
							sc.nextLine();
							System.out.println("************************************************************\n");
							System.out.println("***        SECTION TROEN - D4 - OPTION DU GARAGE         ***\n");
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
									garage.addVoiture(d4_1);
									break;
								
								case '2':
									System.out.println("VOUS AVEZ CHOISIT L'OPTION GPS ");
									d4_1.addOption(new GPS());
									 garage.addVoiture(d4_1);
									break;
								
								case '3':
									System.out.println("VOUS AVEZ CHOISIT L'OPTION VITRE ELECTRIQUE ");
									d4_1.addOption(new VitreElectrique());
									garage.addVoiture(d4_1);
									break;
								
								case '4':
									System.out.println("VOUS AVEZ CHOISIT L'OPTION CLIMATISATION ");
									d4_1.addOption(new Climatisation());
									garage.addVoiture(d4_1);
									break;
								
								case '5':
									System.out.println("VOUS AVEZ CHOISIT L'OPTION SIEGE CHAUFFANT ");
									d4_1.addOption(new SiegeChauffant());
									garage.addVoiture(d4_1);
									break;
									
								case '6':
									System.out.println("VOUS AVEZ CHOISIT L'OPTION BARRE DE TOIT ");
									d4_1.addOption(new BarreDeToit());
									garage.addVoiture(d4_1);
									break;
								default:
									System.out.println("VOUS AVEZ CHOISIT L'OPTION : " + choiceOption );
							}
						}while (choiceOption != '1'&& choiceOption != '2' && choiceOption != '3' && choiceOption != '4' && choiceOption != '5' 
								&& choiceOption != '6');
							sc.nextLine();
						}
		 
		

}
