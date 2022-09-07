package series;

public class Series_Programs {
	public static void main(String[]args)
	{
	Series_Programs obj=new Series_Programs();
	          obj.add();
	          
}	
public void add()
{

	int n=568;
	int odd=0;
	int even=0;
	int count=1;
	while(n>0)
	{
		if (count%2==0)
		{
			even=even+n%10;
			
		}
		else
		{
		 odd=odd+n%10;	
		}
	  n=n/10;
	  count++;
     }
   System.out.println(odd-even);
}
}