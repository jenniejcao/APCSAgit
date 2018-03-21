package journals;
import java.util.Arrays;
public class Journal_3_21 {
	private int[] array;
	private int max;
	private int count;
	public Journal_3_21(int[] ray){
		array=ray;
		max=array[0];
		count=0;
		
	}
	public int findMax(int[] ray){
			if (count<array.length){
				if (array[count]>max){
					max=array[count];
			}
		
				count++;
				findMax(ray);
			}
			return max;
		}
		
	
	public static void main(String args[]){
		int[] go = {1,2,3,4,5,6,7,8};
		Journal_3_21 test = new Journal_3_21(go);
		System.out.println(test.findMax(go));
		int [] go2={5,8,3,13,7,3,6198,3};
		Journal_3_21 test2 = new Journal_3_21(go2);
		System.out.println(test2.findMax(go2));
		
		
	}

}
