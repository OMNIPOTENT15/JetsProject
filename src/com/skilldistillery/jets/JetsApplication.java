package com.skilldistillery.jets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JetsApplication {

	Scanner sc = new Scanner(System.in);
	private Airfield airfield = new Airfield();

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.run();
	}

	public void run() {

		int choice = 0;
		while (choice != 9) {
			choice = flightMenu();
		}

	}

	public int flightMenu() {
		System.out.println("//////////////      Welcome Aboard, Captain!      //////////////\n\n"
				+ " Please select a number from the following menu options.\n\n" + " 1. List fleet\n"
				+ " 2. Fly all jets\n" + " 3. View fastest jet\n" + " 4. View jet with longest range\n"
				+ " 5. Load all Cargo Jets\n" + " 6. Dogfight!\n" + " 7. Add a jet to Fleet\n"
				+ " 8. Remove a jet from Fleet\n" + " 9. Quit\n\n"
				+ "//////////////                                    //////////////");
		int userChoice = sc.nextInt();
		sc.nextLine();
		if (userChoice == 1) {
			airfield.displayJets();
		} else if (userChoice == 2) {
			airfield.flyAllJets();
		} else if (userChoice == 3) {
			airfield.fastestJet();
		} else if (userChoice == 4) {
			airfield.longestRange();
		} else if (userChoice == 5) {
			airfield.loadCargo();
		} else if (userChoice == 6) {
			airfield.dogFight();
		} else if (userChoice == 7) {
			addingJets();
		} else if (userChoice == 8) {
			removeJet();
		} else if (userChoice == 9) {
			System.out.println("You are now exiting the flight menu. Goodbye!");
			System.exit(1);
		} else {
			System.err.println("Please input a valid choice.");
		}
		return userChoice;
	}

	public void addingJets() {
		System.out.println("  Input (1) for adding a military jet.\n " + " Input (2) for adding a civilian jet.\n "
				+ " Input (3) for adding a space jet. ");
		int choice = sc.nextInt();
		String model = "";
		double speed = 0;
		double range = 0;
		double price = 0;
		String purpose = "";
		int year = 0;
		String campaign = "";
		String company = "";
		String mission = "";

		if (choice == 1) {
			System.out.println("Please enter the military jet model: ");
			model = sc.next();
			System.out.println("Please enter the military jet max speed in MPH: ");
			speed = sc.nextDouble();
			System.out.println("Please enter the military jet max range im mile: ");
			range = sc.nextDouble();
			System.out.println("Please enter the military jet purchase price: ");
			price = sc.nextDouble();
			System.out.println("Please enter the military jet purpose (fighter, stealth, bomber): ");
			purpose = sc.next();
			System.out.println("Please enter the military jet year produced: ");
			year = sc.nextInt();
			System.out.println("Please enter the military jet campaign served in: ");
			campaign = sc.next();
			Jet yourJ = new MilitaryJets(model, speed, range, price, purpose, year, campaign);
			airfield.add(yourJ);

		} else if (choice == 2) {
			System.out.println("Please enter the civilian jet model: ");
			model = sc.next();
			System.out.println("Please enter the civilian jet max speed in MPH: ");
			speed = sc.nextDouble();
			System.out.println("Please enter the civilian jet max range in miles: ");
			range = sc.nextDouble();
			System.out.println("Please enter the civilian jet purchase price: ");
			price = sc.nextDouble();
			System.out.println("Please enter the civilian jet company: ");
			company = sc.next();
			System.out.println("Please enter the civilian jet year produced: ");
			year = sc.nextInt();
			Jet yourJ = new CivilianJets(model, speed, range, price, company, year);
			airfield.add(yourJ);
			
		} else if (choice == 3) {
			System.out.println("Please enter the space jet model: ");
			model = sc.next();
			System.out.println("Please enter the space jet max speed in MPH: ");
			speed = sc.nextDouble();
			System.out.println("Please enter the space jet max range in miles: ");
			range = sc.nextDouble();
			System.out.println("Please enter the space jet purchase price: ");
			price = sc.nextDouble();
			System.out.println("Please enter the space jet missions: ");
			mission = sc.next();
			sc.nextLine();

			Jet yourJ = new SpaceJets(model, speed, range, price, mission);
			airfield.add(yourJ);
			
		} else {
			System.err.println("Please input a valid choice.");
			addingJets();
		}
	}

	public void removeJet() {
		airfield.displayJets();
		System.out.println(
				"\nPlease select a jet you would like to remove by enter a number.\nThe jets are listed in sequential order starting at one: "
						+ "");
		int i = sc.nextInt();
		sc.nextLine();
		airfield.deleteJet(i);
	}

}