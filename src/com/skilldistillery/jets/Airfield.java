package com.skilldistillery.jets;

import java.util.ArrayList;

public class Airfield extends Jet {
	private ArrayList<Jet> jets = new ArrayList<>();

	public Airfield(ArrayList<Jet> jets) {
		this.jets = jets;
	}

	public ArrayList<Jet> getJets() {
		return jets;
	}

	public void setJets(ArrayList<Jet> jets) {
		this.jets = jets;
	}

}