package JCollection.DictionaryUtil;
import JCollection.Array;

public class RemoveAt<T, T1>
{
	public Array<DictionaryItem<T, T1>> removeAt(int index, Array<DictionaryItem<T, T1>> items)
	{
		items.removeAt(index);;
		return items;
	}
}