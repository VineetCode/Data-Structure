package com.vineet.interview;

public class ReadWriteExecute {
    public static int symbolicToOctal(String permString) {
        
        String num="";
        int sum=0;
        int count=0;
        String str="";
        char[] chh=permString.toCharArray();
        try{
        for(int i=0;i<chh.length;i++){
        	str=str+chh[i];
        	count++;
        	if(count==3){
        	   sum=calculate(str);
        	   num=num+sum;
        	}
        }
    }catch(Exception e){
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }
    return Integer.valueOf(num);
        
    }
    
    public static int calculate(String str){
    	 int sum=0;
             char[] ch=str.toCharArray();
              for(Character c:ch){
                  sum=sum+c;
                }
          return sum;
        }
       
    

    public static void main(String[] args) {
        // Should write 752
        System.out.println(ReadWriteExecute.symbolicToOctal("rwxr-x-w-"));
    }
}
