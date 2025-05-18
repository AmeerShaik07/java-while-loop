public class NeonNumber {
	public void isNeon(int num) {
		if (num < 0) {
			System.out.println("Invalid Number");
		}
		int temp = num;
		int square = num * num;
		int sum = 0;
		while(square != 0) {
			sum += square % 10;
			square /= 10;
		}
		if (temp == sum) {
			System.out.println(temp + " " + "is a Neon Number");
		}
		else {
			System.out.println(temp + " " + "is not a Neon Number");
		}
	}
	public static void main (String [] args) {
		NeonNumber obj = new NeonNumber ();
		obj.isNeon(12);
		
	}

}