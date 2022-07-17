package controlstatement;

public class Return {

	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		
		int m = addition(a,b);
		int k = substraction(a,b);
		int l = multiplication(a,b);
		float n = division(a,b);
		
		System.out.println(m);
		System.out.println(k);
		System.out.println(l);
	    System.out.println(n);
	} 
	    public static int addition(int a, int b)
	    {
	    int c = a+b ;
	    return c;
	    }
	    public static int substraction(int a, int b)
	    {
	    int c = a-b ;
	    return c;
	    }
	    public static int multiplication(int a, int b)
	    {
	    int c = a*b ;
	    return c;
	    }
	    public static float division(int a, int b)
	    {
	   float c = (float) a/b  ;
	    return c;
	    }
	    
	    
	    
	    
	    
	

}
