package JCollection.DictionaryUtil;
import JCollection.Array;

public class Contains<T, T1>
{
	public boolean containsKey(T key, Array<DictionaryItem<T, T1>> items)
	{
		for(int i = 0; i < items.length; i++)
		{
			if(items.get(i).key.equals(key))
			{
				return true;
			}
		}
		return false;
	}
	public boolean containsValue(T1 value, Array<DictionaryItem<T, T1>> items)
	{
		for(int i = 0; i < items.length; i++)
		{
			if(items.get(i).value.equals(value))
			{
				return true;
			}
		}
		return false;
	}
	public boolean contains(T key, T1 value, Array<DictionaryItem<T, T1>> items)
	{
		return items.contains(new DictionaryItem<>(key, value));
	}
}