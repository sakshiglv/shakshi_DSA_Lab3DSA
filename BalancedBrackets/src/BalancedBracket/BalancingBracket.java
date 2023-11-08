package BalancedBracket;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBracket {
	public static void main(String args[] ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string of brackets: ");
		String input = sc.next();
		boolean result = checkBalancedBracket( input);
		if(result) {
			System.out.println("given string is a balanced bracket");
		}else {
			System.out.println("it is not a balanced bracket");
		}				
	}
	
	
	static boolean checkBalancedBracket(String input) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i<input.length(); i++) {
			char c = input.charAt(i);
			
			if(c == '(' || c == '{' || c == '[') {
				stack.push(c);
				continue;							
			}
		
			
			if(stack.isEmpty()) {
				return false;
			}
			
			char temp = stack.pop();
			switch(c) {
				case ')' :
					if(temp == '[' || temp == '{')
						return false;
					    break;
				case ']' : 
					if(temp == '(' || temp == '{')
						return false;
					    break;
				case '}' : 
					if(temp == '[' || temp == '(')
						return false;
					    break; 
				default : System.out.println("please enter correct type of column");    
			    
			}
		}
		return stack.isEmpty();
			
		
		
	}

}
