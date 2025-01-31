package org.git;

public class Calculator extends Add {
	public Calculator() {
		super();
		System.out.println("Calculator Constructor>>>");
	}

	public Calculator(int a, int b) {
		this("Manivel", 12.4f);
		a = 2;
		b = 4;
		System.out.println(a + "*" + b + "= " + a * b);
	}

	public Calculator(String n, float salary) {
		System.out.println("DONEEEEE");
	}
}
