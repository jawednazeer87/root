package org.la.test.code.karumanchi.back.tracking;

/*
    Finding the length of connected cells of 1s (regions) in an matrix of Os and 1s
 */
public class LenConnectedCells {

    int getVal(int a[][], int i, int j, int row, int col){
        if(i<0 || i>=row || j<0 || j>=col){
            return 0;
        }
        else
            return a[i][j];
    }

    void findMaxBlock(int a[][], int r, int c, int row, int col, int size, boolean cntArr[][]){
        if(r>=row || c>=col)
            return;
        cntArr[r][c] = true;
        size++;
        if(size>maxSize)
            maxSize = size;
        int direction[][] = {{-1, 0}, {-1, -1}, {0, -1}, {1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}};
        for(int i=0 ; i<8 ; i++){
            int newI = r + direction[i][0];
            int newJ = c + direction[i][1];
            int val = getVal(a, newI, newJ, row, col);
            if(val>0 && cntArr[newI][newJ]==false){
                findMaxBlock(a, newI, newJ, row, col, size, cntArr);
            }
        }
        cntArr[r][c] = false;
    }

    int maxSize = 0;
    int getMaxOnes(int a[][], int rMax, int cMax){
        int size = 0;
        boolean[][] cntArr = new boolean[rMax][cMax];
        for(int i=0 ; i<rMax ; i++){
            for(int j=0 ; j<cMax ; j++){
                if(a[i][j]==1){
                    findMaxBlock(a, i, j, rMax, cMax, 0, cntArr);
                }
            }
        }
        return maxSize;
    }

    public static void main(String[] args) {
        int[][] a = {{1,1,1},{1,1,1},{1,1,1},{1,1,1},{0,0,0}};
        LenConnectedCells cells = new LenConnectedCells();
        int rMax = cells.getMaxOnes(a, a.length, a[0].length);
        System.out.println("max: "+rMax);
    }
}
