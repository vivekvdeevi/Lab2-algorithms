package com.gl.lab2.denominations.service;

import java.util.Scanner;

public class DenominationCount {

	static int NUM_ELEMENTS, AMOUNT;
	static int denominationArray[], notesFrequency[];
	 boolean status = false;
	Scanner sc = new Scanner(System.in);

	public void denominationCheck() {
		System.out.println("Enter the size of currency denominations");
		NUM_ELEMENTS = sc.nextInt();
		denominationArray = new int[NUM_ELEMENTS];
		notesFrequency=new int[NUM_ELEMENTS];
		System.out.println("Enter the currency denominations value");
		insertValues();
		sortArray();
		System.out.println("Enter the amount you want to pay");
		AMOUNT = sc.nextInt();
		countNotes();
		printDenominations();
	}

	void insertValues() {
		for (int i = 0; i < NUM_ELEMENTS; i++) {
			denominationArray[i] = sc.nextInt();
		}
	}

	void sortArray() {
		// sorting
		int temp=0;
				for (int i = 0; i < NUM_ELEMENTS; i++) {
					for (int j = i + 1; j < NUM_ELEMENTS; j++) {
						if (denominationArray[i]<denominationArray[j]) {
							temp = denominationArray[i];
							denominationArray[i] = denominationArray[j];
							denominationArray[j] = temp;
						}
					}
				}
	}
	
	static void countNotes() {

		if (AMOUNT < denominationArray[0])
			System.out.println("Target not possible!");
		else {
			for (int i = 0; i < NUM_ELEMENTS; i++) {
				if (AMOUNT >= denominationArray[i]) {
					notesFrequency[i] = AMOUNT / denominationArray[i];
					AMOUNT = AMOUNT - notesFrequency[i] * denominationArray[i];
				}
			}
			
			
		}
	}

	static void printDenominations() {

		//int m = denominationArray.length;
		System.out.println("Your payment approach in order to give min no of notes will be ");
		for (int i = 0; i < NUM_ELEMENTS; i++) {
			if (notesFrequency[i] != 0)
				System.out.println(denominationArray[i] + " : " + notesFrequency[i]);
		}

	}
}