package Ilagan_ArrayExercise;
import java.util.Arrays;
public class IlaganArrayExercise {
	public static int[] findtheSum(int[] num, int target) {
		for (int i = 0; i<num.length-1; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i] + num[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		System.out.println("No match found");
		return null;
	}
	public static void main(String[]args) {
		int[] array = {4,5,6};
		int target = 9;
		
		int[] result = findtheSum(array, target);
		
		if (result != null) {
			System.out.println(Arrays.toString(result));
		}
		
		// TODO Auto-generated constructor stub
	}

}
