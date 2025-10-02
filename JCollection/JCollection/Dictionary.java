package JCollection;
public class Dictionary<T, T1>
{
	public Array<T> keyItems = new Array<>();
	public Array<T1> valueItems = new Array<>();
	
	public void addAt(Integer index, T key, T1 value)
	{
		keyItems.addAt(index, key);
		valueItems.addAt(index, value);
	}
	public void add(T key, T1 value)
	{
		keyItems.add(key);
		valueItems.add(value);
	}
	public void remove(T key)
	{
		Integer[] keyIndexes = keyItems.indexesOf(key);
		for(int i = 0; i < keyIndexes.length; i++)
		{
			valueItems.removeAt(i);
		}
		keyItems.remove(key);
	}
	public void removeAt(Integer index)
	{
		keyItems.removeAt(index);
		valueItems.removeAt(index);
	}
	public T1 get(T key)
	{
		return valueItems.get(indexOf(key));
	}
	public T1 getValueAt(Integer index)
	{
		return valueItems.get(index);
	}
	public T getKeyAt(Integer index)
	{
		return keyItems.get(index);
	}
	public Integer indexOf(T key)
	{
		return keyItems.indexesOf(key)[0];
	}
	public void loop(LoopableDictionary<T, T1> loop)
	{
		for(int i = 0; i < keyItems.items.length; i++)
		{
			loop.loopableDictionary(keyItems.get(i), valueItems.get(i));
		}
	}
	public void filter(FilterableDictionary<T, T1> filterer)
	{
		loop((x,y)->{
			if(filterer.filterableDictionary(x, y) == true)
			{
				remove(x);
			}
		});
	}
	@Override
	public boolean equals(Object o)
	{
		if(o.getClass() == Dictionary.class && ((Dictionary<T,T1>)o).keyItems.items.length == keyItems.items.length)
		{
			for(int i = 0; i < keyItems.items.length; i++)
			{
				if(!((Dictionary<T,T1>) o).getKeyAt(i).equals(getKeyAt(i)))
				{
					return false;
				}
				if(!((Dictionary<T,T1>)o).getValueAt(i).equals(getValueAt(i)))
				{
					return false;
				}
			}
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public String toString()
	{
		String childrenString = "";
		for(int i = 0; i < keyItems.items.length; i++)
		{
			childrenString += getKeyAt(i).toString() + ":" + getValueAt(i).toString();
			if(i < keyItems.items.length - 1)
			{
				childrenString += ",";
			}
		}
		return "{" + childrenString + "}";
	}
}