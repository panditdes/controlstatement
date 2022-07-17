package controlstatement;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//question: find the large number in two
		
		
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter The Value Of a = ");
		int a = scn.nextInt();
		System.out.print("Enter The Value Of b = ");
		int b = scn.nextInt();
		//a =63    b=63
		
		if(a>=b) 
		{
			if(a>b) 
			{
				System.out.println("a is large");
				
			}
			
			else
			
			{
			
				System.out.println("a is equal to b");
			}
		}
		else 
		{
			System.out.println("b is large");
		}
		
	}

  }
