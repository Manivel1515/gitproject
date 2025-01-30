package org.git;

import java.util.Scanner;

public class GitProcess extends Add {
	public static void main(String[] args) {
		System.out.println("Employee 1>>>>>>");
		System.out.println("Clone Done>>>>>");
		System.out.println("Employee 2>>>>>>");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println(a);
		int c = a + 15;
		System.out.println(a + "+15 = " + c);
		Calculator ca = new Calculator();
		int sub = ca.sub(a, 13);		
		System.out.println(a + "-" + 13 + "=" + sub);
		sc.close();
	}
}
