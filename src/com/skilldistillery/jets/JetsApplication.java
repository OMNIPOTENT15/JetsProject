package com.skilldistillery.jets;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JetsApplication {

	Scanner sc = new Scanner(System.in);
	private Airfield airfield;
	ArrayList<Jet> jets = new ArrayList<>();

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.run();
	}

	public void run() {

		Jet milj1 = new MilitaryJets("B-52H Stratofortress", 595.27, 9941.9391, 84000000.0,
				"long-range stategic bomber", 1948, "Post-WW2");
		Jet milj2 = new MilitaryJets("F-22", 1553.427, 1833.045, 138000000.0, "multi-purpose fighter", 2003,
				"War on Terror");
		Jet milj3 = new MilitaryJets("B-2 Spirit", 474.727, 7595.0201, 737000000.0, "steath bomber", 1993, "Cold War");
		jets.add(milj1);
		jets.add(milj2);
		jets.add(milj3);

		Jet civj1 = new CivilianJets("Airbus A220", 521.95, 4144.546, 39200000.0, "Swiss International Air Lines",
				2013);
		Jet civj2 = new CivilianJets("Boeing 787 Dreamliner", 289.55, 8786.1887, 239000000.0, "All Nippon Airways",
				2009);
		Jet civj3 = new CivilianJets("Comac C919", 520.70, 3464.766, 90000000.0, "China Eastern Airlines", 2023);
		jets.add(civj1);
		jets.add(civj2);
		jets.add(civj3);

		Jet spaj1 = new SpaceJets("Discovery", 17400, 148221674.794, 196000000000.0, "ISS Assembly/ Hubble Launch");
		Jet spaj2 = new SpaceJets("Atlantis", 16999.47, 125935768.86, 2000000000.0,
				"ISS Maintenance/ Hubble Servicing/Probes Deployment to Jupiter and Venus");
		Jet spaj3 = new SpaceJets("Endeavour", 17400, 122883151.147, 196000000000.0,
				"ISS Maintenance/ Hubble Servicing/ Comm Satellite Deployment");
		jets.add(spaj1);
		jets.add(spaj2);
		jets.add(spaj3);
		flightMenu();

	}

	public void flightMenu() {
		System.out.println("//////////////      Welcome Aboard, Captain!      //////////////\n\n"
				+ " Please select a number from the following menu options.\n\n" + " 1. List fleet\n"
				+ " 2. Fly all jets\n" + " 3. View fastest jet\n" + " 4. View jet with longest range\n"
				+ " 5. Load all Cargo Jets\n" + " 6. Dogfight!\n" + " 7. Add a jet to Fleet\n"
				+ " 8. Remove a jet from Fleet\n" + " 9. Quit\n\n"
				+ "//////////////                                    //////////////");
		int userChoice = sc.nextInt();
		sc.nextLine();
		if (userChoice == 1) {
			getJets();
			flightMenu();
		} else if (userChoice == 2) {
			for (Jet jet : jets) {
				System.out.println(jet.toString());
				((Jet) jet).flight();
				flightTime(jet);
				System.out.println();
			}
			flightMenu();
		} else if (userChoice == 3) {
			fastestJet();
			System.out.println();
			flightMenu();
		} else if (userChoice == 4) {
			longestRange();
			System.out.println();
			flightMenu();
		} else if (userChoice == 5) {
			for (Jet jet : jets) {
				if (jet instanceof CivilianJets) {
					((CivilianJets) jet).conductBrief();
					((CivilianJets) jet).loading();
				}
				System.out.println();
			}
			flightMenu();
		} else if (userChoice == 6) {
			for (Jet jet : jets) {
				if (jet instanceof MilitaryJets) {
					((MilitaryJets) jet).conductBrief();
					((MilitaryJets) jet).allSystemsGo();
					((MilitaryJets) jet).fight();
				}
				System.out.println();
			}
			flightMenu();

		} else if (userChoice == 7)

		{
			addingJets();
			flightMenu();
		} else if (userChoice == 8) {
			removeJets();
			flightMenu();
		} else if (userChoice == 9) {
			System.out.println("You are now exiting the flight menu. Goodbye!");
			System.exit(1);
		} else {
			System.err.println("Please input a valid choice.");
			flightMenu();
		}
	}

	public void getJets() {
		for (Jet jet : jets) {
			System.out.println(jet);
		}
		System.out.println();
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
			System.out.println("Please enter the military jet year created: ");
			year = sc.nextInt();
			System.out.println("Please enter the military jet campaign served in: ");
			campaign = sc.next();
			Jet yourJ = new MilitaryJets(model, speed, range, price, purpose, year, campaign);
			jets.add(yourJ);
			flightMenu();

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
			System.out.println("Please enter the civilian jet year created: ");
			year = sc.nextInt();
			Jet yourJ = new CivilianJets(model, speed, range, price, company, year);
			jets.add(yourJ);
			flightMenu();

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
			jets.add(yourJ);
			flightMenu();

		} else {
			System.err.println("Please input a valid choice.");
			addingJets();
		}
	}

	public void removeJets() {
		System.out.println("Please select a jet you would like to remove.");
		int count = 1;
		for (Jet jet : jets) {
			System.out.println(count + " : " + jet.getModel());
			count++;
		}
		int i = sc.nextInt();
		jets.remove(i - 1);
		flightMenu();
	}

	public void flightTime(Jet jet) {
		System.out.print("\tYour flight time for " + jet.getModel() + " is ");
		double flightTime = 0.0;
		flightTime = jet.getRange() / jet.getSpeed();
		System.out.printf("%.2f", flightTime);
		System.out.println(" hours.");
		System.out.println();
		System.out.println();

	}

	public void fastestJet() {
		Jet jet = new SpaceJets("", 0, 0, 0, "");
		for (int i = 0; i < jets.size() - 1; i++) {
			if (jets.get(i + 1).getSpeed() > jets.get(i).getSpeed()) {
				jet = jets.get(i + 1);
			} else {
				jet = jets.get(i);
			}
		}
		System.out.println(jet);
	}

	public void longestRange() {
		Jet jet = new SpaceJets("", 0, 0, 0, "");
		for (int i = 0; i < jets.size() - 1; i++) {
			if (jets.get(i + 1).getRange() > jets.get(i).getRange()) {
				jet = jets.get(i + 1);
			} else {
				jet = jets.get(i);
			}
		}
		System.out.println(jet);
	}
}