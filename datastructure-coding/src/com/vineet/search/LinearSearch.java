package com.vineet.search;

public class LinearSearch {
	
	public static boolean linearSearch(int input[],int search){
		boolean found=false;
		if(input!=null){
		for(int index=0;index<input.length;index++){
			if(input[index]==search){
			   found=true;
			   break;//if search element found for loop terminated
			 }//end of if- block
		   }//end of for-loop
		}//end of if-block
		return found;
	}//end of linearSearch(-,-) function
	
	public static void main(String[] args) {
		int[] input={10,30,20,40,35,75,55};
		int search=45;
		if(linearSearch(input, search))
			System.out.println(search+" element is found!!!");
		else
			System.out.println(search+" element is not found!!!");
	}//end of main() method
}//end of class
