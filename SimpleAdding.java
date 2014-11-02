package Easy;

import java.util.*; 
import java.io.*;

class SimpleAdding {  
  int SimpleAdding(int num) { 
  int answer =0;
	  for (int i=0;i<=num;i++){
		  answer +=i;
	  }
       
    return answer;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    SimpleAdding c = new SimpleAdding();
    System.out.print(c.SimpleAdding(s.nextInt())); 
  }   
  
}








  