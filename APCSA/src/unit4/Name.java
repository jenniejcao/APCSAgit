package unit4;

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{
		name="";

	}

	public Name(String s)
	{
		setName(s);

	}

   public void setName(String s)
   {
	   name=s;

   }

	public String getFirst()
	{
		int index = name.indexOf(" ");
		
		return name.substring(0,index);
	}

	public String getLast()
	{
		int index=name.indexOf(" ");
		return name.substring(index+1, name.length());
	}

 	public String toString()
 	{
 		return name+"\n";
	}
}