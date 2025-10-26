package JCollection.ArrayUtil;
import JCollection.LoopableArray;

public class Loop<T>
{
	public void loop(LoopableArray<T> loop, T[] items)
	{
		for(int i = 0; i < items.length; i++)
		{
			loop.loopableArray(i, items[i]);
		}
	}
}