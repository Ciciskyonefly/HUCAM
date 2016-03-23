package _1003;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args){
		int n,m;
		int casenumber = 0;
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			n = scan.nextInt();
			for(int i = 0; i < n;i++){
				casenumber++;
				m = scan.nextInt();
				int[] a = new int[m];
				for(int j = 0; j < m; j++){
					a[j] = scan.nextInt();
				}
				int max = -1002;
				int sum = 0;
				int first = 0;
				int end = 0;
				for(int s = 0 ,p = 0; s < m; s ++){
					sum += a[s];
					//如果比最大值大  当然要更新 first 和end
					if(sum > max){
						max = sum;
						first = p;
						end = s;
					}
					//如果sum小于0 ,说明下一个不管是正是负 让sum = 0 求和的值都会比sum<0 求的值大
					if(sum < 0){
						sum = 0;
						p = s + 1;
					}
					/*
					 * 不想说什么了 说多都是气  不知道为什么脑子就转不出来圈  老是想 if（sum>0)再加一个判断条件 
					 * 写了两个多小时  真不想说什么
					 */
				}//for
				first ++;
				end ++;
				System.out.println("Case "+casenumber+":");
				System.out.println(max + " " + first + " " + end);
				if(casenumber!=n) System.out.println();
				
			}//for
			break;
		}//while
		
	}//main
}





