package org.git;

import java.util.Scanner;

public class GitProcess extends Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		System.out.println(a);
		int c = a + 15;
		System.out.println(a + "+15 = " + c);
		Multiple ca = new Multiple();
		int sub = ca.sub(a, 13);
		System.out.println(a + "-" + 13 + "=" + sub);
		sc.close();
	}
}
