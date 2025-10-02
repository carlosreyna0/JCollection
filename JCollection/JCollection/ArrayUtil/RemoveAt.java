package JCollection.ArrayUtil;

public class RemoveAt<T>
{
	public T[] removeAt(Integer index, T[] array)
	{
		Object[] finalArray = new Object[array.length-1];
		for(int i = 0; i < array.length - 1; i++)
		{
			if(i == index || i > index)
			{
				finalArray[i] = array[i + 1];
			}
			else if(i < index)
			{
				finalArray[i] = array[i];
			}
		}
		
		return (T[]) finalArray;
	}
}