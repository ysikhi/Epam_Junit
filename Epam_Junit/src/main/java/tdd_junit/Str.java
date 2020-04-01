package tdd_junit;

public class Str{
	
public String accept(String s)
{   String h="";
	int y=s.length();
	if(y>=2)
	{
		if(s.charAt(0)!='A')
		{
			h=h+s.charAt(0);
			
		}
		if(s.charAt(1)!='A')
		{
			h=h+s.charAt(1);
			
		}
		if(y>2)
		{
			
			h=h+s.substring(2,y);
			
		}
	
		
	}
	else
	{
		if(y==1)
		{
			if(s.charAt(0)!='A')
			{
				h=h+s.charAt(0);
				
			}	
			
			
		}
		}
	
	return(h);
}
}
