public class Mark {

	private void reportMarks() {

		System.out.println("Enter a mark (0-100) Finish by typing -1: ");

		String mark;
		int intMark;

		int studentCounter = 0;
		int distinctions = 0;
		int passes = 0;
		int fails = 0;
		int invalids = 0;

		do {
			mark = System.console().readLine();
			intMark = Integer.parseInt(mark);
				
			if (intMark != -1) {

				studentCounter++; 

				if (intMark < 0 || intMark > 100) {

					invalids++;


				} else if (intMark >= 70) {

					distinctions++;

				} else if (intMark >= 50) {

					passes++;

				} else {

					fails++;
				}
			}
 	
		} while (intMark != -1);

		System.out.println("There are "            + 
					studentCounter     + 
					" students: "      +
					distinctions       + 
					" distinctions,  " +
					passes             + 
					" passes, "        +
					fails              + 
					" fails (plus "    +
					invalids           +
					" invlids.)");	 
					
		}
	
	public static void main(String[] args) {
	
		Mark mark = new Mark();
		
		mark.reportMarks();
	}	
}
