package question3;

/**
 * This code is to determine if a string input is a circular string. Written below is the problem I was assigned.
 * 
 * For some alphabet A, we define a circular string over A as a sequence:x=a1a2...anfor ai  A, 1in with the assumption that a1 follows an.  
 * In other words, x can be represented by any circular permutation of a1a2...an. 
 * Write a function that determines if two strings are circular permutations of each other.

 * @author prog
 *
 */
public class CircularString {
	
	public static void main(String[] args){
		String string1, string2;
		string1= "cut";
		string2= "tcu";
		System.out.println("input two strings");
		if(circularCheck(string1, string2)){
			System.out.println("these strings are circular representations of each other");
		}else{
			System.out.println("these strings are not circular represtentations of each other");
		}
	}
	
	public static boolean circularCheck(String string1, String string2){
		int n, startpoint;
		startpoint=0;
		if(string1.length() !=string2.length()){return false;}

		for(n=0; n<string1.length(); n++){
			if(string1.charAt(0) == string2.charAt(n)){
				startpoint = n;
			}
		}
		
		while(n<string1.length()){
			if(string1.charAt(n)==string2.charAt(startpoint)){
				if(startpoint<string1.length()){
					startpoint++;
					n++;
				}else{
					startpoint=0;
				}
			}else{
				return false;
			}
		}
		return true;
	}
}