package Algorithms1;

//Given strings s1 and s2 check if s2 exists in s2 and how many times does it occur
//Cannot use indexOf

public class findString {
	
	public static int numOccur(String s1, String s2) {
		int count = 0;
		
		if (s2.length()==0) {
			return 0;
		}
		else if(s1.length()==0) {
			return -1;
		}
		
		if (!s1.contains(s2)) {
			return 0;
		}
		
		//iterates over every character in s1
		for(int i=0; i<s1.length()-s2.length()+1; i++) {
			//check if the first character of s2 is at index i of s1
			//if(s1.charAt(i)==s2.charAt(0)) {
				//check for s1 in s2
				if (s1.substring(i,i+s2.length()).equals(s2)) {
					count++;	//update counter
					i += s2.length()-1;	//skip till the end of the word since it is just s2
				}
			//}
			//System.out.println(i);
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello hello World!";
		String s2 = "potato";
		System.out.println("Number of occurances of " + s2 + " in " + s1 + " are " + numOccur(s1,s2));
	}

}
