package JCollection.ArrayUtil;
import JCollection.Array;

public class Equals<T>
{
	public boolean equals(Array<T> arr1, Array<T> arr2)
	{
		if(arr1.items.length != arr2.items.length)
		{
			return false;
		}
		
		for(int i = 0; i < arr1.items.length; i++)
		{
			if(arr2.get(i).equals(arr1.get(i)))
			{
				continue;
			}
			return false;
		}
		
		return true;
	}
}