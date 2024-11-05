package Ilagan_Lesson6Activity1;

public class Employee {

	public static int employee(int target, int[] employeeHours) {
		int result = 0;
		for (int i : employeeHours) {
			if(i>= target)
				result++;
		}
		return result; 
		
	}

	public static void main(String[] args) {
		int[]employeeHours = {7,7,8,9,5,0};
		int targetHours = 5;
		
		System.out.println("There are " + employee( targetHours , employeeHours )+ " employee who met the target hours");

	}

}
