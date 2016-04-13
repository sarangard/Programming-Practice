import java.util.Iterator;
import java.util.TreeSet;

/**
 * 
 * @author Sarang
 */
public class CountSeriesTerms 
{
	/*
	 * 
	 */
	static int findCountSeriesTerms(int A, int D, int B, int R, int Lim) 
	{
		TreeSet<Integer> ap = new TreeSet<Integer>();
		TreeSet<Integer> gp = new TreeSet<Integer>();
		int retVal = 0;
		
        if(A>1000000000)
        {
            
        }
        else
        {
		
			int i=0;
			while(ap.isEmpty() || ap.last() < Lim)
			{
				ap.add( (A+(D*i)) );
				i++;
			}
	
			int j=0;
			while(gp.isEmpty() || gp.last() < Lim)
			{
				gp.add( (int)(B*Math.pow(R,j)) );
				j++;
			}
	
			Iterator<Integer> iterator1 = ap.iterator(); 
			while (iterator1.hasNext())
			{
				System.out.println(iterator1.next());
			}
			Iterator<Integer> iterator2 = gp.iterator(); 
			while (iterator2.hasNext())
			{
				System.out.println(iterator2.next());
			}
			
			
			Iterator<Integer> iterator = ap.iterator(); 
			while (iterator.hasNext())
			{
				if( gp.contains(iterator.next()) )
				{
					retVal = retVal + 1;
				}
			}        
        }
        
		return retVal;
	}
	
	public static void main(String args[])
	{
		System.out.println(findCountSeriesTerms(1,1,1,2,4));
	}

}
