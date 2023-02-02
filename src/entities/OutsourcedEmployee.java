package entities;

public class OutsourcedEmployee extends Employee{
	
	private Double additionalCharge;
	private Double percentage = 1.1;
	
	
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	public Double getPercentage() {
		return percentage;
	}

	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}

	
	@Override
	public double payment() {
		return super.payment() + getAdditionalCharge() * getPercentage();		
	}
	
}
