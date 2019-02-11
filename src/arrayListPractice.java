import java.util.ArrayList;
public class arrayListPractice {
	public static void main(String[] args) {
		/*
		ArrayList<Integer> grades = new ArrayList<Integer>();
		grades.add(85);
		grades.add(90);
		grades.add(99);
		System.out.println(grades);
		
		for (int i = 0; i < grades.size(); i++) {
			System.out.println(grades.get(i));
		}
		*/
		
		ArrayList<String> band = new ArrayList<String>();
		/*
		band.add("Lindsey");
	  	band.add("Mick");
		band.add("Stevie");
		band.add("Danny");
		band.set(3, "Christine");

		System.out.println(band);
		*/
		
		 band.add("Lindsey");
		 band.add("Mick");
		 band.add("Stevie");
		 band.add("Peter");
		 band.remove(3);
		 band.add(2, "Christine");

			System.out.println(band);

	}

}
