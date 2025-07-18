package in.sowmya;

import java.util.Scanner;

public class Problem2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number ");
	int a=sc.nextInt();
	int count=0;
	int i=1;
	while(count!=a) {
		if(i%2!=0) {
			System.out.print(i+" ");
			i+=2;
			count++;
		}
	}
}
}
