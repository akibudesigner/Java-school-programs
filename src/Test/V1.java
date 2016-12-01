package Test;

import java.util.Random;

public class V1 {

	public static int[][] v = new int[][]{
			{3,3,2,1},
			{2,2,7,0},
			{3,4,1,1}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 0;
		int max = 2;
		int chances = (int)Math.pow(12, 3);
		//int[][][] mark = new int[chances][3][2];
		String[] mark = new String[chances];
		Random rand = new Random();
		int n = 0;
		int w = 0;
		int u = 0;
		int v = 0;
		boolean match = false;
		while(n <= chances) {
			String ins = "";
			for(int i = 1;i <= 3;i++) {
				u = (rand.nextInt((max+1)-min)+min);
				v = (rand.nextInt((max+1)-min)+min);
				ins = ins+u+";"+v+"§";
				/*for(int b = 0;b < chances;b++) {
					for(int c = 0;c < 3;c++) {
						if(mark[b][c][0] == x && mark[b][c][1] == y) {
							bool = true;
						}
					}
				}*/
				/*if(bool == false) {
					//mark[w][i-1][0] = x;
					//mark[w][i-1][1] = y;
					mark[w] = 
					n++;
				}*/
				//bool = false;
			}
			for(int b = 0;b < chances;b++) {
				if((mark[b] instanceof String) && mark[b].equals(ins))
					match = true;
			}
			if(match == false) {
				mark[n] = ins;
				System.out.println("insert "+w);
				System.out.println(mark.length);
				n++;
			}
			w++;
			System.out.println(n);
			match = false;
		}
		/*for(int i=0;i < v.length;i++) {
			for(int j=0;j < v[i].length;j++) {
				System.out.print(v[i][j]+" ");
			}
			System.out.println("");
		}*/
	}

}
