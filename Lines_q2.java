package Lines;

public class Lines_q2 
{
	public static void main(String[] args)
	{
		double x1=Math.floor(Math.random()*10);
		double y1=Math.floor(Math.random()*10);
		double x2=Math.floor(Math.random()*10);
		double y2=Math.floor(Math.random()*10);
		int length=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		System.out.println("Length is: "+length);
	}
}
