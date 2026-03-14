package hospitalPatientQueueSystem;

public class Patient {

	int patientId;
	String patientName;
	String disease;

	public Patient(int patientId, String patientName, String disease) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.disease = disease;
	}

	public void display() {
		System.out.println(patientId + "        " + patientName + "        " + disease);
	}
}