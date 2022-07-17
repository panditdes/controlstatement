package controlstatement;

import java.util.Scanner;

public class While_LOOP {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Add the number of a digit
		Scanner scn = new Scanner(System.in);  //call scanner
		System.out.print("Enter Digit: ");
		int number = scn.nextInt();           // initiate varibale number= 325

		int reminder = 0;                     // intially 0

		while(number >0 )
		{
			reminder = reminder + number%10;  //R=R+n%10=0+5=5;5+2=7;7+3=10
			number = number/10;               //325/10=32.5--> reminder =5

		}

		System.out.println("Addition of number = "+ reminder);



	}

}
