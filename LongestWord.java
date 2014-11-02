package Easy;

import java.util.*; 
import java.io.*;

class LongestWord {  
  String LongestWord(String sen) { 
	  
//String[] words = sen.split(" ");
StringTokenizer st = new StringTokenizer(sen);
String longestWord ="";
while (st.hasMoreTokens()){
	String currentWord = st.nextToken();
	if (currentWord.length()>longestWord.length()){
		longestWord = currentWord;
	}
}

return longestWord;

      
  
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    LongestWord c = new LongestWord();
  // System.out.print(c.LongestWord(s.nextLine())); 
    System.out.println(c.LongestWord(s.nextLine()));
  }   
  
}








  