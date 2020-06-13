//Wap to reverse a String
public class StringReverse {
public static void main(String[] args) {
	String s="Java";//mnuneles 4
	String rev="";
	int len=s.length();//8
	for(int i=len-1;i>=0;i--){
	rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	StringBuffer sb=new StringBuffer(s);
	System.out.println(sb.reverse());
	
}
}
