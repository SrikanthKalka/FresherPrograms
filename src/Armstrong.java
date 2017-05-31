public class Armstrong {
	public static void main(String args[]) {
		int num = 153;
		int n = num; // use to check at last time
		int sum = 0, remainder;
		while (num > 0) {
			remainder = num % 10;
			sum = sum + (int) Math.pow(remainder, 3);
			num = num / 10;
			System.out.println(num);
		}
		if (sum == n)
			System.out.println(n + " is an Armstrong Number");
		else
			System.out.println(n + " is not a Armstrong Number");
	}
}
