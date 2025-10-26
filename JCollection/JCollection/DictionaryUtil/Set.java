package JCollection.DictionaryUtil;
import JCollection.Array;

public class Set<T, T1>
{
	public Array<DictionaryItem<T, T1>> set(int index, T key, T1 value, Array<DictionaryItem<T, T1>> items)
	{
		items.set(index, new DictionaryItem<>(key, value));
		return items;
	}
	public Array<DictionaryItem<T, T1>> setKey(T key, T1 value, Array<DictionaryItem<T, T1>> items)
	{
		items.loop((i, e)->
		{
			if(e.key.equals(key))
			{
				items.set(i, new DictionaryItem<>(key, value));
			}
		});
		return items;
	}
	public Array<DictionaryItem<T, T1>> setAt(int index, T key, T1 value, Array<DictionaryItem<T, T1>> items)
	{
		items.set(index, new DictionaryItem<>(key, value));
		return items;
	}
}