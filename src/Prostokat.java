/**
 * @author Severus
 *
 */
public class Prostokat extends Figura 
{
	private Punkt a;
	private Punkt b;
	public Prostokat(Punkt a, Punkt b)
	{
		this.a = a;
		this.b = b;
	}
	@Override
	public void rysuj() 
	{
		System.out.println("Rysuje prostokat o wierzcholkach " + a + " i " + b);
	}
	public Punkt getA() {
		return a;
	}
	public void setA(Punkt a) {
		this.a = a;
	}
	public Punkt getB() {
		return b;
	}
	public void setB(Punkt b) {
		this.b = b;
	}
	
}
