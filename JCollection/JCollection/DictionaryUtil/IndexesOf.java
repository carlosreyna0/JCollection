package JCollection.DictionaryUtil;
import JCollection.Array;

public class IndexesOf<T, T1>
{
	public int[] indexesOf(T1 value, Array<DictionaryItem<T, T1>> items)
	{
		int occurences = 0;
		Array<Integer> found = new Array<>();
		for(int i = 0; i < items.length; i++)
		{
			if(items.get(i).value.equals(value))
			{
				occurences++;
				found.add(i);
			}
		}
		int[] indexes = new int[occurences];
		
		found.loop((i,x)->
		{
			indexes[i] = x;
		});
		
		return indexes;
	}
}