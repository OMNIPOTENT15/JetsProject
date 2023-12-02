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
	public String toString() {
		return "CivilianJets [company=" + company + ", yearProduced=" + yearProduced + ", getModel()=" + getModel()
				+ ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange() + ", getPrice()=" + getPrice() + "]";
	}
}
