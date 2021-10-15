package org.la.test.code.hackr.rank;

import java.util.*;
import java.util.stream.Collectors;

/*
    This code is not working very perfectly but accepted by hackerank
    and failed in time limit
 */
public class ClimbingLeaderBoard {

    public static Map<Integer, Integer> assignedRank(List<Integer> distinctRankedList){
        int i = 1;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int e : distinctRankedList){
            map.put(e, i++);
        }
        return map;
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> playerList) {
        List<Integer> result = new ArrayList<>();
        List<Integer> dupRanked = new ArrayList<>(ranked);
        List<Integer> distinctRankedList = dupRanked.stream().distinct().collect(Collectors.toList());

        Map<Integer, Integer> map = null;
        for(int player : playerList) {
            if(!distinctRankedList.contains(player)){
                distinctRankedList.add(player);
                //distinctRankedList = distinctRankedList.stream().distinct().collect(Collectors.toList());
                Collections.sort(distinctRankedList, Collections.reverseOrder());
            }
            map = assignedRank(distinctRankedList);
            Integer value = map.get(player);
            if(value!=null){
                result.add(value);
            }
        }
        System.out.println("map: "+map);

        return result;
    }


    public static void main(String[] args) {
        List<Integer> ranked = new ArrayList<>(Arrays.asList(100, 100, 50, 40, 40, 20, 10));
        List<Integer> player = new ArrayList<>(Arrays.asList(5, 25, 50, 120));
        ranked = new ArrayList<>(Arrays.asList(100, 90, 90, 80, 75, 60));
        player = new ArrayList<>(Arrays.asList(50, 65, 77, 90, 102));
        ranked = new ArrayList<>(Arrays.asList(100, 90, 90, 80, 75, 60));
        player = new ArrayList<>(Arrays.asList(40, 50, 65, 77, 90, 102, 103));
        List<Integer> integers = climbingLeaderboard(ranked, player);
        System.out.println("result: ----------------------: "+integers);
    }

}
