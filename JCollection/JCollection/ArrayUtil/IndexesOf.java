package JCollection.ArrayUtil;
import JCollection.Array;

public class IndexesOf<T>
{
	public Integer[] indexesOf(T[] array, T item)
	{
		int occurences = 0;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i].equals(item))
			{
				occurences ++;
			}
		}
		Integer indexes[] = new Integer[occurences];
		int index = -1;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i].equals(item))
			{
				index++;
				indexes[index] = i;
			}
		}
		return indexes;
	}
}