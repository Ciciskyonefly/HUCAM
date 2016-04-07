package _1231;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		
		int n,i,j;
		//从键盘输入
		Scanner scan = new Scanner(System.in);
		while((n = scan.nextInt()) !=0){
			int[] a = new int[n];
			for(i=0;i<n;i++)
				a[i] = scan.nextInt();
			
			//DP Algorithm
			int max = -1;
			int start = 0;
			int end = 0;
			int sum;
			for(i=0;i<n;++i){
				sum = a[i];
				//如果这个元素小于0，这个元素不可能是最大子序列和的起始位置
				if(sum < 0){
					sum = 0;
					continue;
				}else if(sum > max){//如果某一个元素的值比所有的都大，那么起始位置和终止位置都是这个值
					max = sum;
					start = i;
					end = i;
				}
				for(j=i+1;j<n;j++){
					sum = sum + a[j];
					//若sum < 0,那么这个元素不可能是终止位置
					//也不可能是经过此元素的值
					if(sum < 0){
						sum = 0;
						i = j;
						break;
					}
					if(sum > max){
						max = sum;
						start = i;
						end = j;
					}
				}//end for
			}//end for
			if(max >= 0)
				System.out.println(max + " " + a[start] + " "+ a[end]);
			else{
				max = 0;
				System.out.println(max + " " + a[start] + " "+ a[n-1]);
			}
		}//end while
		
	}

}
