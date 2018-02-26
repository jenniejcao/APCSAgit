package unit8;
/*

(Implement the String class) The String class is provided in the Java library. Provide your own implementation for the following methods (name the new class MyString1): 

public MyString1(char[] chars); 
public char charAt(int index); 
public int length(); 
public MyString1 substring(int begin, int end); 
public MyString1 toLowerCase(); 
public boolean equals(MyString1 s); 
public static MyString1 valueOf(int i);

*/

public class MyString1{
	char[] chararray;
  public MyString1(char[] chars){
	  chararray=chars;
  }
  public char charAt(int index){
    return chararray[index];
  }
  public int length(){
    return chararray.length;
  }
  public char[] getCharacters(){
	  return chararray;
  }
  public MyString1 substring(int begin, int end){
    char[] substring = new char[end-begin];
    for (int a=begin; a<end; a++){
      substring[a-begin]=chararray[a];
    }
    MyString1 test = new MyString1(substring);
    return test;
    
  }
  
  public MyString1 toLowerCase(){
    char[] temp = new char[chararray.length];
    for (int i=0; i<temp.length; i++){
      if (chararray[i]>=65 && chararray[i]<=90){
       temp[i]=(char)(32+temp[i]);
      }
      else {
    	  temp[i]=chararray[i];
    }
    MyString1 y = new MyString1(temp);
    return y;
    
  }
  public boolean equals(MyString1 s){
    int test=0;
    for (int i =0; i<s.getCharacters().length; i++){
    	if (this.getCharacters()[i]==s.getCharacters()[i]){
    		test++;
    	}
 
    }
    if (test==s.getCharacters().length){
    	return true;
    }
    else {
    	return false;
    }
  }
  public static MyString1 valueOf(int i){
    System.out.println("The value of the letter at index "+i+" is "+(int)chararray[i]);
  }


public static void main(String[] args){
	char[] x = {'a','b','c'};
  MyString1 test = new MyString1(x);
  System.out.print(test.length());
}
}