package journals;


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
    char[] temp = chararray;
    for (int i=0; i<chararray.length;i++){
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
	  for (int i =0; i<s.length(); i++){
		  if (chararray[i]!=s.charAt(i)){
		   return false;
	   }
   }
   return true;
  }
	public static MyString1 valueOf(int num) {
	    int x = 0;
	    int temp = num;
	    while (temp > 0){
	      x += 1;
	      temp/=10;
	    }
	    char[] sample = new char[x];
	    int newx = 0;
	    while(num >0){
	      sample[x - newx-1] = (char)(num%10+48);
	      num/=10;
	      newx += 1;
	    }
	    MyString1 go = new MyString1(sample);
	    return go;
	    }
	public String toString(){
	     String mystring = "";
	      for(int i = 0; i < chararray.length;i++){
	        mystring += chararray[i];
	      }
	      return mystring;
	    }
	

		



public static void main(String[] args){
	char[] x = {'a','B','c'};
	MyString1 test = new MyString1(x);
	System.out.println(test.length());
	char[] y={'a','B','c'};
	System.out.println(test.equals(y));
	System.out.println(MyString1.valueOf(3));
	System.out.println(test.toLowerCase());
}
}
