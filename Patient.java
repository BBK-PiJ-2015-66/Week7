public class Patient {

	public String name;
	public int age;
	public String illness;

	public Patient next;

	public Patient(String name, int age, String illness) {

		this.name = name;
		this.age = age;
		this.illness = illness;
	}

	public Patient getNext() {

		return next;
	}

	public void setNext(Patient nextPatient) {
		
		this.next = nextPatient;
	}

	public void display() {

		System.out.println(this.name + ": " + this.age + ": " + this.illness);
	}	
}