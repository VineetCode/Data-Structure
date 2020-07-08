package com.vineet.interview;

public class Find2ndLargestElement {

	public static void main(String[] args) {
		/*int input[]={87,78,16,94,36,87,93,50,22,63,28,91,60,64,27,
				     41,27,73,37,12,69,68,30,83,31,63,24,68,36,30,
				     3,23,59,70,68,94,57,12,43,30,74,22,20,85,38,
				     99,25,16,71,14,27,92,81,57,74,63,71,97,82,6,
				     26,85,28,37,6,47,30,14,58,25,96,83,46,15,68,
				     35,65,44,51,88,9,77,79,89
                   };*/
                  
		//int input[] = {12, 35, 1, 10, 34, 1};
		int input[] = {10,10,10};
		int max=0;
		int sndMax=0;
		for(int i=0;i<input.length;i++){
			if(input[i]>max){
				sndMax=max;
				max=input[i];
				System.out.println("Max ::"+max+ ", 2ndMax ::"+sndMax);
			}
			if(input[i]>sndMax && input[i]<max){
				sndMax=input[i];
			}
			if(sndMax==0){
				System.out.println("The second largest does not exist.");
				
			}
		}
		
         System.out.println("Max ::"+max);
         System.out.println("2nd Max ::"+sndMax);
	}

}
