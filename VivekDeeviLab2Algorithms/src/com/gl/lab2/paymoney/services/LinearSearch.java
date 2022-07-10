package com.gl.lab2.paymoney.services;

import java.util.Scanner;

public class LinearSearch {
	public int NUM_ELEMENTS, SEARCH_ELEMENT,TARGET_NUM;
	public int array[];
	public boolean status = false;
	Scanner sc = new Scanner(System.in);

	public void implementationOfLinearSearch() {
		System.out.println("Enter the size of transaction array");
		NUM_ELEMENTS = sc.nextInt();
		array = new int[NUM_ELEMENTS];
		System.out.println("Enter the values of array");
		insertValues();
	//	printValues();
		System.out.println("Enter the total no of targets that needs to be achieved");
		TARGET_NUM= sc.nextInt();
		System.out.println("Enter the value of target ");
		SEARCH_ELEMENT = sc.nextInt();
		searchValue(SEARCH_ELEMENT);
	}

	public void insertValues() {
		for (int i = 0; i < NUM_ELEMENTS; i++) {
		//	System.out.print("Enter element at position " + i + ": ");
			array[i] = sc.nextInt();
		}
		//if(array[0]>10)
			//System.out.print("comparisioh"+array[0]);
	}
/*
	public void printValues() {
		
		for (int i = 0; i < NUM_ELEMENTS; i++) {
			System.out.println("Value at position " + i + "is:" + array[i]);
		}
		}
*/
	public void searchValue(int value) {
		int checkSum=0;
		for (int i = 0; i < array.length; i++) {
			checkSum=checkSum+array[i];
			if (checkSum >= value) {
				System.out.println("Target achieved after "+(i+1)+" transactions ");
				status = true;
				break;
			}
			
		}
		//System.out.println("sum "+checkSum);
		if (status == false) {
			System.out.println("Given target is not achieved");
		}
	}

	
}
