package controlstatement;

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            /*            i=0      j=0                           
                		  i=0      j=1
                		  i=0      j=2
                		  i=0      j=3
                		  i=0      j=4
                		  i=0      j=5
                		  i=0      j=6--> condition failed
                		  
                    	  i=1      j=0
                      	  i=1      j=1
                       	  i=1      j=2
                          i=1      j=3
                          i=1      j=4
                          i=1      j=5
                          
                          
                		  i=2      j=0
                		  i=2      j=1
                		  i=2      j=2
                		  i=2      j=3
	                      i=2      j=4
                		  i=2      j=5                          */
	                      
	
	for (int i=0; i<=5; i++) 
	{
		for(int j=0; j<=5; j++) 
		{
			System.out.print(" * ");
		}
		System.out.println();
	}
		
		
	
	
	
	}

}
