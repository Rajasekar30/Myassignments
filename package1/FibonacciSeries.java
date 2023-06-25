package week1.package1;

import java.util.Iterator;

public class FibonacciSeries {
	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int sum = 0;
		System.out.println(first);
		System.out.println(second);
		for (int i = 0; i<11; ++i)
		{
			sum = first + second;
			first = second;
			second = sum;
			System.out.println(sum);
		}
	}

}
