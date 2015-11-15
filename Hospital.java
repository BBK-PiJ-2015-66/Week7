public class Hospital {

	private Patient firstPatient = null;

	public Hospital() {	

		firstPatient = null;
	}

	public boolean isEmpty() {

		return(firstPatient == null);
	}

	public void insertFirstPatient(String name, int age, String illness) {

		Patient newPatient = new Patient(name, age, illness);
		newPatient.next = firstPatient;
		firstPatient = newPatient;
	}

	public Patient removeFirstPatient() {
	
		Patient linkedReference = firstPatient;

		if(!isEmpty()) {
			firstPatient = firstPatient.next;
		} else {
			System.out.println("No Patient in the file");
		}
		return linkedReference;
	}

	public void display() {

		Patient thePatient = firstPatient;
		while(thePatient != null) {
			thePatient.display();
//			System.out.println("Next Patient: " + thePatient.next);
			thePatient = thePatient.next;
			System.out.println();
		}
	}

	public Patient find(String name) {

		Patient thePatient = firstPatient;

		if(!isEmpty()) {
			while(thePatient.name != name) {
				
				if(thePatient.next == null) {
					return null;
				} else {
					thePatient = thePatient.next;
				}
			}  
		
		} else {
			System.out.println("Empty Hospital");
		}
		return thePatient;	
	}

	public Patient removePatient(String name) {

		Patient currentPatient = firstPatient;
		Patient previousPatient = firstPatient;

		while(currentPatient.name != name) {
			if(currentPatient.next == null) {
				return null;
			} else {
				previousPatient = currentPatient;
				currentPatient = currentPatient.next;	
			}
		}
		if(currentPatient == firstPatient) {
			
			firstPatient = firstPatient.next;
		} else {
			previousPatient.next = currentPatient.next;
		}
		return currentPatient;

	}

	public static void main(String[] args) {

		Hospital theHospital = new Hospital();
		
		theHospital.insertFirstPatient("Solomon1", 10, "Flu1");
		theHospital.insertFirstPatient("Solomon2", 20, "Flu2");
		theHospital.insertFirstPatient("Solomon3", 30, "Flu3");
		theHospital.insertFirstPatient("Solomon4", 40, "Flu4");
		theHospital.insertFirstPatient("Solomon5", 50, "Flu5");
		theHospital.insertFirstPatient("Solomon6", 60, "Flu6");
		theHospital.insertFirstPatient("Solomon7", 70, "Flu7");
		theHospital.insertFirstPatient("Solomon8", 80, "Flu8");
		theHospital.insertFirstPatient("Solomon9", 90, "Flu9");
		theHospital.insertFirstPatient("Solomon10", 100, "Flu10");
		
		System.out.println("PATIENTS LIST: Initial");
		theHospital.display();

		System.out.println("");
		System.out.println("PATIENTS LIST: check if a patient is found");
		System.out.println(theHospital.find("Solomon1").name + " was found");
	
		theHospital.removePatient("Solomon5");
		theHospital.removePatient("Solomon1");

		System.out.println("");
		System.out.println("PATIENTS LIST: after two patients removed");
		theHospital.display();
	}		
}