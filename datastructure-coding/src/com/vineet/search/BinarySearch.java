package com.vineet.search;

public class BinarySearch {
	
	public static boolean binarySearch(int[] input,int key){
		int low=0;
		int mid;
		boolean found=false;
		int high=input.length-1;
		while(low<high){
			mid=(low+high)/2;
			if(key<input[mid]){
				high=mid-1;
			}else if(key>input[mid]){
				low=mid+1;
			}else if(key==input[mid]){
				found=true;
				break;
			}
		}//end of while loop
	
		return found;
	}
	
	public static void main(String[] args) {
		int input[]={10,20,30,40,50,60,70,80,90,100};
		int key=31;
		if(binarySearch(input,key))
			System.out.println(key+" element is found!!!");
		else
			System.out.println(key+" element is not found!!!");
	}//end of main() method

}//end of BinarySearch class
