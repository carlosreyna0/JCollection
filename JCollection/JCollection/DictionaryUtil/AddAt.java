package JCollection.DictionaryUtil;
import JCollection.Array;

public class AddAt<T, T1>
{
	public Array<DictionaryItem<T, T1>> addAt(int index, T key, T1 value, Array<DictionaryItem<T, T1>> items)
	{
		for(int i = 0; i < items.length; i++)
		{
			if(items.get(i).key.equals(key))
			{
				return items;
			}
		}
		items.addAt(index, new DictionaryItem<>(key, value));
		return items;
	}
}