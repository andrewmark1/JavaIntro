package Easy;

import java.util.*; 
import java.io.*;

class FirstFactorial {  

  int FirstFactorial(int num) { 
	  int ans = 1;
	  for (int i=num;i>0;i--){
		  ans = ans *num;
		  num --;
		  
	  }

	  return ans;

    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    FirstFactorial c = new FirstFactorial();
    System.out.print("What number do you want factorialized: ");
    System.out.print(c.FirstFactorial(s.nextInt())); 
  }   
  
}








  