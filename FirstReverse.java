package Easy;

import java.util.*; 
import java.io.*;
import java.lang.reflect.Array;

class FirstReverse {  
  String FirstReverse(String str) { 

    char[] arr = new char[str.length()]; 
    int j = 0;
    
    for (int i = str.length(); i>0; i--){
    	arr[j] = str.charAt(i-1);
    	j++;
    }
    String answer = new String(arr);   
    return answer;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    FirstReverse c = new FirstReverse();
    System.out.print(c.FirstReverse(s.nextLine())); 
  }   
  
}