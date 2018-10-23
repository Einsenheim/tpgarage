package com.garage.principal;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.garage.vehicule.Vehicule;

public class Garage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected List<Vehicule> voiture = new ArrayList<Vehicule>();

	
	protected void addVoiture(Vehicule voit) {
		
		//add a new car
		voiture.add(voit);
		
		//Declaration of object outside try/catch bloc to read and write inside a file
		ObjectInputStream ois;
		ObjectOutputStream oos;
		
		//Errors management
		try {
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(
									new File("save_garage.txt"))));
			
		//We will write every object inside the file
			oos.writeObject(voit);
			
		//Closing output flow
			oos.close();
			
		//Taking data
			ois = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(
									new File("save_garage.txt"))));
		try {
			System.out.println(((Vehicule)ois.readObject()).toString());
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//closing input flow
		ois.close();
		
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
			
		}
		
	//toString 
			public String toString() {
				String listeVoiture = "";
				listeVoiture += "************************************************************\n";
				listeVoiture += "****                 Garage OpenClassrooms              ****\n";
				listeVoiture += "************************************************************\n";
				return listeVoiture;
		}
		
			

	}


