public class Factorial {
	public int isFactorial (int num) {
		if(num < 0) {
			System.out.println("Invalid Number");
		}
		if(num==0) {
			System.out.println("Factorial of number is 1");
		}
		int fact=1;
		int i = 1;
		while (i <= num) {
			fact *= i;
			i++;
		}
		return fact;
	}
	public static void main (String[] args) {
		Factorial obj = new Factorial();
		System.out.println(obj.isFactorial(5));
		
	}

}