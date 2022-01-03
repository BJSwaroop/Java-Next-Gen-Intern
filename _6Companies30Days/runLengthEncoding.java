package _6Companies30Days;

/* 
Input:
str = aaaabbbccc
Output: a4b3c3
Explanation: a repeated 4 times
consecutively b 3 times, c also 3
times.
*/

public class runLengthEncoding {
    String encode(String str)
	{
    String s = "";
    int c =1;
          int i;
          
          for( i =0 ; i<str.length()-1 ; i++)
          {
              if(str.charAt(i) == str.charAt(i+1))
              c++;
              
              else if(str.charAt(i)!=str.charAt(i+1))
              {
                  s = s + str.charAt(i) + c;
                  c =1;
              }
              
         }
          
          s = s + str.charAt(i) + c;
          return s;
	}
    
}
