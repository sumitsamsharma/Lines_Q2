package Lines;

public class Lines_q2 
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
		
		if(length_1==length_2)
		     System.out.println("Length is Equal");
		else
			System.out.println("Length is not Equal");
	}
}
