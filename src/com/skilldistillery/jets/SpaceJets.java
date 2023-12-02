package com.skilldistillery.jets;

public class SpaceJets extends Jet implements SystemsCheck, SafetyBrief {
	private String missions;

	public SpaceJets() {
		super();
	}

	public SpaceJets(String model, double speed, double range, double price, String missions) {
		super(model, speed, range, price);
		this.missions = missions;
	}

	public String getMissions() {
		return missions;
	}

	public void setMissions(String missions) {
		this.missions = missions;
	}

	@Override
	public String toString() {
		return "SpaceJets [missions=" + missions + ", getModel()=" + getModel() + ", getSpeed()=" + getSpeed()
				+ ", getRange()=" + getRange() + ", getPrice()=" + getPrice() + "]";
	}
}
