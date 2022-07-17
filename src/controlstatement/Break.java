package controlstatement;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Q.The sum of x number is 325,then calculate x?
		
		
		int x= 1;
		int sum = 0;
		while (true)
		{
			sum = sum + x;

			if( sum == 325)
			{
				break;
			}
			x++;            //updation
		}

		System.out.println(sum);
		System.out.println(x);
	}

}
