package JCollection.ArrayUtil;
public class Set<T>
{
	public T[] set(Integer index, T[] array, T value)
	{
		Object[] finalArray = new Object[array.length];
		for(int i = 0; i < array.length; i++)
		{
			if(i == index)
			{
				finalArray[i] = value;
			}
			else
			{
				finalArray[i] = array[i];
			}
		}
		return (T[]) finalArray;
	}
}