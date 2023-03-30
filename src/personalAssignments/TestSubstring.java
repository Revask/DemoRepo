package personalAssignments;
import java.util.Arrays;

public class TestSubstring {
	   
	    /* Driver Code */  
	    public static void main(String args[])  
	    {    
	        String text= new String("Hello, My name is Sachin");  
	        /* Splits the sentence by the delimeter passed as an argument */  
	        String[] sentences = text.split(",");  
	        for (String s : sentences)
	        	 System.out.println(s);  
	    }  
	}    

