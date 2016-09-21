package com.akm.sorting;
/**
 * 
 * @author "AshishKrMishra"
 *
 */
public class InsertionSortingAlgo {
	
	public static void main(String[] args) {
		
		int [] inputArray={34,76,21,2,4,31,45,23,67,87,96,31};
		displayArray(inputArray,"Before Sorting");
		// Implementation Of Insertion Sorting
		getInsertionSortedArray(inputArray);
		displayArray(inputArray,"After Sorting");
		
		
	}
	/**
	 * displayArray -Utility Method to Display Array Elements 
	 * @param inputArray 
	 * @param message
	 */
	private static void displayArray(int [] inputArray,String message)
	{
		System.out.println(message);
		for(int val:inputArray)
		{
			System.out.print(val+" ");
		}
		System.out.println();
	}
	/**
	 * getInsertionSortedArray
	 * @param inputArray
	 */
	private static void getInsertionSortedArray(int[] inputArray) {
		// TODO Auto-generated method stub
		int length=inputArray.length;
		if(inputArray==null || length<=0)
		{
			return;
		}
		//Looking for unSorted Array Choosing  Elements one by one 
		for(int j=1;j<length;j++)
		{
				for(int i=0;i<=j;i++)
				{
					//find Appropriate Position
					if(inputArray[j]<= inputArray[i])
					{
						int temp=inputArray[j];
						//Making Position j-th Position Empty
						shiftElements(inputArray,i,j);
						//Inserting  it into Appropriate Position
						inputArray[i]=temp;	
					}
				}
		}
	}
	/**
	 * shiftElements 
	 * @param inputArray
	 * @param from 
	 * @param upto
	 */
	private static void shiftElements(int[] inputArray, int from, int upto) {
		// TODO Auto-generated method stub
		for(int i=upto;i>from;i--)
		{
			//Logic For Shifting Elements One by One 
			inputArray[i]=inputArray[i-1];
		}
	}

}

