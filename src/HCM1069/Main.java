package HCM1069;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		int n,i,j;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int m = 3*n;
		Sort[] sort = new Sort[m] ;
		for(i = 0;i<3*n;i+=3){
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			sort[i].a  = a;
			sort[i].b  = b;
			sort[i].c  = c;
			sort[i+1].a = min(sort[i].b,sort[i].c);
			sort[i+1].b = min(sort[i].a,sort[i].c);
			sort[i+1].c = min(sort[i].a,sort[i].b);
			sort[i+2].a = max(sort[i].b,sort[i].c);
			sort[i+2].b = max(sort[i].a,sort[i].c);
			sort[i+2].c = max(sort[i].a,sort[i].b);
		}
		
		Arrays.sort(sort);
		int[] dp = new int[3*n+1];
		int res = 0;
		for(i=0;i<m;i++){
			dp[i] = sort[i].c;
			for(j=0;j<i;j++){
				if(sort[j].b<sort[i].b&&sort[j].a<sort[i].a){
					dp[i] = max(dp[i],dp[j]+sort[i].c);
				}
			}//for
			res = max(res,dp[i]);
		}//for
		
	/*	for(i=0;i<m;i++){
			System.out.print(dp[i]+ "  ");
		}*/
		
		System.out.println(res);
	
	}

	private static int min(int a, int b) {
		return (a>b?b:a);
	}

	private static int max(int a, int b) {
		return (a>b?a:b);
	}
}

class Sort{
	int a;
	int b;
	int c;
/*	Sort(int a,int b,int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}*/
}
