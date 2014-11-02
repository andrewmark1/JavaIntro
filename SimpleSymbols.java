package Easy;

import java.util.*; 
import java.io.*;

class SimpleSymbols {  
  boolean SimpleSymbols(String str) { 
	  int zero=0;
	  for (int i =0; i<str.length()-1;i++){
		
		  if (Character.isLetter(str.charAt(i))){
			 
				  if(Character.codePointAt(str, i+1)== 43 && Character.codePointAt(str, i-1)==43){
					  zero +=0;
				  }
				  else{
					  zero +=1;
				  }
				  
			  }	  
	  }
	  
    if (zero == 0){
    	return true;
    }
    else {
    	return false;
    }
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    SimpleSymbols c = new SimpleSymbols();
    System.out.print(c.SimpleSymbols(s.nextLine())); 
  }   
  
}








  