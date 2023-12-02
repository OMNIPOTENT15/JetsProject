package com.skilldistillery.jets;

public class MilitaryJets extends Jet implements SystemsCheck, Dogfight {
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
	public String toString() {
		return "MilitaryJets [purpose=" + purpose + ", yearProduced=" + yearProduced + ", campaign=" + campaign
				+ ", getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice() + "]";
	}

}
