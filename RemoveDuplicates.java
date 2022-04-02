package week3.day1;
public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java session in java week1";
		int count =0;
		
		String[] str = text.split(" ");
		
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {						
					count++;					
				}
			}
		}
		if(count>0) {
		System.out.println("No of Duplicates is " +count);
		String replace = text.replace("java", "");
		String trim = replace.trim();
		System.out.println(trim);
	}
		}
		

}
