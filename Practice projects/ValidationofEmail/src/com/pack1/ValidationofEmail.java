package com.pack1;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationofEmail
{ 
   private static final String regex= "^(.+)@(.+)$";

   public static void main(String args[])
   {
	   List<String>emails=new ArrayList<String>();
	   
	   emails.add("purna@example.com");
	   emails.add("chandra#@example.org.in");
	   emails.add("madhuchandhu@example.co.in");
	   
	   emails.add("madhu.example.com");
	   emails.add("chandh#example.com");
	   emails.add("@#example.com");
	   
	   Pattern p=Pattern.compile(regex);
	   
	   for(String value : emails)
	   {
	       Matcher matcher=p.matcher(value);  
                    
                   System.out.println("The Email address " + value + "  is  " + (matcher.matches() ? " valid" : "invalid"));
                   }
                                                                                                                                                                                                       
   }
   
}

