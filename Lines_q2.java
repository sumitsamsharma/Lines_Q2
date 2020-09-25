package Line_comparison;

class Lines 
{
	    private int x1,x2,x3,x4,y1,y2,y3,y4,length_1,length_2;
	    
	    public void get_coordinates()  
	    { 
	    	x1=(int)Math.floor(Math.random()*10);
			y1=(int)Math.floor(Math.random()*10);
			x2=(int)Math.floor(Math.random()*10);
			y2=(int)Math.floor(Math.random()*10);
			x3=(int)Math.floor(Math.random()*10);
			y3=(int)Math.floor(Math.random()*10);
			x4=(int)Math.floor(Math.random()*10);
			y4=(int)Math.floor(Math.random()*10);   
	    	System.out.println("Line1 X-coordinates are ("+x1+" "+x2+") Line1 Y-coordinates are: ("+y1+" "+y2+")");
	    	System.out.println("Line2 X-coordinates are ("+x3+" "+x4+") Line2 Y-coordinates are: ("+y3+" "+y4+")");
	    } 
	    public void get_lengths()  
	    { 
	    	length_1=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
			length_2=(int)Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
			System.out.println("Line 1 length is: "+length_1);
			System.out.println("Line 2 length is: "+length_2);	
	    }
	    public void checking()
	    {
	    	if(length_1==length_2)
			     System.out.println("Both lines are Equal");
			else if(length_1>length_2)
				System.out.println("Line 1 is Bigger");
			else
				System.out.println("Line 2 is Bigger");
	    }	
}
public class Lines_q2 
{
    public static void main(String[] args)
	{
    	Lines object1=new Lines();
    	object1.get_coordinates();
    	object1.get_lengths();
    	object1.checking();
    	
	}
}   
