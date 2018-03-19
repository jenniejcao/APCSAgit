package journals;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class CountNumbers {
	 public static int[] linearSearch(int[] search){
		    int size = search.length;
		    int[] out = new int[size];
		    for(int i =0;i<size;i++){
		      out[search[i]]++;
		    }
		    return out;
		  }
	 public static boolean binarySearch(int look,int[] search) 
	   {
	      	int size = search.length-1;
	         int low = 0;
	         int high = size - 1;
	        
	         while(high >= low) {
	             int middle = (low + high) / 2;
	             if(search[middle] == look) {
	                 return true;
	             }
	             if(search[middle] < look) {
	                 low = middle + 1;
	             }
	             if(search[middle] > look) {
	                 high = middle - 1;
	             }
	        }
	        return false;
	   }
	public static void main(String[] args) {
	    int[] toRead = new int[10000];
	    for(int i =0;i<10000;i++){
	      toRead[i] = (int)(Math.random()*10000);
	    }
	    long startTime = System.nanoTime();
	    int[] occurences=linearSearch(toRead);
	    long endTime = System.nanoTime();
	    System.out.println((endTime-startTime)/1000000 +"ms");
	    System.out.println(Arrays.toString(occurences));
	    
	    startTime=System.nanoTime();
	    System.out.println(binarySearch(5,toRead));
	    endTime=System.nanoTime();
	    System.out.println((endTime-startTime)/1000000 +"ms");
	   
	  }
}


