package pixlab;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  public static void testMyCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  public static void testCopy(){
	  Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    Picture p = new Picture("640x480.jpg");
	    p.copy(beach,100,100);
	    p.explore();
	  
  }
  public static void testCopy2(){
	  Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    Picture p = new Picture("640x480.jpg");
	   p.copy(beach, 0,0,100,100,300,300);
	    p.explore();
	  
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
	Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testEdgeDetection2()
  {
	Picture swan = new Picture("andy_new.png");
    swan.edgeDetection2(10);
    swan.explore();
  }
  public static void testNegate(){
	  Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.negate();
	    beach.explore();
  }
  public static void testGrayscale(){
	  Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.grayscale();
	    beach.explore();
  }
  public static void testFixUnderwater(){
	  Picture p = new Picture("water.jpg");
	    p.explore();
	    p.fixUnderwater();
	    p.explore();
  }
  public static void testMirrorRightToLeft(){
	  Picture temple = new Picture("temple.jpg");
	    temple.explore();
	    temple.mirrorVerticalRightToLeft();
	    temple.explore();
  }
  public static void testMirrorHorizontal(){
	  Picture temple = new Picture("temple.jpg");
	    temple.explore();
	    temple.mirrorHorizontal();
	    temple.explore();
  }
  public static void testMirrorHorizontalBotToTop(){
	  Picture temple = new Picture("temple.jpg");
	    temple.explore();
	    temple.mirrorHorizontalBotToTop();
	    temple.explore();
  }
  public static void testMirrorDiagonal(){
	  Picture beach = new Picture("beach.jpg");
	    beach.explore();
	    beach.mirrorDiagonal();
	    beach.explore();
  }
  public static void testMirrorArms()
  {
    Picture p = new Picture("snowman.jpg");
    p.explore();
    p.mirrorArms();
    p.explore();
  }
  public static void testMirrorGull()
  {
    Picture p = new Picture("seagull.jpg");
    p.explore();
    p.mirrorGull();
    p.explore();
  }
  
  
  
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
	//testMyCollage();
    //testCopy();
	//testCopy2();
    //testEdgeDetection();
    testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}