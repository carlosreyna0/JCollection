package JCollection.ArrayUtil;
import JCollection.Event.Array.ArrayItemChanged;

public class Set<T>
{
	public T[] set(int index, T item, T[] items, ArrayItemChanged<T>[] onItemChanged)
	{
		for(int i = 0; i < onItemChanged.length; i++)
		{
			onItemChanged[i].arrayItemChanged(index, items[index], item);
		}
		items[index] = item;
		return items;
	}
}