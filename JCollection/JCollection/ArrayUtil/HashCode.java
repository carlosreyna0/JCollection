package JCollection.ArrayUtil;
import JCollection.Array;

public class HashCode<T>
{
	public int hashCode(Array<T> arr)
	{
		int code = 0;
		
		for(int i = 0; i < arr.items.length; i++)
		{
			code += i;
		}
		
		return arr.items.length * code;
	}
}