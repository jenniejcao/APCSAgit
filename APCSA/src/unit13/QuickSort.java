package unit13;
import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{	passCount=0;
		int low=0;
		int high=list.length-1;
		quickSort(list, low, high);
	}	


	private static void quickSort(Comparable[] list, int low, int high)
	{ 
		
		if(low<high){
			int split = partition(list, low, high);
			System.out.println("pass "+passCount++
					+" "+Arrays.toString(list));
			
			quickSort(list, low, split);
			quickSort(list, split+1, high);
			
			
			
		}
		
		

	}


	private static int partition(Comparable[] list, int low, int high)
	{
		
		Comparable pivot =  list[low];
		int bot=low-1;
		int top=high+1;
		while (bot<top){
			while (list[--top].compareTo(pivot)>0);
			while (list[++bot].compareTo(pivot)<0);
				if (bot>=top){
					return top;
				}
				Comparable holder= list[bot];
				list[bot]=list[top];
				list[top]=holder;
				
			
		}



		return 0;
	}

	public static void main(String args[])
	{
		QuickSort.quickSort(new Comparable[]{9,5,3,2});


		QuickSort.quickSort(new Comparable[]{19,52,3,2,7,21});


		QuickSort.quickSort(new Comparable[]{68,66,11,2,42,31});
	}

}