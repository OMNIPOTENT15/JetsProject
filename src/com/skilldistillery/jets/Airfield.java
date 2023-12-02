package com.skilldistillery.jets;

import java.util.ArrayList;

public class Airfield extends Jet {
	private ArrayList<Jet> jets = new ArrayList<>();

	public Airfield() {

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

	}

	public void add(Jet jet) {
		jets.add(jet);
	}

	public ArrayList<Jet> getJets() {
		return jets;
	}

	public void setJets(ArrayList<Jet> jets) {
		this.jets = jets;
	}

	public void flyAllJets() {
		for (Jet jet : jets) {
			System.out.println();
			System.out.println(jet.toString());
			((Jet) jet).flight();
			flightTime(jet);
		}

	}

	public void displayJets() {
		for (Jet jet : jets) {
			System.out.println();
			System.out.println(jet);
			System.out.println(
					"--------------------------------------------------------------------------------------------");
		}
	}

	public void flightTime(Jet jet) {
		System.out.print("\tYour flight time for " + jet.getModel() + " is ");
		double flightTime = 0.0;
		flightTime = jet.getRange() / jet.getSpeed();
		System.out.printf("%.2f", flightTime);
		System.out.println(" hours.");
		System.out.println();
		System.out.println(
				"--------------------------------------------------------------------------------------------");

	}

	public void loadCargo() {
		for (Jet jet : jets) {
			if (jet instanceof CivilianJets) {
				System.out.println();
				((CivilianJets) jet).conductBrief();
				((CivilianJets) jet).loading();
				System.out.println();
				System.out.println(
						"--------------------------------------------------------------------------------------------");
			}
		}
	}

	public void dogFight() {
		for (Jet jet : jets) {
			if (jet instanceof MilitaryJets) {
				System.out.println();
				((MilitaryJets) jet).allSystemsGo();
				((MilitaryJets) jet).fight();
				System.out.println();
				System.out.println(
						"--------------------------------------------------------------------------------------------");

			}
		}
	}

	public void deleteJet(int i) {
		jets.remove(i - 1);
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