
public class PrimeNumbers {

	public static boolean isPrimeNumber(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num % i==0) {
				System.out.println("the number is "+ num);
				return false;
			}
		}
		System.out.println("the number is "+ num);
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isPrimeNumber(4));
	}
}
