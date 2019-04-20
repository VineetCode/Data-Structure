package com.vineet.sort;

public class InsertionSort {
	
public static int[] insertionSort(int[] input, int length){
		int key,j;
		for(int i=1;i<length;i++){
			key=input[i];
			j=i-1;
			while(j>=0 && input[j]>key){
				input[j+1]=input[j];
				j=j-1;
			}//end of while loop
			input[j+1]=key;	
		}//outer-for-loop
		return input;
	}//end of bubble sort method

 
	public static void main(String[] args) {
		int[] input={10,30,20,40,35,75,5};
		int length=input.length;
		int[] sorted=insertionSort(input, length);
		for(int i=0;i<sorted.length;i++)
			System.out.print(sorted[i]+" ");
	}//end of main() method


}
