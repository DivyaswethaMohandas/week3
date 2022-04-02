package week3.day1;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count;
		System.out.println("Length of the array is "+arr.length);
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++) {
			count=0;
			for(int j=1+i; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				}if(count>0) {
					System.out.println("Duplicate numbers are "+arr[i]+" ");
			}
			
		}
	}

}