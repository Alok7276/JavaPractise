
public class DemoA {
int a=10;//non static variable
static int i=20;//static variable
public static void main(String[] args) {
	DemoA b=new DemoA();//creating object
	
	
	System.out.println(b.a);
	System.out.println(i);
	b.sub();
	sum();
	
	
}
public static void sum(){
	System.out.println("sum method");
}
public void sub(){
	System.out.println("sub method");
}
}
