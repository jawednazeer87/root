package org.la.test.code.hackr.rank;

import java.util.*;
import java.util.stream.Collectors;

/*
    This one I am trying using recursion by failing in some conditions
 */
//  TODO have to complete this task using recursion


public class ClimbingLeaderBoard3 {



    public static void main(String[] args) {
        List<Integer> ranked = new ArrayList<>(Arrays.asList(100, 100, 50, 40, 40, 20, 10));
        List<Integer> player = new ArrayList<>(Arrays.asList(5, 25, 50, 120));
        //result above [6, 4, 2, 1]
        //ranked = new ArrayList<>(Arrays.asList(100, 90, 90, 80, 75, 60));
        //player = new ArrayList<>(Arrays.asList(50, 65, 77, 90, 102));
        //result above [6, 5, 4, 2, 1]
        ranked = new ArrayList<>(Arrays.asList(100, 90, 90, 80, 75, 60));
        player = new ArrayList<>(Arrays.asList(40, 65, 77, 90, 99));
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
        int rmi = 0;
        int pi = 0;
        int rkey = (int) rankMap.keySet().toArray()[rmi];
        int playerVal = playerList.get(pi);
        int rankValue = rankMap.get(rkey);
        if(playerVal<rkey){
            result.add(rankValue+1);
        }
        else if(playerVal==rkey){
            result.add(rankValue);
        }
        else{
            result.add(rankValue-1);
        }
        rmi++;
        pi++;

        for( ; pi<playerList.size() ; ){
            if(rmi<rankMap.size()) {
                rkey = (int) rankMap.keySet().toArray()[rmi];
                rankValue = rankMap.get(rkey);
                playerVal = playerList.get(pi);
                if(playerVal<rkey){
                    result.add(rankValue+1);
                    rmi++;
                    pi++;
                }
                else if(playerVal==rkey){
                    result.add(rankValue);
                    rmi++;
                    pi++;
                }
                else {
                    rmi++;
                }

            }
            else{
                break;
            }
        }
        playerVal = playerList.get(playerList.size()-1);
        rkey = (int)rankMap.keySet().toArray()[rankMap.size()-1];
        rankValue = rankMap.get(rkey);
        if(playerVal==rkey){
            result.add(rankValue);
        }
        else if(playerVal>rkey){
            result.add(1);
        }
        return result;
    }

    static int rmi;
    static int forward(int playerRank, Map<Integer, Integer> rankMap){
        int rankKey = (int)rankMap.keySet().toArray()[rmi];
        int rankValue = rankMap.get(rankKey);
        if(rankValue==1){
            return 1;
        }
        if(playerRank>rankKey){
            rmi++;
            return forward(playerRank, rankMap);
        }
        return rankValue+1;
    }
    static int pi;
    static int reverse(List<Integer> player, int rankKey, int rankValue, List<Integer> result){
        if(player.get(pi)<rankKey){
            pi++;
            if(pi<player.size()){
                result.add(reverse(player, rankKey, rankValue+1, result));
            }
        }
        return rankValue;
    }

}
