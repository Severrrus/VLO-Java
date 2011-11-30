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
}
