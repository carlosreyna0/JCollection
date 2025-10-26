package JCollection.DictionaryUtil;
import JCollection.Dictionary;

public class Clone<T, T1>
{
	public Dictionary<T, T1> clone(Dictionary<T, T1> original)
	{
		Dictionary<T, T1> clone = new Dictionary<>();
		original.loop((i,x,y)->
		{
			clone.addAt(i, x, y);
		});
		
		return clone;
	}
}