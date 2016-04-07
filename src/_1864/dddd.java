package _1864;

import java.util.Scanner;

public class dddd {

	public static void main(String args[]){
		int j;
		System.out.println("========");
		Scanner scan = new Scanner(System.in);
		int b = scan.nextInt();
		for(j=0;j<b;j++){
			String a = scan.next();
			String[] c = a.split(":");
			c[0] = "A";
	//		System.out.println(c[0].equals("A")||);
			
			float d = Float.parseFloat(c[1]);
			for(int i =0;i<c.length;i++)
				System.out.println(c[i]);
			
		}
	}
	
}
