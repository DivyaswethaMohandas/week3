package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		String s1="Madam";		
	
		StringBuilder sb=new StringBuilder(s1);
		String s2=sb.reverse().toString();
			System.out.println(s2);
			
if(s2.equalsIgnoreCase(s1)) {
	System.out.println("Palindrome");
	}
else
		System.out.println("Not a Palindrome");
	}
}
