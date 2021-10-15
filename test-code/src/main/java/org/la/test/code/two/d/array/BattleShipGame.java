package org.la.test.code.two.d.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BattleShipGame {

	Map<String, Integer> rowColumn = new HashMap<>();
	
	public static void main(String[] args) {
		
		BattleShipGame bsg = new BattleShipGame();
		//int[] sunkHitCount = bsg.solution(20, "1B 2C,2D 4D,1A 1A,2A 3B,4F 5F,4E 4G", "2B 2D 3D 4D 4A");
		//int[] sunkHitCount = bsg.solution(4, "1B 2C,2D 4D", "2B 2D 3D 4D 4A");	//[1,1]
		int[] sunkHitCount = bsg.solution(3, "1A 1B,2C 2C", "1B");	//[0,1]
		
		System.out.println("Sunk :"+sunkHitCount[0]);
		System.out.println("Hit :"+sunkHitCount[1]);
	}

	
	public int[] solution(int N, String S, String T) {
		
		mapping(N);
		
		//rowColumn.forEach((k, v) -> System.out.println(k+" : "+v));
		
		return split(S, T);
		
	}
	
	private int[] split(String S, String T) {
		//System.out.println("split");
		String[] ships = S.split(",");
		//Arrays.stream(ships).forEach(ship -> System.out.println(ship));
		
		String hit[] = T.split(" ");
		
		Arrays.stream(hit).forEach(h -> System.out.println(h));
		
		String hitCoordinate[] = Arrays.stream(hit).map(h -> {
			String v = h.subSequence(0, 1) +""+ rowColumn.get(h.substring(1));
			return v;
		}).toArray(String[]::new);
		Arrays.stream(hitCoordinate).forEach(hc -> System.out.println(hc));
		
		return findCells(ships, hitCoordinate);
	}
	
	private int[] findCells(String ships[], String hitCoordinate[]) {
		
		int hitCount = 0;
		int sinkCount = 0;
		
		for(String ship : ships) {
			String[] cells = ship.split(" ");
			//Arrays.stream(cells).forEach(e -> System.out.print(e));
			//System.out.println();
			String shipLocation[] = findShipLocation(cells);
			Arrays.stream(shipLocation).forEach(sl -> System.out.print(sl+" "));
			System.out.println();
			int[] sunkHitCount = calculateHitSunkCount(shipLocation, hitCoordinate);
			
			sinkCount += sunkHitCount[0];
			hitCount += sunkHitCount[1];
		}
		
		return new int[] { sinkCount, hitCount };
	}
	
	
	private int[] calculateHitSunkCount(String shipLocation[], String hitCoordinate[]) {
		
		int[] sunkHitCount = new int[2];
		int hit = 0;
		
		for(int i=0 ; i<shipLocation.length ; i++) {
			for(int j=0 ; j<hitCoordinate.length ; j++) {
				if(shipLocation[i].equals(hitCoordinate[j])) {
					hit++;
					System.out.println("shipLocation["+i+"]: "+shipLocation[i]);
					System.out.println("hitCoordinate["+j+"]: "+hitCoordinate[j]);
				}
			}
		}
		
		if(hit==shipLocation.length) {
			sunkHitCount[0]++;
			hit = 0;
		}
		
		sunkHitCount[1] = hit;
		
		return sunkHitCount;
	}
	
	private int[] translateRowCol(String cells[], int i) {
		int row = Integer.valueOf(cells[i].substring(0, 1));
		int col = rowColumn.get(cells[i].substring(1));
		return new int[]{row, col};
	}
	
	/*
	 * coordinate of each ship in 1d String array
	 */
	private String[] findShipLocation(String cells[]) {
		
		int rc[] = translateRowCol(cells, 0);
		int row1 = rc[0];
		int col1 = rc[1];
		
		rc = translateRowCol(cells, 1);		
		int row2 = rc[0];
		int col2 = rc[1];
		
		int diffRow = row2 - row1;
		int diffCol = col2 - col1;
		
		String arr[] = null;
		
		if(diffRow==0 && diffCol==0) {
			arr = new String[1];
			arr[0] = row1 + "" + col1;
		}
		else if(diffRow==0 && diffCol>=1) {
			arr = new String[diffCol+1];
			for(int i=0 ; i<=diffCol ; i++) {
				arr[i] = row1 + "" + col1++;
			}
		}
		else if(diffRow>=1 && diffCol==0) {
			arr = new String[diffRow+1];
			for(int i=0 ; i<=diffRow ; i++) {
				arr[i] = row1++ + "" + col1;
			}
		}
		else {
			arr = new String[4];
			for(int i=0 ; i<=1 ; i++) {
				arr[i] = row1 + "" + (col1+i);
			}
			for(int j=2 ; j<4 ; j++) {
				arr[j] = row2 + "" + col1++;
			}
		}
		return arr;
	}
	
	private void mapping(int N) {
		char c = 'A';
		for(int i=1 ; i<=N ; i++) {
			rowColumn.put(Character.toString(c++), i);
		}
		return;
	}
}
