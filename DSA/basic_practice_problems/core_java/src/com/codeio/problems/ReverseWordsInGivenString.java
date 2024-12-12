package com.codeio.problems;

import java.util.Stack;

public class ReverseWordsInGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="i.like.this.program.very.much";
		String output = "";
		Stack<String> words= new Stack<>();
		String temp = "";
		for(int i=0;i<input.length();i++) {
			char c=input.charAt(i);
			if(c=='.') {
				words.add(temp);
				temp="";
			}
			else {
				temp +=c;
			}	
		}
		if(temp.length()>0) {
			words.add(temp);
		}
		while(words.size()>0) {
			output +=words.pop();
			if(words.size()>0) {
				output+=".";
			}
		}
		System.out.println(output);

	}

}
