package com.vineet.sort;

public class SelectionSort {
	
    public static int[] selectionSort(int[] input, int length){
    	
		int min,temp;
		for(int i=0;i<length-1;i++){
			 min=i;
			for(int j=i+1;j<length;j++){
				if(input[j]<input[min])
					min=j;
			}//inner-for-loop
		    temp=input[min];
			input[min]=input[i];
			input[i]=temp;
			System.out.println(input[i]+"===="+input[min]);
		}//outer-for-loop
		return input;
	}//end of bubble sort method
    
	public static void main(String[] args) {
		int[] input={9,3,1,4,2,7,5};
		int length=input.length;
		int[] sorted=selectionSort(input, length);
		for(int i=0;i<sorted.length;i++)
			System.out.print(sorted[i]+" ");
	}//end of main() method


}
