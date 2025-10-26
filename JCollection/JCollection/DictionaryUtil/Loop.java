package JCollection.DictionaryUtil;
import JCollection.LoopableDictionary;
import JCollection.Array;

public class Loop<T, T1>
{
	public void loop(LoopableDictionary<T, T1> loop, Array<DictionaryItem<T, T1>> items)
	{
		items.loop((i,x)->
		{
			loop.loopableDictionary(i, x.key, x.value);
		});
	}
}