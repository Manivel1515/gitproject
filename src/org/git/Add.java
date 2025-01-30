package org.git;

import java.util.Scanner;

public class Add {
	static int age, a, b;
	static String name;
	static Scanner sc;

	public Add(int a, int b) {
		sc = new Scanner(System.in);
		System.out.println("Enter a 1st number");
		a = sc.nextInt();
		System.out.println("Enetr a 2nd number");
		b = sc.nextInt();
		int c = a + b;
		System.out.println(a + "+" + b + "=" + c);
		System.out.println("Done");
	}

	public int sub(int a, int b) {
		int s;
		s = a - b;
		return s;
	}

	public Add() {
		this(age, name);
		System.out.println("Default Constructor>>>>>");
	}

	public Add(int a, String n) {
		this(a, b);
		sc = new Scanner(System.in);
		System.out.println("Enter Your Name>>>>");
		name = sc.nextLine();
		System.out.println("Enter Your Age>>>>");
		age = sc.nextInt();
		System.out.println("Hai " + name + " Your age is " + age);
	}
}
