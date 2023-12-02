package com.skilldistillery.jets;

import java.util.ArrayList;

public class Airfield extends Jet {
	private ArrayList<Jet> jets;

	public static void main(String[] args) {

		Airfield ar = new Airfield();
		ar.addJets();
	}

	public void addJets() {

		Jet milj1 = new MilitaryJets("B-52H Stratofortress", 958.0, 16000.0, 84000000.0, "long-range stategic bomber",
				1948, "Post-WW2");
		Jet milj2 = new MilitaryJets("F-22", 2500.0, 2950.0, 138000000.0, "multi-purpose fighter", 2003,
				"War on Terror");
		Jet milj3 = new MilitaryJets("B-2 Spirit", 764.0, 12223.0, 737000000.0, "steath bomber", 1993, "Cold War");
		jets.add(milj1);
		jets.add(milj2);
		jets.add(milj3);

		Jet civj1 = new CivilianJets("Airbus A220", 840.0, 6670.0, 39200000.0, "Swiss International Air Lines", 2013);
		Jet civj2 = new CivilianJets("Boeing 787 Dreamliner", 466.0, 14140.0, 239000000.0, "All Nippon Airways", 2009);
		Jet civj3 = new CivilianJets("Comac C919", 838.0, 5576.0, 90000000.0, "China Eastern Airlines", 2023);
		jets.add(civj1);
		jets.add(civj2);
		jets.add(civj3);

		Jet spaj1 = new SpaceJets("Discovery", 28002.586, 238539663.0, 196000000000.0, "ISS Assembly/ Hubble Launch");
		Jet spaj2 = new SpaceJets("Atlantis", 27358.0, 202673974.0, 2000000000.0,
				"ISS Maintenance/ Hubble Servicing/Probes Deployment to Jupiter and Venus");
		Jet spaj3 = new SpaceJets("Endeavour", 28002.586, 197761262.0, 196000000000.0,
				"ISS Maintenance/ Hubble Servicing/ Comm Satellite Deployment");
		jets.add(spaj1);
		jets.add(spaj2);
		jets.add(spaj3);
	}
}
