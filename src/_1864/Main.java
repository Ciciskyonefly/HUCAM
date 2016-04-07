package _1864;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		float maxMoney;
		int n,i,j;
		
		
		Scanner scan = new Scanner(System.in);
		
		while((maxMoney = scan.nextFloat())!=0){
			
			int flag = 1;
			n = scan.nextInt();
			if(n==0) break;
			float[] a = new float[n];
			for(i = 0;i<n;i++){
				int b = scan.nextInt();
				for(j=0;j<b;j++){
					String aa = scan.next();
					String[] c = aa.split(":");
					if(!(c[0].equals("A")||c[0].equals("B")||c[0].equals("C"))){
						a[i] = 0;
						flag = 0;
					}
					float tempf = Float.parseFloat(c[1]);
					if(tempf > 600){
						a[i] = 0;
						//	i = i - 1;
						//	flag += 1;
						flag = 0;
					}
					a[i] += tempf;
				
					if(a[i] > 1000){
						a[i] = 0;
						//	i = i-1;
						//	flag += 1;
						flag = 0;
					}
					if(flag == 0)
						a[i] = 0;
				}
			
		}//end for
		
/*		for(i=0;i<n;i++)
			System.out.println(a[i]);*/
		
		
		
		
		float sum = 0;
		float maxM = 0;
		for(i=0;i<n;i++){
			sum = a[i];
			maxM = max(sum,maxM);
			if(sum > maxMoney)
				continue;
			for(j=i+1;j<n;j++){
				sum += a[j];
				if(sum <= maxMoney)
					maxM = max(sum,maxM);
				if(sum >maxMoney)
					continue;
			}//end for
			
		}//end for
			
		DecimalFormat df = new DecimalFormat(".00");  
		System.out.println(df.format(maxM));
		
		}
	}

	private static float max(float a, float b) {
		return (a>b?a:b);
	}

}
