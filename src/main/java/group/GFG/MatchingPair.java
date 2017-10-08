package main.java.group.GFG;

import java.util.Stack;

public class MatchingPair {
	
	
	
	public static int findMatchingPairs(String input){
		if(input == null)
			return -1;
		int counter = -1;
		int matchingPairs= 0;
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<input.length(); i++){
			char c = input.charAt(i);
			if(i == 0 && c >='A' && c <='Z')
				stack.push(c);
			else{
				//check if its a valid letter first
				if(c >= 'A' && c <= 'Z')
					stack.push(c);
				else{
					//may be a small letter
					//we peek inside to see if its corresponding cap letter is present
					if(!stack.isEmpty() && stack.peek() == Character.toUpperCase(c)){
						stack.pop();//we remove the matching pair then and there
						matchingPairs++;
					}
					else{
						if(matchingPairs == 0)
							return -1;
						return matchingPairs;
					}
				}
			}
			counter++;
		}
		if(matchingPairs == 0)
			return -1;
		return counter;
	}
	
	public static void main(String[] args){
		String t1 = "A0ba";
		String t2 = "ABbCca";
		String t3 = "ABbba";
		String t4 = "";
		String t5 = "";
		System.out.println(findMatchingPairs(t1));
		System.out.println(findMatchingPairs(t2));
		System.out.println(findMatchingPairs(t3));
	}

}
