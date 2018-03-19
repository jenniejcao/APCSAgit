package unit13;
import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount;

	public static void quickSort(Comparable[] list)
	{

	}


	private static void quickSort(Comparable[] list, int low, int high)
	{
		int l = low;
		int h = high;
		while (l<h){
			int split = partition(list, l, h);
			quickSort(list, l, split);
			quickSort(list, split+1, h);
		}


	}


	private static int partition(Comparable[] list, int low, int high)
	{
		int pivot = (int) list[0];
		int bot=low-1;
		int top=high+1;
		while (bot<top){
			while (bot+1<pivot &&top-1>pivot){
				if (bot>top){
					return top;
				}
				
			}
		}










		return 0;
	}
}