package JCollection.ArrayUtil;

public class Contains<T>
{
	public boolean contains(T[] array, T item)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == item)
			{
				return true;
			}
		}
		return false;
	}
}