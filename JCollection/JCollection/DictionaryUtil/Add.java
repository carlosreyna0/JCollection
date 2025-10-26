package JCollection.DictionaryUtil;
import JCollection.Array;

public class Add<T, T1>
{
	public Array<DictionaryItem<T, T1>> add(T key, T1 value, Array<DictionaryItem<T, T1>> items)
	{
		if(items.length != 0)
		{
			for(int i = 0; i < items.length; i++)
			{
				if(items.get(i).key.equals(key))
				{
					break;
				}
				if(i == (items.length - 1))
				{
					items.add(new DictionaryItem<>(key, value));
				}
			}	
		}
		else
		{
			items.add(new DictionaryItem<>(key, value));
		}
		return items;
	}
}