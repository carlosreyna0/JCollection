package JCollection.DictionaryUtil;
import JCollection.FilterableDictionary;
import JCollection.Array;

public class Filter<T, T1>
{
	public Array<DictionaryItem<T, T1>> filter(FilterableDictionary<T, T1> filter, Array<DictionaryItem<T, T1>> items)
	{
		items.loop((i,x)->
		{
			if(filter.filterableDictionary(i, x.key, x.value) == true)
			{
				items.removeAt(i);
			}
		});
		
		return items;
	}
}