package Easy;

import java.util.*; 
import java.io.*;

class LetterCapitalize {  
  String LetterCapitalize(String str) { 
int i =0;

StringTokenizer token = new StringTokenizer(str);
String[] arr = new String[token.countTokens()];
	  
	 

	  while (token.hasMoreTokens()){		  
		  arr[i] = token.nextToken();		  
		  StringBuffer buff = new StringBuffer(arr[i]);
		  String temp = new String(arr[i]);
		  arr[i]=buff.replace(0, 1,temp.substring(0, 1).toUpperCase()).toString();
		  i++;
	
	  }
	
	StringBuilder build = new StringBuilder();
	for (String s: arr) {
		build.append(s+" ");
	}
    return build.toString();
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    LetterCapitalize c = new LetterCapitalize();
    System.out.print(c.LetterCapitalize(s.nextLine())); 
  }   
  
}








  