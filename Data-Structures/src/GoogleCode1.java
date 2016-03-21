public class GoogleCode1 
{
	/*
	 * Converts an integer array to an integer
	 */
    private int intArrayToInt(int[] A)
    {
        int num = 0;        
        StringBuilder stringInteger = new StringBuilder();
        
        for(int digit : A)
        {
            stringInteger.append(digit);
        }                
        num = Integer.parseInt(stringInteger.toString());        
        
        return num;
    }
	    
    /*
     * Converts an integer to an integer array
     */
    private int[] intToIntArray(int a)
    {
    	int arraySize = String.valueOf(a).length();
        int[] intArray = new int[arraySize];
        int i = 0;
        
        do
        {
            intArray[i] = a%10;
            a=a/10;
            i++;
        }while(a != 0);
        
        return intArray;
    }
	    
    
    /*
     * Reverses an integer array
     */
    private int[] reverse(int[] array)
    {
    	for(int i = 0; i < array.length / 2; i++)
        {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    	
    	return array;
    }
    
    public int solution(int X) 
    {
    	// Convert integer to integer array
        int[] array = intToIntArray(X);        
        array = reverse(array);        
        
        int[] temp = new int[array.length-1];
        int[] array2 = new int[array.length-1];
        
        // Logic       
        for(int i=0; i<array.length-1; i++)
        {
        	// If two consecutive digits in array are equals then create a temp array.
            if(array[i]==array[i+1])
            {
                for(int j=0; j<array.length; j++)
                {
                	// Dont copy the duplicate element twice. 
                    if(j != i)
                    {
                    	// Copy the array
                        temp[j] = array[j];
                    }                   
                }
            }            
            
            // Compare temp array with array2. If larger then replace array2 with temp.
            if( intArrayToInt(temp) > intArrayToInt(array2) )
            {
                array2 = temp;
            }

        }                
        
        // returns the largest number after removing one of the possible consecutive digits 
        return intArrayToInt(array2);
    }

}
