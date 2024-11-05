/**
 * 
 */
package JavaArray;

import java.util.Arrays;

/**
 * 
 */
public class IlaganElaiza {

	/**
	 * 
	 */
	public IlaganElaiza() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @return 
	 */
	public static void main(String[] args) {
		//a. Declare a constant ARRAY_SIZE that’s initialized to 10. 
		final int ARRAY_SIZE = 10;
		
		//b. Declare an array with ARRAY_SIZE elements of type double, and initialize the elements to 0
		 
		double [] fraction = new double [ARRAY_SIZE];
		
		//c. Refer to array index 4
		 System.out.println(fraction[4]);
		 //d. Assign the value 1.667 to array index 9.
		 fraction[9] = 1.667;
		 System.out.println(fraction[9]);
		 //e. Assign the value 3.333 to array index 6.
		 fraction[6] = 3.333;
		 System.out.println(fraction[6]);
		 //Sum all the elements of the array, using a for statement. Declare the
		 //integer variable x as a control variable for the loop.
		 int sum = 0;
		 for (int x = 0; x < fraction.length; x++) {
			 sum += fraction[x];
		 }	
		
		 
		// System.out.println(Arrays.toString(fraction));
		// TODO Auto-generated method stub

	}
	

}
