package JCollection.DictionaryUtil;
import JCollection.Dictionary;

public class Equals<T, T1>
{
	public boolean equals(Dictionary<T, T1> dict, Object dict2)
	{
		if(!(dict2 instanceof Dictionary))
		{
			return false;
		}
		if(!(((Dictionary<T,T1>)dict2).length == dict.length))
		{
			return false;
		}
		if(!(((Dictionary<T, T1>)dict2).items.equals(dict.items)))
		{
			return false;
		}
		
		return true;
	}
}