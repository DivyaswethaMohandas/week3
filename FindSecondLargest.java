package week3.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
    for(int i=0;i<data.length;i++) {
    	
    	System.out.print( " " +data[i]);
    }
    System.out.println(" ");
    int length1 = data.length;
   int k = data[length1-2];
  
    	System.out.println("Second Largest is  "+k);
    	
}
}