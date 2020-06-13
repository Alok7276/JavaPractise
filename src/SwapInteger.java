//x=10 y=20
//y=10 x=20
//x=x+y=30
//y=x-y=10
//x=x-y=20
public class SwapInteger {
public static void main(String[] args) {
	int x=10;
	int y=20;
	System.out.println("before swapping"+x);
	System.out.println("before swapping"+y);
	x=x+y;
	y=x-y;
	x=x-y;
	System.out.println(x);
	System.out.println(y);
}
}
