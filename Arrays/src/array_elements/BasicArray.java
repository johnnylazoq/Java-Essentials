package array_elements;
// An array is a list of values and is used to group and organize data.
// This code shows how a basic array could be declared and used.

public class BasicArray {

	public static void main(String[] args) {

	// Create constant variables called LIMIT and MULTIPLE, assign the number 15 and 10 respectively.
	final int ARRAYSIZE = 15;
	final int MULTIPLE = 10;
	
		
		
	// Create a new array object that can store a list of values of size 15
	
	int[] valuesList = new int[ARRAYSIZE];
	
	// Initialize the array values 
	for( int index = 0; index < ARRAYSIZE; index++) {
		valuesList[index] = index*MULTIPLE;
	}
	
	// print array values
	System.out.println("Original values");
		for(int value: valuesList) {
			System.out.print(value + " ");
		}
	System.out.println("");
	
	// change one array value
	System.out.println("Changed values");
	valuesList[5] = 10000;
	
	// print array values
	for (int new_values:valuesList) {
		System.out.print(new_values + " ");
	}
	
	
	}

}
