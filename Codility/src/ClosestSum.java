import java.util.StringTokenizer;

/**
 * 
 * @author Sarang
 *
 */
public class ClosestSum 
{
	/*
	 * 
	 */
	public static String findClosestSum(int lim, String s)
	{
		int[] A = new int[lim];
		
		// Creating an array of integers from given String
		StringTokenizer st = new StringTokenizer(s, " ");	       
        while (st.hasMoreTokens())
        {
            for(int i=0; i<A.length; i++)   
            {
                A[i] = Integer.parseInt(st.nextToken());
            }
         }
        		
        int[] B = new int[2];
        int minDiff = Math.abs(A[0]-A[1]);
       
        for (int i=0; i<A.length; i++)
        {         
            for(int j=1; j<A.length; j++)
            {
            	if( ( Math.abs(A[i]-A[j]) < minDiff ) && (i!=j))
            	{
            		minDiff = Math.abs(A[i]-A[j]);
            		B[0] = A[i];
            		B[1] = A[j];
            	}
            }
        }
       
        String retVal = "";
        for(int i=0; i<B.length;i++)
        {           
            retVal = retVal + B[i] + " " ;
        }
        
        return retVal;
	}
	
	public static void main(String args[])
	{
		String input = "-20 -3916237 -357920 -3620601 7374819 -7330761 30 6246457 -6461594 266854";
		System.out.println("Result is " + findClosestSum(10, input) );
	}
	
}
