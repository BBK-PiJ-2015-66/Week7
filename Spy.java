public class Spy {

	private static int spyCount = 0;
	public int spyID;

	public Spy(int spyID) {

		spyCount++;
		System.out.println("Spy ID: " + spyID + " has just been created");
		System.out.println("Total number of spies: " + getNumberOfSpies()); 
	}

	public static int getNumberOfSpies() {
	
		return spyCount;
	}

	private void die(int spyID) {

		System.out.println("Spy " + spyID + " detected and eliminated");
		spyCount--;
		System.out.println("Total number of spies: " + getNumberOfSpies()); 

	}
	
	public static void main(String[] args) {
	
		Spy spy1 = new Spy(100);
		Spy spy2 = new Spy(200);
		Spy spy3 = new Spy(300);
		Spy spy4 = new Spy(400);
		Spy spy5 = new Spy(500);
		
		System.out.println("");

		spy5.die(500);
		spy3.die(300);
		spy1.die(100);
	}	
}
