package org.la.test.code.hackr.rank;

import java.util.*;
import java.util.stream.Collectors;

/*
    This one I am trying using recursion by failing in some conditions
 */
//  TODO have to complete this task using recursion


public class ClimbingLeaderBoard2 {



    public static void main(String[] args) {
        List<Integer> ranked = new ArrayList<>(Arrays.asList(100, 100, 50, 40, 40, 20, 10));
        List<Integer> player = new ArrayList<>(Arrays.asList(5, 25, 50, 120));
        //result above [6, 4, 2, 1]
        //ranked = new ArrayList<>(Arrays.asList(100, 90, 90, 80, 75, 60));
        //player = new ArrayList<>(Arrays.asList(50, 65, 77, 90, 102));
        //result above [6, 5, 4, 2, 1]
        ranked = new ArrayList<>(Arrays.asList(100, 90, 90, 80, 75, 60));
        player = new ArrayList<>(Arrays.asList(40, 65, 77, 90, 110));
        //[6, 4, 3, 2, 1]
        List<Integer> integers = climbingLeaderboard(ranked, player);
        System.out.println("result: "+integers);
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> playerList) {

        List<Integer> result = new ArrayList<>();
        List<Integer> distinctRankedList = ranked.stream().distinct().collect(Collectors.toList());
        Collections.reverse(distinctRankedList);
        Map<Integer, Integer> rankMap = new LinkedHashMap<>();
        final int[] i = {distinctRankedList.size()+1};
        distinctRankedList.stream().forEach(e -> {
            i[0] = i[0] - 1;
            rankMap.put(e, i[0]);
        });
        rmi = 0;
        pi = 0;
        for( ; pi<playerList.size() ; ){
            if(rmi<rankMap.size()) {
                int rkey = (int) rankMap.keySet().toArray()[rmi];
                int playerVal = playerList.get(pi);
                if (playerVal < rkey){
                    result.add(reverse(playerList, rkey, rankMap.get(rkey), result));
                    //reverse(playerList, rkey, rankMap.get(rkey), result);
                }
                else if(playerList.get(pi)==rkey){
                    result.add(rankMap.get(rkey));
                    rmi++;
                    pi++;
                }
                else {
                    result.add(forward(playerList.get(pi), rankMap));
                    //forward(playerList.get(pi), rankMap);
                }
                //rmi++;
            }
            else{
                break;
            }
        }
        return result;
    }
    static int rmi;
    static int forward(int playerRank, Map<Integer, Integer> rankMap){

        int rankKey = (int)rankMap.keySet().toArray()[rmi];
        int rankValue = rankMap.get(rankKey);
        if(rankValue==1){
            rmi++;
            pi++;
            return 1;
        }
        int advRankKey = (int)rankMap.keySet().toArray()[rmi+1];
        if(playerRank>advRankKey){
            rmi++;
            return forward(playerRank, rankMap);
        }
        else if(playerRank==rankKey){
            rmi++;
            pi++;
            return rankValue;
        }
        else{
            pi++;
        }
        return rankValue-1;
    }
    static int pi;
    static int reverse(List<Integer> player, int rankKey, int rankValue, List<Integer> result){
        if(player.get(pi+1)<rankKey){
            pi++;
            //if(pi<player.size()){
            rankValue = reverse(player, rankKey, rankValue+1, result);
            //}
        }
        else{
            //rmi++;
            pi++;
        }
        return rankValue+1;
    }

}
