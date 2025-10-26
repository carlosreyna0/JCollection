package JCollection.DictionaryUtil;
import JCollection.Array;

public class IndexOf<T, T1>
{
	public int indexOf(T key, Array<DictionaryItem<T, T1>> items)
	{
		for(int i = 0; i < items.length; i++)
		{
			if(items.get(i).key.equals(key))
			{
				return i;
			}
		}
		return -1;
	}
}