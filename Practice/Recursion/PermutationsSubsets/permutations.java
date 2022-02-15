package PermutationsSubsets;

import java.util.ArrayList;

public class permutations {
    
    public static void main(String[] args) {
        // allPermutations("","abcd");
        System.out.println(allPermutationsList("","abc"));
        System.out.println(allPermutationsListcount("","abcd"));
    }
    static void allPermutations(String p,String up){

        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        char curr = up.charAt(0);
        for(int i=0;i< p.length()+1;i++){
            String first =  p.substring(0,i);
            String second =  p.substring(i);
            allPermutations( first + curr + second  , up.substring(1));
        }

    }
    static ArrayList<String> allPermutationsList(String p,String up){
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> answer = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char curr = up.charAt(0);
        for(int i=0;i< p.length()+1;i++){
            String first =  p.substring(0,i);
            String second =  p.substring(i);
            
            list = allPermutationsList( first + curr + second  , up.substring(1));

            answer.addAll(list);
        }
        return answer;

    }
    static Integer allPermutationsListcount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        char curr = up.charAt(0);
        int count =0;
        for(int i=0;i< p.length()+1;i++){
            String first =  p.substring(0,i);
            String second =  p.substring(i);
            
            count += allPermutationsListcount( first + curr + second  , up.substring(1));
        }
        return count;

    }
}
