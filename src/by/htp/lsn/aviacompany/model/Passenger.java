package by.htp.lsn.aviacompany.model;

public class Passenger extends Aircraft {
	
	private int passengerCapasity;

	public Passenger(int pssengerCapasity) {
		this.passengerCapasity = pssengerCapasity;
	}

	public Passenger() {

	}

	public int getPassengerCapasity() {
		return passengerCapasity;
	}

	public void setPassengerCapasity(int passengerCapasity) {
		this.passengerCapasity = passengerCapasity;
	}

}
