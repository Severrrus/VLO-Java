/**
 * 
 */

/**
 * @author Severrrus
 *
 */
public class Faktoryzacja {

	/**
	 * 
	 */
	private static int dzielniki(int a)
	{
	     for(int i=2;i*i<=a;i++)
	      	      if(a%i==0) 
	      	    	  return i;
	     return a;
	}
	private static int ile(int a, int b)
	{
		int i = 0;
		while(a%b == 0)
		{
			a/= b;
			i++;
		}
		return i;
	}
	public static void faktor(int x)
	{
		while(x>1)
		{
			int a = dzielniki(x);
			int b = ile(x, a);
			int c = b;
			while(c>0)
			{
				x/= a;
				c--;
			}
			if(b>1)
			{
				System.out.print(a); System.out.print("^"); System.out.print(b); System.out.print("*");
			}
			else
			{
				System.out.print(a); System.out.print("*");
			}
		}
	}

	public static void main(String[] args) {
	faktor(404);

	}

}
