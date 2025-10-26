package JCollection.DictionaryUtil;
import JCollection.Array;

public class Remove<T, T1>
{
	public Array<DictionaryItem<T, T1>> remove(T item, Array<DictionaryItem<T, T1>> items)
	{
		for(int i = 0; i < items.length; i++)
		{
			if(items.get(i).key.equals(item))
			{
				items.removeAt(i);
			}
		}
		
		return items;
	}
}