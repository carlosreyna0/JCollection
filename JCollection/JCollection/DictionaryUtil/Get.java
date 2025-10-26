package JCollection.DictionaryUtil;
import JCollection.Array;

public class Get<T, T1>
{
	public T[] getKeys(T1 value, Array<DictionaryItem<T, T1>> items)
	{
		Array<T> keys = new Array<>();
		
		for(int i = 0; i < items.length; i++)
		{
			if(!(items.get(i).value.equals(value)))
			{
				continue;
			}
			keys.add(items.get(i).key);
		}
		
		return keys.items;
	}
	public T getKeyAt(int index, Array<DictionaryItem<T, T1>> items)
	{
		for(int i = 0; i < items.length; i++)
		{
			if(i != index)
			{
				continue;
			}
			return items.get(i).key;	
		}
		return null;
	}
	public T1 getValueFrom(T key, Array<DictionaryItem<T, T1>> items)
	{
		for(int i = 0; i < items.length; i++)
		{
			if(!(items.get(i).key.equals(key)))
			{
				continue;
			}
			return items.get(i).value;
		}
		return null;
	}
	public T1 getValueAt(int index ,Array<DictionaryItem<T, T1>> items)
	{
		for(int i = 0; i < items.length; i++)
		{
			if(i != index)
			{
				continue;
			}
			return items.get(i).value;	
		}
		return null;
	}
	
}