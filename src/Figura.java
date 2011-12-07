/**
 * @author Severus

 */
public abstract class Figura {

	public abstract void rysuj();
	public static void main(String[] args) 
	{
		Figura a = new Kolo(new Punkt(1d, 1d), 1d);
		a.rysuj();
		a = new Prostokat(new Punkt(-1d, -1d), new Punkt(5d, 3d));
		a.rysuj();
		a = new Kwadrat(new Punkt(-1d, -1d), new Punkt(-2d,-1d));
	}

}
