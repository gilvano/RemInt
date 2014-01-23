package com.gilvano;

public class FibonacciRecursive {
	static long fibo(int n) {
		if (n < 2) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}

	public static void main(String[] args) {

		for (int i = 0; i < 30; i++) {
			System.out.print("" + (i + 1) + "° =" + FibonacciRecursive.fibo(i)
					+ "\n");
		}
	}

}
