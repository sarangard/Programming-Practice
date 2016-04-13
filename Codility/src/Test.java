/**
 * 
 * @author Sarang
 */
public class Test 
{
	public static void main(String[] args) 
	{
		/*
		int[] array = {3,8,9,7,6};
		int k = 3;
		System.out.println("Original Array is - ");
		printArray(array);
		
		CyclicRotation cr = new CyclicRotation(array,k);
		int[] rotatedArray = cr.getRotatedArray();
		
		System.out.println("Rotated Array is - ");
		printArray(rotatedArray);
		*/
		
		/*
		int[] array = {9,3,9,3,9,7,9};
		OddOccurencesInArray oddInArray = new OddOccurencesInArray(array);
		System.out.println("Odd Occcurence in Array is " + oddInArray.getOddOccurenceInArray());
		*/
		
		/*
		FrogJump frogJump = new FrogJump(10,80,30);
		System.out.println("Minimal Steps required is " + frogJump.getMinimalSteps());
		*/
		
		/*
		int[] tape = {3,1,2,4,3};
		TapeEquilibrium tapeEqui = new TapeEquilibrium(tape);
		System.out.println("Minimal Difference is " + tapeEqui.getMinimalDifference() + " at index " + tapeEqui.getMinimalIndex());		
		*/
		
		/*
		int[] elementsList = {2,3,1,5};
		MissingElement missingElement = new MissingElement(elementsList);
		System.out.println("Missing Element is " + missingElement.getMissingElement());
		*/
		
		/*
		int[] input = {1,3,1,4,2,3,5,4};
		FrogRiverOne frogRiver = new FrogRiverOne(5, input);
		System.out.println("Minimal time required is " + frogRiver.getStepsRequired());
		*/
		
		/*
		int[] input = {4,1,3,5,2,1};
		PermCheck permCheck = new PermCheck(input);
		System.out.println("The given Input Array is a Permutation - " + permCheck.getPermCheck());
		*/
		
		/*
		int[] input = {1,4,6,4,1,2};
		MissingInteger missingInteger = new MissingInteger(input);
		System.out.println("First Missing Element is " + missingInteger.getMissingInteger());
		*/
		
		/*
		int[] input = {3,4,4,6,1,4,4};
		MaxCounters maxCounters = new MaxCounters(5, input);
		System.out.println("Counter Values are - ");
		printArray(maxCounters.getCounters());
		*/
		
		/*
		CountDiv countDiv = new CountDiv(6,11,2);
		System.out.println("Number of integers divisible are " + countDiv.getCountDiv());
		*/					
		
		FactorialRemainder factorialRemainder = new FactorialRemainder(50);
		System.out.println("Factorial Remainder is " + factorialRemainder.getFactorialRemainder());
	}

	public static void printArray(int[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
}
