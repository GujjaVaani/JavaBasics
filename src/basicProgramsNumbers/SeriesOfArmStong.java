package basicProgramsNumbers;

import java.util.Scanner;

public class SeriesOfArmStong {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter start number");
	int start=sc.nextInt();
	System.out.println("Enter end Number");
	int end=sc.nextInt();
	
	for(int i=start;i<=end;i++) {
		if(armStrong(i)==true)
		{
			System.out.println(i);
		}
	}
	
}

private static boolean armStrong(int i) {
	// TODO Auto-generated method stub
	int count=0;

	int temp=i;
	int storednum=i;
	while(i>0) {
		
		i=i/10;
		count++;
	}
	
	//System.out.println(count);

	int remainder=0;
	int result=0;
	while(storednum>0) {
		remainder=storednum%10;
		result+=(Math.pow(remainder, count));
		storednum=storednum/10;
	}
	
	if(temp==result) 
		return true;
	else
		return false;
}
}
