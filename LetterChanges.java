/* Using the Java language, have the function LetterChanges(str) take the str parameter being passed and modify 
 * it using the following algorithm. Replace every letter in the string with the letter following it in the
 *  alphabet (ie. c becomes d, z becomes a). Then capitalize every vowel in this new string (a, e, i, o, u) 
 *  and finally return this modified string.
 */

package Easy;

import java.util.*; 
import java.io.*;

class LetterChanges {  
  StringBuffer LetterChanges(String str) {
	  String lower = str.toLowerCase();
	  
//	int test = str.codePointAt(0)+1;
StringBuffer buff = new StringBuffer(lower);
for (int i =0; i<buff.length();i++){
	if (buff.codePointAt(i)>=97 && buff.codePointAt(i)<=122){
	if (buff.codePointAt(i) == 122) {
		buff.replace(i, i+1, Character.toString((char)97));
	}
	else {
buff.replace(i, i+1, Character.toString((char)(buff.codePointAt(i)+1)));
	}
String temp = new String(buff.substring(i, i+1));
switch (buff.substring(i, i+1)) {
	case "a":
		buff.replace(i, i+1, temp.toUpperCase());
		break;
	case "e":
		buff.replace(i,i+1, temp.toUpperCase());
		break;
	case "i":
		buff.replace(i, i+1, temp.toUpperCase());
		break;
	case "o":
		buff.replace(i, i+1, temp.toUpperCase());
		break;
	case "u":
		buff.replace(i, i+1, temp.toUpperCase());
		break;
	default:
		break;		
}
 
}
}
    return buff;
  
    
  } 
  
  public static void main (String[] args) {  
    Scanner  s = new Scanner(System.in);
    LetterChanges c = new LetterChanges();
   // System.out.print(c.LetterChanges(s.nextLine())); 
    System.out.println(c.LetterChanges(s.nextLine()));
  }   
  
}








  