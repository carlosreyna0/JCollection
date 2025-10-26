package JCollection.ArrayUtil;

public class IndexesOf<T>
{
	public int[] indexesOf(T item, T[] items)
	{
		int occurences = 0;
		for(int i = 0; i < items.length; i++)
		{
			if(!items[i].equals(item))
			{
				continue;
			}
			occurences++;
		}

		int[] indexes = new int[occurences];
		int indexOffset = 0;
		
		for(int i = 0; i < items.length; i++)
		{
			if(!items[i].equals(item))
			{
				continue;
			}
			indexes[indexOffset] = i;
			indexOffset++;
		}
		
		return indexes;
	}
}