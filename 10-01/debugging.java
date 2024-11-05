package debugging;

public class debugging {
	public static void main (String[]args) {
		int n = 10;
		int sum = calculateSum(n);
		System.out.println("Sum: "+sum);
		
		int factorial = calculateFactorial(n);
		System.out.println("Factorial: " + factorial);
		
		int fibonacci = calculateFibonacci(n);
		System.out.println("Fibonacci:" + fibonacci);
		
	}
	public static int calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i<=n; i++) {
			sum=sum+i;
		}
		return sum;
	}
	public static int calculateFactorial(int n) {
		int factorial = 1;
		for (int i = 2; i<=n; i++) {
			factorial*=i;
		}
		return factorial;
	}
	public static int calculateFibonacci(int n) {
		int a = 0, b = 1, c;
		System.out.print("Fibonacci Series:" + " " );
		
		for (int i = 1; i < n; i++) {
			c = a+b;
			System.out.print(" " + c);
			a = b;
			b = c;
			//System.out.print(a + " ");
		}
		return b;
	}
}


