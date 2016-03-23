package _2015;

import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		
		int n,m;
		int[] num = new int[100];
		num[0] = 2;
		for(int i = 1;i<100;i++){
			num[i] = num[i-1] + 2;
		}
		
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			n = scan.nextInt();
			m = scan.nextInt();
			int p = 0;
			int[] sum = new int[100];
			int t = n/m;
			int tm = n%m;
			for(int i =0 ;i < n-tm; i+=m){
				int s = 0;
				int q = i;
				int temp = m;
				while(temp-- != 0){
					s += num[q++] ;
				}
				sum[p++] = s/m;
			}//for
			if(tm!=0){
				int lm = 0;
				for(int i = n-tm;i<n;i++ ){
					lm += num[i];
				} 
				sum[p++] = lm/tm;
			}
		
			//输出
			for(int i = 0 ;i < p - 1;i ++){
				System.out.print(sum[i]+" ");
			}
			System.out.println(sum[p-1]);
		}
	}
}
