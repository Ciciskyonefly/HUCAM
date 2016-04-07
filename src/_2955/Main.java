package _2955;

import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		int n,i,j,s;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		for(s=0;s<n;s++){
			
			float p = scan.nextFloat();
			int bankNumber = scan.nextInt();
			int[] M = new int[bankNumber];
			float[] Pro = new float[bankNumber];
			int totalM = 0;
			for(i=0;i<bankNumber;i++){
				M[i] = scan.nextInt();
				totalM += M[i];
				Pro[i] = scan.nextFloat();
			}
			float[] dp = new float[totalM+1];
			dp[0] = 1;
			for(i = 1;i<=totalM;++i)
				dp[i] = -1;
			//dp[i][j] :在0-i个银行中,抢到money为j时风险的最小值
			for(i=0;i<bankNumber;i++){
				for(j=totalM;j>=M[i];j--){//之前从小往大的方向加，后来越想越不对劲，改成从大到小就对了。
					dp[j] = max(dp[j],dp[j-M[i]]*(1-Pro[i]));
				}//endfor
			}//end for
			//找到指定概率条件下最大的价值
			for(j = totalM;j >= 0 ;j--){
				if(dp[j] >= 1-p){
					System.out.println(j);
					break;
				}
			}//end for
			
		}
	
	}
	
	

	private static float max(float i, float j) {
		return (i>=j?i:j);
	}
}
