package array_objects;

// arrays can store objects
public class MarkRange {

	public static void main(String[] args) {
	
		Mark[] marks = {
	
			new Mark("A", 95), new Mark("A-", 90),
			new Mark("B+", 87), new Mark("B", 85),new Mark("B-", 80),
			new Mark("C+", 77), new Mark("C", 75),new Mark("C-", 70),
			new Mark("D+", 67), new Mark("D", 65), new Mark("D-", 60),
			new Mark("F", 0)
		};
		
		for(Mark letter: marks) {
			System.out.println(letter);
		}
		
	}

}
