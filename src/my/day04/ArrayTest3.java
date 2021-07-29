package my.day04;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pizza = { "pepperoni", "mushroom", "onion", "sausages", "bacon" };

		for (int i = 0; i < pizza.length; i++) {
			System.out.print(pizza[i] + " ");
		}
		
		System.out.println();
		System.out.println("피자 토핑 배열의 크기 : " + pizza.length);
	}

}