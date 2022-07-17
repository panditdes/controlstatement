package controlstatement;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q.addition of first 10 digit is ?


		int sum = 0;


		for(int i = 1; i<=10; i++)

		{
			if(i == 8) 
			{
				continue;
			}
			sum = sum +i;
		}


		System.out.println(sum);

	}

}
