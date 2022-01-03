package _6Companies30Days;

import java.util.*;

// Print Anagrams Together https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/#

/* 
Given an array of strings, return all groups of strings that are anagrams. 
The groups must be created in order of their appearance in the original array. 
Look at the sample case for clarification.

Input:
N = 5
words[] = {act,god,cat,dog,tac}
Output: 
god dog
act cat tac
Explanation:
There are 2 groups of
anagrams "god", "dog" make group 1.
"act", "cat", "tac" make group 2.
*/

public class printAnagramsTogether {

    public List<List<String>> Anagrams(String[] string_list) {
        int len = string_list.length;
        HashMap<String,Integer> map = new HashMap<>(); 
        int index = 0;
        List<List<String>> list1 = new ArrayList<>();
        for(int i=0;i<len;i++) {
           char arr[] = new char[string_list[i].length()];
           arr = string_list[i].toCharArray();
           Arrays.sort(arr);
           String word = new String(arr);
           List<String> list = new ArrayList<>();
           if(map.containsKey(word)) {
               int val = map.get(word);
               list = list1.get(val);
               list.add(string_list[i]);
               list1.set(val,list);
           }
           else {
               list.add(string_list[i]);
               map.put(word,index);
               list1.add(list);
               index++;
               
           }
       }
       return list1;
   }
}
