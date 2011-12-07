/**
 * 
 */

/**
 * @author Severus
 *
 */
public class Kwadrat extends Prostokat 
{
	public Kwadrat(Punkt a,Punkt b)
	{
		super(a, b);
		if(a.getX() - b.getX() != a.getY() - b.getY())
				throw new IllegalArgumentException("Kwadrat musi miec rowne boki");		
	}
	@Override
	public void setA(Punkt a) {
		if(getB().getX() - a.getX() != getB().getY() - a.getY())
			throw new IllegalArgumentException("Kwadrat musi miec rowne boki");	
		super.setA(a);
	}
	@Override
	public void setB(Punkt b) {
		if(getA().getX() - b.getX() != getA().getY() - b.getY())
			throw new IllegalArgumentException("Kwadrat musi miec rowne boki");	
		super.setB(b);
	}


}
