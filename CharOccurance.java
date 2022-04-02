package week3.day1;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		
		int count=0;
		char[] charArray1 = str.toCharArray();		
		for(int i=0;i<charArray1.length;i++) {
			if(charArray1[i]=='n') {
				count++;			
			}
		}
			System.out.println("Number of 'n' in the given char is  " +count);
		}
	
}