/**
 * A small frog wants to get to the other side of the road. The frog is currently located 
 * at position X and wants to get to a position greater than or equal to Y. 
 * The small frog always jumps a fixed distance, D.
 * 
 * Count the minimal number of jumps that the small frog must perform to reach its target.
 * 
 * Assume that:
 *         X, Y and D are integers within the range [1..1,000,000,000];
 *         X <= Y.
 * 
 * @author Sarang
 */
public class FrogJump 
{
	int currentPosition;
	int finalPosition;
	int jumpDistance;
	int minimalSteps = 0;
	
	/*
	 * 
	 */
	public FrogJump(int X, int Y, int D)
	{
		this.currentPosition = X;
		this.finalPosition = Y;
		this.jumpDistance = D;
		
		//findMinimalSteps1();
		findMinimalSteps2();		
	}
	
	/*
	 * 
	 */
	public int getMinimalSteps()
	{
		return this.minimalSteps;
	}
	
	/*
	 * 
	 */
	private void findMinimalSteps1()
	{
		while(((jumpDistance*minimalSteps) - currentPosition) < finalPosition)
		{
			minimalSteps = minimalSteps + 1;
		}
	}
	
	private void findMinimalSteps2()
	{
		if( ((finalPosition - currentPosition) % jumpDistance) == 0)
		{
			minimalSteps = ((finalPosition - currentPosition) / jumpDistance); 
		}
		else
		{
			minimalSteps = ((finalPosition - currentPosition) / jumpDistance) + 1; 
		}		
	}
}
