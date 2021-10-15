package org.la.test.code.hackr.rank;

import java.util.*;
import java.util.stream.Collectors;

public class WeightedUniformString {

    static Map<Character, Integer> weightMap = new HashMap<>();
    static List<Integer> weightFound = new ArrayList<>();

    public static void main(String[] args) {
        String s = "abbcccdddd";
        List<Integer> queries = new ArrayList<>(Arrays.asList(1,7,5,4,15));
        weightedUniformStrings(s, queries);
    }
    static void getWeightMap(){
        int i=1;
        for(char c='a'; c<='z' ; c++, i++){
            weightMap.put(c, i);
        }
    }

    public static List<String> weightedUniformStrings(String s, List<Integer> queries) {

        //char and weight map created
        getWeightMap();
        while (s.length()>0) {
            s = uniformString(s, queries);
        }
        List<String> result = new ArrayList<>();
        System.out.println(weightFound);

        for(Integer query : queries){
            boolean ul = weightFound.contains(query) ?  result.add("Yes") : result.add("No") ;
        }

        return result;
    }

    static String uniformString(String s, List<Integer> queries){

        char[] arr = s.toCharArray();
        char a = arr[0];
        weightFound.add(weightMap.get(a));
        StringBuilder sb = new StringBuilder(a);
        int l = arr.length;
        int i=1;
        for(; i<l ; i++){
            if(a==arr[i]){
                sb.append(a);
                weightFound.add(weightMap.get(a)*(i+1));
            }
            else{
                break;
            }
        }
        return s.substring(i);
    }
}
