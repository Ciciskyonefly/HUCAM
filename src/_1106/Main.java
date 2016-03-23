package _1106;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String s = scan.nextLine();
			int j = 0;
			//由于split函数不能以首字母分割 把付出串开始的5去掉
			/*
			 * 由于第一遍没想起来WA了好久 又去百度的别人的思路
			 */
			while(j !=s.length()-1){
				if(s.charAt(j)=='5')
					j++;
				else
					break;
			}
			//生成首字母不为5的字符串
			s = s.substring(j);
			//split 函数 以一个或多个5分割
			String[] str=s.split("5+");
			int[] num = new int[str.length];
			//分割后存进str的是字符串  通过Integer.parseInt逐个变为整数
			for(int i = 0;i<str.length;i++){
				num[i] = Integer.parseInt(str[i]);
				if(num[i] > 100000000)
					System.exit(0);
			}
			//自带函数
			Arrays.sort(num);
			//输出
			for(int i = 0 ;i < num.length - 1;i ++){
				System.out.print(num[i]+" ");
			}
			System.out.print(num[num.length-1]);
			System.out.println();
		}

			
	}
}
