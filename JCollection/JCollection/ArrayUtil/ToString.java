package JCollection.ArrayUtil;

public class ToString<T>
{
	public String toString(T[] items)
	{
		String childrenStringed = "";
		
		for(int i = 0; i < items.length; i++)
		{
			childrenStringed += items[i].toString();
			if(i != (items.length - 1))
			{
				childrenStringed += ", ";
			}
		}
		
		return "{"+ childrenStringed + "}";
	}
}