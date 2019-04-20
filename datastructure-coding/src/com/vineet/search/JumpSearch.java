package com.vineet.search;

public class JumpSearch {
	
	public static int jumpSearch(int[] input,int key){
		int n=input.length;
		int step=(int)Math.floor(Math.sqrt(n));
		int prev=0;
		
		while(input[Math.min(step,n)-1] < key){
			prev=step;
			step=step + (int)Math.floor(Math.sqrt(n));
			if(prev>=n)
				return -1;
		}//end of while loop
		
		while(input[prev] < key){
			prev++;
			if(prev==Math.min(step,n))
			 return -1;
		}//end of while loop
    
		if(input[prev]==key)
			return prev;
		
		
		return -1;
	}//end of jumpSearch() method
	
	public static void main(String[] args) {
		int input[]={0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
		int key=155;
		
		int index=jumpSearch(input, key);
		if(index>0)
           System.out.println(key+" is found at index :"+index);
		else
		   System.out.println(key+" is not found at index :"+index);
	}//end of main() method

}//end of class
