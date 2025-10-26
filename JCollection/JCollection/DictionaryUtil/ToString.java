package JCollection.DictionaryUtil;
import JCollection.Dictionary;

public class ToString<T, T1>
{
	public String toString(Dictionary<T, T1> dict)
	{
		String childrenStringed = "";
		
		for(int i = 0; i < dict.length; i++)
		{
			childrenStringed += dict.items.get(i).toString();
			
			if(!(i == (dict.length - 1)))
			{
				childrenStringed += ", ";
			}
		}
		return "{" + childrenStringed + "}";
	}
}