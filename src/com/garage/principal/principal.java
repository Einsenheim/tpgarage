package com.garage.principal;

import com.garage.interaction.acceuil;
import com.garage.vehicule.A300B;
import com.garage.vehicule.D4;
import com.garage.vehicule.Lagouna;
import com.garage.vehicule.Vehicule;

public class principal {

	public static void main(String[] args) {
		
		// DECLARATION OF VARIABLE
		Vehicule lag1 = new Lagouna();
		Vehicule A300B_1 = new A300B();
		Vehicule d4_1 = new D4();
		
		// CALLING ACCEUIL
		 acceuil user = new acceuil();
		 user.acceuil1();
		
		 //FIRST OPENING GARAGE
		 Garage	 garage = new Garage();
	   	 System.out.println(garage);
	   	 
	   	 //SHOWING THE ADDING CAR IN GARAGE
	   	 System.out.println(lag1);
	   	 System.out.println(A300B_1);
	   	 System.out.println(d4_1);
	   	 
	}
	
}

