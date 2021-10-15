package org.la.test.code.hackr.rank;

import java.util.*;
import java.util.stream.Collectors;

public class DenseRank {

    public static List<Integer> climbingLeaderboard(List<Integer> rank, List<Integer> alice) {
        List<Integer> score = rank.stream().distinct().collect(Collectors.toList());
        //ranked.forEach(System.out::println);
        //distinctRankedList.forEach(System.out::println);
        List<Integer> resultList = new ArrayList<>();
        int rankVal = score.size();
        int scEndInd = score.size() - 1;
        int alEndInd = alice.size() - 1;
        int alStartInd = 0, scStartInd = 0;
        int firstRank = -1;
        /*
            setting last rank
         */
        if(alice.get(alStartInd)<score.get(scEndInd)){
            resultList.add(rankVal+1);
            alStartInd++;
            //scEndInd--;
        }
        /*
            setting first rank
         */
        if(alice.get(alEndInd)>score.get(scStartInd)){
            //resultList.add(scStartInd+1);
            firstRank = scStartInd+1;
            alEndInd--;
            scStartInd++;
        }
        for( ; (alStartInd<=alEndInd) && scEndInd>=1 ; scEndInd--, rankVal--){
            if(alice.get(alStartInd)==score.get(scEndInd)){
                resultList.add(rankVal);
                alStartInd++;
            }
            else if(alice.get(alStartInd)<score.get(scEndInd-1) && alice.get(alStartInd)>score.get(scEndInd)){
                resultList.add(rankVal);
                alStartInd++;
                if(alStartInd>0 && (alice.get(alStartInd-1)<score.get(scEndInd-1))){

                }
            }

        }
        //Collections.sort(resultList, Collections.reverseOrder());
        if(firstRank!=-1){
            resultList.add(firstRank);
        }
        return resultList;
    }

    public static void main(String[] args) {
        List<Integer> score = Arrays.asList(100, 90, 90, 80, 75, 60);
        //score = Arrays.asList(100, 100, 50, 40, 40, 20, 10);
        score = Arrays.asList(100, 90, 50, 45, 40, 20, 10);
        List<Integer> alice = Arrays.asList(50, 65, 77, 90, 102);
        //alice = Arrays.asList(5, 25, 50, 120);
        alice = Arrays.asList(25, 43, 50, 60);
        List<Integer> result = climbingLeaderboard(score, alice);
        result.forEach(System.out::println);
    }





    public static Map<Integer, Integer> assignedRank(List<Integer> distinctRankedList){
        int i = 1;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int e : distinctRankedList){
            map.put(e, i++);
        }
        return map;
    }

    public static List<Integer> climbingLeaderboardOld(List<Integer> ranked, List<Integer> playerList) {
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
}
