package com.vineet.sort;

public class MergeSort {
	public static void merge(int[] input,int low,int mid,int high){
		int size1=mid-low+1;
		int size2=high-mid;
		
		int[] left=new int[size1];
		int[] right=new int[size2];
		
		for (int i=0; i<size1; ++i) 
	          left[i] = input[low + i]; 
	    for (int j=0; j<size2; ++j) 
	          right[j] = input[mid + 1+ j]; 
	    
	   int i=0,j=0,k=0;
	   
	   while(i<=size1 && j<=size2){
		   if(left[i]<right[j])
			   input[k++]=left[i++];
		   else
			   input[k++]=right[j++];
	   }//end of while loop
	    
	   for(;i<=size1;i++)
		   input[k++]=left[i];
	   for(;j<=size2;j++)
		   input[k++]=right[j];

	}//end of merge(-,-,-) method
	
	
	
	public static int[] mergeSort(int[] input, int low, int high){
		if(low<high){
			int mid=(low+high)/2;
			mergeSort(input,low,mid);
			mergeSort(input,mid+1,high);
			merge(input,low,mid,high);
		}
		return input;
	}
	
	
	public static void main(String[] args) {
	
		int[] input={10,16,8,12,15,6,3,9,5};
		int low=0;
		
		int high=input.length-1;
		
		int[] sorted=mergeSort(input,low,high);
		
		for(int i=0;i<sorted.length;i++)
			System.out.print(sorted[i]+" ");
	}//end of main() method


}
