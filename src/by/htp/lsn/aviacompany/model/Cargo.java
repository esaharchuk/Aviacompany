package by.htp.lsn.aviacompany.model;

public class Cargo extends Aircraft {
	
	private int maxCarrying;
	private int cargoProfile;

	public Cargo(int maxCarrying, int cargoProfile) {
		this.maxCarrying = maxCarrying;
		this.cargoProfile = cargoProfile;
	}

	public Cargo() {

	}

	public int getMaxCarrying() {
		return maxCarrying;
	}

	public void setMaxCarrying(int maxCarrying) {
		this.maxCarrying = maxCarrying;
	}

	public int getCargoProfile() {
		return cargoProfile;
	}

	public void setCargoProfile(int cargoProfile) {
		this.cargoProfile = cargoProfile;
	}

}
