/**
 * Test//////////testyy!!!
 */

/**
 * @author Severrrus
 *
 */
//import java.util.Random;

public class Sort {

	private int [] tab;
	//private Random rand;

	public Sort(int[] tab)
	{
		this.tab= tab;
		//this.rand = new Random();
	}
	//Swap
	private void swap(int a, int b)
	{
		int temp = tab[b];
		tab[b] = tab[a];
		tab[a] = temp;
	}
	//Quick Sort
	private int Partition(int p, int q)
	{
		int left = p;
		int right = q;
		int pivot = tab[(left+right)/2]; // TU POWINNA BYC LOSOWA ALE NIE PYKALA
		while(left <= right)
		{
			while(tab[left] < pivot)
				left++;
			while(tab[right] > pivot)
				right++;
			if(left <=right)
			{
				swap(left, right);
				left++; right++;
			}
		}
		return left;		
	}
	public void QuickSort(int p, int q)
	{
		int cos = Partition(p, q);
		if (p < cos - 1)
	            QuickSort(p, cos - 1);
	    if (cos < q)
	            QuickSort(cos, q);
	}
	//Bubble sort
	public void bubble()
	{
		for(int i = 0; i < tab.length-1; i++)
			for(int j = 0; j < tab.length-i-1; j++)
				if(tab[j+1] < tab[j])
					swap(j, j+1);
		
	}
	//MergeSort
	public void MergeSort(int p, int q)
	{
		if(p == q) return;
		int s = (p+q)/2;
		MergeSort(p, s);
		MergeSort(s+1,q);
		Merge(p, q);
	}
	//Merge for MergeSort
	public void Merge(int p, int q)
	{
		int[] tab2 = new int [q-p+1];
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
		for (int x=0;x<q-p+1;x++)
	    {
	        tab[x+p]=tab2[x];
	    }
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] tab = {3,5,2,10,7,4,3,41,2,30};
		Sort array = new Sort(tab);
		array.QuickSort(0, 9);
		//array.MergeSort(0, 9);
		for(int i = 0; i < tab.length; i++)
		{
			System.out.print(tab[i]);
			System.out.print(" ");
		}
	

	}

}
