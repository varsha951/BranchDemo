public class ReverseSentance {
public static void printReverse(String s) {
	String s1[]=s.split("[.]");
	int i=s1.length-1;
	recurse(s1,i);	
}
public static void recurse(String s[],int i) {
	if (i==0) {
		System.out.print(s[i]);
		return;
	}
	System.out.print(s[i]);
	System.out.print(".");
	recurse(s,--i);
}
}
