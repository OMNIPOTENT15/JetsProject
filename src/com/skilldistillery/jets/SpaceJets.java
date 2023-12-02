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
	public void conductBrief() {
		System.out.println("Space jet has conducted safety brief. Ready for takeoff!");

	}

	@Override
	public void allSystemsGo() {
		System.out.println("Space jet checks in progress. All system are green for go.");
	}

	@Override
	public String toString() {
		return "SpaceJets [getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + "\n\t, getRange()=" + getRange()
				+ ", getPrice()=" + getPrice() + "\n\t, missions=" + missions + "]\n\n";
	}
}
