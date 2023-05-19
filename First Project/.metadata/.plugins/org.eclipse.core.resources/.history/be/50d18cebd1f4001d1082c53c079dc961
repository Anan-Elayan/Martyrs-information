package application;

public class MartyrL implements Comparable<MartyrL> {

	private String location;
	LocationList_Martry list_Martry;

	public MartyrL(String location) {

		this.location = location;
		list_Martry = new LocationList_Martry();

	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "MartyrL [location=" + location + "]" + list_Martry.getAllMartyr();
	}

	@Override
	public int compareTo(MartyrL o) {

		return this.location.compareTo(o.location);
	}

}
