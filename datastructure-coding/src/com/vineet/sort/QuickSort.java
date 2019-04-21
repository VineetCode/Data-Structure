package com.vineet.sort;

public class QuickSort {
	
	public static int partition(int[] input,int low,int high){
		int pivot=input[low];
		int i=low;
		int j=high;
		while(i<j){
			do{
			 i++;
			}while(input[i]<=pivot);
            do{
				j--;
			}while(input[j]>pivot);
            if(i<j){
            	int temp=input[i];
            	input[i]=input[j];
            	input[j]=temp;
            }//end of if-block
     
		}//end of while
		int temp=input[low];
    	input[low]=input[j];
    	input[j]=temp;
		return j;
	}//end of partition(-,-,-) method
	
	public static int[] quickSort(int[] input, int low, int high){
		if(low<high){
			int pi=partition(input, low, high);
			System.out.println(pi);
			quickSort(input,low,pi);
			quickSort(input, pi+1,high);
		}//end of if-block
		return input;
	}
	
	
	public static void main(String[] args) {
		int max=Integer.MAX_VALUE;
		int[] input={10,16,8,12,15,6,3,9,5,max};
		int low=0;
		int high=input.length-1;
		int[] sorted=quickSort(input,low,high);
		for(int i=0;i<sorted.length;i++)
			System.out.print(sorted[i]+" ");
	}//end of main() method


}
