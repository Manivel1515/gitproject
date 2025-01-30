package org.git;

import java.util.Scanner;

public class GitProcess {
	public static void main(String[] args) {
		System.out.println("Employee 1>>>>>>");
		System.out.println("Clone Done>>>>>");
		System.out.println("Employee 2>>>>>>");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a 1st number");
		int a = sc.nextInt();
		System.out.println("Enetr a 2nd number");
		int b=sc.nextInt();
		System.out.println(a);
		int c = a + 15;
		System.out.println(a+"+15 = "+c);
		Add x = new Add(a, b);
		int s = x.sub(a, b);
		System.out.println(a+"-"+b+"="+s);
		sc.close();
	}
}
