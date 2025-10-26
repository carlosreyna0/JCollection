package JCollection.DictionaryUtil;
import JCollection.Dictionary;

public class HashCode<T, T1>
{
	public int hashCode(Dictionary<T, T1> dict)
	{
		int code = 0;
		for(int i = 0; i < dict.length; i++)
		{
			T key = dict.items.get(i).key;
			T1 value = dict.items.get(i).value;
			
			if(key == null)
			{
				code -= 1;
				continue;
			}
			if(value == null)
			{
				code -= 1;
				continue;
			}
			if(key.equals(value))
			{
				code += 2;
				continue;
			}
			code++;
		}
		return dict.length * code;
	}
}