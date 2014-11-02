package Easy;

import java.util.*; 
import java.io.*;

class CheckNums {  
  String CheckNums(int num1, int num2) { 
	  String ans = new String();
	  if (num1 > num2){
		  ans = "false";
	  }
	  else if (num1<num2){
		  ans = "true";
	  }
	  else {
		  ans = "-1";
	  }
	  return ans;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    CheckNums c = new CheckNums();
    System.out.print(c.CheckNums(s.nextInt(),s.nextInt())); 
  }   
  
}








  