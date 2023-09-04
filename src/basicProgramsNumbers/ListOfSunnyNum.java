package basicProgramsNumbers;

import java.util.Scanner;

public class ListOfSunnyNum {
public static void main(String[] args) {
	Scanner sc =  new Scanner(System.in);
	System.out.println("Enter start number");
	int start = sc.nextInt();
	System.out.println("Enter end number");
	int end = sc.nextInt();
	for(int i=start;i<end;i++) {
		boolean check=checkSunny(i);
	    if(check==true)
	    	System.out.println(i);
	}
	
}

private static boolean checkSunny(int i) {
	// TODO Auto-generated method stub
	int sunny = i+1;
	int count = 0;
	int sqrt=(int)Math.sqrt(sunny);
	int checknum=sqrt*sqrt;
	if(checknum==sunny)
	    return true;
	else
		return false;
}
}
