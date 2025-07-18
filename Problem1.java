package in.sowmya;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println("enter the operation to perform");
		String operator=sc.next().toLowerCase();
		
		switch(operator) {
		case "addition":
			System.out.println("num1+num2 = "+(a+b));
			break;
		case "subtraction":
			System.out.println("num1-num2 = "+(a-b));
			break;
		case "multiplication":
			System.out.println("num1*num2 = "+(a*b));
			break;
		case "division":
			System.out.println("num1/num2 = "+(a/b));
			break;
			default:
				System.out.println("please enter the correct operation");
		}
	}

}
