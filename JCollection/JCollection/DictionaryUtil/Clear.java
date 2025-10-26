package JCollection.DictionaryUtil;
import JCollection.Array;

public class Clear<T, T1>
{
	public Array<DictionaryItem<T, T1>> clear(Array<DictionaryItem<T,T1>> items)
	{
		items.clear();
		return items;
	}
}