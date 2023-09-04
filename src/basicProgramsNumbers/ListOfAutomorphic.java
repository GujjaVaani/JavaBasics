package basicProgramsNumbers;

import java.util.Scanner;

public class ListOfAutomorphic {
public static void main(String[] args) {
	int start=0,end=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter start number");
	start = sc.nextInt();
	System.out.println("Enter last number");
	end =sc.nextInt();
	for(int i=start;i<=end;i++) {
		isAutomorphic(i);
	}
}

private static void isAutomorphic(int i) {
	// TODO Auto-generated method stub
	int sqr = i*i;
	int temp=i;
    int count =0;
	while(i>0) {
		count++;
		i=i/10;
	}
	int lastdigit = (int)(sqr%(Math.pow(10,count)));
	if(lastdigit==temp) {
		System.out.print(temp+" ");
	}
}
}
