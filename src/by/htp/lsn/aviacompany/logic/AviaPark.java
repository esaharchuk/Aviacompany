package by.htp.lsn.aviacompany.logic;

import by.htp.lsn.aviacompany.model.Aircraft;

public class AviaPark {

	private Aircraft[] aviaPark;
	private int aviaCount = 0;

	public Aircraft[] getAviaPark() {
		return aviaPark;
	}

	public void setAviaPark(Aircraft[] aviaPark) {
		this.aviaPark = aviaPark;
	}

	public int getAviaCount() {
		return aviaCount;
	}

	public void setAviaCount(int aviaCount) {
		this.aviaCount = aviaCount;
	}

	public void addPlane(Aircraft plane) {
		if (aviaPark != null) {
			if (aviaCount < aviaPark.length) {
				addPlane(plane);
			} else {
				newPlainArray();
				addPlane(plane);
			}
		} else {
			aviaPark = new Aircraft[20];
			addPlane(plane);
		}

	}
	@SuppressWarnings("unused")
	private void addOnePlane(Aircraft plane) {
		aviaPark[aviaCount] = plane;
		aviaCount++;
	}
	
	private void newPlainArray() {
		Aircraft[] aviaPark = new Aircraft[aviaCount+10];
		for(int i = 0; i < this.aviaPark.length-1; i++) {
			aviaPark[i] = this.aviaPark[i];
		}
	}

}
