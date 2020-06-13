
public class PalindromeNumber {

	public static void isPlindromeNumber(int num) {
		int r = 0;
		int sum = 0;
		int t;
		t = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num=num/10;
		}
		if(t==sum) {
			System.out.println("Palindrome no");
		}
		else {
			System.out.println("Not Palindrome no");
		}
	}
	public static void main(String[] args) {
		
		isPlindromeNumber(343);
	}
}
