package com.vineet.sort;

public class BubbleSort {
	public static int[] bubbleSort(int[] input, int length){
		
		for(int i=0;i<length-1;i++){
			for(int j=0;j<length-1-i;j++){
				if(input[j]>=input[j+1]){
					int temp=input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}
			}//inner-for-loop
		}//outer-for-loop
		return input;
	}//end of bubble sort method
	public static void main(String[] args) {
		int[] input={10,30,20,40,35,75,55};
		int length=input.length;
		int[] sorted=bubbleSort(input, length);
		for(int i=0;i<sorted.length;i++)
			System.out.print(sorted[i]+" ");
	}//end of main() method

}//end of class
