/**
 * 
 */

/**
 * @author Severus
 *
 */
public class Kolo extends Figura implements Comparable<Kolo>
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
	@Override
	public int compareTo(Kolo o) {
		return (int)(o.r - r);
	}
	public Punkt getO() {
		return o;
	}
	public void setO(Punkt o) {
		this.o = o;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
}
