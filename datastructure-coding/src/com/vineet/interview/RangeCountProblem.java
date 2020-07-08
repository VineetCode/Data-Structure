package com.vineet.interview;

import java.util.Arrays;
import java.util.List;

public class RangeCountProblem {
	
	public static void findRangeCount(List<Integer> list, int input){
		 int rangeCount=0,count=0;
			for(int i=0;i<list.size();i++){
	           
				for(int j=count;j<=80;j++){
					rangeCount++;
				  if(list.contains(j)){
					  count++;
				  }
				  if(input==rangeCount){
				     System.out.println("Range ::"+count);
					 break;
				  }
				}
			}//outer for-loop
		}
		public static void main(String[] args) {
			List<Integer> list=Arrays.asList(1,21,23,30,41,45,53,71);
			int input=10;
	        findRangeCount(list,input);
		}

}
