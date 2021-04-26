
package com.mycompany.lab10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MainClass {
	public static void main(String[] args){
		
		ArrayList<Integer> myArray = new ArrayList();
		HashMap<Integer, Integer> myHashmap = new HashMap();

		Random randomizer = new Random();
		int randomNumber = randomizer.nextInt();

		for (int i = 0; i < 1000000; i++) {
			myArray.add(randomNumber);
			myHashmap.put(randomNumber, i);
			randomNumber = randomizer.nextInt();
		}
		int n = 5;

		long start = System.nanoTime();
		myArray.contains(n);
		long end = System.nanoTime();
		long duration = end - start;
		System.out.println("Array lookup took: " + duration 
			+ " nano seconds.");

		start = System.nanoTime();
		myHashmap.containsKey(n);
		end = System.nanoTime();
		duration = end - start;
		System.out.println("Hashmap lookup took: " + duration
			+ " nano seconds.");
	}

}
