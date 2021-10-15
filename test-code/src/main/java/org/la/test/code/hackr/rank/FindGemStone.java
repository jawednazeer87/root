package org.la.test.code.hackr.rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindGemStone {

    public static void main(String[] args) {
        List<String> sList = new ArrayList<>(Arrays.asList("qsda", "bdsa", "ffaf", "eag", "rrarrs", "ffda"));
        sList = new ArrayList<>(Arrays.asList("qqqsddda"));
        sList = new ArrayList<>(Arrays.asList("qqqsddda", "zzzzqda"));
        sList = new ArrayList<>(Arrays.asList("c", "c"));
        sList = new ArrayList<>(Arrays.asList("c"));
        sList = new ArrayList<>(Arrays.asList("abcdde", "baccd", "eeabg"));
        sList = new ArrayList<>(Arrays.asList("abcddfafasdfkljhaslfjhalfde", "bachlfpsafhewamnmnclhewurhwcd", "eeabgjmtesljdfhhasdjfljafhjasg"));
        int result = gemstones(sList);
        System.out.println("gemstones: "+result);
    }

    public static int gemstones(List<String> arr) {

        if(arr.size()==1){
            return removeDuplicate(arr.get(0));
        }
        List<String> list = selectReferenceStringForComparison(arr);
        System.out.println(list);
        int result = countGemstones(list);
        return result;
    }

    static int removeDuplicate(String s){
        String collect = Arrays.asList(s.split("")).stream()
                .distinct().collect(Collectors.joining());

        return collect.length();
    }

    static int countGemstones(List<String> list){
        int result = 0;
        String unqiue = Arrays.asList(list.get(0).split("")).stream().distinct().collect(Collectors.joining());

        char[] ca = unqiue.toCharArray();

        for(int i=0 ; i<ca.length ; i++){

            boolean gemstoneFound = true;
            for(int x=1 ; x<list.size() ; x++){
                int ind = list.get(x).indexOf(ca[i]);
                if(ind==-1){
                    gemstoneFound = false;
                    break;
                }
            }
            if(gemstoneFound){
                result++;
            }
        }
        return result;
    }
    static List<String> selectReferenceStringForComparison(List<String> arr){
        int result = 0;
        int minLen = arr.get(0).length();
        int index = 0;
        for(int i=1 ; i<arr.size() ; i++){
            if(minLen>arr.get(i).length()){
                minLen = arr.get(i).length();
                index = i;
            }
        }
        if(index!=0) {
            String temp = arr.get(0);
            arr.set(0, arr.get(index));
            arr.set(index, temp);
        }
        System.out.println(arr);
        return arr;
    }

}
