package JCollection.ArrayUtil;
import JCollection.LoopableArray;

public class Loop<T>
{
	public void loop(T[] array, LoopableArray<T> loop)
	{
		for(int i = 0; i < array.length; i++)
		{
			loop.loopableArray(array[i]);
		}
	}
}