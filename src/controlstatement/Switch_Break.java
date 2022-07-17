package controlstatement;

import java.util.Scanner;

public class Switch_Break {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);   // Scanner class call
		System.out.print("Enter Digit: ");
		int a = scn.nextInt();              //declaration of a


		switch(a)
		{
		case 1:                                     // condition 1st
			System.out.print("Low Priority");
			break;                            //after satisfied it directly go outside swich
		case 2:
			System.out.print("Medium Priority");
			break;
		case 3:
			System.out.print("High Priority");
			break;

		default:
			System.out.print("Bug Resolveed");
		}
	}

}
