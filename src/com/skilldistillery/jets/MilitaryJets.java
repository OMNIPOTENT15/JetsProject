package com.skilldistillery.jets;

public class MilitaryJets extends Jet implements SystemsCheck, Dogfight, SafetyBrief {
	private String purpose;
	private int yearProduced;
	private String campaign;

	public MilitaryJets() {
		super();
	}

	public MilitaryJets(String model, double speed, double range, double price, String purpose, int yearProduced,
			String campaign) {
		super(model, speed, range, price);
		this.purpose = purpose;
		this.yearProduced = yearProduced;
		this.campaign = campaign;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public int getYearProduced() {
		return yearProduced;
	}

	public void setYearProduced(int yearProduced) {
		this.yearProduced = yearProduced;
	}

	public String getCampaign() {
		return campaign;
	}

	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}

	@Override
	public void conductBrief() {
		System.out.println(getModel() + " has conducted a safety brief.");

	}

	@Override
	public void allSystemsGo() {
		System.out.println(getModel() + " system checks in progress. All systems are green for go.");
	}

	@Override
	public void fight() {
		System.out.println("War has broken out and " + getModel() + " is now in a heated dogfight! Your speciality is a " + purpose + ".");
	}

	@Override
	public String toString() {
		return "MilitaryJets [getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + "\n\t, getRange()="
				+ getRange() + ", getPrice()=" + getPrice() + "\n\t, purpose=" + purpose + ", yearProduced="
				+ yearProduced + ", campaign=" + campaign + "]\n\n";
	}

}
