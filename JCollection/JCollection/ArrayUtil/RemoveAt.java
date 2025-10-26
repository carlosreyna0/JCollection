package JCollection.ArrayUtil;
import java.lang.reflect.Array;

import JCollection.Event.Array.ArrayItemRemoved;

public class RemoveAt<T>
{
	public T[] removeAt(int index, T[] items, ArrayItemRemoved<T>[] onItemRemoved)
	{
		T[] newArray = (T[]) Array.newInstance(items[index].getClass(), items.length - 1);
		
		for(int i = 0; i < onItemRemoved.length; i++)
		{
			onItemRemoved[i].arrayItemRemoved(index, items[index]);
		}
		
		for(int i = 0; i < newArray.length; i++)
		{
			if(i < index)
			{
				newArray[i] = items[i];
				continue;
			}
			newArray[i] = items[i + 1];
		}
		
		return newArray;
	}
}