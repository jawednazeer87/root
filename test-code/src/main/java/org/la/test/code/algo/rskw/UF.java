package org.la.test.code.algo.rskw;

import java.util.stream.IntStream;

public class UF {

    private int id[];
    private int count;

    public UF(int N){
        count = N;
        id = new int[N];
        IntStream.range(0, N).forEach( i -> id[i] = i);
    }
    public int count(){
        return count;
    }
    public boolean connected(int p, int q){
        return find(p)==find(q);
    }
    public int find(int p){
        return id[p];
    }
    public void union(int p, int q){
        int pID = find(p);
        int qID = find(q);
        if(pID==qID)
            return;
        IntStream.range(0, id.length)
                .forEach(i -> {
                    if (id[i]==pID)
                        id[i] = qID;
                });
    }

    public static void main(String[] args) {
        int N = 200;
        UF uf = new UF(N);

    }
}
