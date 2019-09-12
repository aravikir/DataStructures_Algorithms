package practice_interviews;

import java.util.ArrayList;
import java.util.List;

public class Jetlenses {
	
	/*# Problem Description:

	# Let's say you're given a sentence in the form of words separated
	# with only spaces and no punctuation. For example, something like this:

	# "this is the greatest thing ever"

	# Every word in this sentence can be mispelled. For our purposes,
	# a mispelling is a single character omitted from a word. For example,
	# these are the mispellings of "this":

	# "his"
	# "tis"
	# "ths"
	# "thi"

	# A sentence is considered "ill-constructed" if at least one of its
	# words is mispelled.

	# Given a sentence, build a method that returns all possible "ill-constructed"
	# versions of that sentence.
	#
	#
	# "this is great" => [
	#   "tis is great",
	#   "tis s great",
	#   "tis s gret",
	#   "his is great"
	#]*/

	public static void main(String[] args) {
		String str = "this is great";
	    String[] strArray = str.split(" ");
	    
	    //System.out.println(str);
	    System.out.println(misspellSentence(strArray));
	  }

	  static ArrayList<String> misspell(String str){
		  ArrayList<String> str2 = new ArrayList<>();
	    char[] c = str.toCharArray();
	    
	    for (int i = 0; i<c.length; i++) {
	    	StringBuilder sb = new StringBuilder();
		    sb.append(str);
		    sb.deleteCharAt(i);
		    str2.add(sb.toString());	    	
	    }
	    return str2;
	  }
	  
	  static ArrayList<ArrayList<String>> misspellSentence(String[] str) {
		  ArrayList<ArrayList<String>> str2 = new ArrayList<>();
		  for(int i = 0; i<str.length; i++) {
			  str2.add(misspell(str[i]));
		  }
		  return str2;
	  }

}
