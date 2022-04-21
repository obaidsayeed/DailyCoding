//The area of a circle is defined as πr^2. Estimate π to 3 decimal places using a Monte Carlo method.

import java.util.Random;
public class PiVal
{
    static int cir_pt = 0;
	static int sq_pt = 0;
	public static void main(String args[])
	{
		int interval = 10000;
		for(int i = 0;i < interval;i++)
		{
		    Random rand = new Random();
			double ran_x = rand.nextDouble();
			double ran_y = rand.nextDouble();
			double dist = ran_x*ran_x + ran_y*ran_y;
			
			if(dist <= 1)
			{
				cir_pt += 1;
			}
			sq_pt += 1;
			
			System.out.println(cir_pt + " " + sq_pt);
		}
		float pi = (float)(4*cir_pt)/sq_pt;
		System.out.println(pi);
		
	}
}
