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
    for (int i=0; i<temp.length;i++){
      if (chararray[i]>=65 && chararray[i]<=90){
       temp[i]=(char)(32+temp[i]);
      }
      else {
    	  temp[i]=chararray[i];
    }
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
	public static MyString1 valueOf(int num) {
		//MyString1 x = new MyString1(string);
	    int dig = 0;
	    int temp = num;
	    while (temp > 0){
	      dig += 1;
	      temp/=10;
	    }
	    char[] hi = new char[dig];
	    int ndig = 0;
	    while(num >0){
	      hi[dig - ndig-1] = (char)(num%10+48);
	      num/=10;
	      ndig += 1;
	    }
	    MyString1 xd = new MyString1(hi);
	    return xd;
	    }
	    public String toString(){
	      String mystring = "";
	      for(int i = 0; i < chararray.length;i++){
	        mystring += chararray[i];
	      }
	      mystring+="\n";
	      return mystring;
	    }
	

		/*
		int len = 0;
		while (num>0){
			len++;
			num = num/10;
		}
		char[]temp = new char[len];
		for (int i = temp.length-1; i>0; i--){
			temp[i] = (char)(num%10);
			num = num/10;
		}
		
		MyString1 newString = new MyString1(temp);
		return newString;
		
	}
*/


public static void main(String[] args){
	char[] x = {'a','B','c'};
  MyString1 test = new MyString1(x);
  System.out.println(test.length());
  char[] y={'a','B','c'};
  System.out.println(test.equals(y));
  System.out.println(test.valueOf(2));
  System.out.println(test.toLowerCase());
}
}
