package JCollection.ArrayUtil;
public class Remove<T>
{
	public T[] remove(T[] array, T item)
	{
		T[] finalArray = array.clone();
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == item)
			{
				finalArray = new RemoveAt<T>().removeAt(i, finalArray);
			}
		}
		return finalArray;
	}
}