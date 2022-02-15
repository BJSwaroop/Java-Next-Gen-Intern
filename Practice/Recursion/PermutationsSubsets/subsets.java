package PermutationsSubsets;

import java.util.ArrayList;

public class subsets {
    
    public static void main(String[] args) {
        
        // so to print all the subsets using recursion we see that each character has a role of getting to be taken or not to be taken.
        //  we have to print for all the possible cases in order.
        // define a method which returns no arguments.
        getSubSets("", "abc");
        System.out.println(getSubSetsList("", "abc"));
        System.out.println(getSubSetsAsciiList("", "abc"));
    }
    static void getSubSets(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        char curr = up.charAt(0);
        getSubSets(p + curr , up.substring(1));
        getSubSets(p , up.substring(1));
    }
    static ArrayList<String> getSubSetsList(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char curr = up.charAt(0);
        
        ArrayList<String> left = getSubSetsList(p + curr , up.substring(1));
        ArrayList<String> right = getSubSetsList(p , up.substring(1));
        left.addAll(right);
        return left;
    }
    static ArrayList<String> getSubSetsAsciiList(String p, String up){
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char curr = up.charAt(0);
        ArrayList<String> first = getSubSetsAsciiList(p + curr , up.substring(1));
        ArrayList<String> third = getSubSetsAsciiList(p , up.substring(1));
        ArrayList<String> second = getSubSetsAsciiList(p+  (curr + 0) , up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }

    
}
