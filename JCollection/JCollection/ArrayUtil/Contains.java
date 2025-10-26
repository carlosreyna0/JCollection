package JCollection.ArrayUtil;

public class Contains<T>
{
	public boolean contains(T item, T[] items)
	{
		for(int i = 0; i < items.length; i++)
		{
			if(items[i].equals(item))
			{
				return true;
			}
		}
		return false;
	}
	public boolean contains(T[] array, T[] items)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(!contains(array[i], items))
			{
				return false;
			}
		}
		return true;
	}
}