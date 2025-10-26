package JCollection.ArrayUtil;

public class Get<T>
{
	public T get(int index, T[] items)
	{
		return items[index];
	}
	public T[] get(int[] indexes, T[] items)
	{
		T[] found = (T[]) new Object[indexes.length];
		int foundOffset = 0;
		
		for(int i = 0; i < items.length; i++)
		{
			if(indexes[i] != i)
			{
				continue;
			}
			found[foundOffset] = items[i];
			foundOffset++;
		}
		return found;
	}
}