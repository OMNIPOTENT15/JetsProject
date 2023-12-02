package com.skilldistillery.jets;

public class CivilianJets extends Jet implements SafetyBrief, LoadingCargo {
	private String company;
	private int yearProduced;

	public CivilianJets() {
		super();
	}

	public CivilianJets(String model, double speed, double range, double price, String company, int yearProduced) {
		super(model, speed, range, price);
		this.company = company;
		this.yearProduced = yearProduced;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getyearProduced() {
		return yearProduced;
	}

	public void setyearProduced(int yearProduced) {
		this.yearProduced = yearProduced;
	}

	@Override
	public void loading() {
		System.out
				.println(getModel() + " cargo loading in progress. All cargo and passengers are successfully loaded.");
	}

	@Override
	public void conductBrief() {
		System.out.println(getModel() + " has conducted a safety brief.");

	}

	@Override
	public String toString() {
		return "CivilianJets [getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + "\n\t, getRange()="
				+ getRange() + ", getPrice()=" + getPrice() + "\n\t, company=" + company + ", yearProduced="
				+ yearProduced + "]\n\n";
	}
}
