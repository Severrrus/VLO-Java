/**
 * 
 */

/**
 * @author Severrrus
 *
 */
public class sortowanie {
	/*
	 * Sortowanie babelkowe
	 * 
	 * 
	 */
	public void Bubble(int[] tab)
	{
		for(int i = 0; i < tab.length-1; i++)
			for(int j = 0; j < tab.length-i-1; j++)
				if(tab[j+1] < tab[j])
				{
					int temp = tab[j+1];
					tab[j+1] = tab[j];
					tab[j] = temp;
				}
		
	}
	public void MergeSort(int[] tab, int p, int q)
	{
		if(p == q) return;
		int s = (p+q)/2;
		MergeSort(tab, p, s);
		MergeSort(tab, s+1,q);
		Merge(tab, p, q);
	}
	public void Merge(int[] tab, int p, int q)
	{
		int[] tab2 = {};
		int s = (p+q)/2;
		int i = p, j = s+1, k = 0;
		while(i <= s && j <= q)
		{
			if(tab[i] <= tab[j])
			{
				tab2[k]  = tab[i];
				i++; k++;
			}
			else
			{
				tab2[k] = tab[j];
				j++; k++;
			}
		}
		while(i <= s)
		{
			tab2[k] = tab[i]; i++;k++;
		}
		while(j <= q)
		{
			tab2[k] = tab[j]; j++;k++;
		}
		for(int x = i; x <=q;x++)
		{
			tab[x] = 
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] tab = {3,5,2,10,7,4,3,41,2,30};
		Bubble(tab);
		for(int i = 0; i < tab.length; i++)
		{
			System.out.print(tab[i]);
			System.out.print(" ");
		}

	}

}
