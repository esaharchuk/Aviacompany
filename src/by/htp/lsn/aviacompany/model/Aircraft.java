package by.htp.lsn.aviacompany.model;

public abstract class Aircraft {

	private String model;
	private int carrying;
	private int range;
	private int consumption;
	private int takeOfWeight;
	private int fuelStock;

	public Aircraft(String model, int carrying, int range, int consumption, int takeOfWeight, int fuelStock) {

		this.model = model;
		this.carrying = carrying;
		this.range = range;
		this.consumption = consumption;
		this.takeOfWeight = takeOfWeight;
		this.fuelStock = fuelStock;

	}

	public Aircraft() {

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCarrying() {
		return carrying;
	}

	public void setCarrying(int carrying) {
		this.carrying = carrying;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getConsumption() {
		return consumption;
	}

	public void setConsumption(int consumption) {
		this.consumption = consumption;
	}

	public int getTakeOfWeight() {
		return takeOfWeight;
	}

	public void setTakeOfWeight(int takeOfWeight) {
		this.takeOfWeight = takeOfWeight;
	}

	public int getFuelStock() {
		return fuelStock;
	}

	public void setFuelStock(int fuelStock) {
		this.fuelStock = fuelStock;
	}

}
