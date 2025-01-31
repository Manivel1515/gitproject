package org.git;

public class Calculator extends Add {
	public Calculator() {
		super();
		System.out.println("Calculator Constructor>>>");
	}

	public Calculator(int a, int b) {
		System.out.println(a + "*" + b + "= " + a * b);
	}
}
