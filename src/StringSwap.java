
public class StringSwap {
public static void main(String[] args) {
	String a="Hello";
	String b="World";
	System.out.println("Before swapping :");
	System.out.println(a);
	System.out.println(b);
	//1 append a and b
	a=a+b;//Hello World
	
	b=a.substring(0,a.length()-b.length());
	a=a.substring(b.length());
	System.out.println("The value of a and b after swapping");
	System.out.println(a);
	System.out.println(b);
}
}
