/**
 * 
 */

/**
 * @author Severus
 *
 */
public class Kolo extends Figura
	{
	private Punkt o;
	private double r;
	Kolo(Punkt o, double r)
	{
		this.o = o;
		this.r = r;
	}
	@Override
	public void rysuj() 
	{
		System.out.println("Rysujemy kolo w srodku " + o + " i  promieniu r = " + r);		
	}

}
