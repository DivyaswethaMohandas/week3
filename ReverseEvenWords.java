package week3.day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester"; 
 String[] split1 = test.split(" ");

 for(int i=0;i<split1.length;i++) {
	 if(i%2!=0) {
		 StringBuilder sb=new StringBuilder(split1[i]);
		 String rev1 = sb.reverse().toString();
		 System.out.println(rev1);
			
	 }
	 else {
		 System.out.println(split1[i]);
	 }


}
}
}