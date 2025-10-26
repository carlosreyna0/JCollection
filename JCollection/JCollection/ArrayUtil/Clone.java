package JCollection.ArrayUtil;
import JCollection.Array;

public class Clone<T>
{
	public Array<T> clone(Array<T> arr)
	{
		Array<T> clone = new Array<>();
		
		arr.loop((_,e)->
		{
			clone.add(e);
		});
		
		return clone;
	}
}