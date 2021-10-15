package org.la.test.code.algo;

public class MaxRankBetweenCities {

    public static void main(String[] args) {
        MaxRankBetweenCities mrbc = new MaxRankBetweenCities();
        int roads[][] = {{0,1}, {0,3}, {1,2}, {1,3}};
        int max = mrbc.maxRank(roads.length, roads);
        System.out.println("max rank: "+max);
    }

    int maxRank(int n, int roads[][]){
        int count[] = new int[n];
        int direct[][] = new int[n][n];

        for(int[] road : roads){
            count[road[0]]++;
            count[road[1]]++;
            direct[road[0]][road[1]] = 1;
            direct[road[1]][road[0]] = 1;
        }

        int rank = 0;
        for(int i=0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                rank = Math.max(rank, count[i]+count[j]-direct[i][j]);
            }
        }
        return rank;
    }
}
