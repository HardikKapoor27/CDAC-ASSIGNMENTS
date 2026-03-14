package trainStationManagement;

public class Station {

	int stationId;
	String stationName;
	String arrivalTime;

	public Station(int stationId, String stationName, String arrivalTime) {
		this.stationId = stationId;
		this.stationName = stationName;
		this.arrivalTime = arrivalTime;
	}

	public void display() {
		System.out.println(stationId + "        " + stationName + "        " + arrivalTime);
	}
}