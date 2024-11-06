package Ilagan_Activity;
import java.util.*;

public class JavaExercise1 {
	public static void main(String[] args) {
		// program will calculate the product of three integer
		Scanner scan = new Scanner(System.in);
		int x, y, z, result;
				
		System.out.print("Enter Value first integer: ");
		x = scan.nextInt();
		System.out.print("Enter Value Second integer: ");
		y = scan.nextInt();
		System.out.print("Enter Value Third integer: ");
		z = scan.nextInt();
		
		result = x*y*z;
		System.out.print("The product is " + result);
		
	}
}