package week3.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String txt1="stops";
		String txt2 = "potss"; 
		boolean flag=false;
		
		if((txt1.length())==(txt2.length())) {
		char[] a1= txt1.toCharArray();
		char[] a2= txt1.toCharArray();
  Arrays.sort(a1);
  Arrays.sort(a2);
  	flag=Arrays.equals(a1,a2);  
  }
		if(flag==true) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not  an Anagram");
		}
}
}