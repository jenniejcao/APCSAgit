package journals;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class CountNumbers {
	 public static int[] getArray(int[] search){
		    int size = search.length;
		    int[] out = new int[size];
		    for(int i =0;i<size;i++){
		      out[search[i]]++;
		    }
		    return out;
		  }
	 public static int linearSearch(int[] search, int look){
		 int i=0;
		 while (i<search.length){
			if (search[i]==look){
				return i;
			}
			 i++;
		 }
		 return -1;
	 }
	/* public static int binarySearch(int look,int[] search) 
	   { 
	         int low = 0;
	         int high = search.length - 1;
	        
	         while(high >= low) {
	             int middle = (int) (low + high) / 2;
	             if(search[middle] == look) {
	                 return middle;
	             }
	             else if(search[middle] < look) {
	                 low = middle + 1;
	             }
	             else if(search[middle] > look) {
	                 high = middle - 1;
	             }
	        }
	        return -1;
	        
	   } */
	public static void main(String[] args) {
		for (int j=1; j<=10 ; j++){
	    int[] go = new int[100];
	    for(int i =0;i<100;i++){
	      go[i] = (int)(Math.random()*100);
	    }
	    int[] occurences=getArray(go);
	    System.out.println(Arrays.toString(occurences));
	    long startTime = System.nanoTime();
	    System.out.println(linearSearch(go, 2));
	    long endTime = System.nanoTime();
	    System.out.println((endTime-startTime)/1000 +"ms");
	    
	    
	    startTime=System.nanoTime();
	    //System.out.println(binarySearch(2,go));
	    System.out.println(Arrays.binarySearch(go, 2));
	    endTime=System.nanoTime();
	    System.out.println((endTime-startTime)/1000 +"ms");
	    System.out.println("");
		}
	  }
}


