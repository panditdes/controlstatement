package controlstatement;
import java .util.Scanner;

public class NumberGreat {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scn = new Scanner (System.in);

		System.out.print("Enter Your Number a = ");

		int a = scn.nextInt();                   // declaration of a

		System.out.print("Enter Your Number b = ");

		int b = scn.nextInt();                  // declaration of b   

		System.out.print("Enter Your Number c = ");

		int c = scn.nextInt();                  //  declaration of c


		//Q.which number is larger?


		if (a >= b) 
		{
			if (a == b) 
			{
				if(a == c) 
				{
					System.out.println("a,b and c are equal");
				}
				else
				{
					if(a < c)
					{
						System.out.println("c is large");
					}
					else 
					{
						System.out.println("a and b are equal and large");
					}
				}
			}

			else 
			{
				if(a >= c )
				{
					if(a == c )
					{
						System.out.println("a and c are equal and large");
					}

					else
					{
						System.out.println("a is large");
					}
				}
				else 
				{
					System.out.println("c is large");

				}
			}  

		}

		else 
		{
			if(b >= c)
			{
				if(b == c) 
				{
					{System.out.println("b and c are equal and large");
					}}

				else
				{
					System.out.println("b is large");
				}
			}
			else
			{
				System.out.println("c is large");
			}
		}
	}
}





