
public class StringManipulation {
	public static void main(String[] args) {
		String str="The rain have started here";
		String str1="The rain have started here";
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf("t"));
		System.out.println(str.indexOf("have"));
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.substring(0,9));
		String s="     Hello   World  ";
		System.out.println(s.trim());
		System.out.println(s.replaceAll(" ",""));
		String date ="25-12-2019";
		System.out.println(date.replaceAll("-","/"));
		String s1="cares";
		System.out.println(s1.concat(s));
		String x="Hello";
		String y="World";
		int a=100;
		int b=200;
		System.out.println(x + y);
		System.out.println(x+y+a+b);
		System.out.println(a+x+b+y);
	}

}
