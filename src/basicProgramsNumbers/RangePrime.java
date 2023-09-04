package basicProgramsNumbers;

import java.util.Scanner;

//Range of prime number between two number
public class RangePrime {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("start number");
	 int start=sc.nextInt();
	 System.out.println("end number");
	int end=sc.nextInt();
	for(int i=start;i<=end;i++) {
		if(rangeOfPrime(i)==true) {
		System.out.println(i);
	}
	}
	
	
}

private static boolean rangeOfPrime(int start) {
    
	// TODO Auto-generated method stub
     if(start==0|start==1) {
    	 return false;
     }
    	 for(int i=2;i<=Math.sqrt(start);i++) {
    		 if(start%i==0) {
    			 return false;
    			
    		 }
    	 }
    	 
    	 return true;

}
}
