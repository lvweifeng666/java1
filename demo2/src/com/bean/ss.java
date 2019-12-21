package com.bean;

public class ss {


	    public static void main(String[] args) {
	    	
String sss="12343345566689056";
	       ss builtinMethod = new ss();

	        //builtinMethod.reverseWithStringBuilderBuiltinMethod("javaguides");
	        builtinMethod.reverseWithStringBuilderBuiltinMethod(sss);

	    }

	
	  public String reverseWithStringBuilderBuiltinMethod(String we) {
	  
	  final StringBuilder builder = new StringBuilder(we);
	  
	  display(we, builder.reverse().toString());
	  
	  return builder.reverse().toString();
	  
	  }
	 

	
	  private void display(String input, String output) {
	  
	  System.out.println(" input string :: " + input);
	  
	  System.out.println(" output string :: " + output);
	 
	  
	  }
	
	    	

	
	}



