 package JCollection.DictionaryUtil;

public class DictionaryItem<T, T1>
{
	public T key;
	public T1 value;
	
	public DictionaryItem(T key, T1 value)
	{
		this.key = key;
		this.value = value;
	}
	
	@Override
	public int hashCode()
	{
		int code = 0;
		if(key == null)
		{
			code -= 1;
		}
		else
		{
			code += 2;
		}
		if(value == null)
		{
			code -= 1;
		}
		else
		{
			code +=2;
		}
		return code;
	}
	@Override
	public boolean equals(Object o)
	{
		if(!(o instanceof DictionaryItem))
		{
			return false;
		}
		if(!(((DictionaryItem<T, T1>)o).key.equals(this.key)))
		{
			return false;
		}
		if(!(((DictionaryItem<T,T1>)o).value.equals(this.value)))
		{
			return false;
		}
		return true;
	}
	@Override
	public String toString()
	{
		return "{" + key.toString() + " : " + value.toString() + "}";
	}
}