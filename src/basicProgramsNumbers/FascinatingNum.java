package basicProgramsNumbers;

import java.util.Scanner;

/*
 * eg
 * num=327 
 * 327*2= 654
 * 327*3= 981
 *327654981 contains 1to9 digits
 */
public class FascinatingNum {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int num =sc.nextInt();
	isFascinatingNum(num);
}

private static void isFascinatingNum(int num) {
	// TODO Auto-generated method stub
	int num2=num*2;
	int num3=num*3;
	
	boolean found=true;
	String result=num+""+num2+num3;
	for(char c='1';c<='9';c++) 
	{
		int count=0;
	for(int i=0;i<result.length();i++) 
	{
		char ch=result.charAt(i);
		if(ch==c) 
			count++;
	}
		if(count>1||count==0) {
			found=false;
			break;
		}	
	}
	
	if(found) 
		System.out.println("It is fascinating");
	else 
		System.out.println("It is not fascinating");
	
	
}
}
