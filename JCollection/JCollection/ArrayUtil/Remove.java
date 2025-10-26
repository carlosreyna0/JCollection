package JCollection.ArrayUtil;
import java.lang.reflect.Array;

import JCollection.Event.Array.ArrayItemRemoved;

public class Remove<T>
{
	public T[] remove(T[] items, ArrayItemRemoved<T>[] onItemRemoved)
	{
		T[] newArray = (T[]) Array.newInstance(items[0].getClass(), items.length - 1);
		
		for(int i = 0; i < onItemRemoved.length; i++)
		{
			onItemRemoved[i].arrayItemRemoved(items.length - 1, items[items.length - 1]);
		}
		for(int i = 0; i < newArray.length; i++)
		{
			newArray[i] = items[i];
		}
		
		return newArray;
	}
}