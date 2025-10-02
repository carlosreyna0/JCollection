package JCollection.ArrayUtil;
public class Get<T>
{
	public T get(Integer index, T[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(i == index)
			{
				return array[i];
			}
		}
		return null;
	}
}