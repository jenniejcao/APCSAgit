package unit1;
import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
      
   }

   public void printTwentyStars()
   {
	   for (int a=1; a<=20; a++){
		   System.out.print("*");
	   }
	   System.out.println();
   }

   public void printTwentyDashes()
   {
	   for (int a=1; a<=20; a++){
		   System.out.print("-");
	   }
	   System.out.println();
   }

   public void printTwoBlankLines()
   {
	   System.out.println("\n");
   }
   
   public void printASmallBox()
   {	
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
	   printTwentyStars();
	   printTwentyDashes();
   }
 
   public void printABigBox()
   { 	
	   printASmallBox();
	   printASmallBox();
   }   
}