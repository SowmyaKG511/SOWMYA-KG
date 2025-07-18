package in.sowmya;

import java.util.Scanner;

public class Problem3 {
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	if(a%2==0) {
		a=a-1;
	}
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
