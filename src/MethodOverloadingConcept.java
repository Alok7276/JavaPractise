//same method name but different parameter
public class MethodOverloadingConcept {

	public static void sum(){
		System.out.println("zero param");
	}
	public static int sum(int a){
		System.out.println(a);
		return a;
		
	}
	public static int sum(int b,int c){
		System.out.println("lund");
		return c+b;
	}
	public static void main(String[] args) {
		sum();
		sum(10);
		sum(10, 20);
	}
}
