package Line_comparison;

public class Checking_lengths 
{
	public static void main(String[] args)
	{
		double x1=Math.floor(Math.random()*10);
		double y1=Math.floor(Math.random()*10);
		double x2=Math.floor(Math.random()*10);
		double y2=Math.floor(Math.random()*10);
		double x3=Math.floor(Math.random()*10);
		double y3=Math.floor(Math.random()*10);
		double x4=Math.floor(Math.random()*10);
		double y4=Math.floor(Math.random()*10);
		int length_1=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		int length_2=(int)Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
		
		System.out.println("Line 1 length is: "+length_1);
		System.out.println("Line 2 length is: "+length_2);
		
		if(length_1==length_2)
		     System.out.println("Both lines are Equal");
		else if(length_1>length_2)
			System.out.println("Line 1 is Bigger");
		else
			System.out.println("Line 2 is Bigger");
			
	}
}
