package LCS;
/*
 * Don't know how to compute permutation ,So don't know how to do!
 */
import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		int n,m;
		int casenumber;
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int i,j,k;
			n = scan.nextInt();
			for(i=0; i<n; i++){
				m = scan.nextInt();
				int[] a = new int[m];
				int[] b = new int[m];
				for(j=0;j<m;j++){
					a[j] = scan.nextInt();
				}
				for(j=0;j<m;j++){
					b[j] = scan.nextInt();
				}
				/*
				 * lcs max number
				 */
				int max = 0;
				int[][] dp = new int[m+1][m+1];
				
				for(j=1; j<=m; j++){
					for(k=1; k<=m; k++){
						if(a[j-1] == b[k-1]){
							dp[j][k] = dp[j-1][k-1] + 1;
							if(a[j-1]>max)
								max = a[j-1];
						}else
							dp[j][k] = max(dp[j][k-1],dp[j-1][k]);
					}
				}
				
				System.out.println(max);
			}//end for
		}
	}

	private static int max(int a, int b) {
		return (a>b?a:b);
	}
}
