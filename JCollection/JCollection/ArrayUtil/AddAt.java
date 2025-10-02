package JCollection.ArrayUtil;

public class AddAt<T>
{
	public T[] addAt(Integer index, T[] array, T item)
	{
		Object[] finalArray = new Object[array.length + 1];
		for(int i = 0; i < array.length + 1; i++)
		{
			if(i == index)
			{
				finalArray[i] = item;
			}
			else if(i > index)
			{
				finalArray[i] = array[i - 1];
			}
			else if(i < index)
			{
				finalArray[i] = array[i];
			}
		}
		return (T[]) finalArray;
	}
}