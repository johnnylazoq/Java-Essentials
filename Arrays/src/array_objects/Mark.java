package array_objects;
//Class Mark
public class Mark {

	private String name;
	private int lowerBound;
	
	public Mark(String mark, int cutoff) {
		name = mark;
		lowerBound = cutoff;
		
	}
		
	public String toString(){
		return name + "\t" + lowerBound;
	}
	// construct getter and setters
	public void setName(String grade) {
		name = grade;
	}
	
	public void setLowerBound(int cutoff){
		lowerBound = cutoff;
	}	
	
	public String getName() {
		return name;
	}
		
	public int getLowerBound() {
		return lowerBound;
	}
	
}
