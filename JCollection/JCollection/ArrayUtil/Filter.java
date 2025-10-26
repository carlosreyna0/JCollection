package JCollection.ArrayUtil;
import JCollection.FilterableArray;
import JCollection.Event.Array.ArrayItemRemoved;

public class Filter<T>
{
	public T[] filter(FilterableArray<T> filter, T[] items, ArrayItemRemoved<T>[] onItemRemoved)
	{
		T[] newItems = items.clone();
		
		for(int i = 0; i < items.length; i++)
		{
			if(!filter.filterableArray(i, items[i]))
			{
				continue;
			}
			newItems = new RemoveAt<T>().removeAt(i, newItems, onItemRemoved);
		}
		return newItems;
	}
}